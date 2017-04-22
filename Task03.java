import java.util.ArrayList;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        read.nextLine();
        for(int jkjk=0;jkjk<t;jkjk++)
        {
            String rawVote = read.nextLine();
            int[] votes = {0,0,0,0,0};
            while(rawVote.length()>0)
            {
                int i = Integer.parseInt(rawVote.substring(0,1));
                votes[i]++;
                rawVote = rawVote.substring(1);
            }

            int winner = 0;
            for(int i : votes)
            {
                if(i>winner) winner=i;
            }

            String win = "";
            if(votes[0] == winner) win+="Hoth ";
            if(votes[1] == winner) win+="Jakku ";
            if(votes[2] == winner) win+="Tatooine ";
            if(votes[3] == winner) win+="Dagobah ";
            if(votes[4] == winner) win+="Kashyyk";
            System.out.println(win);
        }
    }
}
