package com.example.restexample;

import com.fasterxml.jackson.annotation.JsonValue;

public class GeoError implements IModel {
	
	@JsonValue
	private GeoErrorEnum errorCode;
	
	public GeoErrorEnum getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(GeoErrorEnum errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	private String errorDesc;

	
}
