import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args){
        double soTienLai = 0;
        Scanner scanner = new Scanner(System.in);
        int inputOption;
        int input = 0;
        boolean flag = true;
        double result;

        do{
            System.out.print("Nhap so tien muon gui: ");
            while(!scanner.hasNextInt()){
                System.out.println("Day khong phai la so vui long nhap lai");
                scanner.next();
                System.out.print("Nhap so tien muon gui: ");
            }
            input = scanner.nextInt();

            if(input <= 0){
                System.out.print("So tien can rut ko hop le");
                flag = false;
            }else{
                flag = true;
            }
        }while(!flag);


        do{
            System.out.print("Chon thang lai suat muon gui (6, 9, 12, 24, 36): ");
            while(!scanner.hasNextInt()){
                System.out.println("Day khong phai la so vui long nhap lai");
                scanner.next();
                System.out.print("Nhap so thang gui: ");
            }
            inputOption = scanner.nextInt();

        switch (inputOption) {
            case 6:
                soTienLai = input * 5.1 / 100;
                flag = true;
                break;
            case 9:
                soTienLai = input * 5.5 / 100;
                flag = true;
                break;
            case 12:
                soTienLai = input * 6.4 / 100;
                flag = true;
                break;
            case 24:
            case 36:
                soTienLai = input * 6.5 / 100;
                flag = true;
                break;
            default:
                System.out.println("Option khong hop le");
                flag = false;
                break;
        }

        }while(!flag);

        result = input + soTienLai;

        System.out.println("input: " + input);
        System.out.println("Loai tien gui: VND");
        System.out.println("Tien lai theo ky: " + (int)soTienLai);
        System.out.println("Lai + Goc: " + (int)result);
    }


        do{
        System.out.print("Nhap so tien muon gui: ");
        while(!scanner.hasNextInt()){
            System.out.println("Day khong phai la so vui long nhap lai");
            scanner.next();
            System.out.print("Nhap so tien muon gui: ");
        }
        input = scanner.nextInt();

        if(input <= 0){
            System.out.print("So tien can rut ko hop le");
            flag = false;
        }else{
            flag = true;
        }
    }while(!flag);


        do{
        System.out.print("Nhap so tien muon gui: ");
        while(!scanner.hasNextInt()){
            System.out.println("Day khong phai la so vui long nhap lai");
            scanner.next();
            System.out.print("Nhap so tien muon gui: ");
        }
        input = scanner.nextInt();

        if(input <= 0){
            System.out.print("So tien can rut ko hop le");
            flag = false;
        }else{
            flag = true;
        }
    }while(!flag);

        do{
        System.out.print("Nhap so tien muon gui: ");
        while(!scanner.hasNextInt()){
            System.out.println("Day khong phai la so vui long nhap lai");
            scanner.next();
            System.out.print("Nhap so tien muon gui: ");
        }
        input = scanner.nextInt();

        if(input <= 0){
            System.out.print("So tien can rut ko hop le");
            flag = false;
        }else{
            flag = true;
        }
    }while(!flag);


    }




