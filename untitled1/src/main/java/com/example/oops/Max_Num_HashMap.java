package com.example.oops;


import java.util.HashMap;

public class Max_Num_HashMap {
    public static void main(String[] args) {

        int arr[]={1,1,2,1,2,1,2,3,3,4,4,4,5,5,6,6,6,5};

        HashMap<Integer,Integer> mp=new HashMap();

        for(int i:arr)
        {
            if(!mp.containsKey(i))
            {
                mp.put(i,1);
            }
            else {
                mp.put(i,mp.get(i)+1);
            }
        }

        System.out.println(mp);
        System.out.println(mp.entrySet());

        int max=0;int ans=-1;

        for(var a:mp.entrySet())
        {
            if(a.getValue()>max)
            {
                max= a.getValue();
                ans= a.getKey();
            }
        }
        System.out.println(ans);



    }
}
