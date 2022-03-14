public class java_lap2_3 {
    //6421600042
    public static void main(String[] args) {
        int[][] arr2d = new int[3][4];
        int x = 10;
        for(int i = 0; i < arr2d.length; i++)
            for(int j = 0; j < arr2d[i].length; j++)
            {
                arr2d[i][j] = x;
                x += 10;
            }
    }
}
