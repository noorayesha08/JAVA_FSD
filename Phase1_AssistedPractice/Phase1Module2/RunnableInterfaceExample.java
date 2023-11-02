package Phase1Module2;

class ImplementingRunnableThread implements Runnable 
{ 
	Thread t; 
	int i; 
	String s[]={"Welcome","to","Java","Programming","Language"}; 
	ImplementingRunnableThread() 
	{ 
		t=new Thread(this,"Runnable Interface Thread "); 
		System.out.println("Thread is :"+t); 
		t.start(); 
	} 
	public void run() 
	{ 
		String name=t.getName(); 
		for(int i=0;i<s.length;++i) 
		{ 
			try 
			{ 
				Thread.sleep(500); 
			} 
			catch(Exception e) 
			{ 
			} 
			System.out.println(name+" : "+s[i]); 
		} 
	}  
}

public class RunnableInterfaceExample {

	public static void main(String[] args) {		
		new ImplementingRunnableThread();
	}

}
