import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2752 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[] arr1 = new int[] {A, B, C};
		int temp;
		
//		올림 정렬
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr1[j] < arr1[i]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
//		내림 정렬
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = i + 1; j < arr1.length; j++) {
//				if(arr1[j] > arr1[i]) {
//					temp = arr1[j];
//					arr1[j] = arr1[i];
//					arr1[i] = temp;
//				}
//			}
//		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
