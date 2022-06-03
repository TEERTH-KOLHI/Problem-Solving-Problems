/*
	When you go out to dinner with your friends, everyone clinks 
	their glass with everyone else exactly once. You wonder how
	many times a glass is clinked against another.
*/
import java.util.*;
public class Clinking_glass{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of glasses: ");
		int n = sc.nextInt();
		int number_of_clinks = clinking_glass(n);
		System.out.println("Number of clinks of glasses: "+number_of_clinks);
		
	}
	public static int clinking_glass(int n){
		int number_of_clinks = n*(n-1)/2;
		return number_of_clinks;
	}
}