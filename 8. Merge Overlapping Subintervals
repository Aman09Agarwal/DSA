class SortByFirst implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        return a[0] - b[0];
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new SortByFirst());
        int i = 1;
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> res = new ArrayList<>();
        while(i < intervals.length) {
            if(intervals[i][0] <= end)
                end = Math.max(end, intervals[i][1]);
            else {
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
            i++;
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}
