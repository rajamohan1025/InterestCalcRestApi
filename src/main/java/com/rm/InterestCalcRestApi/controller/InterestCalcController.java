package com.rm.InterestCalcRestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rm.InterestCalcRestApi.bean.InterestRequestBean;
import com.rm.InterestCalcRestApi.bean.NormalResult;
import com.rm.InterestCalcRestApi.service.InterestCalc;

@RestController
public class InterestCalcController {
	
	@Autowired
	private InterestCalc interestCalc;
	
	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "OK";
	}

	@PostMapping("/simpleInterest")
	public ResponseEntity<NormalResult> simpleInterest(@RequestBody InterestRequestBean interestRequestBean) {
		NormalResult normalResult = new NormalResult(interestCalc.processInterestCalc(interestRequestBean).toString(),HttpStatus.OK);
		return new ResponseEntity<NormalResult>(normalResult,HttpStatus.OK);
	}
}
