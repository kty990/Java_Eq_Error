package unit1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/**
	 * Notes:
	 * 		Make the question come from an array list
	 * 		After all the basics are working, make this into a GUI for user friendly usage
	 * 		Main class should be the one running the information, side classes display the information in the GUI
	 */
	
	private static String author = "@kty990";
	private static double version = 0.1;
	private static int unit = 1;
	private static String question;
	private static String input; //lookup how to get input from user
	
	public boolean active = true;
	
	private static void print(String printable) {
		System.out.println(printable);
	}
	
	public static Scanner scan;
	public static ArrayList<String> questions = null;
	public static ArrayList<String> answer;
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		scan = new Scanner(System.in);
		print("Author: " + author);
		print("v" + Double.toString(version));
		print("Unit: " + Integer.toString(unit));
		questions = new ArrayList<String>();
		answer = new ArrayList<String>();
		String Q1 = "Does this work?"; //repeat for all questions
		questions.add(Q1); //repeat for all questions
		String A1 = "Maybe?";
		answer.add(A1);
		
		askQuestion(0); //I am going to make this into a GUI later on, and have different ways to select a question, but for now, this is what I have
	}
	
	
	
	public static void askQuestion(int question_number) {
		getQuestion(question_number);
		getReply();
		if(input.equals(answer.get(question_number))) {
			print("Yay, that is the correct answer!");
		} else {
			print("Sorry, the correct answer is: " + answer.get(question_number));
			print("You put: " + input);
			
		}
	}
	
	private static void getQuestion(int questionNum) {
		if(questions != null) { //fix nullpointerexception and then continue working
			print(questions.get(questionNum));
		}
	}
	
	private static void getReply() {
		input = scan.nextLine();
	}
	
	public void setActive(boolean Activate) {
		if(active != true) {
			active = true;
			print("New active unit: " + Integer.toString(unit));
		}
	}
}
