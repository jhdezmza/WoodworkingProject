package com.woodworking.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;

public class Test {
	public static void testConn() {
		Connection con = null;
		Statement sttm = null;
		ResultSet rs = null;
		try {
			AbandonedConnectionCleanupThread.shutdown();
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx
					.lookup("java:/comp/env/jdbc/ConexionMySQL");
			con = ds.getConnection();
			String sql = "SELECT * FROM area";
			System.out.println(sql);
			sttm = con.createStatement();

			if (sttm.execute(sql)) {
				System.out.println("Se ejecutó la sentencia");
				rs = sttm.getResultSet();
				System.out.println("tamaño de rs=" + rs.getFetchSize());
				if (rs.next()) {
					System.out.println("ResultSet >> " + rs.getInt(1) + " - "
							+ rs.getString(2) + " - " + rs.getString(3));
				}
			} else {
				System.out.println("No se ejecutó la sentencia");
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (sttm != null)
					sttm.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
