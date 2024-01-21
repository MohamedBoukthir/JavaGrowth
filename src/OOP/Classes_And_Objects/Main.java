package OOP.Classes_And_Objects;

public class Main {
    public static void main(String[] args) {

        // The example of the cicle

//         declaration and creation of object
//        Circle circleOne = new Circle(), circleTwo = new Circle();
//
//        /* each object has the same attributes of the class but different data values */
//        // Circle one
//        circleOne.setRadius(3.0);
//        circleOne.setColor("black");
//        System.out.println( "The Area of The Circle One = " + circleOne.getArea());
//
//        // Circle two
//        circleTwo.setRadius(4.1);
//        circleTwo.setColor("red");
//        System.out.println( "The Circumference of The Circle two = " + circleTwo.getCircumference());

        // The example of The Bank

        Account accountOne = new Account(), accountTwo = new Account(), accountThree = new Account();

        // Account one
        accountOne.insert(52,"Mohamed", 100000f);
        accountOne.deposit(50); // 50.0 Deposited.
        accountOne.withdraw(1200); // 1200.0 Withdrawn.
        accountOne.checkBalance(); // Your Balance = 98850.0
        System.out.println(accountOne); // Account{accountNum=52, name='Mohamed', amount=98850.0}

        // Account two
        accountTwo.insert(589,"Anis", 15628f);
        accountTwo.deposit(560); // 560.0 Deposited.
        accountTwo.withdraw(155555); // Sorry, Insufficient Balance.
        accountTwo.checkBalance(); // Your Balance = 16188.0
        System.out.println(accountTwo); // Account{accountNum=589, name='Anis', amount=16188.0}

        // Account three
        accountThree.insert(1,"Med", 100000f);
        accountThree.deposit(50); // 50.0 Deposited.
        accountThree.withdraw(10000); // 10000.0 Withdrawn.
        accountThree.checkBalance(); // Your Balance = 90050.0
        System.out.println(accountThree); // Account{accountNum=1, name='Med', amount=90050.0}
    }
}
