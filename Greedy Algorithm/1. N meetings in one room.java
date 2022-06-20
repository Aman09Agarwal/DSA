class Meeting {
    int start, end, pos;
    public Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class MeetingComparator implements Comparator<Meeting>{
    @Override
    public int compare(Meeting a, Meeting b) {
        if(a.end < b.end)   return -1;
        else if(a.end > b.end)  return 1;
        else if(a.pos < b.pos)  return -1;
        return 1;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Meeting> meetings = new ArrayList<>();
        
        for(int i=0; i<n; i++)
            meetings.add(new Meeting(start[i], end[i], i+1));
            
        Collections.sort(meetings, new MeetingComparator());
        int limit = meetings.get(0).end;
        int ans = 1;
        for(int i=1; i<n; i++) {
            if(limit < meetings.get(i).start) {
                limit = meetings.get(i).end;
                ans++;
            }
        }
        return ans;
    }
}
