package court;

// The libraries used in this project
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.ArrayList;

// main method
public class court
{
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
		 char login;
		 
		 System.out.println("\n\n     -------------------- Welcome to Al.Aali Law Firm --------------------\n\n");
		 System.out.print("Do you want to login as a lawyer or guest for lawyer press l for guest press g ? ");
		 login = input.next().charAt(0);
		 
		   if(login == 'g' || login == 'G')
		   {
			 // object from sup class (Guest account)
			 Guestـaccount x1 = new Guestـaccount();
			 
			 // Upcasting object
			 Information x2 = new Guestـaccount();
			 
			 x1.desplay();
			 x2.Advantages();
		   }
		   
		   if(login == 'l' || login == 'L') 
		   {
			 // object from sup class (Court_justice)
			   Court_justice x = new Court_justice();
			 x.getLawyer();
			 x.print(); 
		   }  
	 }
	 
}

// class Lawyer
class Court_justice
{
	// list of variables 
	public String Lawyers_name [] = {"Ali Salem","Abdulaziz Mohammed","Turkish Khaled","Abdullah Saleh","Mohamed Nawaf","Ghanem Hamad"};
	private String Lawyer_Username;
	private String Lawyer_password;
	public String scheduled_cases;
	int date;
	String Plaintiff_name;
	String Defendant;
    int Civil_Registry;
    String case_name;
	String Evidence;
	String Case_content;
	int Serial_Number;
	int Day;
	int month;
	
	// object from class Cases
	Cases x = new Cases();
	
	// object from Random library
	Random rand = new Random();
	Random R1 = new Random();
	Random R2 = new Random();
	Random R3 = new Random();
	
	// object from Date library
	Date D = new Date();
	
	Scanner input = new Scanner(System.in);
	
	// This method to Log in to the lawyer's account
void getLawyer()
{
	System.out.print("\nEnter the username: ");
	Lawyer_Username = input.next();
	
	System.out.print("Enter the password: ");
	Lawyer_password = input.next();
}
void print()
{
	int choice;
	char option;
	System.out.println("\nWelcome " + Lawyers_name[rand.nextInt(Lawyers_name.length)]);
	System.out.println("\nIf you want to add a new case, please press 1");
	System.out.println("If you want to see a previous case, please press 2\n");
	choice = input.nextInt();
	
	while(choice != 1 || choice != 2)
	{
		if(choice == 1)
		{
			System.out.print("Enter the Plaintiff name: ");
			Plaintiff_name = input.next();
			System.out.print("Enter the Defendant name: ");
			Defendant = input.next();
			System.out.print("Enter the Civil Registry: ");
			Civil_Registry = input.nextInt();
			System.out.print("Enter the case name: ");
			case_name = input.next();
			System.out.print("Enter the Evidence in this case: ");
			Evidence = input.next();
			System.out.print("Enter the content of the case: ");
			Case_content = input.next();
			System.out.println("\nA new case has been added successfully.\nThe case date is " + D);
			int rand_int1 = R1.nextInt(0,4);
			int rand_int2 = R1.nextInt(5,7);
			int rand_int3 = R1.nextInt(8,10);
			System.out.println("The serial number for this case is " +rand_int1 + rand_int2 + rand_int3);
			break;
			
		}
		if(choice == 2)
		{
			System.out.print("\nDo you want to enter by serial number or date ? s for serial number d for date ");
			option = input.next().charAt(0);
			
			if(option == 'S' || option == 's')
			{
				System.out.print("\nPlease enter the serial number: ");
				Serial_Number = input.nextInt();
				x.Cases_Information(Serial_Number);
			}
			if(option == 'D' || option == 'd')
			{
				System.out.println("\nPlease enter the date: ");
				System.out.print("The day: ");
				Day = input.nextInt();
				System.out.print("The month: ");
				month = input.nextInt();
				x.Cases_Information(Day,month);
			}
			
			break;
		}
		else
		{
		   System.out.println("\nSorry, wrong choice Try again ");
		   System.out.println("If you want to add a new case, please press 1");
		   System.out.println("If you want to see a previous case, please press 2\n");
		   choice = input.nextInt();
		   
		}
			
	}
	
}

	
	
	
	
}

// class Cases
class Cases
{
	// Overloading method
	public void Cases_Information(int Serial_Number)
	{
		// The case 1
		if(Serial_Number == 220)
		{
			System.out.println("\nThe Plaintiff name is Khaled Al Salem");
			System.out.println("The Defendant name is Turki Al-Ali");
			System.out.println("The Civil Registry is 1222145656");
			System.out.println("The case name is 'scam case' ");
			System.out.println("The Evidence in the case is: ");
			System.out.println("1- Bank transfer of 200,000 ");
			System.out.println("2- conversations between Plaintiff and Defendant");
			System.out.println("On Wednesday, February 12, 2022, the plaintiff (Khalid Al Salem) transferred an amount of 200,000\n "
					+ "to the defendant (Turki Al-Ali) at the request of the defendant,\n"
					+ " as the conversations indicated that he would purchase shares for him.");
		}
		// The case 2
		if(Serial_Number == 221)
		{
			System.out.println("\nThe Plaintiff name is Hind Saleh");
			System.out.println("The Defendant name is Ahmed Sayyaf");
			System.out.println("The Civil Registry is 1232678234 ");
			System.out.println("The case name is 'violence case' ");
			System.out.println("The Evidence in the case is: ");
			System.out.println("1- Autopsy evidence that the victim was killed ");
			System.out.println("2- Testimony of Muhammad Fahd (neighbor of a victim)");
			System.out.println("On Thursday 4/5/2022, the plaintiff (Hind Saleh) was subjected to abuse by her husband, the defendant (Ahmed Sayyaf), \n"
					+ "who was beaten to the fourth degree, and she went unconscious to the hospital..\n");
		}
		// The case 3
		if(Serial_Number == 222)
		{
			System.out.println("\nThe Plaintiff name is Hassan Jassim");
			System.out.println("The Defendant name is Hashem Ahmed");
			System.out.println("The Civil Registry is 1034523678");
			System.out.println("The case name is 'murder case' ");
			System.out.println("The Evidence in the case is: ");
			System.out.println("1- Bank transfer of 200,000 ");
			System.out.println("2- Record calls and conversations");
			System.out.println("On Sunday, 07/07/2022, the plaintiff (Hassan Jassim) filed a case against the defendant (Hashem Ahmed)\n"
					+ " due to the murder of the plaintiff’s brother, Hussein Jassim,\n "
					+ "as the evidence states that there are problems between the victim and the defendant and that the last victim’s meeting was with him");
		}	
	}
	
	// Overloading method
	public void Cases_Information(int Day,int month)
	{
		if(Day == 2 && month == 3)
		{
			System.out.println("\nThe Plaintiff name is Abdulaziz Mohammed");
			System.out.println("The Defendant name is Fahad Hamed");
			System.out.println("The Civil Registry is 1113422674");
			System.out.println("The case name is 'house burglary case' ");
			System.out.println("The Evidence in the case is: ");
			System.out.println("1- camera footage of the house  ");
			System.out.println("2- The finger prints on the broken windows ");
			System.out.println("On Sunday, June 14, 2022, the plaintiff (Abdulaziz Muhammad)\n"
					+ "was robbed by the defendant (Fahd Ahmed), who broke the glass of the window and robbed the house");
			
		}
		if(Day == 4 && month == 4)
		{
			System.out.println("\nThe Plaintiff name is Maha Al-Abullah(school principal)");
			System.out.println("The Defendant name is Waleed Faisald");
			System.out.println("The Civil Registry is 1215574786");
			System.out.println("The case name is ’girls school shooting’ ");
		    System.out.println("The Evidence in the case is: ");
			System.out.println("1- security cameras ");
			System.out.println("2- The finger prints on the broken windows ");
			System.out.println("On Tuesday March20, 2022, the defendanrt(Waleed Faisal)\n "
					+ "was caught shooting outside the girls school");
			
		}
		if(Day == 6 && month == 1)
		{
			System.out.println("\nhe Plaintiff name is Ziad Khaled");
			System.out.println("The Defendant name is Saad Ali");
			System.out.println("The Civil Registry is 1345223428");
			System.out.println("The case name is 'car theft' ");
		    System.out.println("The Evidence in the case is: ");
			System.out.println("1- The presence of surveillance cameras in front of the house ");
			System.out.println("the presence of fingerprints on the tools used to break the car window ");
			System.out.println("On Saturday October 29, 2022, The plaintiff (Ziad Khaled)"
					+ "\nfiled a lawsuit against the defendant (Saad Ali)  "
					+ "\n because of the theft of the plaintiff's car (Ziad Khaled) "
					+ "\nwhere the plaintiff showed some threatening messages from the defendant (Saad Ali)");
			
		}
		
	}
	
	
	
	
	
}

// super class
abstract class Information
{
	String Lawyer1 = "Ali Salem";
	String Lawyer2 = "Abdulaziz Mohammed";
	String Lawyer3 = "Turkish Khaled";
	String Lawyer4 = "Abdullah Saleh";
	String Lawyer5 = "Mohamed Nawaf";
	String Lawyer6 = "Ghanem Hamad";
	
	double Lawyer1_fees = 240;
	double Lawyer2_fees = 300.5;
	double Lawyer3_fees = 200;
	double Lawyer4_fees = 400;
	double Lawyer5_fees = 260.5;
	double Lawyer6_fees = 350;
	
	//@Override
	void desplay()
	{
		System.out.println(" --------------------------------------------------");
		System.out.println("|     Lawyers' names     |     Lawyers' prices     |");
		System.out.println(" --------------------------------------------------");
		System.out.println("|     "+Lawyer1+"          |         "+Lawyer1_fees+"RS         |" );
		System.out.println(" --------------------------------------------------");
		System.out.println("|  "+Lawyer2+"    |         "+Lawyer2_fees+"RS         |" );
		System.out.println(" --------------------------------------------------");
		System.out.println("|   "+Lawyer3+"       |         "+Lawyer3_fees+"RS         |" );
		System.out.println(" --------------------------------------------------");
		System.out.println("|   "+Lawyer4+"       |         "+Lawyer4_fees+"RS         |" );
		System.out.println(" --------------------------------------------------");
		System.out.println("|    "+Lawyer5+"       |         "+Lawyer5_fees+"RS         |" );
		System.out.println(" --------------------------------------------------");
	    System.out.println("|     "+Lawyer6+"       |         "+Lawyer6_fees+"RS         |" );			   
		System.out.println(" --------------------------------------------------");
		
	}
	
	//Polymorphism
	abstract void Advantages();
	
}

//sup class
class Guestـaccount extends Information
{
	String email;
	String password;
	String name1;
	String name2;
	char answer;
	
	//@Override
    void desplay()
	{
			Scanner input = new Scanner(System.in);
			System.out.println("\n\nHi To see all our benefits, log in/sign in ");
			
			
			System.out.print("\nDo you have an account ? y for yes/ n for no: ");
			answer = input.next().charAt(0);
			
			while(answer != 'y' || answer != 'Y' || answer != 'n' || answer != 'N')
			{
				//How to log in if he already has an account
				if(answer == 'y' || answer == 'Y')
				{
					System.out.print("\nEnter your email: ");
				    email = input.next();
					System.out.print("Enter your password:  ");
				    password = input.next();
				    break;
				}
				
				//How to log in if you do not have an account
				else if(answer == 'n' || answer == 'N')
				{
					System.out.print("\nEnter your first name:  ");
				    name1 = input.next();
					System.out.print("Enter your last name:  ");
				    name2 = input.next();
					System.out.print("Enter your email: ");
				    email = input.next();
					System.out.print("Enter your password:  ");
				    password = input.next();
				    break;
				}
				else
				{
				    System.out.println("\nSorry, wrong answer. Answer again ");
				    System.out.print("\nDo you have an account ? y for yes/ n for no: ");
					answer = input.next().charAt(0);
				}
					
			}
		System.out.print("\nThis is our lawyers list\n\n ");
		
		
		//super keyword to get to the method in super class
		super.desplay();
		
		
		System.out.print("\n\nIf you want to hire a lawyer, please call this number 0556002116\n\n");
		
	}
    
    //Polymorphism
	void Advantages() 
	{
		// Arraylist
		ArrayList<String> comments = new ArrayList<String>();
		String comment1;
		String comment2;
		int C;
		int C1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nAl-Aali firm has nearly 1,000 expert lawyers. Where there are many lawyers who have\n"
				+ "received the Legal Excellence Award, Al Aali Company has won many cases\n ");
		
		System.out.print("\nDo you have any questions about our company? 1 for YES 2 for NO ? ");
		C = input.nextInt();
		if(C == 1)
		{
			System.out.print("Please enter your questions here: ");
			comment1 = input.next();
			
			// method (add) to add element in ArrayList
			comments.add(comment1);
			
			System.out.print("\nWe will evaluate your questions and reply to the email as soon as possible. Thank you for your time\n ");
		}
		else if(C == 2)
		{
			System.out.print("\nThank you for your time\n ");
		}
		
		
		System.out.print("\nDo you have any comments for lawyers? 1 for YES 2 for NO ? ");
		C1 = input.nextInt();
		if(C1 == 1)
		{
			System.out.print("Please enter your comments here: ");
			comment2 = input.next();
			
			// method (add) to add element in ArrayList
			comments.add(comment2);
			
			System.out.print("\nWe will evaluate your comments. Thank you for your time\n ");
		}
		else if(C1 == 2)
		{
			System.out.print("\nThank you for your time\n ");
		}
	}	
}








