import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Task03
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
            
            ArrayList<String> winners = new ArrayList<>();
            if(votes[0] == winner) winners.add("Hoth ");
            if(votes[1] == winner) winners.add("Jakku ");
            if(votes[2] == winner) winners.add("Tatooine ");
            if(votes[3] == winner) winners.add("Dagobah ");
            if(votes[4] == winner) winners.add("Kashyyk");
            Collections.sort(winners);
            
            for(String win : winners) System.out.print(win);
            System.out.println();
        }
    }
}
