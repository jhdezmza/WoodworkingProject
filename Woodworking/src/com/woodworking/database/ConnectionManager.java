package com.woodworking.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;
import com.mysql.jdbc.CallableStatement;

public class ConnectionManager {
	private final Logger log = Logger.getLogger(getClass().getName());

	public DataSource obtenerOrigenDeDatos() throws InterruptedException,
			NamingException {
		AbandonedConnectionCleanupThread.shutdown();
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx
				.lookup("java:/comp/env/jdbc/ConexionMySQL");
		return ds;
	}

	public void cerrarConeccion(Connection con, PreparedStatement ps,
			CallableStatement cs, Statement sttm, ResultSet rs) {
		try {
			if (con != null) {
				con.close();
				log.info("Cerrando conexión");
			}
			if (ps != null) {
				ps.close();
				log.info("Cerrando PreparedStatement");
			}
			if (cs != null) {
				cs.close();
				log.info("Cerrando CallableStatement");
			}
			if (sttm != null) {
				sttm.close();
				log.info("Cerrando Statement");
			}
			if (rs != null) {
				rs.close();
				log.info("Cerrando ResultSet");
			}
		} catch (SQLException e) {
			log.severe(e.getMessage() + " - " + e.getLocalizedMessage());
		}
	}
}
