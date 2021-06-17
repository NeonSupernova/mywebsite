package FakeVir;
import java.util.Scanner; //Imports the Scanner(User Input) Utility
public class Main { //Defines the class
	static void askLoop() { //Creates a method 
		System.out.println("Proceed? y/n"); //Query for user input
		var promptVir = new Scanner(System.in); //Creates Scanner object promptVir
		String installVir = promptVir.nextLine(); //Creates String variable installVir and gives it the value of promptVir
		if (installVir.equals("n")) { //Creates an if statement to direct variable output for user input of "n"
		System.out.println(" "); //Creates an empty line
		System.out.println("Have a nice Day!"); //Prints string if response is "n"
		}	else if (installVir.equals("y")) { //Directs variable output for user input "y"
			 int w = 0; //Defines variable "w"
		while (w < 1) { //Creates never ending loop
			 int randomNum = (int)(Math.random() * 101); //Defines variable "randomNum" to receive a new value each time the loop runs
			 System.out.print(randomNum); //Prints value of variable "randomNum"
			}
		  promptVir.close();//Closes variable**
		  } else if (!installVir.equals("n" + "y")) { //If any text other than "n" or "y" is input
			  System.out.println("PLease Try Again"); //This will ask to try again 
			  askLoop(); //Restarts the method
		  }
	}
	public static void main(String[] args) { //Standard document form
	  String boom="Virus Installing"; //Defines variable "boom" as a string
	  System.out.println(10>9);//Not sure
	  int q = 1;//Defines variable "q"
	  while (q < 101) { //Creates a loop with the parameters "q"< 101
	  	 System.out.println(boom); //Prints the string variable "boom" in a loop until condition is met
	  	 System.out.println("	" + q + "% Complete"); //Prints the value of "q" % Complete
	 	 q++; //Adds a a value of +1 to q every time loop runs
		}
		askLoop();

	}
}
/* 
**Not sure why variable is required to
close, but it's supposed to save memory
somehow.
*/ 