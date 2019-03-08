public class HelloAll {

public static void main (String [] args) {

System.out.println("Hello all !!!")
//================================
printUserInfo("Stakh", "Jurii");
printUserInfo("Lucec", "Dmitrii");
printUserInfo("Slobodenyk", "Anna");
printUserInfo("Skakalckyi", "Alexandr");
}

public static void printUserInfo (String firstname , String lastName) {

System.out.format("Hello %s %s, Welcome to Hillel school, \n ", firstName, lastName);

}

}
