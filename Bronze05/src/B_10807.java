import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10807 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int A = Integer.parseInt(br.readLine());
		int[] B = new int[A];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
//		 내가 풀어본 풀이
				for(int i = 0; i < A; i++) {
					B[i] = Integer.parseInt(st.nextToken());
					
					if(B[i] == C) {
						sum++;
					}
				}
				System.out.println(sum);

		// 문자열에서 정수 자료형으로 형변환 후 비교연산으로 결과 확인
//		for(int i = 0; i < A; i++) {
//
//			if(Integer.parseInt(st.nextToken()) == C) {
//				sum++;
//			}
//		}
//		System.out.println(sum);

		// equals 로 비교
//		for(int i = 0; i < A; i++) {
//
//			if(st.nextToken().equals(C)) {
//				sum++;
//			}
//		}
//		System.out.println(sum);
	}

}
