package org.wolfe.designpattern.factory;
/**
 * ProjectName: DesignPattern
 * FileName: FactoryPatternDemo.java
 * PackageName: org.wolfe.designpattern.factory
 * Date: 2016-9-21下午4:46:59
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape("circle");
		circle.draw();
		Shape square = factory.getShape("square");
		square.draw();
		Shape rectangle = factory.getShape("rectangle");
		rectangle.draw();
		Shape unknow = factory.getShape("other");
		if (null==unknow) {
			System.out.println("no this type factory!");
		}
	}

}
