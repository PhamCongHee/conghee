package Object;

public class Address {
    public static final String CITYNAME = "No CityName";
    public static final String DISTRICTNAME = "No DistrictName";
    public static final String STREETNAME = "No StreetName";

    //opject's properties
    private String cityName;
    private  String districtName;
    private  String streetName;

    public Address(String cityName, String districtName, String streetName){
        this.cityName = cityName;
        this.districtName = districtName;
        this.streetName = streetName;
    }

    public Address(Address address){
        this(address.cityName,address.districtName,address.streetName);
    }

    public Address() {
        this(Address.CITYNAME,Address.DISTRICTNAME,Address.STREETNAME);
    }

    public Address setCityName(String cityName){
        this.cityName = cityName;
        return this;
    }

    public String getCityName() {
        return this.cityName;
    }

    public Address setDistrictName(String districtName){
        this.districtName = districtName;
        return this;
    }
    public String getDistrictName(){
        return this.districtName;
    }

    public Address setStreetName(String streetName){
        this.streetName = streetName;
        return this;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String toString(){
        return "CityName: " + cityName+"\nDistrictName: "+districtName+"\nStreetName: " + streetName;
    }
    public static void main(String[] args) {
        Address address = new Address("Hà Nội","Nam Từ Liêm","Tây Mỗ");
        System.out.println(address.toString());
    }
}
