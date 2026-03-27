import java.util.Scanner;
public class control_statement {
    public static void main(String[] args){

        // Q1. Code for finding Greatest Number.
              /*
                DECLARE a : INTEGER
                DECLARE b : INTEGER
                DECLARE c : INTEGER
                READ a
                READ b
                READ c
                IF a>b AND a>c THEN
                  PRINT "a is Greater"
                ELSE IF b>a AND b>c THEN
                  PRINT "b is Greater"
                ELSE
                  PRINT "c is Greater"
                  */

        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is Greater");
        } else if (b > a && b > c) {
            System.out.println("b is Greater");
        }
        else {
            System.out.println("c is Greater");
        }

//----------------------------------------------------------------------------

        // Q2. UID - Login Verification code
                /*
                DECLARE uid : STRING
                DECLARE pass : STRING
                READ uid
                READ pass
                IF uid == "admin" AND pass == "admin123" THEN
                    PRINT "Login successful"
                ELSE
                    PRINT "Login failed"
                END IF
                 */

        String uid;
        String pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UID: ");
        uid = sc.nextLine();
        System.out.println("Enter Password: ");
        pass = sc.nextLine();
        if (uid.equals("admin") && pass.equals("admin404")) {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login failed");
        }

//----------------------------------------------------------------------------

        // Q3.
            /*
            INTEGER p, q, r
            SET p:= 1, q:= 5, r:= 7
            r = q + p
            IF ((3+p) < (q+3)) THEN
                IF ((r+q+8) < (q+p+r)) THEN
                    r = (3+30) + r
                END IF
                r = (q+1) + q
            ELSE
                IF ((r+q) < (p+r)) THEN
                    q = 12 + q
                ELSE
                    r = q + p
                END IF
                r = (p+q) + r
            END IF
            r = r + r
            PRINT p + q + r
             */

        int p = 1;
        int q = 5;
        int r = 7;
        r = q + p;
        if ((3+p) < (q+3)) {
            if ((r+q+8) < (q+p+r)) {
                r = (3+30) + r;
            }
            r = (q+1) + q;
        }
        else {
            if ((r+q) < (p+r)) {
                q = 12 + q;
            }
            else {
                r = q + p;
            }
            r = (p+q) + r;
        }
        r = r + r;
        System.out.println(p + q + r);

//----------------------------------------------------------------------------

        // Q4.
            /*
            INTEGER a, b, c
            SET a:= 1, b:= 5, c:= 7
            IF ((c+b) < (a+c)) THEN
                b = a + b
            ELSE
                IF ((c+9+b) < (6+c)) THEN
                    c = (3+8) + c
                END IF
            END IF
            PRINT a + b + c
             */

        int a = 1;
        int b = 5;
        int c = 7;
        if ((c+b) <= (a+c)){
            b = a + b;
        }
        else{
            if ((c+9+b) <= (6+c)){
                c = (3+8) + c;
            }
        }
        System.out.println(a + b + c);


    }
}
