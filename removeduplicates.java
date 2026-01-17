class removeduplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,7,7,7,1};

        removeduplicates obj = new removeduplicates();
        int k = obj.removeDuplicates(nums);

        for(int i = 0; i < k; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public int removeDuplicates(int[] nums){
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
