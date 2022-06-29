import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5543 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[] {A,B,C};
		int[] arr2 = new int[] {D,E};
		int temp;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
					temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = i + 1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					temp = arr2[j];
					arr2[j] = arr2[i];
					arr2[i] = temp;
				}
			}
		}
		
		System.out.println(arr1[0] + arr2[0] - 50);

	}

}
