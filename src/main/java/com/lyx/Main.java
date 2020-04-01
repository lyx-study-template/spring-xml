package com.lyx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		// 获得IOC容器，在获得容器时，配置文件中配置的bean就创建了
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Student student = ctx.getBean("stu", Student.class);

		System.out.println(student);
	}
}