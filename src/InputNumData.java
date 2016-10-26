import java.util.*;
import java.io.*;
public class InputNumData {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("C:\\Users\\45160\\Desktop\\Test\\Jimmy.txt"));
		int maxIndx = -1;
		String []text = new String[1000];
		while (sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		String answer = "";
		int sum;
		for (int j = 0; j <= maxIndx; j++){
			Scanner sc = new Scanner(text[j]);
			sum = 0;
			answer = "";
			while (sc.hasNext()){
				int i = sc.nextInt();
				if(answer.equals("")){
					answer = answer + i;
				}
				answer = answer + " + " + i;
				sum = sum + i;
			}
			answer = answer + " = " + sum;
			System.out.println(answer);
		}
	}

}
