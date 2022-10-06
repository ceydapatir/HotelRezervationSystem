package CustomerInfo;

public abstract class Information implements Payment{
    private String id ;
    private String name ;
    private String surname ;
    private String country ;
    private int count = 0 ;
    
    public Information(String id, String name, String surname,String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        count++ ;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCount() {
        return count;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "\n" +"\nReservated Customer"+count + "\n\nid=" + id + "\n name=" + name + "\n surname=" + surname + "\n country=" + country  ;
    }
    
    

  

}
