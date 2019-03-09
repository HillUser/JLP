public class IsNumEvenOrOdd {

    public static void main(String[] args) {
       search(5);
       search(6);
    }

    public static void search (int number){
        System.out.println(number % 2 == 0 ? number + " Even" : number + " Odd");
    }

}
