package com.example.demo.FrontEnd.service;

import java.util.List;

import com.example.demo.FrontEnd.model.Zomato;

public interface ZomatoService {
	Zomato saveRestaurents(Zomato obj);
	List<Zomato> fetchAllRestaurents();
	Zomato fetchById(int restaurantId) throws Exception;
	Zomato updateRestaurents(int restaurantId, Zomato newVal);
	void deleteRestaurents(int id);
}