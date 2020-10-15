package com.turing.spring01;
/**
 * 打印店
 * @author admin
 *
 */
public class PrintHouse {
	private PinPrint pinPrint;//属性
	
	public void service(){
		pinPrint=new PinPrint();
		pinPrint.print();
	}
	public static void main(String[] args) {
		PrintHouse house = new PrintHouse();
		house.service();
	}
}
