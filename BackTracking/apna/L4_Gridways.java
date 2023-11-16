package BackTracking.apna;

public class L4_Gridways {

    public static int gridWays(int i, int j, int n, int m){
        if(i== n-1 && j==m-1){
            // condn for last cell
            return 1;
        }else if(i==n || j==n){
            return 0;
        }

        return gridWays(i+1, j, n, m) + gridWays(i, j+1, n, m);

    }

    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
