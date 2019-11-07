package day19_ForLoop;

import java.util.Scanner;

public class warmup {
	/*
	 * Given: username: cybertek.batch12@gmail.com
            password: Javengers
    write a program for the login functionality of the gmail account. (user input is required)
        - username can be entered either in upper or lower case
        - password MUST be entered as it is
        - if the username does not end with "@gmail.com":
                    print "it's not a valid email address"
        - if username ends with gmail but :
                    username and password did not match:
                        print "Invalid username and password"
                    username did not match:
                        print "Invalid username"
                    password did not match:
                        print "Invalid password"
        - if the username and passwords are correct:
                    print "loged in successfully"
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user name");
		String username=scan.nextLine().toLowerCase();
		
		System.out.println("Enter password");
		String password=scan.nextLine();
		
		if (username.endsWith("@gmail.com")){
		    if (username.equalsIgnoreCase("cybertek.batch12@gmail.com") && password.equals("Javengers")){
		    	System.out.println("logged in successfully");
		    }else  {
		    	 if (!username.equalsIgnoreCase("cybertek.batch12@gmail.com") && password.equals("Javengers")) {
		    	System.out.println("invalid user name");
		    }else if(username.equalsIgnoreCase("cybertek.batch12@gmail.com") && !password.equals("Javengers")) {
		    	System.out.println("invalid password");
		    }else {
		    	System.out.println("invalid username and password");
		    }
		    }
		
		
		}else {
			System.out.println("it is not a valid email");
		}

}
}