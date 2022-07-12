import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10808 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		int[] arr1 = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			arr1[str.charAt(i) - 'a'] += 1;
		}
		
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
		
//		}
		
		for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i]);
            sb.append(" ");
        }

        System.out.println(sb);
	}
}
