package org.test.maven.action.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.maven.server.api.service.TestRegistryService;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class MyController {

	@Reference(version="1.0.0")
	private TestRegistryService testService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ResponseEntity<Map<String, String>> home() {
//		System.out.println(testService.hello("wrt"));
		Map<String, String> map = new HashMap<String, String>();
		map.put("say", testService.hello("wrt"));
		return ResponseEntity.ok(map);
	}
}
