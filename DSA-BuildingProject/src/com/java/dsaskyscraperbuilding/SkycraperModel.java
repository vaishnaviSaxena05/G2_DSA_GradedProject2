package com.java.dsaskyscraperbuilding;

public class SkycraperModel {
	public static int totalFloors;
	
	public static int[] totalFloorSize;

	public static void main(String[] args) {
		
		BuildingFloors objDriver = new BuildingFloors();
		
		objDriver.userInputs();
		
		objDriver.orderOfConstruction(objDriver.totalFloorSize);
	}
}
