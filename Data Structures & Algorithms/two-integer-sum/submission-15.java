class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x=0;x<nums.length;x++){
            int current=target-nums[x];
            if(map.containsKey(current)){
                return new int[]{map.get(current),x};
            }
        map.put(nums[x],x);
        }
    return new int[]{};
    }
}
