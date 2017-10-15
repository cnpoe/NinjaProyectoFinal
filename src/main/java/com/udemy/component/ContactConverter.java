package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {
	
	public Contact convertContactModelToContact(ContactModel contactModel) {
		return new Contact( 
				contactModel.getId(),
				contactModel.getCity(),
				contactModel.getFirstName(),
				contactModel.getLastName(),
				contactModel.getTelephone()
				);
	}
	
	public ContactModel convertContactToContactModel(Contact contact){
		return new ContactModel(
				contact.getId(),
				contact.getFirstName(),
				contact.getLastName(),
				contact.getTelephone(),
				contact.getCity()
				);
	}
}
