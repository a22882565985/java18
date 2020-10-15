package com.turing.spring04;

import org.springframework.stereotype.Component;

/**
 * 激光打印机
 * @author admin
 *
 */
@Component
public class PinPrint implements Print{
	@Override
	public void print(){
		System.out.println("激光打印机开始工作");
	}
}
