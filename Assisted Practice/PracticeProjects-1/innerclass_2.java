package PracticeProjects;
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class innerclass_2 {
	

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }

}
