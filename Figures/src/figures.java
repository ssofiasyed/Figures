/*Name: Sofia Syed
 *CPSC-50100 Programming FUndamentals
 *Summer 2020
 *PROGRAMMING ASSIGNMENT 2 - Figures
 */
import java.util.Scanner;
public class figures {
		static void printBox(int size) { //method for printing box
			for(int x=0;x<=size;x++) { //for loop created for the rows represented by x
				for(int y=0; y<=size; y++) { //for loop created for the columns represented by y
	               System.out.print("X");
	           }
	           System.out.println(); }		
}
		static void printDiamond(int size) { //method for printing box
			{
				int x,y,z; //initialize variables
				size=size+1;
				z = (size/2);
				for(x = 1; x<= z; x++) {
				for(y = 1; y<=(z-x); y++){
				System.out.print(" ");
				}
				if(x == 1) {
				System.out.print("XX");
				} else {
				System.out.print("X");

				for(y = 1; y<=2*x-3; y++){
				System.out.print(" ");
				}
				System.out.print("X");
				}
				System.out.print("\n");
				}
				for(x = z+1; x<size; x++) {
				for(y = 1; y<=x-z; y++) {
				System.out.print(" ");
				}
				if(x == size-1) {
				System.out.print("XX");
				} else {
				System.out.print("X");

				for(y = 1; y<=2*(size - x)-3; y++) {

				System.out.print(" ");
				}
				System.out.print("X");
				}
				System.out.print("\n"); }
				}
			}
			static void printX(int size) { //method for printing X
			{System.out.println();
	        // prints the top portion of the X
	        int x = size - 2; //initializing variable for the spaces
	        int y = 0; //initializing variable for start of space
	        for (int top = 1; top <= (size - 1) / 2; top++) {
	            for (int space = 1; space <= y; space++)
	                System.out.print(" ");
	            System.out.print("X");
	            for (int space = 1; space <= x; space++) {
	                System.out.print(" ");
	            }
	            	System.out.print("X");
	            	System.out.println();
	            	x -= 2;

	            	y += 1;
	        }
	        // prints the middle portion of the X
	        for (int space = 1; space <= y; space++)
	            System.out.print(" ");
	        	System.out.println("X");
	        	x = 1;

	        // prints the lower portion of the X
	        for (int top = 1; top <= (size - 1) / 2; top++) {
	            y -= 1;
	            for (int space = 1; space <= y; space++)
	                System.out.print(" ");
	            System.out.print("X");
	            for (int space = 1; space <= x; space++) {
	                System.out.print(" ");
	            }
	            	System.out.print("X");
	            	System.out.println();
	            	x += 2; }		
			}
			}
		public static void main(String[] args) {
		int size=0, option; //initializing variables
		Scanner scan=new Scanner(System.in); 
		System.out.println("Please enter a number for the size of the figure: "); //prompts user to enter a size for the figure
		size=scan.nextInt();
			while (size%2==0) { //while loop for odd number prompt
				System.out.println("Figure size must be an odd number! Please re-enter a number for the size of the figure: ");
				size=scan.nextInt();
		}
			while (true) { //while loop for menu created for choice of figure to print
				System.out.println();
				System.out.print("MENU:"); //Menu displayed to user
				System.out.println("\n1. Print box\n2. Print diamond\n3. Print X\n4. Quit Program\n");
				System.out.print("Please select an option: "); //prompts user to select option of figure
				option = scan.nextInt();
				switch (option) { //switch statement for option selection
                	case 1:printBox(size);break;
                	case 2:printDiamond(size);break;
                	case 3:printX(size); break;
                	case 4:break;
                	default:System.out.println("Invalid option.");
				}
				if (option == 4) break; //option 4 to quit program
        }
			System.out.println("Good Bye!"); //"Good Bye" message to user upon exiting the program
			System.exit(0);
		}
}
		


