import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int tot = A * B;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 5; i++) {
			int sum = 0;
			int N = Integer.parseInt(st.nextToken());
			if(tot > N) {
				sum += N - tot;
			} else if(tot < N) {
				sum += N - tot;
			}
			System.out.print(sum + " ");
		}
		
	}

}
