import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String turn = read.nextLine();
        boolean next = turn.equals("Chewbacca");
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++)
        {
            String row = read.nextLine();
            board[i] = row.toCharArray();
        }

        ArrayList<char[]> lines = new ArrayList<>();
        lines.add(new char[]{board[0][0],board[0][1],board[0][2]});
        lines.add(new char[]{board[1][0],board[1][1],board[1][2]});
        lines.add(new char[]{board[2][0],board[2][1],board[2][2]});
        lines.add(new char[]{board[0][0],board[1][0],board[2][0]});
        lines.add(new char[]{board[0][1],board[1][1],board[2][1]});
        lines.add(new char[]{board[0][2],board[1][2],board[2][2]});
        lines.add(new char[]{board[0][0],board[1][1],board[2][2]});
        lines.add(new char[]{board[0][2],board[1][1],board[2][0]});
        boolean open = false;
        int numopen = 0;
        for(char[] line : lines)
        {
            if(!(line[0]=='o'||line[1]=='o'||line[2]=='o'))
            {
                open=true;
                numopen++;
            }
        }
        if(next)
        {
            if(open)
            {
                System.out.println("yes");
                return;
            }
            else
            {
                System.out.println("no");
                return;
            }
        }
        else if(open)
        {
            if(numopen>1)
            {
                System.out.println("yes");
                return;
            }
            else
            {
                System.out.println("no");
                return;
            }
        }
    }
}
