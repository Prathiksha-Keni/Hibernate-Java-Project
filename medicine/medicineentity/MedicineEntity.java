package com.xworkz.medicine.medicineentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_details")
public class MedicineEntity {
	@Column(name = "MEDICINE_ID")
	@Id
	private int medicineId;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "M_NAME")
	private String mName;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "M_DATE")
	private String mDate;

	@Column(name = "E_DATE")
	private String eDate;

	public MedicineEntity() {

	}

	public MedicineEntity(int medicineId, String brand, String mName, double price, String mDate, String eDate) {
		super();
		this.medicineId = medicineId;
		this.brand = brand;
		this.mName = mName;
		this.price = price;
		this.mDate = mDate;
		this.eDate = eDate;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	public String geteDate() {
		return eDate;
	}

	public void seteDate(String eDate) {
		this.eDate = eDate;
	}

}
