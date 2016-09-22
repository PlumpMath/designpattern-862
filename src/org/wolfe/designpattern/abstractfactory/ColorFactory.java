package org.wolfe.designpattern.abstractfactory;

/**
 * ProjectName: DesignPattern
 * FileName: ColorFactory.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:57:49
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		if ("red".equals(color)) {
			return new Red();
		} else if ("green".equals(color)) {
			return new Green();
		} else if ("blue".equals(color)) {
			return new Blue();
		}
		return null;
	}

}
