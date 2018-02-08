package com.mcfadden.exercise4;
//Ean McFadden
//February 8, 2018
//Exercise 4
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Map<String, Integer> cities = new TreeMap<>();
		int n = 0;
		String name = cityInput();
		while (!name.equals("END")) {
			ArrayList<Integer> temp = temperatureInput();
			int avg = averageCalculator(temp);
			cities.put(name, avg);
			name = cityInput();
			n++;
		}
		displayCity(cities);
		}
	static void displayCity(Map<String, Integer> cities){
		for (String key: cities.keySet()) {
			Integer avg = cities.get(key);
			System.out.println("The average for " + key + " is " + avg + " degrees.");
		}
	}
	static Integer averageCalculator(ArrayList<Integer> temp){
		int[] temperature = new int [5];
		temperature[0] = temp.get(0);
		temperature[1] = temp.get(1);
		temperature[2] = temp.get(2);
		temperature[3] = temp.get(3);
		temperature[4] = temp.get(4);
		int avg = (temperature[0] + temperature[1] + temperature[2]  + temperature[3] + temperature[4]) / 5;
		return avg;
	}
	static String cityInput(){
		Scanner cityInput = new Scanner(System.in);
		System.out.println("Enter a city name. Enter 'END' to move on");
		String name = cityInput.nextLine();
		return name;
	}
	static ArrayList<Integer> temperatureInput(){
		Scanner tempInput = new Scanner(System.in);
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i <=4; i++){
			System.out.println("Enter the temperature for day " + (i + 1));
			int temperature = tempInput.nextInt();
			temp.add(temperature);
		}
		return temp;
	}

}
