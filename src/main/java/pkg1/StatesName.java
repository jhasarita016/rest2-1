package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StatesName {

	public static void main(String[] args) throws IOException {
		jumbleFile("USAStates.txt");
	}

	public static String jumbleFile(String fName) throws IOException {
		File f1 = new File(fName);
		FileWriter fw1 = new FileWriter("output.txt");
		String info1 = "";
		List<String> states = new ArrayList<>();

		Scanner sc1 = new Scanner(f1);
		while (sc1.hasNextLine()) {
			String inputString = sc1.nextLine();

			System.out.print(inputString + " - ");
			info1 = jumbleMultiWords(inputString).toLowerCase();
			System.out.println(info1);
			fw1.write(info1 + "\n");
		}

		System.out.println("inter state");
		fw1.close();
		return "success";

	}

	public static String jumbleMultiWords(String input) {
		String output = "";

		if (input == null || input.isEmpty()) {
			return input;
		}

		List<String> list1 = Arrays.asList(input.split(" "));
		int size = list1.size();
		for (int i = 0; i < size; i++) {
			output = output + " " + jumbleWord(list1.get(i));
		}
		return output;

	}

	public static String jumbleWord(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		List<String> list2 = Arrays.asList(input.split(""));
		Collections.shuffle(list2, new Random());
		return String.join("", list2);

	}

}
