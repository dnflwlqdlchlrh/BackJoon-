import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_8718 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(k * 7 <= x) {
			a = 7000 * k;
		} 
		if(3.5 * k <=  x) {
			b = 3500 * k;
		} 
		if(1.75 * k <= x) {
			c = 1750 * k;
		} 
		
		int[] arr1 = new int[] {a, b, c};
		
		System.out.println(Arrays.stream(arr1).max().getAsInt());
		
	}

}
