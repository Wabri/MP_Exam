package Console;

import java.util.Scanner;

public class ConsoleGeneric {

	protected static String getString() {
		Scanner keyboard = new Scanner(System.in);
		return keyboard.nextLine();
	}

	protected static int getInt() {
		Scanner keyboard = new Scanner(System.in);
		return keyboard.nextInt();
	}

}