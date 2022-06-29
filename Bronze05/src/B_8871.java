import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_8871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int A = (N+1)*2;
		int B = (N+1)*3;
		
		System.out.printf("%d %d",A , B);
		
	}

}
