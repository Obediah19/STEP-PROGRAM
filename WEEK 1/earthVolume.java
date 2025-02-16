class earthVolume {
public static void main(String[] args){
	int radiusKM = 6378;
	double volKM = (4/3)*3.14*radiusKM*radiusKM*radiusKM;
	double volM = volKM*1.6;
	
	System.out.println("The volume of Earth in cubic kilometers is "+volKM+" and cubic miles is "+volM);
}
}
