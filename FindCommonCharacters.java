/*
    Given a string array words, return an array of all characters that show up in all strings within
    the words (including duplicates). You may return the answer in any order.
*/
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        String word = words[0];
        int count = 0;
        char temp = '/';
        for(int i = 0; i < word.length(); i++){
            count = 0;
            for(int j = 0; j < words.length; j++){
                
                String str = words[j];
                for(int k = 0; k < str.length(); k++){
                    if(word.charAt(i) == str.charAt(k)){
                        temp = str.charAt(k);
                        count++;
                        String r = String.valueOf(str.charAt(k));
                        str = str.replaceFirst(r, "!");
                        break;
                    }
                }
                words[j] = str;
            }
            if(count == words.length){
                String val = String.valueOf(temp);
                list.add(val);
            }
        }
        
        return list;
    }
}
