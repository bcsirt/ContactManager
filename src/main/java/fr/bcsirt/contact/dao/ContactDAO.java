package fr.bcsirt.contact.dao;

import java.util.List;

import fr.bcsirt.contact.bean.Contact;

public interface ContactDAO {
	
	// Method to save
	public int save(Contact contact);
	// Method to update
	public int update(Contact contact);
	// Method to Id
	public Contact get(Integer id);
	// Method to delete
	public int delete(Integer id);
	//Method to list 	
	public List<Contact> list();

}
