import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
       char[] start =s.toCharArray();
       char [] end =t.toCharArray();
       Arrays.sort(start);
       Arrays.sort(end);
       return Arrays.equals(start,end);
    }
} 