package org.test.maven.action.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.maven.server.api.service.TestRegistryService;

@RestController
public class MyController {

	@Autowired
	private TestRegistryService testService;
	
	@RequestMapping("/home")
	public ResponseEntity<Map<String, String>> home() {
		System.out.println(testService.hello("wrt"));
		Map<String, String> map = new HashMap<String, String>();
		map.put("say", testService.hello("wrt"));
		return ResponseEntity.ok(map);
	}
}
