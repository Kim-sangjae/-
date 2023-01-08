package day8.sub2;

public class Ex02 {

	public static void main(String[] args) {
		/**
		Human[] humans = new Human[3];
		humans[0] = new Human();  // Human , Animal
		humans[1] = new Bird();  // Bird , Animal
		humans[2] = new Dog(); // Dog , Animal
		*/
		
		Animal[] animals = new Animal[3];
		animals[0] = new Human();
		animals[1] = new Bird();
		animals[2]  = new Dog();
		
		
		for(Animal animal : animals) {
			animal.move();
			
			if(animal instanceof Human) {
			Human human = (Human) animal;
			human.readBook();
		} else if (animal instanceof Dog) {
			
			Dog dog = (Dog)animal;
			dog.bark();
		}
		}
	}

}
