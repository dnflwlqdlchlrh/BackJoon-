import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_5928 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());;
		 
		 int D = Integer.parseInt(st.nextToken());
		 int H = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
		 
		 int t1 = 11 * 60 * 24 + 11 * 60 + 11;
		 int t2 = D * 60 * 24 + H * 60 + M;
		 
		 int result = t2 - t1;
		
		 System.out.printf("%d", result < 0 ? -1 : result);
		
		 

		 
		 

	}

}
