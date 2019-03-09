public class FindMinFrom3 {
    public static void main(String[] args) {
        findNum(5,4,3);
    }

    public static void findNum(int first, int second, int third){

        System.out.println(Math.min(Math.min(first,second),third));

    }



}
