package app_hotel.entities.application;

import app_hotel.entities.Rent;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("how many rooms will be rented? ");
        int n= sc.nextInt();



        for (int i=0; i<n ; i++){
            System.out.println();
            System.out.println("Rent #"+ (i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);

        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i<10 ; i++){
            if (vect[i] != null){
                System.out.println(i + ": " +vect[i]);
            }

        }

    }
}
