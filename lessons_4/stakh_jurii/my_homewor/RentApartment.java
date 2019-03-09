public class RentApartment {

    public static void main(String[] args) {
        rentPrice(10);
    }

    public static void rentPrice (int numberOfDays) {

        if (numberOfDays < 0) {
            System.out.println("Incorrect number of days");
            return;
        }

        int pricePerNight = 40;
        int commonPrice = 0;

        if (numberOfDays <= 5)
            System.out.println((commonPrice = numberOfDays * 40));
        else if (numberOfDays <= 7)
            System.out.println((commonPrice = numberOfDays * 40 - 20));
        else
            System.out.println((commonPrice = numberOfDays * 40 - 50));
    }
}
