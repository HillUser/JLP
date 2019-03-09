public class FindTheNearstTo10Of2Num {
    public static final int TEN = 10;
    public static int one;
    public static int two;

    public static void main(String[] args) {
        search(9 , 11);
    }

    public static void search (int first, int second){

        if (first < 0)
            one = first + (- TEN);

        if(second < 0)
            one = second + (- TEN);

        if(first > 0 && first < 10)
            one = TEN - first;

        if (first < 10 || second < 10)
            two = TEN - second;

        if(first > TEN)
            one = first - TEN;

        if(second > TEN)
            two = second - TEN;

        System.out.println(Math.abs(one) < Math.abs(two) ? "Nearest to 10 - number (" + first + ")"
                            : "Nearest to 10 - number (" + second + ")");

    }

}
