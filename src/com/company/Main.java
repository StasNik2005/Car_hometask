package com.company;

import com.company.Car;

import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
/*
        Car car = new Car();
        car.setMarka("Ferrari");
        car.setModel("Ferrari F8");
        car.setColor("Red");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input Marka (starting with UpperCase Letter): ");
            car.setMarka(scanner.nextLine());
        } while (car.getMarka() == null);

        do {
            System.out.println("Input Model (starting with UpperCase Letter): ");
            car.setModel(scanner.nextLine());
        } while (car.getModel() == null);

        do {
            System.out.println("Input Color: ");
            car.setColor(scanner.nextLine());
        } while (car.getColor() == null);

        int p;
        do {
            System.out.println("Input your distance: ");
            p = -1;
//            scanner.close();
            scanner.reset();
            try {
                String s = scanner.nextLine();
                p = Integer.parseInt(s);
            }
            catch (Exception exc)
            {
                System.out.println("Error: "+exc.getLocalizedMessage());
            }
            finally {
                car.setProbeg(p);
            }
        } while (car.getProbeg() == -1);

        System.out.println(car.getMarka());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        car.setGod_vypuska(new Date(2019 - 1900, 9, 18));
        System.out.println(car);
        */

        AutoPark park = new AutoPark(10);
        park.fill();
        System.out.println(park);

        System.out.println("Машины прошлого тысячилетия: ");
        park.previuousCenturyCars();

        System.out.println("Отчет по автомобилям марки: ");
        for (int i = 0; i < Dictionary.marks.length; i++)
        {
            String marka = Dictionary.marks[i][0];
            System.out.println(marka);
            park.getCarsByMark(marka);
        }

        int n = 50000;
        System.out.println("Машины с пробегом меньше чем : " + n);
        park.getCarsWithDistanceLess(n);

        System.out.println("Машины по цвету: ");
        for (int i = 0; i < Dictionary.colors.length; i++)
        {
            String marka = Dictionary.colors[i];
            System.out.println(marka);
            park.getColorsByColor(marka);
        }
    }
}


