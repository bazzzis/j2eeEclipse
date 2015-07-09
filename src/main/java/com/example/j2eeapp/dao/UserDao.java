package com.example.j2eeapp.dao;

import com.example.j2eeapp.commons.dao.GenericDao;
import com.example.j2eeapp.domain.UserEntity;

/**
 * Data access objetc interface to work with user entity database operations
 * 
 * @author bazzis
 *
 */

public interface UserDao extends GenericDao <UserEntity, Long  > {
/**
 * Queries database for user name availability 
 * 
 * @param userName
 * @return true if the requested user name is available 
 */
	boolean checkAvailable(String userName);
/**
 * Queries user by userName. 
 * 
 * @param userName
 * @return return value if user name is avalable
 */
	UserEntity loadUserByUserName(String userName);
}
