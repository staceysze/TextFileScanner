import java.io.File;
import java.io.IOException;
import java.util.*;

public class fileScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Queue<String> femaleQ = new LinkedList<String>();
		Queue<String> maleQ = new LinkedList<String>();
		Queue<String> childQ = new LinkedList<String>();
		Scanner input = new Scanner(new File("input1.txt"));	
		while(input.hasNextLine()){
			String line = input.nextLine();
			Scanner temp = new Scanner(line);
			while(temp.hasNext()){
				String gender = temp.next();
				int month = temp.nextInt();
				int day = temp.nextInt();
				int year = temp.nextInt();
				if( year > 2011){
					childQ.add(line);
				}
				else if(gender.compareTo("Female")==0){
					femaleQ.add(line);
				}
				else{
					maleQ.add(line);
				}
			}
			//System.out.println(line);
			
		}
		input.close();
		System.out.print(childQ);
		System.out.println();
		System.out.print(femaleQ);
		System.out.println();
		System.out.print(maleQ);
	}

}
