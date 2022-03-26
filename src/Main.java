import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("=========== WELCOME TO THE MINESWEEPER GAME =============");
        System.out.println(" Please enter the size of the game ");
        System.out.print(" Number of Row : ");
        int r=input.nextInt();
        System.out.print(" Number of Column : ");
        int c=input.nextInt();
        MineSweeper mineSweeper = new MineSweeper(r,c);
        mineSweeper.run();
    }
}