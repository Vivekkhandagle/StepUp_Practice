package com.example.oops;

public class Reverse_word_in_String {
    public static void main(String[] args) {

        String str="i am vivek";
        String ans=" ";
        StringBuilder st=new StringBuilder(" ");

        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(ch!=' ')
            {
                st.append(ch);

            }
            else {
                st.reverse();
                ans+=st;
                ans+=" ";
                  st=new StringBuilder(" ");

            }


        }
       st.reverse();
        ans+=st;
        System.out.println(ans);
    }
}
