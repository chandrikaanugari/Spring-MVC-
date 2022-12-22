package com.example.demo.FrontEnd.serviceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.FrontEnd.model.Zomato;
import com.example.demo.FrontEnd.repository.ZomatoInterface;
import com.example.demo.FrontEnd.service.ZomatoService;

@Service
public class ZomatoImplement implements ZomatoService{
	private ZomatoInterface zomatoInt;

	public ZomatoImplement(ZomatoInterface zomatoInt) {
		this.zomatoInt = zomatoInt;
	}
	

	@Override
	public Zomato saveRestaurents(Zomato obj) {
		return zomatoInt.save(obj);
	}

	@Override
	public List<Zomato> fetchAllRestaurents() {
		return zomatoInt.findAll();
	}

	@Override
	public Zomato fetchById(int restaurantId) throws Exception {
		
		return zomatoInt.findById(restaurantId).get();
	}

	@Override
	public Zomato updateRestaurents(int restaurantId, Zomato newVal) {
		
		return zomatoInt.findById(restaurantId).get();
	}

	@Override
	public void deleteRestaurents(int id) {
	
		zomatoInt.deleteById(id);
	}
	
	
}