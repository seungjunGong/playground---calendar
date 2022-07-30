public class Monthdate {
    public static int date(int d){
        int[] maxday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 29};
        return maxday[d-1];
    }
}
