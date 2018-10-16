package age;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        int namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam sinh: ");
        namsinh=sc.nextInt();
        System.out.println("Tuoi cua ban la: "+(2018-namsinh));
    }
    
}
