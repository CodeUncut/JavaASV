public class patternInvertHalfPyramidNumbers {

    public static void patternInvertedHalfPyramidNumbers(int n){
        //outer loop -determine number of lines
        for(int i =1; i<=n;i++){
            //inner loop- determine value
            for(int j=1; j<=(n-i+1);j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        patternInvertedHalfPyramidNumbers(5);
    }
}
