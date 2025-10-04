class Solution {
    public int searchInsert(int[] nums, int target) {
      int len= nums.length;
      int res=len;
      for(int i=0;i<len;i++){
        if(nums[i]>=target){
            res=i;
            break;
        }
        else{
            
        }
      }
      return res;
    }
}