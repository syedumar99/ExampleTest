package com.sonata.MyService;

import java.util.Arrays;
import java.util.List;

public class MyServiceStub implements MyServiceIntf{
	
	@Override
	public List<String> retrieveUsers(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}

}
