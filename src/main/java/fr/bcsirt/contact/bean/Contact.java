package fr.bcsirt.contact.bean;

public class Contact {
	private int id;
	private String name;
	private String email;
	private String address;
	private String phone;
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param address
	 * @param phone
	 */
	public Contact(int id, String name, String email, String address, String phone) {
		this(name, email, address, phone);
		this.id = id;
	}
	
	
	
	/**
	 * 
	 */
	public Contact() {
		super();
	}



	public Contact(String name, String email, String address, String phone) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone
				+ "]";
	}
	
	

}
