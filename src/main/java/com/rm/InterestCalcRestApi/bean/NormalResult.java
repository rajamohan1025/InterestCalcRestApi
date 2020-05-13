package com.rm.InterestCalcRestApi.bean;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class NormalResult {

	private String data;

	private HttpStatus httpStatus;

	public NormalResult() {
		super();
	}

	public NormalResult(String data, HttpStatus httpStatus) {
		super();
		this.data = data;
		this.httpStatus = httpStatus;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public String toString() {
		return "NormalResult [data=" + data + ", httpStatus=" + httpStatus + "]";
	}
}
