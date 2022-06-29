import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1264 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;) {
			String A = br.readLine();
			int count = 0;
			if(A.equals("#")) {
				break;
			}
			
			A = A.toLowerCase();
			
			for(int i = 0; i < A.length(); i++) {
				switch(A.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				default:
					break;
				}
			}
			System.out.println(count);
		}
	}
}
