class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int sum=0, ans=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            sum = sum+arr[i];
            if(sum == 0)    ans=i+1;
            else {
                if(map.containsKey(sum))
                    ans = Math.max(ans, i-map.get(sum));
                else
                    map.put(sum, i);
            }
        }
        return ans;
    }
}
