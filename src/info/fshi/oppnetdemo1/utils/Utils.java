package info.fshi.oppnetdemo1.utils;

public class Utils {

	public static boolean isInteger(String s) {
	    return isInteger(s,10);
	}
	
	public static boolean isOppNet(String s){
		if(s.substring(0, 6).equals("OppNet")){
			return true;
		}else{
			return false;
		}
	}
	
	public static int getQueueLen(String s){
		return Integer.parseInt(s.split(":")[2]);
	}
	
	public static int getBatteryLevel(String s){
		return Integer.parseInt(s.split(":")[3]);
	}
	
	public static String getDeviceID(String s){
		return s.split(":")[1];
	}
	
	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}

}
