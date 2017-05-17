package org.test.maven.server.console.service;

import org.test.maven.server.api.service.TestRegistryService;
import org.test.maven.server.other.api.OtherService;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class TestRegistryServiceImpl implements TestRegistryService{

	@Reference
	private OtherService otherService;
	
	@Override
	public String hello(String name) {
		System.out.println("TestRegistryServiceImpl*************************" + name);
		otherService.sayWhat(name);
		return "hello" + name;
	}

}
