import java.util.*;
class Febonacci_Sequence{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int result = febonacci_seq(n);
		System.out.println("The sum is: "+ result);
	}
	public static int febonacci_seq(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		return febonacci_seq(n - 2) + febonacci_seq(n - 1);
	}
}