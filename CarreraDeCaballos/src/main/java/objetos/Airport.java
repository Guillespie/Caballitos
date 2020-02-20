package objetos;

public class Airport {

    private String id;
    private String type;
    private String name;
    private  int elevation;
    private String continent;
    private String country;
    private String region;
    private String municipality;
    private String gps_code;
    private String local_code;
    private String coordinates;

    public Airport(String id, String type, String name, int elevation, String continent, String country, String region, String municipality, String gps_code, String local_code, String coordinates) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.elevation = elevation;
        this.continent = continent;
        this.country = country;
        this.region = region;
        this.municipality = municipality;
        this.gps_code = gps_code;
        this.local_code = local_code;
        this.coordinates = coordinates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getGps_code() {
        return gps_code;
    }

    public void setGps_code(String gps_code) {
        this.gps_code = gps_code;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public long getLatitude(){

        long latitude;

        String[] values = this.coordinates.split(",");

        latitude = Long.valueOf(values[0]);

        return latitude;
    }

    public long getLongitude(){

        long longitude;

        String[] values = this.coordinates.split(", ");

        longitude = Long.valueOf(values[1]);

        return longitude;

    }
}
