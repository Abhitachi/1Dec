package oop;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		dog.setLegs(4);
		dog.setType("Domestic");
		//Accessing values through Getters
		System.out.println("D O G");
		System.out.println("Type :"+dog.getType()+" Number of Legs :"+dog.getLegs()+" Wings :"+dog.getWings()+" Age :"+Animal.age);
		dog.isOmnivore();

		System.out.println("T I G E R");
		Animal tiger = new Animal(4,"Wild");
		tiger.display();
		tiger.isCarnivore();
		Animal.incrementAge();

		System.out.println("P I G E O N");
		Animal pgn = new Animal(4,"Domestic",2);
		pgn.display();
		pgn.isHerbivore();
		Animal.incrementAge();

	}

}
class Animal
{
	//instance variables
	int legs;
	String type;
	int wings;
	//static variable
	static int age=0;

	//CONSTRUCTORS
	Animal()
	{
	System.out.println("ANIMALS");
	}
	Animal(int legs, String type)
	{
		//CONSTRUCTOR CHAINING
		this(4,type,0);
	}
	Animal(int legs, String type,int wings)
	{
		this.legs = legs;
		this.type = type;
		this.wings=wings;
	}

	//Auto generated Getters & Setters
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLegs() {
		return legs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	public int getWings() {
		return wings;
	}
	//Member Functions
	public void isHerbivore()
	{
		System.out.println("Is a Herbivore");
	}
	public void isCarnivore()
	{
		System.out.println("Is a Carnivore");
	}
	public void isOmnivore()
	{
		System.out.println("Is a Omnivore");
	}
	public void display() {
		System.out.println("Type :"+this.type+" Number of Legs :"+this.legs+" Wings :"+this.wings+" Age :"+age);
	}
	
	static void incrementAge()
	{
		age++;
		System.out.println("Incremented age :"+age);
	}

}
