package org.wolfe.designpattern.factory;
/**
 * ProjectName: DesignPattern
 * FileName: Rectangle.java
 * PackageName: org.wolfe.designpattern.factory
 * Date: 2016-9-21下午4:43:02
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
