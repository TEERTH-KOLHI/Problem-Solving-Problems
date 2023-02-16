/*      You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
        The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
        The interpreted strings are then concatenated in the original order.
        Given the string command, return the Goal Parser's interpretation of command.
*/

import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class Goal_parser_Interpretaion{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pattern: ");
        String command = sc.nextLine();
        System.out.println(interpret(command));
    }
    private static String interpret(String command){
        StringBuilder sb = new StringBuilder();
        int command_len = command.length();
        for(int i = 0; i < command_len; i++){
            if(command.charAt(i) == 'G'){
                sb.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                i = i + 1;
                sb.append("o");
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                i = i + 3;
                sb.append("al");
            }
        }
        return sb.toString(); 
    }
}
