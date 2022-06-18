class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int max_count = 0;
        for(int num : nums){
            h.add(num);
        }
        for(int num : nums){
            int count = 0;
            if(!h.contains(num-1)){
                while(h.contains(num++))
                    count++;
                if(max_count<count) max_count= count;
            }
        }
        return max_count;
    }
}
