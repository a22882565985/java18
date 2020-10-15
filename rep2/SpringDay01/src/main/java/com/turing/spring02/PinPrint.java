package com.turing.spring02;
/**
 * 激光打印机
 * @author admin
 *
 */
public class PinPrint implements Print{
	@Override
	public void print(){
		System.out.println("激光打印机开始工作");
	}
}
