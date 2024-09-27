/*
6. Find Square Root 
Problem: Write a Java program to find the square root of a given 
number (using integer approximation). 
Test Cases: 
Input: x = 16 
Output: 4 
Input: x = 27 
Output: 5 
*/


import java.util.*;

class Squareroot{
	
public static void main(String args[]){
	
Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number whose square root you want: ");
	double x = sc.nextDouble();
	double ans = (int) Math.sqrt(x);	
	System.out.println(ans);
}
}