public class FindMaxAndMinFrom3 {

    public static void main(String[] args) {
        findMaxAndMin(5,6,8);
    }

    public static void findMaxAndMin(int first, int second, int third){

        System.out.println("Min = " + Math.min(Math.min(first,second),third));
        System.out.println("Max = " + Math.max(Math.max(first,second),third));

    }

}
