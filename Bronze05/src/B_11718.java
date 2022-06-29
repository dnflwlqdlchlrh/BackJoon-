import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11718 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String str;

		while((str = br.readLine()) != null) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
		
	}

}
