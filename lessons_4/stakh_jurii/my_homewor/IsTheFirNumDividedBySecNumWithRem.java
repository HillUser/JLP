public class IsTheFirNumDividedBySecNumWithRem {
    public static void main(String[] args) {
        answer(8,3);
    }

    public static void answer (int first, int second){
        System.out.print("Is the first number divisible by the second - ");
        System.out.print(first % second == 0 ? " Divided" : " Not divided");
    }
}
