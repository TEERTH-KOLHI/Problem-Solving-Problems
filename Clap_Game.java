/*
	Clap is a game played by a group of people, whereby each person
	will call out numbers, in ascending order, starting from 1. 
	However, if the number satisfies any of the following conditions:
	
		> The number is divisible by 7
		> The number has the digit 7 in it
		> The sum of the digits of the number is divisible by 7
		
	Then the person has to clap instead of calling out the number. If the
	person does not perform the correct action, he loses.
	Given integer N, determine how many claps there have been, if the
	game has terminated at N, including N.
	An example is shown, where three players A, B and C are playing this game.
	A: 1
	B: 2
	C: 3
	D: 4
	E: 5
	F: 6
	G: CLAP
	H: 8
	I: 9
	J: 10
	K: 11
	L: 12
	M: 13
	N: CLAP
	O: 15
	P: CLAP
	Q: CLAP
	R: 18
	S: 19
	T: 20

*/
import java.util.*;
import java.io.File;
public class Clap_Game{
	public static void main(String...args){
		try{
			File file = new File("E:\\T.txt");
			Scanner sc = new Scanner(file);
			int arr[] = new int[20];
			int index = 0;
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				arr[index++] = Integer.parseInt(str);
			}
			sc.close();
			
			for(int i=0;i<arr.length;i++){
				if(arr[i]%7==0){
					System.out.println("CLAP");
				}else{
					int p = arr[i]; int sum =0;
					while(p>0){
						sum+=p%10;
						if(p%10 == 7){
							System.out.println("CLAP");
						}
						p = p/10;
					}
					if(sum%7==0){
						System.out.println("CLAP");
					}else{
						if(arr[i]%10==7){
							continue;
						}else{
							System.out.println(arr[i]);
						}
					}
				}
			}
		}catch(Exception e){
			System.out.println("File does not found!");
		}
	}
}