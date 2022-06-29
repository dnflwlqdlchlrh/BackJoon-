import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_3003 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        ArrayList<Integer> chess = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++){
            chess.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> bChess = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,8)   ); // 체스말의 기본 갯수
        for(int i = 0; i < 6; i++){
            int result;
            result = bChess.get(i) - chess.get(i);
            System.out.print(result + " ");
        }
    }
}

