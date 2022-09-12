package com.sonata.MyServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.sonata.MyService.MyServiceIntf;
import com.sonata.MyService.MyServiceStub;


class MyServiceImplStubTest {
	
	@Test
	void test() {
		MyServiceIntf my = new MyServiceStub();
		MyServiceImpl mys = new MyServiceImpl(my);
		List<String> filterMySer = mys.retrieveRelated("Dummy");
		assertEquals(2, filterMySer.size());
	}

}