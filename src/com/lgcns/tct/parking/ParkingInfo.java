package com.lgcns.tct.parking;

public class ParkingInfo {
	private String carNumber; // ������ȣ
	private int parkingTime; // �����ð�
	
	
	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getParkingTime() {
		return parkingTime;
	}

	public void setPakingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}

	/**
	 * @param carNumber
	 * @param pakingTime
	 */
	public ParkingInfo(String carNumber, int parkingTime) {
		super();
		this.carNumber = carNumber;
		this.parkingTime = parkingTime;
	}

	public ParkingInfo() {
		// TODO Auto-generated constructor stub
	}

}
