import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_8710 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		b -= a;
		
		if(b <= 0) {
			System.out.println(0);
		} else {
			int d = b / c;
			if(b % c != 0) {
				d += 1;
			}
			System.out.println(d);
		}
		

	}

}
