package com.siddharth;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Mobile mb = new Mobile();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print options.");
        System.out.println("\t 1 - To print the saved contacts.");
        System.out.println("\t 2 - To add a new contact in contact book.");
        System.out.println("\t 3 - To modify a existing contact.");
        System.out.println("\t 4 - To remove a contact from your contact book.");
        System.out.println("\t 5 - To search for a contact in contact book.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void main(String[] args) {
        int choice;
        boolean quit = false;
        while (!quit) {
            printInstructions();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    break;

                case 1:

                    printContacts();
                    break;

                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    //  processArrayList();
                    //  case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void add() {
        System.out.print("Enter name you want to add: ");
        String name = mb.textFormatter(sc.nextLine());
        System.out.print("Enter phone number: ");
        String number = sc.nextLine();
        System.out.print("Enter email ID: ");
        String mail = sc.nextLine();
        ContactBook contact = ContactBook.createContact(name, number, mail);
        mb.addContact(contact);
    }

    public static void printContacts() {
        mb.printContact();
    }

    public static void modify(){
        System.out.print("Enter name you want to modify: ");
        String oldName = mb.textFormatter(sc.nextLine());
        int position = mb.contactPosition(oldName);
        if(position>=0) {
            System.out.print("Enter name for new contact: ");
            String newName = sc.nextLine();
            System.out.print("\tEnter number: ");
            String number = sc.nextLine();
            System.out.print("Enter email ID: ");
            String mail = sc.nextLine();
            ContactBook contact = ContactBook.createContact(newName, number, mail);
            mb.modifyContact(position,contact);
        }else{
            System.out.println("Contact with name '"+ oldName + "' not present.!");
        }
    }

    public static void remove(){
        System.out.print("Enter name you want to remove: ");
        mb.remove(mb.contactPosition(mb.textFormatter(sc.nextLine())));
    }

    public static void search(){
        System.out.print("Enter name you want to search: ");
        mb.printContact(mb.getContact(mb.contactPosition(mb.textFormatter(sc.nextLine()))));
    }
}



