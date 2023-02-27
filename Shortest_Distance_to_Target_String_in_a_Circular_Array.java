/*
  You are given a 0-indexed circular string array words and a string target. A circular array means that the array's end connects to the array's beginning.

Formally, the next element of words[i] is words[(i + 1) % n] and the previous element of words[i] is words[(i - 1 + n) % n], where n is the length of words.
Starting from startIndex, you can move to either the next word or the previous word with 1 step at a time.

Return the shortest distance needed to reach the string target. If the string target does not exist in words, return -1.
*/

class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min_distance = Integer.MAX_VALUE;
        for(int i = startIndex; i < n + startIndex; i++){
            if(target.equals(words[i % n])){
                int difference = Math.abs(startIndex - i);
                min_distance = Math.min(min_distance, Math.min(difference, words.length - difference));
            }
        }
        
        if(min_distance == 2147483647){
            return -1;
        }
        return min_distance;
    }
}
