

public class bai123 {
    static int randomInt(int low, int high) {
        int Random = (int) (Math.random() * high + low);

        return Random;

    }

    public static void main(String[] args) {

        System.out.println(randomInt(1, 50));
    }
}
