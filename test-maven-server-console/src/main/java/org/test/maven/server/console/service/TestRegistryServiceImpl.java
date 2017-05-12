package org.test.maven.server.console.service;

import org.test.maven.server.api.service.TestRegistryService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class TestRegistryServiceImpl implements TestRegistryService{

	@Override
	public String hello(String name) {
		
		return "hello" + name;
	}

}
