class Insert{

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i += 1){
            if (target <= nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
};