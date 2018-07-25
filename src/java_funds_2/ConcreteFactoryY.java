package java_funds_2;

public class ConcreteFactoryY implements AbstractFactory{

		public ProductA createProductA(){
			return new ProductAY();
		}
		public ProductB createProductB() {
			return new ProductBY();
		};
}

