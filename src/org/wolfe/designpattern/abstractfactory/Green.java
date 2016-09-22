package org.wolfe.designpattern.abstractfactory;
/**
 * ProjectName: DesignPattern
 * FileName: Green.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:48:59
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Green::fill() method");
	}

}
