import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_8545 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		sb.append(S);
		
		System.out.println(sb.reverse());
		
		

	}

}
