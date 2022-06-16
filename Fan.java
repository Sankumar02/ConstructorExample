package com.constructor.org;

public class Fan {
String fanType;
int noOfBlades;
int fanSpeed;
int powerConsumption;
int noOfSpeedsetting;
String bladeDesign;
String fanBrand;
String fanModel;
String bladeType;
int sweep;
double weight;
int frequency;
long airdelivery;
String fanColor;
void FanSpecification() {
	System.out.println("FAN SPECIFICATION:"+"\n");
	System.out.println("FAN TYPE :"+fanType+"\n");
	System.out.println("FAN BRAND :"+fanBrand+"\n");
	System.out.println("FAN MODEL :"+fanModel+"\n");
	System.out.println("FAN COLOUR :"+fanColor+"\n");
	System.out.println("NO OF BLADES :"+noOfBlades+"\n");
	System.out.println("BLADE TYPE :"+bladeType+"\n");
	System.out.println("MOTOR TYPE :"+bladeDesign+"\n");
	System.out.println("POWER CONSUMPTION :"+powerConsumption+"W"+"\n");
	System.out.println("SPEED SETTING :"+noOfSpeedsetting+"\n");
	System.out.println("FAN SPEED :"+fanSpeed+"RPM"+"\n");
	System.out.println("AIR DELIVERY :"+airdelivery+"CMM"+"\n");
	System.out.println("SWEEP :"+sweep+"mm"+"\n");
	System.out.println("WEIGHT :"+weight+"Kg"+"\n");
	System.out.println("FREQUENCY :"+frequency+"Hz");
}
public Fan(String Type,String Brand,String Model,String Colour,int Blades,String BladeType,String BladeDesign,int Power,
		int SpeedSetting,int Speed,long AirDelivery,int Sweep,double Weight,int Frequency) {
	fanType=Type;
	fanBrand=Brand;
	fanModel=Model;
	fanColor=Colour;
	noOfBlades=Blades;
	bladeType=BladeType;
	bladeDesign=BladeDesign;
	powerConsumption=Power;
	noOfSpeedsetting=SpeedSetting;
	fanSpeed=Speed;
	airdelivery=AirDelivery;
	sweep=Sweep;
	weight=Weight;
	frequency=Frequency;
}
	public static void main(String[] args) {
		Fan fanSpecs=new Fan("Ceiling Fan", "Havells", "Legaza 3B", "Black Metal", 4, "Metal", "Aerodynamically designed & Balanced Blade", 72, 4,350 , 215, 1200, 4.5, 50);
		fanSpecs.FanSpecification();

	}

}