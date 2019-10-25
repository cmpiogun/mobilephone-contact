import java.util.Scanner;

public class Main {
    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        printInstrutions();
        boolean quit = false;
        int choice = 0;

        while(!quit){
            System.out.println("Enter Choice: ");
            choice = console.nextInt();
            console.nextLine();
            switch(choice){
                case 0:
                    printInstrutions();
                    break;
                case 1:
                    mobilePhone.displayContact();
                    break;
                case 2:
                    addContact(mobilePhone);
                    break;
                case 3:
                    modifyPhoneContact(mobilePhone);
                    break;
                case 4:
                    removeContact(mobilePhone);
                    break;
                case 5:
                    queryPhoneContact(mobilePhone);
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstrutions(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To display phone contact list.");
        System.out.println("\t 2 - To store contact details.");
        System.out.println("\t 3 - To modify phone contact.");
        System.out.println("\t 4 - To remove contact.");
        System.out.println("\t 5 - To query contact list.");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addContact(MobilePhone mobilePhone){
        System.out.print("Enter Name: ");
        String name = console.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNo = console.nextLine();
        mobilePhone.storeContact(phoneNo, name);
    }

    public static void modifyPhoneContact(MobilePhone mobilePhone){
        mobilePhone.displayContact();
        System.out.print("Select Number to Modify: ");
        int position = console.nextInt();
        console.nextLine();
        System.out.print("Enter New Contact Name: ");
        String name = console.nextLine();
        System.out.print("Enter Replacement Phone Number: ");
        String phoneNo = console.nextLine();
        mobilePhone.modifyContact(position, phoneNo, name);
    }

    public static void removeContact(MobilePhone mobilePhone){
        mobilePhone.displayContact();
        System.out.print("Select Number to Remove: ");
        int position = console.nextInt();
        mobilePhone.removeContact(position);
    }

    public static void queryPhoneContact(MobilePhone mobilePhone){
        System.out.print("Enter Name/Phone No: ");
        String query = console.nextLine();
        if(mobilePhone.queryContact(query) != null){
            System.out.println(query + " Found in your contact list");
        } else{
            System.out.println(query + " Not in your contact list");
        }
    }
}
