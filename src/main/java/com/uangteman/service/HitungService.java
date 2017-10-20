package com.uangteman.service;

import org.springframework.stereotype.Service;

@Service("hitungService")
public class HitungService {
	
	public int add(int a, int b) {
		return a + b;
	}

}
