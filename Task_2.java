import java.util.Scanner;

class Task_2 {

    static void printNoFillRectangle(int h, int w, String cha)
    {
        for (int i = 0; i < h; i++)
        {
            System.out.println();
            for (int j = 0; j < w; j++)
            {
                if (i == 0 || i == h-1 ||
                    j== 0 || j == w-1)
                   System.out.print(cha);
                else
                   System.out.print(" ");
            }
        }
    }

    static void printFillRectangle(int h, int w, String cha)
    {
        for (int i = 0; i < h; i++)
        {
            System.out.println();
            for (int j = 0; j < w; j++)
            {
                System.out.print(cha);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give drawing charater: ");
        String character = sc.nextLine();

        System.out.println("Give height and width: ");
        int height = sc.nextInt();
        int width = sc.nextInt();

        System.out.println("Filled or not (y=yes, n=no): ");
        String filledOrNot = sc.next();

        if (filledOrNot.equals("y")){
          printFillRectangle(height, width, character);  
        }
        else if (filledOrNot.equals("n")){
            printNoFillRectangle(height, width, character);
        }
        
    }
}
