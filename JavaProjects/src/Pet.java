
public class Pet {
	private String name;
	private int age;
	private double weight;
	private String type;
	private String breed;
	
	public Pet() {
		name = "";
		age = 0;
		weight = 0.0;
		type = "N/A";
		breed = "N/A";
		
	}
	/*
	 * Pre-Condition: name != ""
	 * Age >= 0
	 * Weight <= 0.0
	 * Type != ""
	 * Breed != ""
	 */
	
	public Pet(String name, int age, double weight, String type, String breed) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.type = type;
		this.breed = breed;
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public String getType() {
		return type;
	}
	public String getBreed() {
		return breed;
	}
	
	public String toString() {
		return String.format("Name: %s, \nAge: %d, \nWeight: %.02f, \nType: %s, \nBreed: %s.", name, age, weight, type, breed);
		
	}

}
