package com.example.test1.dao;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public interface TestService {
	HashMap<String, Object> searchProductList(HashMap<String, Object> map);
	
	
}
