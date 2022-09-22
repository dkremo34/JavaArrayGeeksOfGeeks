package com.core;

import java.math.BigInteger;
import java.util.*;

public class ArraysTest {
    public static void main(String[] args) {
        /*int[] x = {6,10,1,4,3};// 1,3,4,6,10
        int[] y = {2,5,3,1,6};
        Arrays.sort(x);
        int maxWidth = 0;
        for (int i = 0; i < x.length - 1; i++) {
            maxWidth = Math.max(maxWidth, (x[i + 1]) - x[i]);
        }
        System.out.println(maxWidth);*/


        /* String x = "[({[([{}])]})}";
        int b= 0;
        int m= 0;
        int s = 0;
        for(int i=0; i<x.length();i++){
            char val = x.charAt(i);
            if(val=='[' || val==']')
            {
               b++;
            }
            if(val=='{' || val=='}')
            {
                m++;
            }
            if(val=='(' || val==')')
            {
                  s++;
            }
        }

        if(b%2==0 && m%2==0 && s%2==0){
            System.out.println("asdsa");
        }

        System.out.println(0%2);*/

        /*String address = "172.16.254.01";
        String[] ipv4 = address.split("\\.");
        int count = 0;
        for (String s : ipv4) {
            long i = Long.parseLong(s);
            if (i > 0 && i < 255) {
                count++;
            }
            if (count == 4) {
                System.out.println("dfgdsfg");
            }
        }*/

        /*String reverse = "reverse";
        String nstr="";
        char ch;
        for(int i=0; i<reverse.length();i++)
        {
            ch= reverse.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println(nstr);*/

        /*String s1="23";
        String s2 ="5";
        BigInteger s = null;
        if( s1!=null || s2!=null){
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);

            s = a.multiply(b);
        }
        System.out.println(String.valueOf(s));*/
    /*String S="i.like.this.program.very.much";
        String[] str=S.split("\\.");
        String str1="";
        for (int i=0; i<str.length;i++) {
            if(i==0){
                str1=str[i];
            }else {
                str1 = str[i] + "." + str1;
            }
        }
        System.out.println(str1
        );*/

        /*String s = "geeksforgeeks";
        String s1 = "for";
        if(s.indexOf(s1)>=0){
        String f = s.substring(s.indexOf(s1), s.indexOf(s1) + s1.length());
        if (f.equalsIgnoreCase(s1)) {
            System.out.println("gg");
        }
        }*/


        /*String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        if (s1.length() == s2.length()) {
            Map<Character, Integer> m = new HashMap<>();
            Map<Character, Integer> m2 = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                if (m.containsKey(s1.charAt(i))) {
                    m.put(s1.charAt(i), m.get(s1.charAt(i)) + 1);
                } else {
                    m.put(s1.charAt(i), 1);
                }
                if (m2.containsKey(s2.charAt(i))) {
                    m2.put(s2.charAt(i), m2.get(s2.charAt(i)) + 1);
                } else {
                    m2.put(s2.charAt(i), 1);
                }
            }
            for (Map.Entry<Character, Integer> h : m.entrySet()) {
                System.out.println(h.getKey() + "" + h.getValue());
                if(m2.containsKey(h.getKey()))
                {
                    if(m2.get(h.getKey()) != h.getValue()){


                    }
                }
            }

        }*/


        String a= "amazon";
        String b= "azonam";

        for (int i = 1; i<=a.length(); i++){


            String l = a.substring(i,a.length())+a.substring(0,i);
            if((l).equalsIgnoreCase(b)){
                System.out.println(l+1);
               break;
            }

            System.out.println(l );

        }




    }

}
