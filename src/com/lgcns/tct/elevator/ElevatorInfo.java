package com.lgcns.tct.elevator;

public class ElevatorInfo {
	private String name; // ���������� �̸�
	private String drivingInfo; // ��������
	private int power; // ������
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrivingInfo() {
		return drivingInfo;
	}

	public void setDrivingInfo(String drivingInfo) {
		this.drivingInfo = drivingInfo;
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * @param name
	 * @param drivingInfo
	 */
	public ElevatorInfo(String name, String drivingInfo) {
		super();
		this.name = name;
		this.drivingInfo = drivingInfo;
	}
	
	

	/**
	 * @param name
	 * @param power
	 */
	public ElevatorInfo(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}

	public ElevatorInfo() {
		// TODO Auto-generated constructor stub
	}

}
