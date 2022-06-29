import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2530 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int cook = Integer.parseInt(st.nextToken());
		
		while(true) {
			s += cook;
			
			if(s >= 60) {
				m += s / 60;
				s = s % 60;
			} 
			if(m >= 60) {
				t += m / 60;
				m = m % 60;
			}
			if(t >= 24) {
				t = t % 24;
			}
			break;
		}
		System.out.println(t + " " + m + " " + s);
		
	}

}
