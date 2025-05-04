package com.edu.training.jc.trendline.logic;

import com.edu.training.jc.trendline.print.Print;

public class Logic {
	
/*
 * метод определяет простое среднееарифметическе нескольких значений
 */
	public static double[] calculateAverageTemperature(double[][] temperature) {
		double[] result = new double[temperature.length];
		for (int i = 0; i < temperature.length; i++) {
			result[i] = (temperature[i][0] + temperature[i][1] + temperature[i][2]) / 3;
		}
		return result;
	}
	
/*
 * Метод отыскивает все участки(любой длины) с повышением температуры
 */
	public static int[][] searchAllTrendLine(double[] temp) {
		int counter; // счётчик линии трренда
		int[][] allTrendLine = new int[temp.length][]; // хранение всех трендов
		for (int i = 0, j = 0; i < temp.length - 1; i++, j++) { // идём по температурам
			int[] prom = new int[temp.length]; // хранение текущего тренда
			prom[0] = i; // первый индекс текущего тренда начинается с начала участка массива
			counter = 1; // первая позиция текущего тренда заполнена, счетчик единица
			while (i < temp.length - 1 && temp[i + 1] > temp[i]) { // пока последующая температура больше текущей
																	// добавляем индексы в текущий тренд
				prom[counter++] = ++i;
			}
			allTrendLine[j] = trim(prom);
		}
		// Print.printArray(trim(allTrendLine));
		return trim(allTrendLine);
	}
	
/*
 * метод отыскивает подмассив(подмассивы) с максимальной длиной
 */
	public static int[][] searchLongestTrendLine(double[] array) {
		int[][] allTtrendLine = searchAllTrendLine(array);
		int[][] result = new int[array.length][];
		int indexInsert = 1;
		result[0] = allTtrendLine[0];
		for (int i = 1; i < allTtrendLine.length; i++) {
			if (allTtrendLine[i].length == allTtrendLine[i - 1].length) {
				result[indexInsert++] = allTtrendLine[i];
			} else if (allTtrendLine[i].length > result[0].length) {
				result = new int[array.length][];
				result[0] = allTtrendLine[i];
				indexInsert = 1;
			}
		}
		return trim(result);
	}

	/*
	 * метод ищет и выводит периоды поышения температуры максимальной длины
	 */
	public static void showLongestTrendLine(double[][] temperature, String[] days) {
		double[] averageTemperature = calculateAverageTemperature(temperature);
		int[][] longestTrendLine = searchLongestTrendLine(averageTemperature);
		Print.printTrendLine(averageTemperature, days, longestTrendLine);
	}

	/*
	 * метод удаляет нулевые ячейки массива в конце одномерного массива
	 */
	public static int[] trim(int[] array) {
		int realLength = 1;
		while (array[realLength] != 0) {
			realLength++;
		}
		int[] result = new int[realLength];
		for (int i = 0; i < realLength; i++) {
			result[i] = array[i];
		}
		return result;
	}

	/*
	 * метод удаляет нулевые подмассивы двумерного массива
	 */
	public static int[][] trim(int[][] array) {
		int realLength = 1;
		while (array[realLength] != null) {
			realLength++;
		}
		int[][] result = new int[realLength][];
		for (int i = 0; i < realLength; i++) {
			result[i] = array[i];
		}
		return result;
	}
}
