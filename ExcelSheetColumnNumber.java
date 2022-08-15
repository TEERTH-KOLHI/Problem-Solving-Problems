import java.util.*;

/*
	Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701

*/

class ExcelSheetColumnNumber{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the column of the excel sheet: ");
		String columnTitle = sc.nextLine();
		
		int columnNumber = titleToNumber(columnTitle);
		System.out.println("Column number is: " + columnNumber);
	}
	public static int titleToNumber(String columnTitle){
		int  columnNumber = 0;
		for(char ch:columnTitle.toCharArray()){
			columnNumber = columnNumber * 26 +(ch - 'A' + 1);
		}
		return columnNumber;
	}
}