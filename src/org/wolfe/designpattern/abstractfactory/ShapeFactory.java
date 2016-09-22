package org.wolfe.designpattern.abstractfactory;
/**
 * ProjectName: DesignPattern
 * FileName: ShapeFactory.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:51:58
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class ShapeFactory implements AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if("circle".equals(shapeType)){
			return new Circle();
		}else if("square".equals(shapeType)){
			return new Square();
		}else if("rectangle".equals(shapeType)){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
