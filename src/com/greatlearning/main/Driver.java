package com.greatlearning.main;
import java.util.*;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	//Declare a main method
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		// Take inputs from the user for firstName, lastName, display choice - department
		System.out.println("Welcome Onboard");
		System.out.print("Enter your firstname:");
		String firstName = in.next();
		System.out.print("Enter your lastname:");
		String lastName = in.next();
		System.out.println("Enter your Department:");
		System.out.println(" 1. Technical");
		System.out.println(" 2. Admin");
		System.out.println(" 3. Human Resource");
		System.out.println(" 4. Legal");
		int dept = in.nextInt();
		Employee emp = null;
		//Switch case and create an object  the firstName, lastName and department
        switch(dept)
        {
            case 1: 
           {
        	    emp = new Employee(firstName,lastName,"tech");

           }
            break;
           case 2: 
            {
            	emp = new Employee(firstName,lastName,"admin");
;
            }
             break;
           case 3: 
           {
           		emp = new Employee(firstName,lastName,"hr");

           }
            break;
           case 4: 
           {
        	   emp = new Employee(firstName,lastName,"legal");

           }
            break;
           default:
           System.out.println("Please enter only the numbers listed above");
           break;
        }
         
           // call methods from CredentialService class
           CredentialService cs = new CredentialService();
           String email = cs.generateEmailAddress(emp);
           String password = cs.generatePassword();
           cs.showCredentials(emp, email, password);
	}
	}