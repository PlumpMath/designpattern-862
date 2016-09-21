package org.wolfe.designpattern.factory;
/**
 * ProjectName: DesignPattern
 * FileName: Square.java
 * PackageName: org.wolfe.designpattern.factory
 * Date: 2016-9-21下午4:42:13
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw() method!");
	}

}
