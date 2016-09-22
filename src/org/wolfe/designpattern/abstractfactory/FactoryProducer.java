package org.wolfe.designpattern.abstractfactory;

/**
 * ProjectName: DesignPattern
 * FileName: FactoryProducer.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午11:00:17
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if ("shape".equals(choice)) {
			return new ShapeFactory();
		} else if ("color".equals(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
