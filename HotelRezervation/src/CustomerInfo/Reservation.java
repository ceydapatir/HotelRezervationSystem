
package CustomerInfo;

import java.util.ArrayList;

public class Reservation extends Information {

    int childNo, adultNo, charge;
    String dateIn, dateOut;

    public static  ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

    public Reservation(String id, int childNo, int adultNo, String name, String surname, String country, String dateIn, String dateOut, int charge) {

        super(id, name, surname, country);
        this.childNo = childNo;
        this.adultNo = adultNo;
        this.charge = charge;
        this.dateIn = dateIn;
        this.dateOut = dateOut;

    }

    public int getChildNo() {
        return childNo;
    }

    public int getAdultNo() {
        return adultNo;
    }

    public String getDateIn() {
        return dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setChildNo(int childNo) {
        this.childNo = childNo;
    }

    public void setAdultNo(int adultNo) {
        this.adultNo = adultNo;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    @Override
    public String toString() {
        return super.toString() + "\nchildNo=" + childNo + "\nadultNo=" + adultNo + "\ndateIn=" + dateIn + "\nDay(s)=" + dateOut;
    }

    public void setRevList(ArrayList<Reservation> ar) {
        this.reservationList = ar;
    }

    @Override
    public int payment() {
        if (getAdultNo() == 1 || getAdultNo() == 2) {
            charge = charge + (adultNo*0) + (childNo * 10) ;  

        }
        else if(getAdultNo() > 2){
            charge = charge + ((adultNo-2) *50) + (childNo * 10) ;
        }
        return charge ;
    }
}
