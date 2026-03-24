import java.util.Scanner;
class wave_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nRows = sc.nextInt();
        int nCols = sc.nextInt(); 
        int[][] arr = new int[nRows][nCols];
        for(int row=0;row<nRows;row++){
            for(int col=0;col<nCols;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        for(int col=0;col<nCols;col++){
            if(col%2==0){
                for(int row=0;row<nRows;row++){
                    System.out.print(arr[row][col]+" ");
                }
            }
            else{
                for(int row=nRows-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
        sc.close();
    }
}
