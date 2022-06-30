import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5554 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		int sum = A + B + C + D;
		
		if(sum >= 60) {
			sb.append(sum / 60).append("\n").append(sum % 60);
		}
			
		System.out.println(sb);
		

	}

}
