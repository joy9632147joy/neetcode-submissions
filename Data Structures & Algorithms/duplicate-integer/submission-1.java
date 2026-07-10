class Solution {
    public boolean hasDuplicate(int[] nums) {
        //array線性搜尋O(N)  set雜湊公式搜尋O(1)
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}