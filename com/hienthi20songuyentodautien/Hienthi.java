package com.hienthi20songuyentodautien;
import java.util.Scanner;
public class Hienthi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to dau tien can hien thi:");
        int number = scanner.nextInt();
        System.out.print(number+ " so nguyen to dau tien la: ");
        int count =0;
        int N =2;
        while (count < number){
            if (isPrimeNumber(N)){
                System.out.print(N+"\t");
                count ++;
            }
            N ++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
