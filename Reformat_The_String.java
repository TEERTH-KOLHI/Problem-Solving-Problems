/*
  You are given an alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. 
That is, no two adjacent characters have the same type.

Return the reformatted string or return an empty string if it is impossible to reformat the string.
*/

class Solution {
    public String reformat(String s) {
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                digits.append(s.charAt(i));
            }else{
                letters.append(s.charAt(i));
            }
        }
        int number_of_char = letters.length(), number_of_digits = digits.length();
        if(Math.abs(number_of_digits - number_of_char) > 1){
            return "";
        }
            StringBuilder ans = new StringBuilder();
            int j = 0, k = 0;
            boolean flag = digits.length() >= letters.length() ? true : false;
            for(int i = 0; i < s.length(); i++){
                if(flag){
                    ans.append(digits.charAt(j));
                    j++;
                }else{
                    ans.append(letters.charAt(k));
                    k++;
                }
                flag = !flag;
            }
            s = ans.toString(); 
        
        return s;
    }
}
