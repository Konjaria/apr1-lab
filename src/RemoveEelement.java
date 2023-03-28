class RemoveElement{
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int num : nums) {
            if (num != val) {
                nums[c] = num;
                c++;
            }
        }
        return c;
    }
};