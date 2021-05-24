package com.twtest.trycondition;

import com.twtest.trycondition.testBean.BeanOne.ItestInterface;
import com.twtest.trycondition.testBean.BeanTwo.ItestInterface1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TryconditionApplicationTests {

	@Autowired
	private ItestInterface itestInterface;

	@Autowired
	private ItestInterface1 itestInterface1;

	@Test
	public void contextLoads() {
		System.out.println(itestInterface.introduceSelf());
		System.out.println(itestInterface1.introduceSelf());
	}
}
