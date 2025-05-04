package com.edu.training.jc.trendline.main;

import com.edu.training.jc.trendline.logic.Logic;
import com.edu.training.jc.trendline.print.Print;

public class Main {

	public static void main(String[] args) {
		
		double[] tempOne = new double[] {0,0,0};
		double[] tempTwo = new double[] {0,0,0};
		double[] tempThree = new double[] {0,0,0};
		double[] tempFour = new double[] {0,0,0};
		double[] tempFive = new double[] {0,0,0};
		double[] tempSix = new double[] {0,0,0};
		double[] tempSeven = new double[] {0,0,0};
		
		double[] tempOne2 = new double[] {0,0,0};
		double[] tempTwo2 = new double[] {1,0,0};
		double[] tempThree2 = new double[] {2,0,0};
		double[] tempFour2 = new double[] {3,0,0};
		double[] tempFive2 = new double[] {4,0,0};
		double[] tempSix2 = new double[] {5,0,0};
		double[] tempSeven2 = new double[] {6,0,0};
		
		double[] tempOne3 = new double[] {0,0,0};
		double[] tempTwo3 = new double[] {1,0,0};
		double[] tempThree3 = new double[] {2,0,0};
		double[] tempFour3 = new double[] {0,0,0};
		double[] tempFive3 = new double[] {1,0,0};
		double[] tempSix3 = new double[] {2,0,0};
		double[] tempSeven3 = new double[] {0,0,0};
		
		double[] tempOne4 = new double[] {0,0,0};
		double[] tempTwo4 = new double[] {1,0,0};
		double[] tempThree4 = new double[] {0,0,0};
		double[] tempFour4 = new double[] {1,0,0};
		double[] tempFive4 = new double[] {0,0,0};
		double[] tempSix4 = new double[] {1,0,0};
		double[] tempSeven4 = new double[] {0,0,0};
		
		double[] tempOne5 = new double[] {0,0,0};
		double[] tempTwo5 = new double[] {1,0,0};
		double[] tempThree5 = new double[] {2,0,0};
		double[] tempFour5 = new double[] {0,0,0};
		double[] tempFive5 = new double[] {1,0,0};
		double[] tempSix5 = new double[] {0,0,0};
		double[] tempSeven5 = new double[] {1,0,0};
		
		double[] tempOne6 = new double[] {0,0,0};
		double[] tempTwo6 = new double[] {1,0,0};
		double[] tempThree6 = new double[] {0,0,0};
		double[] tempFour6 = new double[] {1,0,0};
		double[] tempFive6 = new double[] {2,0,0};
		double[] tempSix6 = new double[] {0,0,0};
		double[] tempSeven6 = new double[] {1,0,0};
		
		String dayOne = "2025-02-10";
		String dayTwo = "2025-02-11";
		String dayThree = "2025-02-12";
		String dayFour = "2025-02-13";
		String dayFive = "2025-02-14";
		String daySix = "2025-02-15";
		String daySeven = "2025-02-16";
		
		String[] day = new String[] {dayOne, dayTwo, dayThree, dayFour, dayFive, daySix, daySeven};
		double[][] temperature = new double[][] {tempOne, tempTwo, tempThree, tempFour, tempFive, tempSix, tempSeven};
		double[][] temperature2 = new double[][] {tempOne2, tempTwo2, tempThree2, tempFour2, tempFive2, tempSix2, tempSeven2};
		double[][] temperature3 = new double[][] {tempOne3, tempTwo3, tempThree3, tempFour3, tempFive3, tempSix3, tempSeven3};
		double[][] temperature4 = new double[][] {tempOne4, tempTwo4, tempThree4, tempFour4, tempFive4, tempSix4, tempSeven4};
		double[][] temperature5 = new double[][] {tempOne5, tempTwo5, tempThree5, tempFour5, tempFive5, tempSix5, tempSeven5};
		double[][] temperature6 = new double[][] {tempOne6, tempTwo6, tempThree6, tempFour6, tempFive6, tempSix6, tempSeven6};
		
		double[] averageTemperature = Logic.calculateAverageTemperature(temperature6);

		Print.printArray(averageTemperature);

		Logic.showLongestTrendLine(temperature6, day);

	}

}
