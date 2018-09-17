	public class Dog extends Animal implements Comparable<Dog>{
	
	public int compareTo(Dog dog){
		return (this.legs - dog.getLegs());
	}
	public Dog(String name, int legs){
		super(name, legs);
		}
	}