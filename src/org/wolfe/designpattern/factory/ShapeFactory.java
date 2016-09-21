package org.wolfe.designpattern.factory;

/**
 * ProjectName: DesignPattern
 * FileName: ShapeFactory.java
 * PackageName: org.wolfe.designpattern.factory
 * Date: 2016-9-21下午4:43:35
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null || shapeType.length() == 0) {
			return null;
		}
		if ("circle".equals(shapeType)) {
			return new Circle();
		} else if ("square".equals(shapeType)) {
			return new Square();
		} else if ("rectangle".equals(shapeType)) {
			return new Rectangle();
		}
		return null;
	}
}
