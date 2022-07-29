package edu.proyecto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.proyecto.domains.User;
import edu.proyecto.interfaces.ICrudUser;

public class CrudUser implements ICrudUser{
	
	private Statement stmt = null;
	private ResultSet rs = null;
	private Connection cursor;
	
	@Override
	public Boolean createUser(String base, User obj) {

		return null;
	}

	@Override
	public List<User> getAllUsers(String base) {
		cursor = Conexion.conectar(base);
		List<User> listUsers = new ArrayList<>();
		try {
			stmt = cursor.createStatement();
			if(stmt.execute("select * from user")) {
				rs = stmt.getResultSet();
				while(rs.next()) {
					listUsers.add(new User(rs.getInt(0),rs.getString(1), rs.getString(2)));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return listUsers;
	}

	@Override
	public Boolean getOneUser(String base, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(String base, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(String base, String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
