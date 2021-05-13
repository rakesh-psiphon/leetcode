class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int dist[] = new int[n];
        
        for(int i=0;i<n;i++){
            dist[i] = points[i][0]*points[i][0] + points[i][1]*points[i][1];
        }
        
        Arrays.sort(dist);
        int distk = dist[k-1];
        int arr[][] = new int[k][2];
        int index=0;
        
        for(int i=0;i<n;i++){
            int dis = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            if(dis <= distk){
                arr[index][0] = points[i][0];
                arr[index][1] = points[i][1];
                index++;
            }
        }
        return arr;
    }
}