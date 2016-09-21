package org.wolfe.designpattern.factory;

/**
 * ProjectName: DesignPattern
 * FileName: Circle.java
 * PackageName: org.wolfe.designpattern.factory
 * Date: 2016-9-21下午4:40:48
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw() method!");
	}

}
