class Solution {
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int[] arr, int i, int j){
        while(i<j) swap(arr, i++, j--);
    }
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        if(nums==null || size==0 || size==1) return;
        int i = size-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = size-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i+1,size-1);
    }
}
