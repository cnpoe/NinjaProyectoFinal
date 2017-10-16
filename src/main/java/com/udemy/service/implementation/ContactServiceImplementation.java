package com.udemy.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.component.ContactConverter;
import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;
import com.udemy.repository.ContactRepository;
import com.udemy.service.ContactService;

@Service("contactServiceImplementation")
public class ContactServiceImplementation implements ContactService {
	
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;

	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact = contactRepository.save(contactConverter.convertContactModelToContact(contactModel));
		return contactConverter.convertContactToContactModel(contact);
	}

	@Override
	public List<ContactModel> listAllContacts() {
		List<ContactModel> contactModelList = new ArrayList<ContactModel>();
		List<Contact> contacts = contactRepository.findAll();		
		contacts.forEach( contact -> 
			contactModelList.add( contactConverter.convertContactToContactModel(contact) ) 
		);
		return contactModelList;
	}

	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}
	
	@Override
	public ContactModel findContactModelById(int id){
		return contactConverter.convertContactToContactModel( findContactById(id) );
	}

	@Override
	public void removeContact(int id) {
		Contact contact = contactRepository.findById(id);
		if( contact != null)
			contactRepository.delete( contact );
	}

}
