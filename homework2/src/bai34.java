public class bai34 {
    static void printAmerican() {
        String day, month;
        int date, year;
        year = 2011;
        month = "july";
        date = 16;
        day = "Saturday";
        String c = String.format("%s, %s %s, %s", day, month, date, year);
        System.out.println(c);
    }
    static void printEuropean(){
        String day, month;
        int date, year;
        year = 2011;
        month = "july";
        date = 16;
        day = "Saturday";
        String a = String.format("%s %s %s, %s", day, date, month, year);
        System.out.println(a);
    }
    public static void main(String[] args) {
        printAmerican();
        printEuropean();
    }
}
