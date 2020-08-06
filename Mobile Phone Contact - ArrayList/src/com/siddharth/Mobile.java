package com.siddharth;

import java.util.ArrayList;

public class Mobile {

    private ArrayList<ContactBook> myContact;

    public Mobile() {
        this.myContact = new ArrayList<>();
    }

    public String textFormatter(ContactBook contact){

        return contact.getContactName().substring(0,1).toUpperCase() +
                contact.getContactName().substring(1).toLowerCase();
    }

    public int contactPosition(String name){
        for(int i=0; i<myContact.size(); i++){
            ContactBook c = myContact.get(i);
            if(c.getContactName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public void addContact(ContactBook contact){
        int position = contactPosition(contact.getContactName());
        if(position>=0){
            System.out.println("Contact name already present!");
        }else{
            myContact.add(contact);
            System.out.println("Contact added successfully!");
        }
    }

    /*public void modifyContact(ContactBook oldContact, ContactBook newContact){
        int position = contactPosition(oldContact.getContactName());
        int temp = contactPosition(newContact.getContactName());
        if(temp>=0){
            System.out.println("New contact already present!");
        }else{
            myContact.set(position,newContact);
            System.out.println("Contact modified successfully!");
        }
    }
*/

    public void modifyContact(int position, ContactBook newContact){
        int temp = contactPosition(newContact.getContactName());
        if(temp==-1){
            myContact.set(position, newContact);
            System.out.println("Contact modified!");
        }else{
            System.out.println("New contact already present in contact book!");
        }
    }


    public void searchContact(ContactBook contact){
        int position = contactPosition(contact.getContactName());
        if(position>= 0){
            printContact(contact);
        }else{
            System.out.println("No result found!");
        }
    }

    public void printContact(ContactBook contact){
        System.out.println(myContact.indexOf(contact)+1 +".\tName:--  " + contact.getContactName());
        System.out.println("\t  Phone Number:--  " + contact.getContactNumber());
        System.out.println("\t  Mail ID:--  " + contact.getContactMail());
    }

    public void printContact(){
        if(myContact.size()>0) {
            for (int i = 0; i < myContact.size(); i++) {
                printContact(myContact.get(i));
            }
        }else{
            System.out.println("No saved contacts to show!");
        }
    }

    public ContactBook getContact(int position){
        if(position>=0){
            return myContact.get(position);
        }else{
            System.out.println("No contact present with such name!");
        }return  null;
    }

    public void remove(int position){
        if(position>=0){
            myContact.remove(position);
            System.out.println("Contact deleted!");
        }else{
            System.out.println("No such contact found!");
        }
    }

    public String textFormatter(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}
