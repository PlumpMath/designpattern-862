package org.wolfe.designpattern.abstractfactory;

/**
 * ProjectName: DesignPattern
 * FileName: Rectangle.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:47:26
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle:draw() method!");
	}

}
