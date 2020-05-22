/**
 * 
 */

/**
 * Sindhu Muni Padmanabha 300297872
 *
 */

import java.util.Scanner;
public class myFirstJava {

	/**
	 * Created new branch branch1
	 * The Java file will ask for name and age to be entered by the user
	 * and will show the output after receiving input from user
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age;
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter your name:");
		name=input.nextLine();
		System.out.print("Please enter you age:");
		age=input.nextInt();
		System.out.println("Your name is "+name+" and you are "+ age+" years old ");
	}

}
