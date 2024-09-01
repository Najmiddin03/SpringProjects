package com.neotron.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.neotron.interfaces.Car;
import com.neotron.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;

	@Override
	public void specs() {
		System.out.println("Sedan from Toyota with engine " + engine.specs());
	}

}
