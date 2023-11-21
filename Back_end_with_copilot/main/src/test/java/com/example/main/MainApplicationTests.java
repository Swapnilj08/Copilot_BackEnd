package com.example.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.main.entity.Contact;
import com.example.main.service.ContactService;

@SpringBootTest
class MainApplicationTests {

//define test case for get all contacts

	static Long newUserId;

	@Autowired
	ContactService contactService;
	
	
	@Test
	void testGetallContacts() {
	List<Contact> contacts=contactService.getContacts();
		
	assertNotNull(contacts);
	assertEquals(13, contacts.size());	

	}


	//define test case for add contact
	@Test
	void testAddContact() throws Exception {
		Contact contact=new Contact();
		//contact.setId(1L);
		contact.setName("Rahul");
		contact.setEmail("abc@gmail.com");
		contact.setPhone("1234567890");
		contact.setAddress("Delhi");

		Contact addedContact=contactService.addContact(contact);
		newUserId=addedContact.getId();
		System.out.println(newUserId);
		assertNotNull(addedContact);
		assertEquals("Rahul", addedContact.getName());
		assertEquals("abc@gmail.com", addedContact.getEmail());
		assertEquals("1234567890", addedContact.getPhone());
		assertEquals("Delhi", addedContact.getAddress());
	
	}

	//define test case for update contact
	@Test
	void testUpdateContact() {
		System.out.println(newUserId);
		Contact contact=new Contact();
		contact.setId((long) 3);
		contact.setName("Rahul");
		contact.setEmail("xyz@gmail.com");
		contact.setPhone("1234567890");
		contact.setAddress("pune");

		Contact updatedContact=contactService.updateContact(contact);
		assertNotNull(updatedContact);
		assertEquals("Rahul", updatedContact.getName());
		assertEquals("xyz@gmail.com", updatedContact.getEmail());
		assertEquals("1234567890", updatedContact.getPhone());
		assertEquals("pune", updatedContact.getAddress());
	}


	//define test case for delete contact
	@Test
	void testDeleteContact() {
		Contact deletedContact=contactService.deleteContact((long) 3);
		assertNotNull(deletedContact);
		assertEquals("yash", deletedContact.getName());
		assertEquals("yash@gmail.com", deletedContact.getEmail());
	}

}
