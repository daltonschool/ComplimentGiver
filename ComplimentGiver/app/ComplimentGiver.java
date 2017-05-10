package app;

import java.util.ArrayList;

/**
 * A program that gives compliments. (ArrayList mini-assignment.)
 * 
 * @author PLEASE put your name here!
 */
public class ComplimentGiver {

	public static void main(String args[]) {
		// Declare an ArrayList of Strings.
		ArrayList<String> compliments = new ArrayList<>();

		// Add elements to the ArrayList.
		compliments.add("generous");
		compliments.add("intelligent");
		compliments.add("athletic");
		compliments.add("deep");
		compliments.add("well-read");
		compliments.add(1, "studious"); // insert at 1 spot
		compliments.add(0, "respectful"); // insert at 0 spot

		// Display the first compliment
		System.out.println("First compliment: " + compliments.get(0));

		// Remove elements. We couldn't do this with regular arrays!
		compliments.remove("well-read");
		compliments.remove(5);

		// Display number of compliments.
		System.out.println("Size of compliments: " + compliments.size());

		// Display each compliment.
		System.out.print("All compliments: ");

		for (int i = 0; i < compliments.size(); i++) {
			System.out.print(compliments.get(i) + " ");
		}

		/*
		 * TODO: START HERE BASE ASSIGNMENT. Do exercises 1-3 below.
		 * -----------------------------------------------
		 */
		// 1: Answer questions 1a and 1b. (Type answers as comments here.)

		// 1a. What is the difference between compliments.add("awesome") and
		// compliments.add(1, "awesome")?

		/*
		 * (answer here)
		 */
		
		
		

		// 1b. What is the difference between compliments.remove("well-read")
		// and compliments.remove(2)?

		/*
		 * (answer here)
		 */
		
		
		
		

		// 2. Display a random compliment. E.g. "You are athletic!". Add code in
		// the space below.
		
		
		
		

		// 3. Ask the user for a compliment, add it to the list, then print all
		// the compliments in the list. Add code in the space below.
		
		
		
		

		/*
		 * INITIATIVES. Choose up to 6 points worth.
		 * --------------------------------------------
		 */

		// (1 pt) Display the last compliment in the list.

		// (2 pts) Rewrite #2 and #3 as functions and call them.

		// (3 pts) Display all the elements in the ArrayList using a foreach
		// loop. (Hint - Do a Google search on foreach loops with ArrayLists)

		// (3 pts) Rewrite Food-O-Matic using ArrayLists instead of regular
		// arrays. You can submit it as a separate .java file.
	}
}