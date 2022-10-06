package CustomerInfo;

public class Pension extends Information {
    private boolean minibar;
    private boolean massage;
    private boolean breakfast;
    private boolean gym;
    private boolean Tour;
    private  boolean spa ;
    private int charge;

    public Pension(boolean minibar, boolean massage, boolean breakfast, boolean gym, boolean Tour, boolean spa,int charge, String id, String name, String surname, String country) {
        super(id, name, surname,country);
        this.spa = spa ;
        this.minibar = minibar;
        this.massage = massage;
        this.breakfast = breakfast;
        this.gym = gym;
        this.Tour = Tour;
        this.charge = charge;
    }

    @Override
    public int  payment() {
            if(minibar ){
                charge = charge + 10;
            }
            if(massage ){
                charge = charge + 15;
            }
            if(breakfast ){
                charge = charge + 20;
            }
            if(gym){
                charge = charge + 10;
            }
            if(Tour){
                charge = charge + 20;
            }
            if(spa){
                charge = charge + 10;
            }
         return charge ;
    }
    

}