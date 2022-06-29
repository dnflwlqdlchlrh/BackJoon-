import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_20492 {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());

		sb.append(A * 0.78).append(" ").append(A - ((A * 0.2) * 0.22));
		System.out.println((int)(A * 0.78) + " " + (int)(A - ((A * 0.2) * 0.22)));
		
	}

}
