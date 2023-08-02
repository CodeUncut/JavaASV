public class PattersHallow {

    public static void patternHollow(int totRow, int totCol){
        // outer loop - Rows

        for(int i =1; i<= totRow; i++){
            // inner loop - Cols
            for(int j= 1;j<=totCol; j++){
                // boundary condition
                if(i == 1 || i == totRow || j == 1 || j == totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternHollow(10,7);
    }
}
