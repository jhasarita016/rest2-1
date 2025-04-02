package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StatesName {

	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("USAStates.txt");
		

		List<String> states = new ArrayList<>();

		Scanner sc1 = new Scanner(f1);
		while (sc1.hasNextLine()) {
			String inputString = sc1.nextLine();

			System.out.print(inputString + " - ");
			System.out.println(jumbleWord(inputString).toLowerCase());
		}
		System.out.println("inter state");

	}

	public static String jumbleWord(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		List<String> list1 = Arrays.asList(input.split(""));
		Collections.shuffle(list1, new Random());
		return String.join("", list1);

	}

}
