package PracticeProjects;

public class innerclass_1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  
	 
	 public static void main(String[] args) {
			innerclass_1  ob=new innerclass_1 ();  
			ob.display();  
			}

}
