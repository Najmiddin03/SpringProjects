package com.neotron.specs;

import org.springframework.stereotype.Component;

import com.neotron.interfaces.Engine;
@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V8 engine";
	}

}
