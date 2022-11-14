package com.java.dsaskyscraperbuilding;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
public class BuildingFloors {
	public Integer totalFloors;
	
	public Integer[] totalFloorSize;
	
	private Scanner sc;

	public void userInputs() {
		System.out.println("enter the total number of floors in the building: ");
		
		sc = new Scanner(System.in);
		totalFloors = sc.nextInt();
		totalFloorSize = new Integer[totalFloors];

		for (int i = 1; i <= totalFloors; i++) {
			System.out.println("enter the floor Size given on day : " + i);
			totalFloorSize[i - 1] = sc.nextInt();
		}
	}

	public void orderOfConstruction(Integer[] totalFloorSize) {
		System.out.println("The order ofthe construction is as follows:");

		int j = 0;
		Integer[] totalFloorSizeSorted = totalFloorSize.clone();
		Arrays.sort(totalFloorSizeSorted, Collections.reverseOrder());

		Stack<Integer> buildingStack = new Stack<Integer>();


		for (int i = 0; i < totalFloorSize.length; i++) {

			if (totalFloorSize[i] == totalFloorSizeSorted[j]) {
				if (i == totalFloorSize.length - 1)
					j = i;
				else
					j = i + 1;

				System.out.println("Day: " + (i + 1));


				if (buildingStack != null) {
					
					System.out.print(totalFloorSize[i] + " ");
					while (!buildingStack.isEmpty()) {
						
						int val = buildingStack.pop();
						if (val >= totalFloorSizeSorted[j]) {
							
							System.out.print(val + " ");
						} else {
							
							buildingStack.push(val);
							j -= buildingStack.size();
							break;
						}
					}
					
					System.out.println("");
				} else {
					
					System.out.println(totalFloorSize[i]);
				}
				
			} else

			{
				System.out.println("Day:" + (i + 1));
				buildingStack.push(totalFloorSize[i]);
			}
		}
	}
}
