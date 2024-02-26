ublic class UseAnimal {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Cat myCat = new Cat();
		myDog.setName("My dog Raul");
		myCat.setName("My cat Sassa");
		System.out.print(myDog.getName() + " says ");
		myDog.speak();
		System.out.print(myCat.getName() + " says ");
		myCat.speak();.

	}

}
abstract class Animal {
	private String name;
	public abstract void speak();
	public void setName(String animalName) {
		name = animalName;
	}
	public String getName(){
		return name;
	}
}
class Dog extends Animal{
	public void speak() {
		System.out.println("Woof!");
	}
}
class Cat extends Animal{
	public void speak() {
		System.out.println("Meow!");
	}
}
