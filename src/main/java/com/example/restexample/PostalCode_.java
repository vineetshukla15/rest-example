package com.example.restexample;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "adminCode2", "adminName3", "adminCode1", "adminName2", "lng", "countryCode", "postalCode",
		"adminName1", "ISO3166-2", "placeName", "lat" })

public class PostalCode_ {

	@JsonProperty("adminode2")
	private String adminCode2;
	@JsonProperty("adminName3")
	private String adminName3;
	@JsonProperty("adminCode1")
	private String adminCode1;
	@JsonProperty("adminName2")
	private String adminName2;
	@JsonProperty("lng")
	private Double lng;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("postalcode")
	private String postalCode;
	@JsonProperty("adminName1")
	private String adminName1;
	@JsonProperty("ISO3166-2")
	private String iSO31662;
	@JsonProperty("placeName")
	private String placeName;
	@JsonProperty("lat")
	private Double lat;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("admincode2")
	public String getAdminCode2() {
		return adminCode2;
	}

	@JsonProperty("adminCode2")
	public void setAdminCode2(String adminCode2) {
		this.adminCode2 = adminCode2;
	}

	@JsonProperty("adminName3")
	public String getAdminName3() {
		return adminName3;
	}

	@JsonProperty("adminName3")
	public void setAdminName3(String adminName3) {
		this.adminName3 = adminName3;
	}

	@JsonProperty("adminCode1")
	public String getAdminCode1() {
		return adminCode1;
	}

	@JsonProperty("adminCode1")
	public void setAdminCode1(String adminCode1) {
		this.adminCode1 = adminCode1;
	}

	@JsonProperty("adminName2")
	public String getAdminName2() {
		return adminName2;
	}

	@JsonProperty("adminName2")
	public void setAdminName2(String adminName2) {
		this.adminName2 = adminName2;
	}

	@JsonProperty("lng")
	public Double getLng() {
		return lng;
	}

	@JsonProperty("lng")
	public void setLng(Double lng) {
		this.lng = lng;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@JsonProperty("postalcode")
	public String getPostalCode() {
		return postalCode;
	}

	@JsonProperty("postalcode")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonProperty("adminName1")
	public String getAdminName1() {
		return adminName1;
	}

	@JsonProperty("adminName1")
	public void setAdminName1(String adminName1) {
		this.adminName1 = adminName1;
	}

	@JsonProperty("ISO3166-2")
	public String getISO31662() {
		return iSO31662;
	}

	@JsonProperty("ISO3166-2")
	public void setISO31662(String iSO31662) {
		this.iSO31662 = iSO31662;
	}

	@JsonProperty("placeName")
	public String getPlaceName() {
		return placeName;
	}

	@JsonProperty("placeName")
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	@JsonProperty("lat")
	public Double getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "PostalCode [adminCode2=" + adminCode2 + ", adminName3=" + adminName3 + ", adminCode1=" + adminCode1
				+ ", adminName2=" + adminName2 + ", lng=" + lng + ", countryCode=" + countryCode + ", postalCode="
				+ postalCode + ", adminName1=" + adminName1 + ", iSO31662=" + iSO31662 + ", placeName=" + placeName
				+ ", lat=" + lat + ", additionalProperties=" + additionalProperties + "]";
	}

}