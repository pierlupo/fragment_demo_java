package com.exercice1.service;

import com.exercice1.model.Contact;

import java.util.ArrayList;
import java.util.List;


public class ContactService {

    private List<Contact> contacts;

    private static ContactService instance = null;

    public ContactService() {
       contacts = new ArrayList<>();

        }
    public static ContactService getInstance() {
        if (instance == null)
            instance = new ContactService();
        return instance;
    }

    public void addContact(String prnm, String nm, String phon) {
        Contact contact = new Contact(prnm, nm, phon);
        contacts.add(contact);
    }

    public Contact getContact(int id) {
        return contacts.get(id);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
