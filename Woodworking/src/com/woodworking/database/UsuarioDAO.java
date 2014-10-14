package com.woodworking.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.sql.DataSource;

public class UsuarioDAO extends ConnectionManager {
	public boolean validateUsernamePassword(String user, String pass) {
		boolean isValid = false;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";
		try {
			DataSource ds = obtenerOrigenDeDatos();
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			if (ps.execute()) {
				rs = ps.getResultSet();
				if (rs.next()) {

				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cerrarConeccion(con, ps, null, null, rs);
		}

		return isValid;
	}
}
