package CustomerInfo;

public class RoomInfo extends Information{
    private String typeOfRoom ;
    private int roomNo ;
    private int charge ;

    public RoomInfo(String typeOfRoom, int roomNo, int charge, String id, String name, String surname, String country) {
        super(id, name, surname, country);
        this.typeOfRoom = typeOfRoom;
        this.roomNo = roomNo;
        this.charge = charge;
    }

    @Override
    public int payment() {
        if(typeOfRoom.equalsIgnoreCase("Suit(+$100)")){
            charge = charge + 100 ;
        }
        if(typeOfRoom.equalsIgnoreCase("Deluxe(+$200)")){
            charge =  charge + 200 ;
        }
        charge = charge * roomNo ;
        
       return charge ; 
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getCharge() {
        return charge;
    }

    @Override
    public String toString() {
        return "RoomInfo{" + "typeOfRoom=" + typeOfRoom + ", roomNo=" + roomNo + '}';
    }
    
}
    
    
    
