package com.example.demo;

public class RevealRequest {
	String claimcode;
	String asin;
	
	public RevealRequest() {
		
	}
	public void setClaimcode(String claimcode) {
		this.claimcode = claimcode;
	}
	public void setAsin(String asin) {
		this.asin = asin;
	}
	public String getClaimcode() {
		return claimcode;
	}
	public String getAsin() {
		return asin;
	}
}
