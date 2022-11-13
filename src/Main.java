// 1. Create a double variable with a value of 20.00
// 2. Create a second variable of type double with the value 80.00
// 3. Add both numbers together and multiply by 100.00
// 4. Use the remainder operator to figure out what the remainder is from the result of the operation in step 3
//      and 40.00.
// 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if it's not zero.
// 6. Output the boolean variable.
// 7. Write an if statement that displays a message 'got some remainder' if the boolean in step 5 is not true.

public class Main {
    public static void main(String[] args) {
        //1
        double myFirstValue = 20.00d;
        //2
        double mySecondValue = 80.00d;
        //3
        double myTotalValue = 100.00d * (myFirstValue + mySecondValue);
        //4
        System.out.println("MyTotalValue = " + myTotalValue);
        //5
        double myRemainder = myTotalValue % 40.00d;
        //6
        System.out.println("myRemainder = " + myRemainder);
        boolean isNoRemainder = (myRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        //7
        if (!isNoRemainder) {
            System.out.println("Got some remainder.");
        }
    }
}

