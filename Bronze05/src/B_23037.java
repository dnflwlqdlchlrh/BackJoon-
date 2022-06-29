import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_23037 {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int sum = 0;
		for(int i = 0; i < S.length(); i++) {
			int temp = S.charAt(i) - 48;
			temp = (int) Math.pow(temp, 5);
			sum += temp;
		}
		System.out.println(sum);

	}

}
