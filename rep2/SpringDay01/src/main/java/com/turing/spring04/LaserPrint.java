package com.turing.spring04;

import org.springframework.stereotype.Component;

/**
 * 针式打印机
 * @author admin
 *
 */
@Component
public class LaserPrint implements Print{
	@Override
	public void print(){
		System.out.println("针式打印机开始工作");
	}
}
