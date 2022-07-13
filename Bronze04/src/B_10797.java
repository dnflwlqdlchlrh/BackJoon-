import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10797 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int tot = 0;
		for(int i = 0; i < 5; i++) {
				if(str.equals(st.nextToken())) {
					tot++;
				}
			}
		System.out.println(tot);
		
		

	}

}
