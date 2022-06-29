import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24736 {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		
		int T1 = Integer.parseInt(st.nextToken());
		int F1 = Integer.parseInt(st.nextToken());
		int S1 = Integer.parseInt(st.nextToken());
		int P1 = Integer.parseInt(st.nextToken());
		int C1 = Integer.parseInt(st.nextToken());

		sb.append((T * 6) + (F * 3) + (S * 2) + (P * 1) + (C * 2)).append(" ").append((T1 * 6) + (F1 * 3) + (S1 * 2) + (P1 * 1) + (C1 * 2));
		System.out.println(sb);
	}

}
