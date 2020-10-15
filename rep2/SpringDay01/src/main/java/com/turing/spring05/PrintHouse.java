package com.turing.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 打印店
 * 
 * @author admin
 *
 */
@Configuration // 相当于xml
@ComponentScan // 相当于自动扫描当前项目先的包
public class PrintHouse {
	//@Autowired
	//@Qualifier("pinPrinter")
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
		// 通过注解的方式创建spring容器对象
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PrintHouse.class);
		// 通过名称
		Print bean = ctx.getBean(LaserPrint.class);
		bean.print();
		
		/*PrintHouse print = new PrintHouse();
		print.service();*/
	}

}
