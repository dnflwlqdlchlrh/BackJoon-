import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr1 = new int[26];

		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = -1;
		}
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(arr1[ch - 'a'] == -1) {
				arr1[ch - 'a'] = i;
			}
		}
		
		for(int val : arr1) {	
			/*
			 *  생성된 배열의 요소를 확인하는 방법 
			 *  	for(배열의 요소값 : 반복 대상 배열명)
			 *  
			 *  배열의 요소값에는 int,char,boolean 자료형을 사용할 수 있고,
			 *  배열의 요소값에 배열 안에 요소들이 순차적으로 담기게 된다.
			 *  배열의 길이만큼 자동으로 반복된다.
			 */
			System.out.print(val + " ");
		}



	}

}
