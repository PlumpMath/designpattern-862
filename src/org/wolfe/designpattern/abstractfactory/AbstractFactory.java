package org.wolfe.designpattern.abstractfactory;

/**
 * ProjectName: DesignPattern
 * FileName: AbstractFactory.java
 * PackageName: org.wolfe.designpattern.abstractfactory
 * Date: 2016-9-22上午10:53:27
 * Author: wolfe_yuan
 * Description: TODO
 * Copyright (c) 2016, wolfe_yuan@163.com All Rights Reserved.
 */
public interface AbstractFactory {
	Shape getShape(String shapeType);

	Color getColor(String color);
}
