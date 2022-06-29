import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_25304 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tot = Integer.parseInt(br.readLine());
		
		int cnt = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sum += A * B;
			
		}
		
		if(sum == tot) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			
		}
	}
}
