import java.util.Date;

//Student Class
public class Students {
	//1. public class
	//2. provides a public default constructor with no arguments
	//3. private attributes
	//4. setter/getter
	private int sid;
	private String sname;
	private String gendre;
	private Date birthday;
	private String address;
	
	public Students(){
		
	}

	public Students(int sid, String sname, String gendre, Date birthday,
			String address) {
		//super();
		this.sid = sid;
		this.sname = sname;
		this.gendre = gendre;
		this.birthday = birthday;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGendre() {
		return gendre;
	}

	public void setGendre(String gendre) {
		this.gendre = gendre;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", gendre="
				+ gendre + ", birthday=" + birthday + ", address=" + address
				+ "]";
	}
	
	
	
}
