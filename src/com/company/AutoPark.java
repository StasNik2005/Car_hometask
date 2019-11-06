package com.company;

import java.util.Arrays;
import java.util.Date;

public class AutoPark {
    Car [] cars;

    public AutoPark(int n) {
        this.cars = new Car[n];
    }

    public void fill(){
        for (int c = 0; c < cars.length; c++) {
            int mark = (int)(Math.random()*Dictionary.marks.length);
            int model = 1+(int)(Math.random()*Dictionary.marks[mark].length-1);
            int color = (int)(Math.random()*Dictionary.colors.length);
            int probeg = (int)(Math.random()*2500000);
            int date = 1900+(int)(Math.random()*(new Date().getYear()));
            cars [c] = new Car(Dictionary.marks[mark][0], Dictionary.marks[mark][model], Dictionary.colors[color], date, probeg);
        }
    }

    @Override
    public String toString()
    {
        String s ="";
        for (int c = 0; c < cars.length; c++) {
            s += "\n" + cars [c];
        }

        return s;
    }

    public void previuousCenturyCars()
    {
        for (int d = 0; d < cars.length; d++) {
           if(cars[d].getGod_vypuska()<=2000){
               System.out.println(cars[d]);
           }

        }
    }

    public void getCarsByMark(String mark){
        int n =0;
        for (int d = 0; d < cars.length; d++) {
            if(cars[d].getMarka().equals(mark)){
                System.out.println(cars[d]);
                n++;
            }
        }

        if(n==0){
            System.out.println("Нет машин марки " + mark);
        }
    }

    public void getCarsWithDistanceLess(int n){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getProbeg()<n){
                System.out.println(cars[i]);
                n++;
            }
        }

        if(n==0){
            System.out.println("Нет машин с пробегом меньше чем  " + n);
        }
    }

    public void getColorsByColor(String s){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getColor().equals(s)){
                System.out.println(cars[i]);

            }
        }
    }
}
