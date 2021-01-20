/************************************************************
 * Student ID: 
 * First Name:
 * Last Name
 *
 * Team:
 * 1. <Student ID> <First Name> <Last Name>
 * 2.
 * 3.
 * 
 *
 *
 ************************************************************/


package cinema;

import java.util.Scanner;

public class Cinema {

    final static Scanner scanner = new Scanner(System.in);    
    private int numRow;
    private int numSeat;
    private char[][] cinema;

    Cinema(int numRow, int numSeat) {
        this.numRow = numRow;
        this.numSeat = numSeat;
        // TODO
    }

    void showCinema() {
       // TODO 
    }
    
    void buyTicket() {
       // TODO
    }

    void showStatistics() {
       // TODO
    }
        
    static void showMenu() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");                    
        System.out.println();
    }

    static void showPrompt() {
        System.out.print("> ");
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        showPrompt();
        int numRow = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        showPrompt();
        int numSeat = scanner.nextInt();
        
        Cinema cinema = new Cinema(numRow, numSeat);
        int choice;
        boolean end = false;
        while (!end && true) {
            showMenu();
            showPrompt();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cinema.showCinema();                
                    break;
                case 2:
                    cinema.buyTicket();
                    break;
                case 3:
                    cinema.showStatistics();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    break;
            }
        }        
        
    }
}
