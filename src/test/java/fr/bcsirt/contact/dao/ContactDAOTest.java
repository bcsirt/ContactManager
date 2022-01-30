package fr.bcsirt.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import fr.bcsirt.contact.bean.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("");

		dao = new ContactDAOImpl(dataSource);

	}

	@Test
	void testSave() {
		Contact contact = new Contact("Steve Jobs", "steve@apple.com", "Cupertino, CA", "1234567890");
		int result = dao.save(contact);

		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(2, "Steve MACARON", "steves@apple.com", "Redmon, WA", "1234567890");
		int result = dao.update(contact);
	}

	@Test
	void testGet() {
		int id = 1;
		Contact contact = dao.get(id);
		if (contact != null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}


	@Test
	void testDelete() {
		int id = 3;
		int result = dao.delete(id);
		
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> listContacts = dao.list();
		
		for (Contact aContact : listContacts) {
			System.out.println(aContact);
		}
		
		assertTrue(listContacts.isEmpty());
	}

}
