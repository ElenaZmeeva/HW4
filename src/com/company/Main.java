package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 1
        int n = 1;
        while (n <=10){
            System.out.print(" " + n);
            n ++;
        }
        System.out.println();
       int i =10;
       for ( ; i >0; i--){
           System.out.print(" " + i );
       }
        System.out.println();
       // Task 2
        int f = 3;
       for ( ;f <=31; f=f+7 ){
           System.out.println(" Сегодня пятница "+ f + "-е число. Необходимо подготовить отчет.");
       }
        System.out.println();
       //Task 3
        for (int y=0; y<2122; y = y+79){
        }
        int comet = 1896;
        int finish = 2122;
        System.out.println(" Приближение кометы к Земле за последние 200 лет:");
        for ( ;comet < finish;comet = comet +79 ){
            System.out.println(comet);
        }
        }

    }

