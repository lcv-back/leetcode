public class _1791_Find_Center_of_Star_Graph {
    public static int findCenter(int[][] edges) {
        // edges has 2 elements [i,j]
        int tempCurrent1 = edges[0][0];
        int tempCurrent2 = edges[0][1];
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[0].length; j++) {
                if (edges[i][j] == tempCurrent1) {
                    count1++;
                } else if (edges[i][j] == tempCurrent2) {
                    count2++;
                } 
            }
        }
        if (count1 == edges.length) {
            return tempCurrent1;
        }
        return tempCurrent2;
    }
}
