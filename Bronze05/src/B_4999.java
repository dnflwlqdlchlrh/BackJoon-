import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4999 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
			String A = br.readLine();
			String B = br.readLine();
			
			if(A.length() >= B.length()) {
				System.out.println("go");
			} else {
				System.out.println("no");
			}
		}
	}
