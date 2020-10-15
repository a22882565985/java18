package com.turing.spring03;
/**
 * 针式打印机
 * @author admin
 *
 */
public class LaserPrint implements Print{
	@Override
	public void print(){
		System.out.println("针式打印机开始工作");
	}
}
