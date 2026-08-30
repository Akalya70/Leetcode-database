class Solution {
    public int longestConsecutive(int[] nums) {
        int max=1;
        int current=1;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                current++;
            }
            else if(nums[i]!=nums[i-1]){
                current=1;
            }
             max=Math.max(max,current);
        }
       return max;
    }
}