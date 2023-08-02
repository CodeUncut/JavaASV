public class patternHollowRhombus {
    public static void hollow_rhombus(int n){
        //outer loop
        for(int i=1;i<=n; i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle -stars

            for(int j=1;j<=n;j++){
                //boundary condition

                if(i==1 || i ==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollow_rhombus(5);
    }
}
