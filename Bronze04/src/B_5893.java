import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class B_5893 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		
		BigInteger big = new BigInteger("0");
		for(int i = 0; i < N.length(); i++) {
			if(N.charAt(i) == '1') {
				big = big.add(new BigInteger("2").pow(N.length() - (i + 1)));
			} else if(N.charAt(i) == '0') {
				big = big.add(new BigInteger("0"));
			} else if(N == "0") {
				bw.write(String.valueOf("0"));
			}
		}
		
		BigInteger result = big.multiply(new BigInteger("17"));
		String last = "";
		while(result != BigInteger.valueOf(0)) {
			last += result.mod(BigInteger.valueOf(2));
			result = result.divide(BigInteger.valueOf(2));
		}
		
		for(int i = last.length() -1; i >= 0; i--) {
			bw.write(String.valueOf(last.charAt(i)));
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
//		2진수 입력
//		String S = br.readLine();
//		
//		2진수에서 10진수로 변경
//		int t1 = Integer.parseInt(S, 2);
//		int t2 = t1 * 17;
//		
//		10진수에서 2진수로 변경
//		String S1 = Integer.toBinaryString(t2);
//		
//		2진수 출력
//		System.out.println(S1);

	}

}
