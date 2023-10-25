import java.util.Scanner;

/*
хід коня по шахматній дошці.  Вводится текущее положение коня и клетка
в которую пробуют его передвинуть за 1 ход. Программа должна проверить,
возможно ли это сделать
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter letter - ");
        String let = scan.nextLine();
        System.out.print("enter number - ");
        int num = scan.nextInt();
        String a= (let);
        int b= (num);
        scan = new Scanner(System.in);
        System.out.print("which to switch to letter  - ");
        String letX = scan.nextLine();
        System.out.print("which to switch to number - ");
        int numY = scan.nextInt();
        String x= (letX);
        int y= (numY);
        canMoveHorse(int a, b);
        chessBoard(int a,b);
    }
    public static String chessBoard(int a, int b) {
        String letter = "abcdefgh";
        String number = "87654321";
        if ((a > 7)||(b>7)) return null;
        else return (Character.toString(letter.charAt(a)) + number.charAt(b));
    }
    public static boolean canMoveHorse(final int a, final int b) {

        return (a - x) == (b - y) || (a + x) == (b + y);
    }
}
