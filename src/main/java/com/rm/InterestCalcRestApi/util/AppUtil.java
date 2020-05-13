package com.rm.InterestCalcRestApi.util;

public class AppUtil {

	public static Double calculateSimpleInterest(Double principal, int time, Double rate) {
		return (principal * time * rate)/(365 * 100);
	}

}
