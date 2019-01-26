package unit1;

//GUI Design by: #######
//Project started on: 2019/01/22

import java.util.ArrayList;

public class Main {
	
	public static boolean active = true; //this is the unit that starts active
	public static ArrayList<String> questions; 
	public static ArrayList<String> answers;
	
	public static String Q1 = "Does";
	public static String Q2 = "this work";
	
	
	public static String A1 = "may";
	public static String A2 = "be?";
	
	
	public Main() {
		questions = new ArrayList<String>();
		
		questions.add(Q1);
		questions.add(Q2);
		
		
		answers = new ArrayList<String>();
		
		answers.add(A1);
		answers.add(A2);
		
	}
	
	public static ArrayList<String> getQuestions() {
		return questions;
		
	}
	
	public static ArrayList<String> getAnswers() {
		return answers;
		
	}
}
