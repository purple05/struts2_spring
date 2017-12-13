package com.ssh.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	public String test(){
		Thread thread = Thread.currentThread();
		System.out.println("Service:"+thread);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "testservice()";
	}
}
