import java.util.Scanner;

/*
хід коня по шахматній дошці.  Вводится текущее положение коня и клетка
в которую пробуют его передвинуть за 1 ход. Программа должна проверить,
возможно ли это сделать
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Хід коня з");
        String start;
        String muveS = inputUser.next();
        System.out.println("Хід коня на");
        String fin;
        String muveF = inputUser.next();
        {
            start = muveS.split(" ")[0];
            fin = muveF.split(" ")[0];
            if (isMuve(start.charAt(0), Character.digit(start.charAt(1), 8),
                    fin.charAt(0), Character.digit(fin.charAt(1), 8)))
                System.out.println("Bірний");
            else System.out.println("не вірний");
        }
    }

    public static boolean positionBoard(char letter, int num) {
        return (letter < 'a' && letter <= 'h') && (num < 1 && num <= 8);
    }

    public static boolean isMuve(char startPos, int numStartPos, char finPos, int finNumPos) {
        return (!positionBoard(startPos, numStartPos) ||
                !positionBoard(finPos, finNumPos)) &&
                ((startPos!=finPos)&&(numStartPos!=finNumPos))&&
                Math.abs(startPos - finPos) + Math.abs(numStartPos - finNumPos) == 3;
    }
}