package main;

//GUI Design by: ####### --Not started yet
//Project started on: 2019/01/22
//Saved with encryption UTF-8


import java.util.ArrayList;
import java.util.Scanner;

public class Beta_Testing {
	
	/**
	 * Notes:
	 * 		After all the basics are working, make this into a GUI for user friendly usage
	 * 		Main class should be the one running the information, side classes display the information in the GUI
	 * 		Every place that uses the print method should be changed (just change what the label displays) and have an input field where the input will come from
	 * 		Have a mode to make a quiz contain equal amounts of questions from each unit
	 * 		Sort units by different topics in the book that Hubick made us get
	 * 		The classes of the units all should be called "Main.java"
	 * 		To start, have five units and then progress from there once everything works smoothly
	 * 		Make it able to have multiple subjects, each with their own set of units / lessons
	 * 		Check to make sure only one unit is active at the start
	 * 
	 * 
	 * 		DO IMMEDIETLY NEXT TIME:
	 * 			
	 * 			In each unit, have ONE class that only contains PUBLIC lists and (doubles or ints) 
	 * 			In this class, have method to check active unit and have 2 ArrayLists in main equal to that unit's questions and answers
	 * 			In each unit's "Main" class, have a boolean to say whether that unit is active or not
	 */
	
	private static String author = "@kty990";
	private static double version = 0.1;
	private static int unit = 1;
	private static String input;
	public static int question_Length;
	public static int answer_Length;
	
	private static void print(String printable) {
		System.out.println(printable);
	}
	
	public static Scanner scan;
	public static ArrayList<String> questions = null;
	public static ArrayList<Boolean> units; 
	public static ArrayList<String> answer;
	public static ArrayList<String> incorrect = null;
	public static ArrayList<String> inC_question = null;
	public static ArrayList<String> core_correct = null;
	public static ArrayList<String> units_name = null;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		print("Author: " + author);
		print("v" + Double.toString(version));
		print("Unit: " + Integer.toString(unit));
		questions = new ArrayList<String>();
		answer = new ArrayList<String>();
		incorrect = new ArrayList<String>();
		core_correct = new ArrayList<String>();
		inC_question = new ArrayList<String>();
		units = new ArrayList<Boolean>();
		units_name = new ArrayList<String>();
		units.add(unit1.Main.active);
		units.add(unit2.Main.active);
		units.add(unit3.Main.active);
		units.add(unit4.Main.active);
		units.add(unit5.Main.active);
		units_name.add("Unit 1"); 
		units_name.add("Unit 2");
		units_name.add("Unit 3");
		units_name.add("Unit 4");
		units_name.add("Unit 5");
		
		checkActive_Unit();
		
		print(questions.get(0));
		
		//equation stuff (nothing to see here)
		question_Length = questions.size();
		answer_Length = answer.size();
		
		
		quiz(25);
	}
	
	private static double Correct;
	private static double inCorrect;
	private static double Results;
	
	public static void askQuestion(int question_number) {
		getQuestion(question_number);
		getReply();
		if(input.equals(answer.get(question_number))) {
			Correct += 1;
		} if(questions != null && !input.contentEquals(answer.get(question_number))) {
			inCorrect += 1; //add incorrect answers into a seperate ArrayList, and add all the coresponding correct answers into an ArrayList for comparison at the end
			incorrect.add(input + "\n"); 
			inC_question.add(questions.get(question_number) + "\n");
			core_correct.add(answer.get(question_number) + "\n"); 
		}
	}
	
	private static void getQuestion(int questionNum) {
		if(questions != null) { 
			print(questions.get(questionNum));
		}
	}
	
	
	
	private static void quiz(int num_Questions) {
		if(question_Length > num_Questions) {
			print("Algorithm");
		}if(question_Length < num_Questions) {
			int i;
			for(i = 0;i<question_Length;i++) {
				askQuestion(i);
			}
			Results = question_Length - inCorrect;
			print("Quiz Results: " + Results + "/" + question_Length + "(" + (Correct/question_Length)*100 + "%)");
			displayIncorrect();
		}else {
			int i;
			for(i = 0;i < 25; i++) {
				askQuestion(i);
			}
		}
	}
	
	private static void getReply() {
		input = scan.nextLine();
	}
	
	private static void checkActive_Unit() { //before this can be used, must have a way to change units while using program (right now, only unit 1 will work)
		int i;
		for(i=0;i<units.size();i++) {
			if(units.get(i) == true) {
				print(units_name.get(i) + " now ACTIVE"); //double check that only one unit starts active
				if(i == 0) {
					questions = unit1.Main.getListQ(); //correct way to equate
					print("STEP 1");
					if(questions.equals(unit1.Main.questions)) {
						print("UNIT 1 WORKS!");
					}
					//answers
					answer = unit1.Main.getListA(); //correct way to equate
					if(answer.equals(unit1.Main.answers)) {
						print("Unit 1 answers work too");
					}
				} if (i == 1) {
					questions = unit2.Main.questions;
					if(questions.equals(unit2.Main.questions)) {
						print("UNIT 2 WORKS!");
					}
				}if(i == 2) {
					
				}if(i == 3) {
					
				}if(i == 4) {
					
				}
			}
		}
	}
	
	private static void displayIncorrect() {
		int i;
		if(incorrect.size() != 0) {
			print("These are the questions you got wrong:");
		}
		if(incorrect.size() == 0) {
			print("Congratulations on your 100%");
		}
		for(i = 0; i < incorrect.size(); i++) {
			print("The question was: " + inC_question);
			print("You put: " + incorrect.get(i));
			print("The correct answer was: " + core_correct.get(i));
		}
	}
}
