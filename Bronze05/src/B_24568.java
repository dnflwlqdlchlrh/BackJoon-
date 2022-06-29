import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_24568 {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int B = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		
		System.out.println((B * 8) + (S * 3) - 28);
		
		

	}

}
