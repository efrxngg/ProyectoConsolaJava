package edu.proyecto.interfaces;

import java.util.List;

import edu.proyecto.domains.User;

public interface ICrudUser {
	Boolean createUser(String base, User obj);
	List<User> getAllUsers(String base);
	Boolean getOneUser(String base, String id);
	Boolean updateUser(String base, String id);
	Boolean deleteUser(String base, String id);
	
}
