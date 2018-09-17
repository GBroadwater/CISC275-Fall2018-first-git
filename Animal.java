	public abstract class Animal{
		int legs;
		String name;

		public String toString(){return this.name;}

		public Animal(String name, int legs){
			this.name = name;
			this.legs = legs;
		}
		
		public int getLegs(){return this.legs;}
		
		
	}
	