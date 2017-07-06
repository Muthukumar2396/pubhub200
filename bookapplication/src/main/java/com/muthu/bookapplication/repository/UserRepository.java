package com.muthu.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.bookapplication.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmailAndPassword (String emailid,String Password) ;

}