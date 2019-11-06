package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Car {
    private String Marka;
    private String Model;
    private String Color;
    private int God_vypuska;
    private int probeg;

    public Car(String marka, String model, String color, int god_vypuska, int probeg) {
        Marka = marka;
        Model = model;
        Color = color;
        God_vypuska = god_vypuska;
        this.probeg = probeg;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public int getGod_vypuska() {
        return God_vypuska;
    }

    public void setGod_vypuska(int god_vypuska) {

        if (god_vypuska <= (new Date().getYear()) && (god_vypuska>1900))
            this.God_vypuska = god_vypuska;
        else
            this.God_vypuska = new Date().getYear()+1900;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        if (probeg >= 0 && probeg <= 2500000) {
            System.out.println("Many kilometers!!!");
            this.probeg = probeg;
        } else {
            this.probeg = -1;
        }
    }

    public void setMarka(String Marka) {
        if (Character.isUpperCase(Marka.charAt(0))) {
            this.Marka = Marka;
        } else {
            System.out.println("Incorrect name");
            this.Marka = null;
        }
    }

    public String getMarka() {
        return this.Marka;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", God_vypuska=" + (God_vypuska) +
                ", probeg=" + probeg +
                '}';
    }

    /* public void generatePassword(int length)
        {
            Random random = new Random();
            char[] password=new char[length];
            Arrays.fill(password,' ');
            for(int i = 0;i <= 100;i++){
                password[random.nextInt(password.length)] = ((char)(random.nextInt(27)+65));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(27)+97));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(11)+48));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(15)+33));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(7)+58));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(6)+91));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(5)+123));
            }

            String str ="";
            for (char c: password) {
                str+=c;
            }
            this.setPassword(str);
        }
        */
}

