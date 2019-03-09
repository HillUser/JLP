public class FindAFewOfTheMin3Num {

    public static void main(String[] args) {
        search(2,2,2);
    }

    public static void search (int first, int second, int third){

        if(first == second && second == third){
            System.out.println("All three numbers equals");
        }else{
            int min = Math.min(Math.min(first,second),third);
            int [] nums = {first,second,third};
            System.out.print("Min = ");
            for (int num : nums) {
                if(num == min)
                    System.out.print("(" + num + ")");
            }
        }

    }

}
