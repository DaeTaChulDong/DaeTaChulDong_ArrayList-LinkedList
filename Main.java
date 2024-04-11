package Package;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Process process = new Process();
		Scanner scanner=new Scanner(System.in);

		int Array[] = new int[] { 0, 1, 2, 3, 4 };
		String TaskSelect=process.Start(Array);

		if (TaskSelect.equals("get"))	process.Get(Array);

		else if (TaskSelect.equals("add"))	process.Add(Array);

		else if (TaskSelect.equals("del"))	process.Del(Array);

		else	process.Replace(Array);

		scanner.close();
	}
}
