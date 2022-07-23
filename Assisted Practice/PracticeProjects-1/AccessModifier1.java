package PracticeProjects;

public class AccessModifier1 {
	public void methodPublic() {
		System.out.println("This is public method");
	}
	
	private void methodPrivate() {
		System.out.println("This is private method");
	}
	
	void methodDefault() {
		System.out.println("This is default method");
	}
	
	protected void methodProtected() {
		System.out.println("This is protected method");
	}
	
	//same class able to access all types of modifiers
	public static void main(String [] args) {
		
		AccessModifier1 obj= new  AccessModifier1();
		
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
	
	}

}
