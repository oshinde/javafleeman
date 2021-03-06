package fleet;
// Generated 20 Jan, 2020 2:21:04 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Booking generated by hbm2java
 */
@Entity
@Table(name = "booking", catalog = "fleet_management", uniqueConstraints = @UniqueConstraint(columnNames = "emailid"))
public class Booking implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bookingid;
	private Hub hubByPickuploc;
	private Registeruser registeruser;
	private Hub hubByDropoffloc;
	private Date bookingdate;
	private String bfirstname;
	private String blastname;
	private Date bdob;
	private String baddress;
	private String drivinglicenseno;
	private String baadharno;
	private String bpassportno;
	private String phoneno1;
	private String phoneno2;
	private String emailid;
	private Date pickupdate;
	private Date returndate;
	private String cartype;
	private String amenitiesname;
	private Long amenitiesrate;

	public Booking() {
	}

	public Booking(int bookingid, Hub hubByPickuploc, Registeruser registeruser, Hub hubByDropoffloc, String emailid) {
		this.bookingid = bookingid;
		this.hubByPickuploc = hubByPickuploc;
		this.registeruser = registeruser;
		this.hubByDropoffloc = hubByDropoffloc;
		this.emailid = emailid;
	}

	public Booking(int bookingid, Hub hubByPickuploc, Registeruser registeruser, Hub hubByDropoffloc, Date bookingdate,
			String bfirstname, String blastname, Date bdob, String baddress, String drivinglicenseno, String baadharno,
			String bpassportno, String phoneno1, String phoneno2, String emailid, Date pickupdate, Date returndate,
			String cartype, String amenitiesname, Long amenitiesrate) {
		this.bookingid = bookingid;
		this.hubByPickuploc = hubByPickuploc;
		this.registeruser = registeruser;
		this.hubByDropoffloc = hubByDropoffloc;
		this.bookingdate = bookingdate;
		this.bfirstname = bfirstname;
		this.blastname = blastname;
		this.bdob = bdob;
		this.baddress = baddress;
		this.drivinglicenseno = drivinglicenseno;
		this.baadharno = baadharno;
		this.bpassportno = bpassportno;
		this.phoneno1 = phoneno1;
		this.phoneno2 = phoneno2;
		this.emailid = emailid;
		this.pickupdate = pickupdate;
		this.returndate = returndate;
		this.cartype = cartype;
		this.amenitiesname = amenitiesname;
		this.amenitiesrate = amenitiesrate;
	}

	@Id

	@Column(name = "bookingid", unique = true, nullable = false)
	public int getBookingid() {
		return this.bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	@Transient
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pickuploc", nullable = false)
	public Hub getHubByPickuploc() {
		return this.hubByPickuploc;
	}

	public void setHubByPickuploc(Hub hubByPickuploc) {
		this.hubByPickuploc = hubByPickuploc;
	}

	//@Transient
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "registeruseruserid", nullable = false)
	public Registeruser getRegisteruser() {
		return this.registeruser;
	}

	public void setRegisteruser(Registeruser registeruser) {
		this.registeruser = registeruser;
	}

	@Transient
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dropoffloc", nullable = false)
	public Hub getHubByDropoffloc() {
		return this.hubByDropoffloc;
	}

	public void setHubByDropoffloc(Hub hubByDropoffloc) {
		this.hubByDropoffloc = hubByDropoffloc;
	}

	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "bookingdate", length = 10)
	public Date getBookingdate() {
		return this.bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	@Column(name = "bfirstname", length = 256)
	public String getBfirstname() {
		return this.bfirstname;
	}

	public void setBfirstname(String bfirstname) {
		this.bfirstname = bfirstname;
	}

	@Column(name = "blastname", length = 256)
	public String getBlastname() {
		return this.blastname;
	}

	public void setBlastname(String blastname) {
		this.blastname = blastname;
	}

	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "bdob", length = 10)
	public Date getBdob() {
		return this.bdob;
	}

	public void setBdob(Date bdob) {
		this.bdob = bdob;
	}

	@Column(name = "baddress", length = 256)
	public String getBaddress() {
		return this.baddress;
	}

	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}

	@Column(name = "drivinglicenseno", length = 256)
	public String getDrivinglicenseno() {
		return this.drivinglicenseno;
	}

	public void setDrivinglicenseno(String drivinglicenseno) {
		this.drivinglicenseno = drivinglicenseno;
	}

	@Column(name = "baadharno", length = 256)
	public String getBaadharno() {
		return this.baadharno;
	}

	public void setBaadharno(String baadharno) {
		this.baadharno = baadharno;
	}

	@Column(name = "bpassportno", length = 256)
	public String getBpassportno() {
		return this.bpassportno;
	}

	public void setBpassportno(String bpassportno) {
		this.bpassportno = bpassportno;
	}

	@Column(name = "phoneno1", length = 256)
	public String getPhoneno1() {
		return this.phoneno1;
	}

	public void setPhoneno1(String phoneno1) {
		this.phoneno1 = phoneno1;
	}

	@Column(name = "phoneno2", length = 256)
	public String getPhoneno2() {
		return this.phoneno2;
	}

	public void setPhoneno2(String phoneno2) {
		this.phoneno2 = phoneno2;
	}

	@Column(name = "emailid", unique = true, nullable = false, length = 256)
	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "pickupdate", length = 10)
	public Date getPickupdate() {
		return this.pickupdate;
	}

	public void setPickupdate(Date pickupdate) {
		this.pickupdate = pickupdate;
	}

	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "returndate", length = 10)
	public Date getReturndate() {
		return this.returndate;
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

	@Column(name = "cartype", length = 256)
	public String getCartype() {
		return this.cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	@Column(name = "amenitiesname", length = 256)
	public String getAmenitiesname() {
		return this.amenitiesname;
	}

	public void setAmenitiesname(String amenitiesname) {
		this.amenitiesname = amenitiesname;
	}

	@Column(name = "amenitiesrate", precision = 10, scale = 0)
	public Long getAmenitiesrate() {
		return this.amenitiesrate;
	}

	public void setAmenitiesrate(Long amenitiesrate) {
		this.amenitiesrate = amenitiesrate;
	}

}
