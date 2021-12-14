package com.company;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(-1200);

        System.out.println();
        isLeapYear(2017);
        isLeapYear(2000);


    }

        public static boolean isLeapYear(int year){
            if(year < 1 && year > 9999){
                return false;
            } else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
                return true;
            } else {
                return false;
            }
        }
    }

