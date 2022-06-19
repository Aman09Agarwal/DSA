class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int ans=0;
        int[] left = new int[size];
        int[] right = new int[size];
        for(int i=0; i<size; i++){
            if(i>0)
                left[i] = height[i]>left[i-1] ? height[i] : left[i-1];
            else
                left[i] = height[i];
        }
        for(int i=size-1; i>=0; i--){
            if(i<size-1)
                right[i] = height[i]>right[i+1] ? height[i] : right[i+1];
            else
                right[i] = height[i];
        }
        for(int i=0; i<size; i++){
            if(Math.min(right[i],left[i])-height[i]>0)
            ans += Math.min(right[i],left[i])-height[i];
        }
        return ans;
    }
}
