package org.wolfe.designpattern.abstractfactory;
/**
 * ProjectName: DesignPattern
 * FileName: Circle.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:45:26
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle:draw() method!");
	}

}
