package com.neotron.specs;

import org.springframework.stereotype.Component;

import com.neotron.interfaces.Engine;
@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V6 engine";
	}

}
