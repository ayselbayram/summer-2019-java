package day30WrapperClassArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice4 {
	public static void main(String[] args) {
		ArrayList<String> nameList=new ArrayList<>();//only accepts string
		//add()
		    nameList.add("Homayra");
		    nameList.add("Apple");
		    System.out.println(nameList);
		    
		/*create an ArrayList called student names
		   create  scanner object called scan
		   
		 
		*/
		    Scanner scan=new Scanner(System.in);
		    ArrayList<String> studentNames=new ArrayList<>();
		    
		    
		    while(true) {
		    System.out.println("Enter a name");
		    String name=scan.nextLine();
		      studentNames.add(name);
		      
		     System.out.println("do you want to add another name?");
		     String answer=scan.nextLine();
		     if((!(answer.equals("yes") || answer.equals("no")))) {
		    	 System.out.println("invalid");
		    	 break;
		     }

		     if(answer.equalsIgnoreCase("no")) {//OT toLowerCase
		    	 break;
//		     }else {
//		    	
//			    	 System.out.println("invalid");
//			    	 break;
//			     }
		     }
		    
		    
		    
		    System.out.println(studentNames);
		    
		    
		    ArrayList<Integer>list=new ArrayList<>();
		    Integer a=1;
		    System.out.println(list.remove(a));
		    
		    
		    
		    
		    }	    
	}

}
