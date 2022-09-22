import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Give share name: ");
    String shareName = myObj.nextLine();

    System.out.println("Give profit percentage: ");
    Float profitPercentage = myObj.nextFloat(); 

    System.out.println("Give amount of money: ");
    Integer Capital = myObj.nextInt();

    Float ROI = profitPercentage * (float) Capital / 100;
    

    System.out.println("Share " + shareName + " return on capital " + Capital + " is " + ROI);

  }
}