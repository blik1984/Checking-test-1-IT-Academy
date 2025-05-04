package com.edu.training.jc.trendline.print;

public class Print {

	public static void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.2f \n", array[i]);
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("" + array[i] + " | ");
		}
		System.out.println("");
	}

	public static void printArray(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%.2f | ", array[i][j]);
			}
		}
		System.out.println("");
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("" + array[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void printTrendLine(double[] temperature, String[] days, int[][] longestTrendLine) {

		if (longestTrendLine.length == 0) {
			System.out.println(
					"На протяжении анализируемого промежутка времени отсутствуют периоды повышения температуры");
			return;
		}
		String s = "дня";
		if (longestTrendLine[0] != null && longestTrendLine[0].length > 4) { // для отрезка более 20 дней нужно
																				// усложнять
			s = "дней";
		}
		if (longestTrendLine.length == 1) {
			System.out.println("Самый длинный период повышения: " + longestTrendLine[0].length + " " + s + " \n (с "
					+ days[longestTrendLine[0][0]] + " по " + days[longestTrendLine[0][longestTrendLine[0].length - 1]]
					+ ")");
		} else if (longestTrendLine.length > 1) {
			System.out.println(
					"На протяжении анализируемого промежутка времени есть несколько равнодлинных периодов повышения температуры:");
			for (int i = 0; i < longestTrendLine.length; i++) {
				System.out.println(
						i + 1 + ") " + longestTrendLine[0].length + " " + s + " \n (с " + days[longestTrendLine[i][0]]
								+ " по " + days[longestTrendLine[i][longestTrendLine[i].length - 1]] + ")");
			}
		}

	}
}
