package org.wolfe.designpattern.abstractfactory;
/**
 * ProjectName: DesignPattern
 * FileName: AbstractFactoryDemo.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午11:03:44
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Shape circle = shapeFactory.getShape("circle");
		Color red = colorFactory.getColor("red");
		
		circle.draw();
		red.fill();
	}

}
