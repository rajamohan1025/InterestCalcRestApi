package com.rm.InterestCalcRestApi.service;

import com.rm.InterestCalcRestApi.bean.InterestRequestBean;

public interface InterestCalc {
	InterestRequestBean processInterestCalc(InterestRequestBean interestRequestBean);
}
