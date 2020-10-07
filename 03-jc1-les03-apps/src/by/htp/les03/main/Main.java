package by.htp.les03.main;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int digit = 0;

		System.out.print("Введите число: ");
		if (sc.hasNextInt())
			number = sc.nextInt();

		while (number != 0) {//1
			digit = number % 10;//1
			number = number / 10;//0
			if (digit % 2 == 0) {
				System.out.println("В числе есть четная цифра.");
				return;
			}
		}
		System.out.println("В числе нет четных цифр.");

	}

}
