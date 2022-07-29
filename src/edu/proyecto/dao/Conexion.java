package edu.proyecto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

	private static Connection cone = null;
	private final static String BASE_URL = "jdbc:mysql://localhost:3307/%s";
	
	
	/**
	 * Descripcion: Establece la conexion a la base de datos
	 * 
	 * @param database Base de datos con la que se desea establecer la conexion
	 * @return cone Devuelve un objeto Connection con la conexion establecida
	 * 
	 **/
	
	
	public static Connection conectar(String database) {
		
		try{
			Properties credenciales = new Properties(); 
			credenciales.put("user", "root");
			credenciales.put("password", "root1234");
			cone = DriverManager.getConnection(String.format(BASE_URL, database), credenciales);
			System.out.println(cone);
			
			
		}catch(SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    
		}
		
		return cone;
		
	}

}
