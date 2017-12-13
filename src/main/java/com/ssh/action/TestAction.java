package com.ssh.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ssh.service.TestService;

@Controller
@Scope("prototype")
public class TestAction extends BaseAction {
	@Resource(name="testService")
	private TestService testServicce;
	public String testStruts(){
		Thread thread = Thread.currentThread();
		System.out.println("Action:"+thread);
		System.out.println(testServicce.test());
		System.out.println("testStruts()");
		request.put("key", "test");
		return SUCCESS;
	}
}
