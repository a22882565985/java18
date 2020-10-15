package com.turing.spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 打印店
 * 
 * @author admin
 *
 */
@Component
public class PrintHouse {
	private Print print;// 属性

	public void service() {
		print.print();
	}

	public void setPrint(Print print) {
		this.print = print;
	}

	public PrintHouse(Print print) {
		super();
		this.print = print;
	}

	public PrintHouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 通过注解的方式创建sping容器对象
		ApplicationContext context = new ClassPathXmlApplicationContext("com/turing/spring04/ApplicationContext.xml");
		// 获取激光打印机
		Print p = (Print) context.getBean("pinPrint");
		p.print();
	}

}
