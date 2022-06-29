import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1008 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
		
//		String[] arr1 = br.readLine().split(" ");
//		double a = Double.parseDouble(arr1[0]);
//		double b = Double.parseDouble(arr1[1]);
//		
//		System.out.println(a/b);

	}

}
