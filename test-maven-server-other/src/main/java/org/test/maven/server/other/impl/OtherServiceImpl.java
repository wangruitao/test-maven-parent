package org.test.maven.server.other.impl;

import org.test.maven.server.other.api.OtherService;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class OtherServiceImpl implements OtherService {

	@Override
	public String sayWhat(String name) {
		String str = name + " say what";
		System.out.println(str);
		return str;
	}

}
