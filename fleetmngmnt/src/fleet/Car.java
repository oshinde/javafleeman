package fleet;
// Generated 20 Jan, 2020 2:21:04 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Car generated by hbm2java
 */
@Entity
@Table(name = "car", catalog = "fleet_management")
public class Car implements java.io.Serializable {

	private int carid;
	private Hub hub;
	private Carcategory carcategory;
	private String carnumberplate;
	private String color;
	private String capacity;
	private String carname;
	private String mileage;
	private String availibility;

	public Car() {
	}

	public Car(int carid, Hub hub, Carcategory carcategory) {
		this.carid = carid;
		this.hub = hub;
		this.carcategory = carcategory;
	}

	public Car(int carid, Hub hub, Carcategory carcategory, String carnumberplate, String color, String capacity,
			String carname, String mileage, String availibility) {
		this.carid = carid;
		this.hub = hub;
		this.carcategory = carcategory;
		this.carnumberplate = carnumberplate;
		this.color = color;
		this.capacity = capacity;
		this.carname = carname;
		this.mileage = mileage;
		this.availibility = availibility;
	}

	@Id

	@Column(name = "carid", unique = true, nullable = false)
	public int getCarid() {
		return this.carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	/*@Transient
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hubhubid", nullable = false)
	public Hub getHub() {
		return this.hub;
	}*/

	public void setHub(Hub hub) {
		this.hub = hub;
	}

	@Transient
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "carcategorycategoryid", nullable = false)
	public Carcategory getCarcategory() {
		return this.carcategory;
	}

	public void setCarcategory(Carcategory carcategory) {
		this.carcategory = carcategory;
	}

	@Column(name = "carnumberplate", length = 256)
	public String getCarnumberplate() {
		return this.carnumberplate;
	}

	public void setCarnumberplate(String carnumberplate) {
		this.carnumberplate = carnumberplate;
	}

	@Column(name = "color", length = 256)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "capacity", length = 256)
	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Column(name = "carname", length = 256)
	public String getCarname() {
		return this.carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Column(name = "mileage", length = 256)
	public String getMileage() {
		return this.mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	@Column(name = "availibility", length = 256)
	public String getAvailibility() {
		return this.availibility;
	}

	public void setAvailibility(String availibility) {
		this.availibility = availibility;
	}

}
