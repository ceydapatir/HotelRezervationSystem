package CustomerInfo;
import static CustomerInfo.Reservation.reservationList;
import java.util.ArrayList;

public class CustomerList  {

    public static ArrayList<Information> customer = new ArrayList<Information>();
    
    public static void addCustomer(Information info) {
        customer.add(info);
    }

   public static String search(String id) {
        String str = ""; 
        for (int i = 0; i < customer.size(); i++) 
        {
            if (customer.get(i).getId().equals(id)) 
            {
                str += customer.get(i).toString();
            } 
            else 
            {
                str = "Customer can not found!!";
            }
        }
        return str;
    }
        public static boolean removeCustomer(String id) {

        for (int i = 0; i < customer.size(); i++) 
        {
            if (id.equals(customer.get(i).getId())) 
            {
                customer.remove(i);
                return true;
            }

        }
        return false;
    }

     public String findId(String id) 
     {
        String find = "This Id is no exist";
        for (int i = 0; i < customer.size(); i++) 
        {
            if (customer.get(i).getId().equals(id)) 
            {
                find = customer.get(i).toString();
            }
        }
        return find;
    }

    public String showAllReservation() 
    {
        String all = "";
        for (int i = 0; i < customer.size(); i++) 
        {
            all += customer.get(i).toString() + "\n\n";
        }
         return all;
    }
    
}

