import java.util.Scanner;
public class loops {
    public static void main(String[] args){

        // DO-WHILE LOOP:-
            /*
            INTEGER x
            SET x:= 1
            DO
                PRINT x
                INCREMENT x
            WHILE x<10
             */

        int x = 1;
        do {
            System.out.println(x);
            x++;
        }
        while (x <= 10);


//----------------------------------------------------------------------------

        // WHILE LOOP:-
            /*
            DECLARE n : INTEGER
            SET n:= 1
            WHILE n <= 10
                PRINT n
                INCREMENT n
            END WHILE
             */

        int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }

//----------------------------------------------------------------------------

        // FOR LOOP:-
        // Factorial of a Number:
            /*
            INPUT n
            SET fact = 1
            FOR i = 1 TO n DO
                fact = fact * i
            END FOR
            PRINT fact
             */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i=1; i <= num; i++){
            fact *= i;
        }
        System.out.println("factorial: " + fact);
        sc.close();

//----------------------------------------------------------------------------

        // Palindrome Number:
            /*
             DECLARE n : INTEGER
             DECLARE num : INTEGER
             DECLARE sum : INTEGER
             DECLARE rem : INTEGER
             SET sum = 0
             READ n
             num := n
             WHILE n != 0
                rem = n % 10
                rev = (sum * 10) + rem
                n = n / 10
             END WHILE
             IF num == sum THEN
                PRINT "Palindrome number"
             ELSE
                PRINT "Not a Palindrome number"
             ENDIF
             */

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int summ = 0;
        int num1 = num;

        while (num != 0) {
            int rem = num % 10;
            summ = (summ * 10) + rem;
            num /= 10;
        }

        if (num1 == summ) {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not a Palindrome");
        }
        sc.close();


    }
}