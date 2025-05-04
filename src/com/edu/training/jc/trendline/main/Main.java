package com.edu.training.jc.trendline.main;

import com.edu.training.jc.trendline.logic.Logic;
import com.edu.training.jc.trendline.print.Print;

public class Main {

	public static void main(String[] args) {
		
		double[] tempOne = new double[] {-9,5,0.5};
		double[] tempTwo = new double[] {-10,5,10.1};
		double[] tempThree = new double[] {-3,5,0};
		double[] tempFour = new double[] {-3,5,7};
		double[] tempFive = new double[] {1,5,-7};
		double[] tempSix = new double[] {-5,5,8};
		double[] tempSeven = new double[] {-13,5,-3};
		
		String dayOne = "2025-02-10";
		String dayTwo = "2025-02-11";
		String dayThree = "2025-02-12";
		String dayFour = "2025-02-13";
		String dayFive = "2025-02-14";
		String daySix = "2025-02-15";
		String daySeven = "2025-02-16";
		
		String[] day = new String[] {dayOne, dayTwo, dayThree, dayFour, dayFive, daySix, daySeven};
		double[][] temperature = new double[][] {tempOne, tempTwo, tempThree, tempFour, tempFive, tempSix, tempSeven};

		
		double[] averageTemperature = Logic.calculateAverageTemperature(temperature);

		Print.printArray(averageTemperature);

		Logic.showLongestTrendLine(temperature, day);

	}

}
