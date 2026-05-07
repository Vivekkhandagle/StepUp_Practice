package com.example.oops;

public class PrintPatterns {

    public static void main(String[] args) {
        //rightTriangleStarPattern();
       // leftTriangleStarPattern();
       // piramidStarPattern();
        practiced();
    }

    private static void practiced() {

        int row=6;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row-i-1;j++)

            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void piramidStarPattern() {


            int row = 6;

            for (int i = 0; i < row; i++) {

                // spaces
                for (int j = 0; j < row - i - 1; j++) {
                    System.out.print(" ");
                }

                // stars
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }

                System.out.println();

        }
    }

    private static void leftTriangleStarPattern() {
        int row=6;
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<row-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    private static void rightTriangleStarPattern() {
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
