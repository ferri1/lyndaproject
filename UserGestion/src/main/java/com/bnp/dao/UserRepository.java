package com.bnp.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bnp.entites.User;

@RepositoryRestResource
@CrossOrigin(name="http://localhost:4200")
public interface UserRepository extends JpaRepository<User, Long> {

	//http://localhost:8080/users/search/findUser?email=lynda@gmail.com&password=lynda
	@RestResource(path="/findUser")
	public User findByEmailAndPassword(@Param("email")String email,@Param("password")String password);

	//http://localhost:8080/users/search/findByname?nom=tibari
	@RestResource(path="/findByname")
	public User findByNom(@Param("nom")String nom);
	
	@RestResource(path="/findByEmail")
	public User findByEmail(@Param("email")String email);
}
