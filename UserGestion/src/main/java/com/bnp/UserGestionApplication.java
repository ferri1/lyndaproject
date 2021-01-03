package com.bnp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bnp.dao.UserRepository;
import com.bnp.entites.User;

@SpringBootApplication
public class UserGestionApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(UserGestionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("lynad","lynda@gmail.com","lynda"));
		userRepository.save(new User("tibari","tibari@gmail.com","tibari"));
		userRepository.save(new User("tarik","tarik@gmail.com","tarik"));
		
		
		userRepository.findAll().forEach(u->{
			System.out.println(u.toString());
		});
		
	}

}
