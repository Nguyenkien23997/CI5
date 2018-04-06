
public class bai122 {
    static double randomDouble(double low,double high){
        double Random =Math.random() * high + low;

        return Random;

    }
    public static void main(String[] args) {

        System.out.println(randomDouble(0,50));
    }
}
