import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5597 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] stu = new int[31];

		for(int i = 1; i < 29; i++) {
			int com = Integer.parseInt(br.readLine());
			stu[com] = 1;
		}
		for(int i = 1; i < stu.length; i++) {
			if(stu[i]!=1)
				System.out.println(i);
		}

	}

}
