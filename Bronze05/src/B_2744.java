import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class B_2744 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char[] arr;
		
		arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char)(arr[i] + 32);
				continue;
			}
			if(97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char)(arr[i] - 32);
				continue;
			}
		}
		System.out.println(arr);
	
		
		// 내가 푼 로직
//		for(int i = 0; i < str.length(); i++) {
//			char temp = str.charAt(i);
//			
//			if(temp <= 'a' && temp <= 'z') {
//				temp += 32;
//			}else {
//				temp -= 32;
//			}
//			System.out.print(temp);
//		}
	}

}
