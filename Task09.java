import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task09 {

	static class Job implements Comparable {
		int time, fine;

		public Job(int time, int fine) {
			super();
			this.time = time;
			this.fine = fine;
		}

		@Override
		public int compareTo(Object o) {
			Job other = (Job) o;
			double r1 = (double) this.fine/this.time;
			double r2 = (double) other.fine/other.time;
			return (r1 >= r2) ? -1 : 0;
		}

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Job[] jobs = new Job[N];
        int fineRate = 0;

        for (int i = 0; i < N; i++) {
        	jobs[i] = new Job(in.nextInt(), in.nextInt());
        	fineRate += jobs[i].fine;
        }

        int fine = 0;
        Arrays.sort(jobs);
        for (int i = 0; i < N; i++) {
        	fineRate -= jobs[i].fine;
        	fine += fineRate * jobs[i].time;
        	//System.out.println(fineRate);
        	//System.out.println(fine);
        }

        System.out.println(fine);
    }

}
