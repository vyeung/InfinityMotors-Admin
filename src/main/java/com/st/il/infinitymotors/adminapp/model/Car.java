package com.st.il.infinitymotors.adminapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * A car in a the database.
 *
 * @author Tonny Huang
 * @author Vien Yeung
 * @author Al Amine
 * @author Henry Cho
 */
@Entity
@Table(name = "tbl_car")
public class Car {
	
	/**
	 * The ID number used to refer to this car in the database.
	 */
	@Id
	@Column(name = "carId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId;
	
	@Column(name="type")
	private String type;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="price")
	private Integer price;
	
	@OneToOne
	@JoinColumn(name = "carspecId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private CarSpecifications carspecId;
    
	@Column(name="diagonalView")
	private String diagonalView;
	
	@Column(name="sideView")
	private String sideView;
	
	@Column(name="interiorView")
	private String interiorView;
	
	@Column(name="numAvailable")
	private Integer numAvailable;
	
	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public CarSpecifications getSpecs() {
		return carspecId;
	}

	public void setSpecs(CarSpecifications specs) {
		this.carspecId = specs;
	}
	
	public String getDiagonalView() {
		return diagonalView;
	}

	public void setDiagonalView(String diagonalView) {
		this.diagonalView = diagonalView;
	}

	public String getSideView() {
		return sideView;
	}

	public void setSideView(String sideView) {
		this.sideView = sideView;
	}

	public String getInteriorView() {
		return interiorView;
	}

	public void setInteriorView(String interiorView) {
		this.interiorView = interiorView;
	}
	
	public Integer getNumAvailable() {
		return numAvailable;
	}
	
	public void setNumAvailable(int numAvailable) {
		this.numAvailable = numAvailable;
	}

	public Car() {
		
	}
	
	
	public Car(Integer carId) {
		this.carId = carId;
	}

	public Car(Integer carId, String type, String make, String model, Integer year, Integer price,
			CarSpecifications specs, String diagonalView, String sideView, String interiorView, int numAvailable) {
		this.carId = carId;
		this.type = type;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.carspecId = specs;
		this.diagonalView = diagonalView;
		this.sideView = sideView;
		this.interiorView = interiorView;
		this.numAvailable = numAvailable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carId == null) ? 0 : carId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carId == null) {
			if (other.carId != null)
				return false;
		} else if (!carId.equals(other.carId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", type=" + type + ", make=" + make + ", model=" + model + ", year=" + year
				+ ", price=" + price + ", specs=" + carspecId + ", numAvailable" + numAvailable + "]";
	}
	
	
	
}
