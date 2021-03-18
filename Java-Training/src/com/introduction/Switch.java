package com.introduction;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month  number to get season: ");
		int i = sc.nextInt();
		//String s=""
		switch(i)
		{
		case 1:
			System.out.println("Winter");
		case 2:
			System.out.println("Winter");
		case 12:
			System.out.println("Winter");
			break;
		case 3:
			System.out.println("Summer ");	
		case 4:
			System.out.println("Summer ");
		case 5:
			System.out.println("Summer ");
			break;
		case 6:
			System.out.println("Monsoon ");	
		case 7:
			System.out.println("Monsoon ");
		case 8:
			System.out.println("Monsoon ");
		case 9:
			System.out.println("Monsoon ");
			break;
		case 10:
			System.out.println("autumn ");
		case 11:
			System.out.println("autumn ");	
			break;
		default:
			System.out.println("Enter b/w 1 to 12");	
		}
		sc.close();
	}

}
