import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10039 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr1 = new int[5];
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
			if(arr1[i] <= 40) {
				arr1[i] = 40;
			}
			sum += arr1[i];
		}
		
		System.out.println(sum / arr1.length);
	}
}
