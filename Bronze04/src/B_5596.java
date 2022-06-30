import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_5596 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		 StringTokenizer st = new StringTokenizer(br.readLine());
//         int a1 = Integer.parseInt(st.nextToken());
//         int b1 = Integer.parseInt(st.nextToken());
//         int c1 = Integer.parseInt(st.nextToken());
//         int d1 = Integer.parseInt(st.nextToken());
//         
//         st = new StringTokenizer(br.readLine());
//         int a2 = Integer.parseInt(st.nextToken());
//         int b2 = Integer.parseInt(st.nextToken());
//         int c2 = Integer.parseInt(st.nextToken());
//         int d2 = Integer.parseInt(st.nextToken());
//         
//         int mSum = a1 + b1 + c1 + d1;
//         int sSum = a2 + b2 + c2 + d2;
//         
//         if(mSum > sSum) {
//        	 System.out.println(mSum);
//         }else {
//        	 System.out.println(sSum);
//         }
		 StringTokenizer st = new StringTokenizer(br.readLine());;
		 int mSum = 0;
		 for(int i = 0; i < 4; i++) {

			 int temp = Integer.parseInt(st.nextToken());
			 mSum += temp;
		 }
		 
		 st = new StringTokenizer(br.readLine());
		 int sSum = 0;
		 for(int i = 0; i < 4; i++) {
			 int temp = Integer.parseInt(st.nextToken());
			 sSum += temp;
		 }
		 
		 if(mSum > sSum) {
			 System.out.println(mSum);
		 }else {
			 System.out.println(sSum);
		 }
		 
		 
		 
	}

}
