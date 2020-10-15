package com.turing.spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 打印店
 * @author admin
 *
 */
public class PrintHouse {
	private Print print;//属性
	//创建无参构造方法
	/*public PrintHouse(){
		print=new PinPrint();
	}*/


	public void service(){
		print.print();
	}
	
	public void setPrint(Print print) {
		this.print = print;
	}
	

	public PrintHouse(Print print) {
		super();
		this.print = print;
	}

	public static void main(String[] args) {
	//初始化Spring容器
	ApplicationContext context =new ClassPathXmlApplicationContext("com/turing/spring03/ApplicationContext.xml");
	//获取context
	//通过类型获取bean
	/*PinPrint bean = (PinPrint)context.getBean(Print.class);
	bean.print();*/
	//通过名称获取bean
	/*PinPrint bean = (PinPrint)context.getBean("pinPrint");
	bean.print();*/
	//通过名称和类型获取bean
	/*Print bean = context.getBean("pinPrint",Print.class);
	bean.print();*/
	
	//通过spring容器获取打印店
	PrintHouse house = (PrintHouse)context.getBean("printHouse2");
	house.service();
	}

}
