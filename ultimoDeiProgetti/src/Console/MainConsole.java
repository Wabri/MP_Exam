package Console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import frameworkAgency.Credentials;
import frameworkAgency.GeneralAgency;
import frameworkAgency.GeneralPerson;
import packAgency.TravelAgency;

public class MainConsole {

	static GeneralAgency agency;
	static Credentials user;

	public static void main(String args[]) {
		boolean flag = true;
		while (flag) {
			try {
				agency = ConsoleAction.getAgency(ConsoleDisplayMenu.displayMainMenu());
				System.out.println(agency.getName());
				flag = false;
			} catch (Exception e) {
				flag = true;
			}
		}
		flag = true;
		while (flag) {
			try {
				user = ConsoleAction.getUser(ConsoleDisplayMenu.displayLogin(agency.getName()));
				flag = false;
			} catch (Exception e) {
				flag = true;
			}
		}
		// user = ConsoleDisplayMenu.displayLogin(agency.getName());
	}

	private static void displayHierachy(int resp) {
		switch (resp) {
		case 1:
			ConsoleDisplayMenu.displayForEmplo(agency.getName());
			break;
		case 2:
			ConsoleDisplayMenu.displayForManager(agency.getName());
			break;
		default:
			System.out.println("Errore di I/O");
			break;
		}
	}
}