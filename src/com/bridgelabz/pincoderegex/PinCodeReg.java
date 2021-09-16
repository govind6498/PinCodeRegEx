package com.bridgelabz.pincoderegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeReg {
	public static boolean checkValidPincode(String pinCode) {
		String pinCodeRegex = "[0-9]{6}$";
		Pattern patternObject = Pattern.compile(pinCodeRegex);
		if (pinCode == null) {
			return false;
		}
		Matcher matcherObject = patternObject.matcher(pinCode);
		return matcherObject.matches();
	}
	public static void main(String[] args) {
//		String pincode="400088";
//		pincode="A400088";
		String pincode="400088A";
		boolean isPinCode=checkValidPincode(pincode);
		if(isPinCode) {
			System.out.println(pincode+" is an Valid PinCode");
			System.exit(0);
		}
		System.out.println(pincode+" is an Invalid PinCode");

	}
}
