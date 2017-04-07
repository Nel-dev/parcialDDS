package org.eam.is.dds.daosample.connection;

import java.sql.*;

/**
 * Clase para conectarse a una base de datos utilizando JDBC.
 * 
 * @author Heider
 *
 */
public class DbConnection {
	/** Parametros de conexion */
	private static String bd = "banco";
	private static String login = "root";
	private static String password = "root";
	private static String url = "jdbc:mysql://localhost/" + bd;

	private Connection connection = null;

	/** Constructor de DbConnection */
	public DbConnection() {
		try {
			// obtenemos el driver de para mysql
			Class.forName("com.mysql.jdbc.Driver");
			// obtenemos la conexión
			connection = DriverManager.getConnection(url, login, password);
			if (connection != null) {
				System.out.println("Conexion a base de datos " + bd + " OK\n");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** Permite retornar la conexion */
	public Connection getConnection() {
		return connection;
	}

}