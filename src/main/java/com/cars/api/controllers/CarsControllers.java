package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.DTO.CarDTO;

@RestController
@RequestMapping("/car")
public class CarsControllers {
	
	@PostMapping
	public void createCar(@RequestBody CarDTO car){
		System.out.println("carro é: "+ car.modelo());
		System.out.println("Do fabricante: " + car.fabricante());
		System.out.println("No valor de: "+ car.valor());
	}
}
