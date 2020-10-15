package com.turing.spring02;
/**
 * 打印店
 * @author admin
 *
 */
public class PrintHouse {
	private PinPrint pinPrint;//属性
	//创建无参构造方法
	public PrintHouse(){
		pinPrint=new PinPrint();
	}
	
	public void service(){
		pinPrint.print();
	}
	
	public static void main(String[] args) {
		//通过new 创建对象会增强耦合性
		PrintHouse house = new PrintHouse();
		house.service();
	}
}
