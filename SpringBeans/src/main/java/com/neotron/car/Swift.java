package com.neotron.car;

import org.springframework.stereotype.Component;

import com.neotron.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Hatchback from Suzuki ");
	}

}
