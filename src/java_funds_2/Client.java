package java_funds_2;

public class Client {
	AbstractFactory factoryX = new ConcreteFactoryX();
	AbstractFactory factoryY = new ConcreteFactoryY();
	
	ProductA productAX = factoryX.createProductA();
	ProductA productAY = factoryY.createProductA();
	
	ProductB productBX = factoryX.createProductB();
	ProductB productBY = factoryY.createProductB();
	
}
