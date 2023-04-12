package bai8;

import java.util.Random;
import java.util.Scanner;


public class bai8 {
    public static void main(String args[]) {
        int a, b, c, t, max, min, i, edge;
        Robot[] arrRobot;
        Random rd = new Random();
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Nhap A so luong Pedion:");
            a = in.nextInt();
            System.out.println("Nhap B so luong Zattacker:");
            b = in.nextInt();
            System.out.println("Nhap C so luong Carrier:");
            c = in.nextInt();
        }


        t = a + b + c;
        arrRobot = new Robot[t];

        edge = a;
        for (i = 0; i < edge; i++) {
            min = 1;
            max = 5;
            int f = rd.nextInt((max - min) + 1) + min;
            arrRobot[i] = new Pedion(f);
        }

        edge += b;
        for (; i < edge; i++) {
            min = 20;
            max = 30;
            int p = rd.nextInt((max - min) + 1) + min;
            arrRobot[i] = new Zattacker(p);
        }

        edge += c;
        for (; i < edge; i++) {
            min = 50;
            max = 100;
            int e = rd.nextInt((max - min) + 1) + min;
            arrRobot[i] = new Carrier(e);
        }

        //Output
        //a
        System.out.println("---Xuat thong tin---");
        for (i = 0; i < t; i++) {
            System.out.println("Robot thu " + (i + 1) + " :");
            System.out.println(arrRobot[i]);
            System.out.println("---");
        }

        //b
        int MaxOfConsumtion = Math.max(Math.max(Pedion.SumOfEnergyConsumtion, Zattacker.SumOfEnergyConsumtion), Carrier.SumOfEnergyConsumtion);
        if(MaxOfConsumtion == Pedion.SumOfEnergyConsumtion)
            System.out.println("Robot loai Pedion tieu thu nang luong nhieu nhat voi " + Pedion.SumOfEnergyConsumtion);
        if(MaxOfConsumtion == Zattacker.SumOfEnergyConsumtion)
            System.out.println("Robot loai Zattacker tieu thu nang luong nhieu nhat voi " + Zattacker.SumOfEnergyConsumtion);
        if(MaxOfConsumtion == Carrier.SumOfEnergyConsumtion)
            System.out.println("Robot loai Carrier tieu thu nang luong nhieu nhat voi " + Carrier.SumOfEnergyConsumtion);


    }
}