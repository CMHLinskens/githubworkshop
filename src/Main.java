public class Main {

    public static void main(String[] args){
        System.out.println("Hoi.");

        double a = 3.3;
        double b = 6.6;
        System.out.println(sum(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double mul(double a, double b){
        return a*b;
    }
}
