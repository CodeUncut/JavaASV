public class functionOverloading {

    //func to cal 2 no.s
    public static int sum(int a, int b){
        return a+b;
    }
    //func to cal 3 nos
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,2));
        System.out.println(sum(5,3,5));
    }
}
