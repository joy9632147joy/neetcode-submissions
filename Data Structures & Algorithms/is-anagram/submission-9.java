class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] count=new int[26];
        for(int x=0;x<s.length();x++){
            //ASCII
            count[s.charAt(x)-'a']++;
            count[t.charAt(x)-'a']--;
        }

        for(int y:count){
            if(y!=0){
                return false;
            }
        }
        return true;
    }
}
