public class bai125 {
    static boolean areFactors(int n,int[] c){
        boolean a=false;
        for(int i=0;i<c.length;i++){
            if(c[i]%n==0){
                a=true;
            }
            else {
                a = false;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] c={2,4,6,8};
        System.out.println(areFactors(2,c));
    }
}
