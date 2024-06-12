import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Dong500 = 0, Dong200 = 0, Dong100 = 0, Dong50 = 0;
        boolean flag = true;
        int input = 0;

        do{
        System.out.print("Nhap so tien can rut: ");
        while(!scanner.hasNextInt()){
            System.out.println("Day khong phai la so vui long nhap lai");
            scanner.next();
            System.out.print("Nhap so tien can rut: ");
        }
        input = scanner.nextInt();

            if(input <= 0){
                System.out.println("So tien can rut ko hop le");
                flag = false;
            }else{
                flag = true;
            }
        }while(!flag);


        if (flag) {
            System.out.println("Input nhap vao: " + input);
            Dong500 = input / 500000;
            input = input % 500000;

            Dong200 = input / 200000;
            input = input % 200000;

            Dong100 = input / 100000;
            input = input % 100000;

            Dong50 = input / 50000;
            input = input % 50000;

            double total = Dong500 + Dong200 + Dong100 + Dong50;


            System.out.println("hello");
            String name = " ";
            int n = 2;
            System.out.println(name + n );


            System.out.println("So to 500000: " + (int) Dong500);
            System.out.println("So to 200000: " + (int) Dong200);
            System.out.println("So to 100000: " + (int) Dong100);
            System.out.println("So to 50000: " + (int) Dong50);
            System.out.println("Tong so to: " + (int) total);
        }
    }
}
