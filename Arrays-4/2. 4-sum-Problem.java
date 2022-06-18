class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);
        int size = nums.length;
        for(int i=0; i<size-3; i++) {
            for(int j=i+1; j<size-2; j++) {
                int k=j+1, l=size-1;
                long t = nums[i]+nums[j];
                while(k<l) {
                    if(target == t+nums[k]+nums[l]) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        ans.add(nums[l]);
                        res.add(ans);
                        while(k<l && nums[k] == ans.get(2)) k++;
                        while(k<l && nums[l] == ans.get(3)) l--;
                    } 
                    else if(target > t+nums[k]+nums[l])
                        k++;
                    else
                        l--;
                }
                while(j+1<size && nums[j+1] == nums[j]) j++;
            }
            while(i+1<size && nums[i+1] == nums[i]) i++;
        }
        return res;
    }
}
