import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1271 {

	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str, " ");
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//
//		System.out.println(A/B);
//		System.out.println(A%B);
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		sc.close();
		
		System.out.println(A.divide(B));
		System.out.println(A.remainder(B));
		
	}

}
