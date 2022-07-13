import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11121 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String a;
		String b;

		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a = st.nextToken();
			b = st.nextToken();
			
			if(a.equals(b)) {
				System.out.println("OK");
			} else {
				System.out.println("ERROR");
			}
		}
	}
}
