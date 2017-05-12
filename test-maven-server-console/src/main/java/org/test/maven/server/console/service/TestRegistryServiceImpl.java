package org.test.maven.server.console.service;

import org.springframework.stereotype.Service;
import org.test.maven.server.api.service.TestRegistryService;

@Service("testService")
public class TestRegistryServiceImpl implements TestRegistryService{

	@Override
	public String hello(String name) {
		
		return "hello" + name;
	}

}
