import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int cnt= Integer.parseInt(st.nextToken());

//		내가 푼 로직
//		int[] arr1 = new int[N];
//
//		
//
//		for(int i = 0; i < arr1.length; i++) {
//			int temp = 0;
//			arr1[i] = Integer.parseInt(st.nextToken());
//			if(arr1[i] < 5) {
//				temp += arr1[i];
//			}else {
//				continue;
//			}
//			System.out.print(temp + " ");
//		}
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value < cnt) {
				sb.append(value).append(' ');
			}
		}
		System.out.println(sb);
		
	}
}

