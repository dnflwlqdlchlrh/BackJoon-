import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9086 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String S = br.readLine();
			System.out.println(S.charAt(0) + "" + S.charAt(S.length() - 1));
		}

	}

}
