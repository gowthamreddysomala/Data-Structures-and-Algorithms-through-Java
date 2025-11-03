package Arrays.medium;

public class SetMatrixZeros {
    public static void makezeros(int[][] arr){
       int m = arr[0].length;
       int n = arr.length;
       boolean flag = false;
       // for finding zeros in first line
       for(int i=0;i<n;i++){
           if(arr[0][i]==0){
               flag = true;
           }
       }
       // for finding zeros
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[0][j] = 0;
                }
           }
       }
       // for setting zeros in remaining lines
       for(int i=0;i<n;i++){
           if(arr[0][i]==0){
               for(int j=0;j<m;j++){
                   arr[i][j]=0;
               }
           }
      }
       if(flag){
           for(int i=0;i<n;i++){
               arr[0][i] = 0;
           }
       }
    }
    public static void print(int[][] arr){
        int m = arr[0].length;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        //int[][] arr =  {{1,1,1},{1,0,1},{1,1,1}};
       int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       // int[][] arr={{0,1}};
        //[[1,0,1],[0,0,0],[1,0,1]]
        // [[0,0,0,0],[0,4,5,0],[0,3,1,0]
        print(arr);
        System.out.println(arr[1][1]);
       makezeros(arr);
       print(arr);

    }
}
