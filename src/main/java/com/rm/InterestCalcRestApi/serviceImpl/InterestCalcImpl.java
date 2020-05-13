package com.rm.InterestCalcRestApi.serviceImpl;

import java.text.DecimalFormat;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.rm.InterestCalcRestApi.bean.InterestRequestBean;
import com.rm.InterestCalcRestApi.service.InterestCalc;
import com.rm.InterestCalcRestApi.util.AppUtil;

@Service
public class InterestCalcImpl implements InterestCalc {
	
	@Override
	public InterestRequestBean processInterestCalc(InterestRequestBean interestRequestBean) {
		Double amount = null;
		String result = null;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		if(interestRequestBean != null) {
			Double principal = interestRequestBean.getPrincipal();
			int time = Period.between(interestRequestBean.getFromDate(), interestRequestBean.getToDate()).getDays();
			Double rate = interestRequestBean.getRate();
			amount = AppUtil.calculateSimpleInterest(principal, time, rate);
			interestRequestBean.setInterestAmount(Double.parseDouble(decimalFormat.format(amount)));
			interestRequestBean.setTotalAmount(Double.parseDouble(decimalFormat.format(amount += principal)));
			
		}
		return interestRequestBean;
	}
}
