class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int y = 0; y < t.length(); y++) {
            char d = t.charAt(y);

            if (!map.containsKey(d) || map.get(d) == 0) {
                return false;
            }
            map.put(d, map.get(d) - 1);
        }

        return true;
    }
}