/**package com.siddharth;

import com.siddharth.ContactBook;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<ContactBook> myContact;

    public MobilePhone() {
        this.myContact = new ArrayList();
    }

    public String textFormatter(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public boolean checkAvailability(String contactName){
        contactName = textFormatter(contactName);
        int position = contactAvailability();
        if(position >= 0){
            return true;
        }
        return false;
    }

    public void addContact(ContactBook contact){
        if(checkAvailability(contact.getContactName())){
            System.out.println("Contact already exists!");
        }
        else{
            myContact.add(contact);
            System.out.println("Contact added successfully!");
        }
    }

    public void modifyContact(ContactBook contact){
        String name = contact.getContactName();
        name = textFormatter(name);
        if(!checkAvailability(name)){
            int position = myContact.indexOf(name);
            myContact.set(position, contact);
        }
        else{
            System.out.println("Name not present!");
        }
    }

    public void removeContact(String name){
        name = textFormatter(name);
        if(checkAvailability(name)){
            myContact.remove(myContact.indexOf(name));
        }
        else{
            System.out.println("Contact with name'" + name + "' not present!");
        }
    }

    public void searchContact(String name){
        name = textFormatter(name);
        if(checkAvailability(name)){
            printContact(name);
        }
        else{
            System.out.println("contact not present");
        }
    }

    public void printContact(String name, int i){
        name = textFormatter(name);
        if(i>=0){
            ContactBook c = myContact.get(i);
            System.out.println("\tName --> " + c.getContactName());
            System.out.println("\tNumber --> " + c.getContactNumber());
            System.out.println("\tMail --> " + c.getContactMail());
        }else{
            System.out.println("No contact found.");
        }
    }

    public void printContact(){
        if(myContact.size()>0) {
            for (int i = 0; i < myContact.size(); i++) {
                printContact(myContact.get(i).getContactName(), i);
            }
        }else{
            System.out.println("No saved contacts to show!");
        }
    }

    public int contactAvailability(ContactBook newContact){
        for( int i=0; i< myContact.size(); i++){
            ContactBook oldContact = myContact.get(i);
            if (oldContact.getContactName().equalsIgnoreCase(newContact.getContactName())){
                return i;
            }
        }
        return -1;
    }
}*/