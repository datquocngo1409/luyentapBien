package hinhtron;

import java.util.Scanner;

public class Hinhtron {

    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        radius=sc.nextDouble();
        double dientich=radius*radius*Math.PI, chuvi = 2*radius*Math.PI;
        System.out.println("Dien tich hinh tron la: "+dientich);
        System.out.println("Chu vi hinh tron la : "+chuvi);
    }
    
}
