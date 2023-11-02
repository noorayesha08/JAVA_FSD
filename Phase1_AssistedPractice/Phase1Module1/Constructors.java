package Phase1Module1;

public class Constructors {

	int id;  
	String name;  
	
	Constructors(int i,String n){  
		id = i;  
		name = n;  
	} 

	void display(){
		System.out.println("This is a Parameterized Constructor ");
		System.out.println(id+" "+name); 
	}   	 

	public static void main(String args[]){  
 
		Constructors c1 = new Constructors(1001,"Noor"); 
		Constructors c2 = new Constructors(1002,"Ayesha"); 

		c1.display();
		c2.display();
	}  
}

