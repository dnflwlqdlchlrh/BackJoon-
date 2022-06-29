import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10870 {
	

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		//배열문 풀이(바텀 업 풀이)
		int[] fibonacci = new int[N + 1];
		
		for(int i = 0; i < fibonacci.length; i++) {
			if(i == 0) fibonacci[0] = 0;
			else if(i == 1) fibonacci[1] = 1;
			else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		//배열문 호출
		System.out.println(fibonacci[N]);

		
		// 재귀적 호출
		System.out.println(fibonacci(N));
	}

	// 재귀적 풀이(탑 다운 풀이)
	static int fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		return fibonacci(N - 1) + fibonacci(N - 2); 
	}
	
}

