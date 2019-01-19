import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVWithScanner {

	public static void main(String[] args) throws IOException {
		// open file input stream
		Main app = new Main();
		BufferedReader reader = new BufferedReader(new FileReader(
				"D:/My Folder/Car Park Database/hdb-carpark-information.csv"));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Employee> empList = new ArrayList<>();
		while (((line = reader.readLine()) != null)) {
			Employee emp = new Employee();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setcode(data);
				else if (index == 1)
					emp.setaddr(data);
				index++;
			}
			index = 0;
			empList.add(emp);
			System.out.println(emp);
			app.insert(emp.getcode(), emp.getaddr());
		}
		
		//close reader
		reader.close();
		
		//System.out.println(empList);
		
	}

}