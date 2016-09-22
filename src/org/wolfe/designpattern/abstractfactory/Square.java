package org.wolfe.designpattern.abstractfactory;

/**
 * ProjectName: DesignPattern
 * FileName: Square.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:46:37
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square:draw() method!");
	}

}
