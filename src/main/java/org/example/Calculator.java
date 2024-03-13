package org.example;

import java.util.Scanner;

public class Calculator {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите два числа");
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();

		System.out.println("Сумма: " + (numberOne + numberTwo));
		System.out.println("Разность: " + (numberOne - numberTwo));
		System.out.println("Умножение: " + (numberOne * numberTwo));
		System.out.println("Деление: " + (numberOne / numberTwo));
	}
}
