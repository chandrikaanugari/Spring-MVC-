package com.example.demo.FrontEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.FrontEnd.model.Zomato;

public interface ZomatoInterface extends JpaRepository<Zomato, Integer>{

	

}