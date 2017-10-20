package com.uangteman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.service.HitungService;

@RestController
@RequestMapping("/hitung")
public class HitungController {
	
	@Autowired HitungService hitungService;
	
	@RequestMapping(value = "/add/{a}/{b}", method=RequestMethod.GET)
	public int add(int a, int b) {
		return hitungService.add(a, b);
	}
}
