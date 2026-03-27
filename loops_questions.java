public class loops_questions {
    public static void main(String[] args) {

        // Q1.
            /*
                INTEGER a, b, c
                SET b:= 4, c:= 5
                FOR EACH a FROM 2 TO 4 LOOP
                    PRINT c
                    b:= b - 1
                    c:= c + b
                NEXT FOR
             */

        int a, b, c;
        b = 4;
        c = 5;
        for (a = 2; a<=4; a++) {
            System.out.println(c);
            b -= 1;
            c += b;
        }


        // Q2.
            /*
                INTEGER a, b, c
                SET  b:= 0, c:= 0
                FOR EACH a FROM 1 TO 5 LOOP
                    PRINT c
                    b:= b + 1
                    c:= c + b
                NEXT FOR
             */

        int a, b, c;
        b = 0;
        c = 0;
        for (a = 1; a<= 5; a++) {
            System.out.println(c);
            b += 1;
            c += b;
        }



        // Q3.
            /*
                INTERGER value, n
                SET value:= 32, n:= 1
                WHILE value GREATER THAN OR EQUAL TO n LOOP
                    value < - value >> 1
                END LOOP
                PRINT value
             */

        int value = 32;
        int n = 1;
        while (value >= n){
            value = value >> 1;
        }
        System.out.println(value);



        // Q4.
            /*
                INTERGER x, y
                SET x:= 4, y:= 8
                DO
                    PRINT x
                    x:= x + y + 1
                WHILE x < 15
                END DO-WHILE
             */

        int x = 4;
        int y = 8;

        do {
            System.out.println(x);
            x = x + y + 1;
        }
        while (x < 15);



        // Q5.
            /*
                INTERGER a, b, c
                SET c:= 12, b:= 4
                a:= c / b
                c:= b >> a
                PRINT c
             */

        int a, b, c;
        b = 4;
        c = 12;

        a = c / b;
        c = b >> a;
        System.out.println(c);



        // Q6.
            /*
                INTEGER p, q, r, s
                SET p:= 4, q:= 2, r:= 1
                s:= (p AND q) OR (r + 1)
                PRINT s
             */

        int p, q, r, s;
        p = 4;
        q = 2;
        r = 1;
        s = (p & q) | (r + 1);
        System.out.println(s);



        // Q7.
            /*
                INTEGER a, b, c, d
                SET b:= 10, c:= 11
                a:= b - c
                FOR EACH c FROM 2 TO a LOOP
                    b:= b + c + 10
                    b:= b / 2
                NEXT FOR
                c:= a + b + c
                PRINT a, b, c
             */

        int a, b, c, d;
        b = 10;
        c = 11;
        a = b - c;

        for (c = 2; c <= a; c++) {
            b = b + c + 10;
            b = b / 2;
        }
        c = a + b + c;
        System.out.println(a + " " + b + " " + c);



        // Q8.
            /*
                INTEGER p, q, r
                SET q:= 30, p:= 10, r:= 20
                IF (r > (r+p))
                    q:= 1
                ELSE
                    p:= p - 2
                    r:= r - 2
                END IF
                IF (r > (q+p) || 1) THEN
                    q:= (0 ^ 5)
                ELSE
                    p = p + 2
                    r = p + 2
                END IF
                PRINT p, q, r
             */

        int q = 30;
        int p = 10;
        int r = 20;

        if (r > (r+p)){
            q = 1;
        }
        else {
            p -= 2;
            r -= 2;
        }

        if (r > (q+p) || true) {
            q = (0 ^ 5);
        }
        else {
            p += 2;
            r = p + 2;
        }
        System.out.println(p + " " + q + " " + r);


        // Q9.
            /*
                INTEGER p, q, r
                SET p:= 6, q:= 4, r:= 4
                r = (r+p) + q
                IF ((q+p) < (10-q))
                    r:= 12 + q
                    p:= r + r
                    q:= (q+4) + r
                END IF
                PRINT(p + q + r)
             */

        int p = 6;
        int q = 4;
        int r = 4;
        r = (r + p) + q;
        if ((q + p) < (10 - q)) {
            r = 12 + q;
            p = r + r;
            q = (q + 4) + r;
        }
        System.out.println(p + q + r);


        // Q10.
            /*
                INTEGER p, q, r
                SET p:= 4, q:= 6, r:= 5
                q:= (r^p) AND q
                IF (((6+p) AND (7^r)) > (q^r))
                    p = p + q
                END IF
                PRINT p+q+r
             */

        int p = 4;
        int q = 6;
        int r = 5;
        q = (r ^ p) & q;
        if (((6 + p) & (7 ^ r)) > (q ^ r)) {
            p += q;
        }
        System.out.println(p + q + r);



    }
}
