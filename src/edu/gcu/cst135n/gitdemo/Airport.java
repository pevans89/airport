package edu.gcu.cst135n.gitdemo;

import java.util.Scanner;

public class Airport {

	private Airplane plane;
	private Scanner sc = new Scanner(System.in);

	public Airport() {
		plane = new Airplane();
	}

	public void flyPlane() {
		String option = "";
		plane.addPilot();
		System.out.println(plane);
		do {
			System.out.println("Do you want the plane to go up? [Y = Yes / N = No / X = eXit] ");
			option = sc.nextLine();
			if (option.equals("Y"))
				plane.goUp();
		} while (!(option.equals("X")));
		System.out.println("Thank you for flying with us!");
	}

}
