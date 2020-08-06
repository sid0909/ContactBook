package com.siddharth;

public class ContactBook {

    private String contactNumber;
    private String contactName;
    private String contactMail;

    public ContactBook(String contactNumber, String contactName, String contactMail) {
        this.contactNumber = contactNumber;
        this.contactName = contactName;
        this.contactMail = contactMail;
    }

    String getContactName() {
        return contactName;
    }

    String getContactNumber(){
        return contactNumber;
    }

    public String getContactMail(){
        return contactMail;
    }

    public static ContactBook createContact(String contactName, String contactNumber, String contactMail){
        /* ContactBook c = new ContactBook(contactNumber, contactName, contactMail);
        return ContactBook;
         */
        return new ContactBook(contactNumber, contactName, contactMail);
    }

}