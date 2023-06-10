class Bank{
	float rateOfInterest(){
		return 0;
	}
}
class ICICI extends Bank{
	float rateOfInterest(){
		return 5.5f;
	}
}
class SBI extends Bank{
	float rateOfInterest(){
		return 10.6f;
	}
}
class HDFC extends Bank{
	float rateOfInterest(){
		return 9.4f;
	}
}
class Polymorphism{
    public static void main(String[] args) {
    	Bank B;
	B = new ICICI();
    	System.out.println("Rate of interest of ICICI is: "+B.rateOfInterest());
    	B = new SBI();
    	System.out.println("Rate of interest of SBI is: "+B.rateOfInterest());
    	B = new HDFC();
    	System.out.println("Rate of interest of HDFC is: "+B.rateOfInterest());
    }
}
