package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	     List<Integer> zahlen = new ArrayList<Integer>();
	     Random rand=new Random();

	     for(int i=1;i<=10;i++)
         {
             zahlen.add(rand.nextInt(100)+1);
         }
         int x=0;
	     for(int b=0;b<10;b++) {
             for (int a = 0; a <9; a++) {
                 if (zahlen.get(a) > zahlen.get(a + 1)) {
                     x = zahlen.get(a);
                     zahlen.set(a,zahlen.get(a+1));
                     zahlen.set(a + 1,x);
                 }
             }
         }
         for(int e=0;e<zahlen.size();e++)
         {
             System.out.println(zahlen.get(e));
         }
    }
}
