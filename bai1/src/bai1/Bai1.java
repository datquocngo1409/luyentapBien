package bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemly, diemhoa, diemsinh;
        System.out.println("Nhap diem vat ly: ");
        diemly=sc.nextDouble();
        System.out.println("Nhap diem hoa hoc: ");
        diemhoa=sc.nextDouble();
        System.out.println("Nhap diem sinh hoc: ");
        diemsinh=sc.nextDouble();
        double diemtrungbinh=(diemhoa+diemly+diemsinh)/3;
        System.out.println("Diem trung binh 3 mon la: "+diemtrungbinh);
    }
    
}
