import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10162 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int btn[] = {300, 60, 10};
		int cnt_btn[] = {0, 0, 0};
		int i;

		// 초를 맞출 수 없을 때
		if(T % 10 != 0) {
			System.out.println(-1);
			return;
		}

		for(i = 0; i < 3; i++) {
			cnt_btn[i] = T / btn[i]; // 5분 -> 1분 -> 10초 버튼 순서로 체크 => 항상 최소값
			T -= btn[i]*cnt_btn[i];

			// 출력
			System.out.print(cnt_btn[i]+" ");
		}


		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//		
		//		int T = Integer.parseInt(br.readLine());
		//		
		//		int A = 0;
		//		int B = 0;
		//		int C = 0;
		//		
		//		if(T >= 300) {
		//			A = T / 300;
		//			T -= 300 * A;
		//		}
		//		
		//		if(T >= 60) {
		//			B = T / 60;
		//			T -= T * B;
		//		}
		//		
		//		if(T % 10 != 0) {
		//			System.out.println(-1);
		//			System.exit(0);
		//		} else {
		//			C = T / 10;
		//			System.out.println(A + " " + B + " " + C);
	}
}
