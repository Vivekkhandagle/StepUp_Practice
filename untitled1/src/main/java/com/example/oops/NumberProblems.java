package com.example.oops;
class Practical {

    static void isprime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i <= 1) continue;
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("its prime number " + i);
            }
        }
    }

    public static boolean ispalindrome(int n) {
        int s = n;
        int m = 0;
        while (n > 0) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        if (s == m) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) throws Exception {
        //isprime(1,10);
        //System.out.println(ispalindrome(11211));
       // isFactorial(5);
       // isArmstrong(153);
        createRandomNumber();

    }

    private static void createRandomNumber() {

        int min=200;
        int max=400;
      double randomNumber=Math.random()*(max-min+1)+min;
        System.out.println(randomNumber);

    }

    private static void isArmstrong(int n) {

        int s=n;
        int z = 0;
        while(s>0)
        {
            int m=s%10;
             m=m*m*m;
            z=z+m;
            s=s/10;

        }
        if(n==z)
        {
            System.out.println("this is armstring number"+n);
        }
        else {
            System.out.println("this is not armstrong number"+n);
        }
    }

    private static void isFactorial(int n) {

        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}