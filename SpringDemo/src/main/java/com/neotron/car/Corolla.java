package com.neotron.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.neotron.interfaces.Car;
import com.neotron.interfaces.Engine;

public class Corolla implements Car {
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;

	@Override
	public void specs() {
		System.out.println("Sedan from Toyota with engine " + engine.specs());
	}

}
