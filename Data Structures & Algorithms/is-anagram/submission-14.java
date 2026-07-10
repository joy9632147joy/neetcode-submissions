class Solution {
    public boolean isAnagram(String s, String t) {
        //string算長度要用()呼叫
        if (s.length() != t.length()) {
            return false;
        }
        //ArrayList彈性伸縮 / int[]原生陣列 長度固定 可以給有條件的用
        int[] count = new int[26];
        for (int x = 0; x < s.length(); x++) {
            //Java裡String是封裝物件所以要用charAt()來取字元 但python可以用[]取
            count[s.charAt(x) - 'a']++;
            count[t.charAt(x) - 'a']--;
        }
        for (int y : count) {
            if (y != 0) {
                return false;
            }
        }
        return true;
    }
}
