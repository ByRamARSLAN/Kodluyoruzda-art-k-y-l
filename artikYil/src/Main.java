import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen artık yıl olup olmadığını merak ettiğiniz yılı giriniz : ");
        yil = input.nextInt();

        if(yil % 4 == 0){
            System.out.println(yil + " Yılı artık yıldır.");
        }else {
            System.out.println(yil + " Yılı artık yıl değidir!");
        }
    }
}