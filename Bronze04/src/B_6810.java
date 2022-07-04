import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_6810 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		System.out.printf("The 1-3-sum is %d", 91 + a + b * 3 + c);
	}
}