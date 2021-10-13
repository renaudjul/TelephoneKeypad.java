/*
 * Name:		            Julie Renaud 
 * Date:		            10/7/2021
 * Course Number:	      CSC-111 D01
 * Course Name:		      Intro to Java 
 * Problem Number:	    Chapter 3 Project 
 * Email: 	 	          jmrenaud2001@student.stcc.edu
 * Description: 	      Telephone Letter Mapping Project 
 */

import java.util.Scanner;

public class TelephoneLetterMapping {

	public static void main(String[] args) {

		// user input - converts user input into upper case only - converts first...
		// character (0 place) into a char data type for switch operation
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a single letter or character to find out the coresponding number on a phone keypad: ");
		String userInput = input.nextLine();
		userInput = userInput.toUpperCase();
		char firstChar = userInput.charAt(0);
		input.close();

		String result = "";
		// Switch Statement
		switch (firstChar) {
		case '1':
			result = "1";
			break;
		case 'A', 'B', 'C', '2':
			result = "2";
			break;
		case 'D', 'E', 'F', '3':
			result = "3";
			break;
		case 'G', 'H', 'I', '4':
			result = "4";
			break;
		case 'J', 'K', 'L', '5':
			result = "5";
			break;
		case 'M', 'N', 'O', '6':
			result = "6";
			break;
		case 'P', 'Q', 'R', 'S', '7':
			result = "7";
			break;
		case 'T', 'U', 'V', '8':
			result = "8";
			break;
		case 'W', 'X', 'Y', 'Z', '9':
			result = "9";
			break;
		case '*':
			result = "*";
			break;
		case '+', '0':
			result = "0";
			break;
		case '#':
			result = "#";
			break;
		default:
			result = "This character in not found on a phone keypad, try again.";
		}

		// Printed output of the "case" selected
		System.out.print(result);

	}

}
