package practiceprojects2;

	class Exceptionhandler extends Exception{
		   String str1;
		   Exceptionhandler(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}
		class Example1{
		   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new Exceptionhandler("This is My error Message");
			}
			catch(Exceptionhandler exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
		}
		
		


