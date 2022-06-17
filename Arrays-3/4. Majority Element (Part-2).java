class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m1 = -1, m2 = -1, c1 = 0, c2 = 0;
        for(int num : nums) {
            if(m1 == num)   c1++;
            else if(m2 == num)  c2++;
            else if(c1 == 0) {
                m1 = num;
                c1++;
            } else if(c2 == 0) {
                m2 = num;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0; c2 = 0;
        for(int num : nums) {
            if(num == m1) c1++;
            else if(num == m2) c2++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        int expectedSize = nums.length/3;
        if(c1>expectedSize) res.add(m1);
        if(c2>expectedSize && m1 != m2) res.add(m2);
        return res;
    }
}
