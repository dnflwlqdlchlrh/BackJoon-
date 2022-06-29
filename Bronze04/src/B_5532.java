import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5532 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int V = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());

		int Ksum = A / C;
		int Msum = B / D;
		
		if(A % C != 0) 
			Ksum++;
		
		if(B % D != 0) 
			Msum++;
		
		int workday = Math.max(Ksum, Msum);
		System.out.println(V - workday);
		
//		if(Ksum >= Msum) {
//			System.out.println(V - Ksum);
//		} else {
//			System.out.println(V - Msum);
//		}
		
	}

}
