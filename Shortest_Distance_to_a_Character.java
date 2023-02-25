class Solution {
    public int[] shortestToChar(String s, char c) {
        // loveleetcode
        int p = 0;
        int temp = Integer.MAX_VALUE;
        int arr[] = new int[s.length()]; 
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                for(; p < s.length(); p++){
                    arr[p] = Math.min(Math.abs(p - i), Math.abs(p - temp));
                }
                temp = i;
                p = i;
            }
        }
        return arr;
    }
}
