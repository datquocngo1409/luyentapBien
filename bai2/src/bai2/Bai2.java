package bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numC,numF;
        System.out.println("Nhap do C: ");
        numC=sc.nextDouble();
        numF=numC*1.8+32;
        System.out.println("Do F la: "+numF);
    }
    
}
