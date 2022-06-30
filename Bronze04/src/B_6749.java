import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_6749 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int c = b + (b - a);
		
		System.out.println(c);
	}

}
