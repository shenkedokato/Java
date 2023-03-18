package src;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class bai7 {
    public static void main(String[] args) {
        // Đọc dữ liệu từ file input
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file input.txt");
            System.exit(1);
        }

        int numDays = inputFile.nextInt();
        double[][] temperatures = new double[numDays][12];

        for (int i = 0; i < numDays; i++) {
            for (int j = 0; j < 12; j++) {
                temperatures[i][j] = inputFile.nextDouble();
            }
        }

        inputFile.close();

        // Tính nhiệt độ trung bình, cao nhất và thấp nhất cho mỗi ngày và trong tất cả các ngày
        double[] avgTemps = new double[numDays];
        double[] maxTemps = new double[numDays];
        double[] minTemps = new double[numDays];

        double overallMax = Double.MIN_VALUE;
        double overallMin = Double.MAX_VALUE;

        for (int i = 0; i < numDays; i++) {
            double sum = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            for (int j = 0; j < 12; j++) {
                double temp = temperatures[i][j];
                sum += temp;
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }

            double avg = sum / 12;
            avgTemps[i] = avg;
            maxTemps[i] = max;
            minTemps[i] = min;

            if (max > overallMax) {
                overallMax = max;
            }
            if (min < overallMin) {
                overallMin = min;
            }
        }

        // Xuất dữ liệu ra file output
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Không thể tạo file output.txt");
            System.exit(1);
        }

        outputFile.printf("Nhiệt độ trung bình, cao nhất và thấp nhất của từng ngày:\n");
        for (int i = 0; i < numDays; i++) {
            outputFile.printf("Ngày %d: %.1f %.1f %.1f\n", i+1, avgTemps[i], maxTemps[i], minTemps[i]);
        }

        outputFile.printf("\nNhiệt độ cao nhất và thấp nhất trong tất cả các ngày:\n");
        outputFile.printf("Cao nhất: %.1f\n", overallMax);
        outputFile.printf("Thấp nhất: %.1f\n", overallMin);

        outputFile.close();
    }
}


