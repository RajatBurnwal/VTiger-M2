package practice;

import genericUtility.JavaUtility;

public class JavaUtilityPractice {

	public static void main(String[] args) {
		
		JavaUtility jUtil = new JavaUtility();
		String value = jUtil.getCalendarDetails("dd-MM-YYYY");
		System.out.println(value);
		String value1 = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(value1);
		int number = jUtil.generateRandomNumber(100);
		System.out.println(number);

	}

}
