package com.constructor.org;

public class Mobile {
	String mobileType;
	String operatingSystem;
	double bandwidthSupport;
	String ramSize;
	int internalMemory;
	String expandableMemory;
	int noOfFrontCameras;
	int noOfBackCameras;
	int frontCameraPixel;
	int backPameraPixel;
	double dimension;
	long battery;
	String mobileProcessor;
	int networkType;
	String simType;
	float bluetoothVersion;
	int onscreenTime;
	String mobileColor;
	String mobileBrandName;
	String mobileBrandModel;

	void MobileSpecification() {
		System.out.println("MOBILE SPECIFICATIONS:");
		System.out.println("");
		System.out.println("MOBILE TYPE :" + mobileType + "\n");
		System.out.println("MOBILE BRAND :" + mobileBrandName + "\n");
		System.out.println("MOBILE BRAND MODEL :" + mobileBrandModel + "\n");
		System.out.println("OPERATING SYSTEM :" + operatingSystem + "\n");
		System.out.println("MOBILE PROCESSOR :" + mobileProcessor + "\n");
		System.out.println("NETWORK TYPE :" + networkType + "G" + "\n");
		System.out.println("WIFI BANDWIDTH :" + bandwidthSupport + "GHz." + "\n");
		System.out.println("SIM TYPE :" + simType + "\n");
		System.out.println("BLUETOOTH VERSION :Version" + bluetoothVersion + "\n");
		System.out.println("MOBILE COLOUR :" + mobileColor + "\n");
		System.out.println("BATTERY CAPACITY :" + battery + "mAh" + "\n");
		System.out.println("ONSCREEN TIME :" + onscreenTime + "Hrs" + "\n");
		System.out.println("RAM SIZE :" + ramSize + "\n");
		System.out.println("ROM SIZE :" + internalMemory + "ROM." + "\n");
		System.out.println("EXPANDABLE MEMORY :" + expandableMemory + "\n");
		System.out.println("DISPLAY SIZE :" + dimension + "Inch" + "\n");
		System.out.println("FRONT CAMERA :" + noOfFrontCameras + "\n");
		System.out.println("REAR CAMERA :" + noOfBackCameras + "\n");
		System.out.println("REAR CAMERA PIXEL :" + backPameraPixel + "Mp" + "\n");
		System.out.println("FRONT CAMERA PIXEL :" + frontCameraPixel + "Mp" + "\n");

	}

	public Mobile(String Type, String Name, String Model, String OS, String Processor, int Network, double band,
			String sim, float version, String color, long capacity, int time, String ramMemory, int romMemory,
			String romexpandable, double display, int frontCamera, int rearCamera, int rearPixel, int frontPixel) {
		mobileType = Type;
		mobileBrandName = Name;
		mobileBrandModel = Model;
		operatingSystem = OS;
		mobileProcessor = Processor;
		networkType = Network;
		bandwidthSupport = band;
		simType = sim;
		bluetoothVersion = version;
		mobileColor = color;
		battery = capacity;
		onscreenTime = time;
		ramSize = ramMemory;
		internalMemory = romMemory;
		expandableMemory = romexpandable;
		dimension = display;
		noOfFrontCameras = frontCamera;
		noOfBackCameras = rearCamera;
		backPameraPixel = rearPixel;
		frontCameraPixel = frontPixel;
	}

	public static void main(String[] args) {
		Mobile mobilespec1 = new Mobile("Smartphone", "Apple", "Iphone 13", "IOS", "A15 Bionic Chip", 5, 5.0, "Dual Sim",
				5.0f, "Midnight Blue", 3250, 12, "It doesn't contains RAM", 512, "No", 6.1, 1, 2, 24, 12);
		mobilespec1.MobileSpecification();
		System.out.println("");
		System.out.println("");
		Mobile mobilespec2 = new Mobile("Smartphone", "Xiaomi", "POCO x2", "Android", "Qualcomm Snapdragon 730G", 4, 5.0,
				"Dual Sim with Memory card option", 5.0f, "Matrix Purple", 4500, 14, "8GB", 256, "upo 512GB", 6.67, 2, 4, 76, 22);
		mobilespec2.MobileSpecification();
	}

}
