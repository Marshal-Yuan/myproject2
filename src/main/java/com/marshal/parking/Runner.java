package com.marshal.parking;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:00";
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");

        Date d = null;
        try {
            d = sdf.parse(enterTime);
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        int enter = 7800;
        int exit = 7980;
        d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime() - d.getTime();
            int minutes = (int) (ms / (1000 * 60));
            System.out.println(minutes);

            int hours =  (minutes + 30)/60;
            System.out.println(30*hours);

        }catch (Exception e){
            System.out.println("Exit wrong format");

//        long a =3*60*60*1000;
//        Date d2 = new Date();
//        d2.setTime(d.getTime()+a);
//        System.out.println(d2);
//        System.out.println(d2.getTime());
        }

    }
}