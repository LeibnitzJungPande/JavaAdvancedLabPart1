package Lab2.Assignment18;

public class Run {
	public static void main(String args[]) {
		Animal dodo=new Dog();
		dodo.speak();
		Animal pussy=new Cat();
		pussy.speak();
		Animal hante=new Hippo();
		hante.speak();
		Animal general=new Animal();
		general.speak();
		System.out.println();
	}
}
