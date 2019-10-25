import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> MobilePhone = new ArrayList<>();

    public void displayContact(){
        System.out.println("You have " + MobilePhone.size() + " contacts on your mobile phone contact list.");
        for(int i = 0; i < MobilePhone.size(); i++){
            System.out.println(i+1 +". " + MobilePhone.get(i).getName() + " | " + MobilePhone.get(i).getPhoneNo());
        }
    }

    public void storeContact(String phoneNo, String name){
        MobilePhone.add(new Contacts(phoneNo, name));
    }

    public void modifyContact(int position, String phoneNo, String name){
        MobilePhone.set(position-1, new Contacts(phoneNo, name));
        System.out.println("Contact Changed");
    }

    public void removeContact(int position){
        MobilePhone.remove(position-1);
        System.out.println("Contact Removed");
    }

    public String queryContact(String searchTerm){
        int position = MobilePhone.get(searchTerm.indexOf(searchTerm)).getName().indexOf(searchTerm);
        if(position>=0){
            return "Query Found";
        }else{
            return null;
        }
    }

}
