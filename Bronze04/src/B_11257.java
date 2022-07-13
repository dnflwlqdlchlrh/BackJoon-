import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11257 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int S = 35 - (int)(35 * 0.7);
		int M = 25 - (int)(25 * 0.7);
		int T = 40 - (int)(40 * 0.7);

		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int num = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			if (b >= 10.5 && c >= 7.5 && d >= 12 && b+c+d >= 55) {
				System.out.println(num + " " + (b + c + d) + " " + "PASS");
			} else {
				System.out.println(num + " " + (b + c + d) + " " + "FAIL");
			}
//
//			if(b < S || c < M || d < T) {
//				System.out.println(num + " " + (b + c + d) + " " + "FAIL");
//			} else if(b > S) {
//				if(c > M) {
//					if(d > T) {
//						System.out.println(num + " " + (b + c + d) + " " + "PASS");
//					}
//				}
//			} else if(b + c + d < 55) {
//				System.out.println(num + " " + (b + c + d) + " " + "FAIL");
//			} else {
//				System.out.println(num + " " + (b + c + d) + " " + "FAIL");
//			}
		}
	}
}

