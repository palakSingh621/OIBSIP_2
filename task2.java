package Task1;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		int ans=(int)(Math.random()*100)+1;
		int k=5;
		Scanner sc=new Scanner(System.in);
		boolean correct=false;
		System.out.println("Guessing a number between 1 and 100.\nYou have 5 tries to guess the number.");
		while(k>0) {
			System.out.println("Enter your guess:");
			int guess =sc.nextInt();
			if(guess==ans) {
				System.out.println("Bravo!! Correct guess!");
				break;
			}
			else if(guess>ans) {
				System.out.println("Your guess is too high.\nYou have "+(k-1)+" tries left.");
				k--;
			}
			else {
				System.out.println("Your guess is too low.\nYou have  "+(k-1)+" tries left.");
				k--;
			}
		}
		if(correct == false) {
			System.out.println("You ran out of tries.\nYou lost!");
		}

	}

}
