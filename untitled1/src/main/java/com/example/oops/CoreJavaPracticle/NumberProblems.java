package com.example.oops.CoreJavaPracticle;

public class NumberProblems {
    static String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten",
        "eleven","tweleve","threen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};

    static String[] tens={
            " "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    public static void main(String[] args) {

        //checkNumberEvenOrOdd(11);
        //findAllPrimeNumbersInRange(1,10);
        //sumOfDigitsOfNumber(143);
        //palindromeNumber(123);
        //countDigits(23451);
        //findLargestThreeNumbers(20,15,25);
        //swapTwoNumbers(10,20);
        //checkFactorial(5);
       //armstrongNumber(3);
       //fobonacciSeries(10);
        //findGCD(10,20);
        //findLCM(10,20);
        //perfectNumber(496);
        //System.out.println(sumOfNaturalNumbers(10));
        //countEvenorOddInDigit(45782);
       //secondLargestNumberInDigit(598746);
       //removeDuplicatesFromNumber(12314561);
        //convertNumbertoWord(1234);
       // findStrongNumber(40585);
        //automorphicNumber(6);
       // powerOfNumber(2,3);
        //HarshadNumber(19);
       //countFrequencyofeachNumber(4650);
        squareRootWithoutUsingFunction(48);
    }

    private static void squareRootWithoutUsingFunction(int n) {
        int start=1;
        int end=n;
        int ans=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid*mid==n)
            {
                System.out.println(mid);
                return;
            }
            else if(mid * mid<n)
            {
                ans=mid;
                start++;
            }
            else {
                end--;
            }

        }
        System.out.println(ans);
    }

    private static void countFrequencyofeachNumber(int n) {



        int arr[]=new int[10];
        int temp=n;
        if(temp==0)
        {
            arr[0]=1;
        }
        while(temp>0)
        {
            int s=temp%10;
            arr[s]++;
            temp/=10;

        }

        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>0)
           {
               System.out.println(arr[i]);
           }
        }
    }

    private static void HarshadNumber(int n) {
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            sum+=temp%10;
            temp/=10;
        }
        if(n%sum==0)
        {
            System.out.println("its harshd number");
        }
        else {
            System.out.println("its not harshad number");
        }

    }

    private static void powerOfNumber(int a,int b) {
        if(a==0 ||b==0 )
            System.out.println("its not creates power");
        int n=1;
        for(int i=1;i<=b;i++)
        {
            n*=a;

        }
        System.out.println(n);
    }



    private static void automorphicNumber(int n) {

        int square=n*n;
        int temp=n;
        while(temp>0)
        {
            if(temp%10!=square%10)
            {
                System.out.println("this is not automorphic number");
                return;
            }
            temp/=10;
            square/=10;
        }
        System.out.println("its automorphic number");

    }

    private static void findStrongNumber(int n) {

        int strong=0;
        int m=n;
        while(n>0)
        {  int fact=1;
            int s=n%10;
            for(int i=1;i<=s;i++)
            {
                fact=fact*i;
            }
            strong+=fact;
            n=n/10;
        }
        if(m==strong)
        {
            System.out.println("its a strong number");
        }
        else {
            System.out.println("its not strong number");
        }


    }


    private static void convertNumbertoWord(int n) {


            if(n==0)
            {
                System.out.println(" zero");
                return;
            }

            if(n>=1000)
            {
                System.out.print(ones[n/1000]+" thousand ");
                n%=1000;
            }
            if(n>=100)
            {
                System.out.print(ones[n/100]+" hundred ");
                n%=100;
            }
            if(n>=20)
            {
                System.out.print(tens[n/10]+" ");
                n%=10;
            }
            if(n>0)
            {
                System.out.print(ones[n]+" ");
            }
    }

    private static void removeDuplicatesFromNumber(int n) {
        boolean arr[]=new boolean[10];
        String s="";

        while(n>0)
        {
            int digit=n%10;
            if(!arr[digit])
            {
                s=digit+s;
                arr[digit]=true;
            }
            n/=10;


        }
        System.out.println(s);

    }

    private static void secondLargestNumberInDigit(int n) {
        int largest=-1;
        int secondLargest=-1;
        while(n>0)
        {
            int digit=n%10;
            if(digit>largest)
            {
                secondLargest=largest;
                largest=digit;
            }
            else if(digit>secondLargest && digit!=largest )
            {
                secondLargest=digit;
            }
            n/=10;
        }
        if(secondLargest ==-1){
            System.out.println("no second largest number");
        }
        else {
            System.out.println("second largest number is:"+secondLargest);
        }


    }

    private static void countEvenorOddInDigit(int n) {


        while(n>0)
        {
            int m=n%10;

            if(m%2==0)
            {
                System.out.println("even"+m);
            }
            else {
                System.out.println("odd"+m);
            }
            n/=10;
        }
    }

    private static int sumOfNaturalNumbers(int n) {
        if(n==1)
        {
            return 1;
        }
        return n+ sumOfNaturalNumbers(n-1);
    }

    private static void perfectNumber(int n) {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("its perfect number");
        }
        else {
            System.out.println("its not perfect number");
        }

    }

    private static void findLCM(int a, int b) {

        int gcd=findGCD(a,b);
        int lcm=(a*b)/gcd;
        System.out.println(lcm);


    }

    private static int findGCD(int a, int b) {

        //formula=gcd(a,b)=gcd(a,b%a)
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;


        }
        return a;
    }

    private static void fobonacciSeries(int n) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }


    }

    private static void armstrongNumber(int n) {

        double s=0;
        int m=n;
        int z=String.valueOf(n).length();

        while(m>0)
        {
           int a=m%10;
           s+=Math.pow(a,z);
           m/=10;
        }

        if(n==s)
        {
            System.out.println("it is armstrong number");
        }
        else {
            System.out.println("it is not armstrong number");
        }

    }

    private static void checkFactorial(int n) {

        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);

    }

    private static void swapTwoNumbers(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+"  "+b);
    }

    private static void findLargestThreeNumbers(int a,int b,int c) {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is larger");
            }
            else {
                System.out.println("c is smaller");
            }
        }
        else {
            if(b>c)
            {
                System.out.println("b is larger");
            }
            else {
                System.out.println("c is larger");
            }
        }

        System.out.println(Math.max(a,Math.max(b,c)));

    }

    private static void countDigits(int n) {
        int count=0;
        int s=n;
        while(s>0)
        {
           count++;
           s/=10;
        }
        System.out.println(count);
    }

    private static void palindromeNumber(int n) {

        int s=n;
        int m=0;

        while(s>0)
        {
            m=m*10+s%10;
            s/=10;

        }
        if(n==m)
        {
            System.out.println("its palindrome");
        }
        else {
            System.out.println("its not palindrome");
        }

    }

    private static void sumOfDigitsOfNumber(int n) {

        int z=0;
        while(n>0)
        {
            z+=n%10;
            n/=10;
        }
        System.out.println(z);

    }

    private static void checkNumberEvenOrOdd(int n) {

       if((n & 1)==0)
       {
           System.out.println("even number:"+n);
       }
       else
       {
           System.out.println("odd number"+n);
       }
    }

    private static void findAllPrimeNumbersInRange(int a,int b) {

        for (int i = a; i <= b; i++) {
            if(i==1)
            {
                continue;
            }
            boolean isPrime=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j == 0) {
                    isPrime=false;
                }

            }
            if(isPrime)
            {
                System.out.println("prime number is"+i);
            }

        }
    }
}
