import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_14928 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		시간 초과 나서 못쓰는 로직(내가 푼 로직)
//		BigInteger A = new BigInteger(br.readLine());
//		BigInteger B = new BigInteger("20000303");
//		
//		System.out.println(A.remainder(B));
		
		
//		자릿수를 하나씩 늘려가면서 연산하는 방법
		String input = br.readLine();
		
//        long temp = 0;
//        for (int i = 0; i < input.length(); i++) {
//        	temp = (temp * 10 + (input.charAt(i) - '0')) % 20000303;
//        }
		
		int temp = 0;
		
		int mod = 20000303;
		for(int i = 0; i < input.length(); i++) {
			int V = input.charAt(i) - '0';
			temp *= 10;
			temp = temp + V;
			temp %= mod;
		}
        
        System.out.println(temp);

	}

}
