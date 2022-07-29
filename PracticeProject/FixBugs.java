package PracticeProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class FixBugs {
	
	    public static void main(String[] args) {
	    	
	        System.out.println("Hello World!");
	        System.out.println("\n**************\n");
	        System.out.println("\tWelcome to The Desk \n");
	        System.out.println("**************");
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(5000);
	        expenses.add(6500);
	        expenses.add(54000);
	        expenses.add(23000);
	        expenses.add(5500);
	        optionsSelection(expenses);

	    }
	    private static void optionsSelection(ArrayList<Integer> expenses) {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	 
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	                
	        	switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection(expenses);
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Your value is updated\n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection(expenses);
	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection(expenses);
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        optionsSelection(expenses);
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        optionsSelection(expenses);
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	    
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        System.out.println("Enter the expense you need to search:\t");
	        
	       Scanner inp=new Scanner(System.in);
	       int n=inp.nextInt();
	      
	    	   if(arrayList.contains(n))
	    		   System.out.println(n+" : is present in Arraylist");
	    	   else 
	    		   System.out.println(n+" : is  not present in Arraylist");
	       
	        //Complete the method
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();   // here i write the code for sorting 
	        for (int i = 0; i < arrlength - 1; i++)
	        for (int j = 0; j < arrlength - i - 1; j++)
	        {
	        	int a=arrayList.get(j);
	        	int b=arrayList.get(j+1);
	            if (a > b) {
	                
	            	Collections.swap(arrayList, j, j+1); // use for the swap
	            }
	        }
	    }
	}