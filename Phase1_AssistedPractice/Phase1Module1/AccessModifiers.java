package Phase1Module1;

public class AccessModifiers {
	public int publicVariable = 7845;
	private int privateVariable = 9834; //gives error
	protected int protectedVariable = 4980;
	int defaultVariable = 9440;

	public void publicMethod() {
		System.out.println("This is Public Method");
	}

	private void privateMethod() { //gives error
		System.out.println("This is Private Method");
	}

	protected void protectedMethod() {
		System.out.println("This is Protected Method");
	}

	void defaultMethod() {
		System.out.println("This is Default Method");	
	}

}

