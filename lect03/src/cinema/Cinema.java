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
    final static char EMPTY = 'S';
    final static char BOUGHT = 'B';
    final static int FRONTROW_PRICE = 100;
    final static int BACKROW_PRICE = 80;

    final static Scanner scanner = new Scanner(System.in);    
    private int numRow;
    private int numSeat;
    private int totSeats;
    private int totIncome;
    private int numPurchased;
    private int currentIncome;
    private int frontRows;
    private int backRows;
    private char[][] cinema;
    

    Cinema(int numRow, int numSeat) {
        this.numRow = numRow;
        this.numSeat = numSeat;
        totSeats = numRow * numSeat;       
        frontRows = numRow / 2; 
        backRows = numRow - frontRows;
        calcTotalIncome();
        numPurchased = 0;
        currentIncome = 0;
        initCinema();        
    }

    void calcTotalIncome() {
        if (! isLargeCinema()) {
            totIncome = totSeats * FRONTROW_PRICE;
        }
        else {
            totIncome = (frontRows * FRONTROW_PRICE + backRows * BACKROW_PRICE) * numSeat;
        }
    }

    void initCinema() {
        cinema = new char[numRow][numSeat];
        for (int i = 0; i < numRow; i++) 
            for (int j = 0; j < numSeat; j++)
                cinema[i][j] = EMPTY;

    }

    void showCinema() {
        System.out.print("\nCinema:\n  ");
        for (int j = 1; j <= numSeat; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < numRow; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < numSeat; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean isLargeCinema() {
        return totSeats > 60;
    }

    boolean isBackRow(int row) {
        return row > frontRows;
    }
    
    boolean isWrongInput(int row, int seat) {
        if (row <= 0 || seat <= 0) {
            return true;
        } 
        else if (row > numRow || seat > numSeat) {
            return true;
        }
        else {
            return false;
        } 

    }

    boolean isTicketAvailable(int row, int seat) {
        return cinema[row-1][seat-1] == EMPTY;
    }

    int getTicketPrice(int row, int seat) {
        int price = FRONTROW_PRICE;

        if (isLargeCinema()) {
            if (isBackRow(row)) {
                price = BACKROW_PRICE;
            }
        }
        return price;
    }

    void doBuyTicketTransaction(int row, int seat, int price) {
        cinema[row-1][seat-1] = BOUGHT;
        numPurchased++;
        currentIncome += price;
    }

    void doBuyTicket(int row, int seat) {
        int price = getTicketPrice(row, seat);
        doBuyTicketTransaction(row, seat, price);
        System.out.printf("Ticket price: %d BAHT\n\n", price);
    }

    void buyTicket() {
        boolean done = false;
        while (!done) {
            System.out.println("Enter a row number:");
            showPrompt();
            int row = scanner.nextInt();
            System.out.println("Enter a seat number:");
            showPrompt();
            int seat = scanner.nextInt();
            System.out.println();
        
            if (isWrongInput(row, seat)) {
                System.out.println("Wrong input!\n");            
            } 
            else if (! isTicketAvailable(row, seat)) {
                System.out.println("That ticket has already been purchased!\n");
            } 
            else {
                doBuyTicket(row, seat);
                done = true; 
            }    
        }
    }

    double percentPurchased() {
        return numPurchased * 100.00 / totSeats;
    }
    void showStatistics() {
        System.out.printf("\nNumber of purchased tickets: %d", numPurchased);
        System.out.printf("\nPercentage: %.2f%%", percentPurchased());
        System.out.printf("\nCurrent income: %d BAHT", currentIncome);
        System.out.printf("\nTotal income: %d BAHT", totIncome);
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
