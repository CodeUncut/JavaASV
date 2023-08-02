public class PatternFloyDTriangle {


    public static void floydTriangle(int n){
        //outer loop
        int counter=1;
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j =1; j<=i;j++){
                //counter

                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        floydTriangle(10);
    }
}
