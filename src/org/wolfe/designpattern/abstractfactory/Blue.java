package org.wolfe.designpattern.abstractfactory;
/**
 * ProjectName: DesignPattern
 * FileName: Blue.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:50:03
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Blue::fill() method");
	}

}
