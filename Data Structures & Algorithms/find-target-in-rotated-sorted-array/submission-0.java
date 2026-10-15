class Solution {
    public int search(int[] nums, int target) {
        int targetIdx=searchElement(nums,target,0,nums.length-1);

        return targetIdx;
    }
    
    public int searchElement(int[] nums,int target,int si,int ei){

        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        if(nums[mid] == target){
            return mid;
        }
        
        if(nums[si] <= nums[mid]){ //line 1
            if(nums[si] <= target && target <= nums[mid]){
                return searchElement(nums,target,si,mid-1);
            }else{
                return searchElement(nums,target,mid+1,ei);
            }
        }
        else{      //line 2
            if(nums[mid] <= target && target<=nums[ei]){
                return searchElement(nums,target,mid+1,ei);
            }else{
                return searchElement(nums,target,si,mid-1);
            }
        }
    }

}
