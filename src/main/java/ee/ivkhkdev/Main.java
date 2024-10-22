package ee.ivkhkdev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc2.nextLine();
        System.out.print("enter last name: ");
        String lname = sc2.nextLine();
        System.out.print("enter birth month (ex 'January'): ");
        String bmonth = sc2.nextLine();
        System.out.print("enter birth day (ex 4): " );
        int bday = sc2.nextInt();
        System.out.print("enter birth year (ex '1984'): ");
        int byear = sc2.nextInt();
        System.out.println(name + " " + lname + " born on " + bday + " " + bmonth + " " + byear + " ");

    }
}