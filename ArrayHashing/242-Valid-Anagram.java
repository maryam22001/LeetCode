//if we increment each letter by 1 in \s\and decrement the second by 1 in \t\ each leter will be 0 ,we will use hash map 

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length())return false;
        int [] char_count =new int [26];
        for(int i =0 ;i<s.length();i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }
for (int count : char_count){
    if(count!=0)return false;

        }
return true;
        
    }
}