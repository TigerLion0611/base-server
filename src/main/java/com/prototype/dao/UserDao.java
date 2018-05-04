package com.prototype.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.prototype.model.entity.User;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, String>, PagingAndSortingRepository<User, String>{

	User findByUserName(String userName);	

	User findByUserNameAndPassword(String userName, String password);
}
