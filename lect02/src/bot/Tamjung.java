package bot;

import java.util.Scanner;

class Tamjung {
  private Scanner scanner;
  private String botName;
  private int createdYear;

  Tamjung(String botName, int createdYear) {
    this.scanner = new Scanner(System.in);
    this.botName = botName;
    this.createdYear = createdYear;
  }
   
  void greeting() {
    // การรับข้อมูลจากคีย์บอร์ด 
    
  }
  
  void guessAge() {
    // การเขียน arithmetic expression  

  }

  void countNumber() {
    // ใช้ while-loop

  }

  void quiz() {
    

  }

  public static void main(String[] args) {
    Tamjung bot = new Tamjung("tamjung", 2020);
    bot.greeting(); 
    bot.guessAge();
    bot.countNumber();
    bot.quiz(); 
  }
}
