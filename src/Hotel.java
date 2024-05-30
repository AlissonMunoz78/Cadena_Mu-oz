public class Hotel {
    private String nombreHotel;
    private String rucHotel;
    private boolean estrellasHotel;
    private String direccionHotel;
    private float costoMinimoHotel;

    // Constructor
    public Hotel(String nombreHotel, String rucHotel, boolean estrellasHotel, String direccionHotel, float costoMinimoHotel) {
        this.nombreHotel = nombreHotel;
        this.rucHotel = rucHotel;
        this.estrellasHotel = estrellasHotel;
        this.direccionHotel = direccionHotel;
        this.costoMinimoHotel = costoMinimoHotel;
    }

    // Getters y Setters
    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getRucHotel() {
        return rucHotel;
    }

    public void setRucHotel(String rucHotel) {
        this.rucHotel = rucHotel;
    }

    public boolean isEstrellasHotel() {
        return estrellasHotel;
    }

    public void setEstrellasHotel(boolean estrellasHotel) {
        this.estrellasHotel = estrellasHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public float getCostoMinimoHotel() {
        return costoMinimoHotel;
    }

    public void setCostoMinimoHotel(float costoMinimoHotel) {
        this.costoMinimoHotel = costoMinimoHotel;
    }


    public String toString() {
        return "Hotel{" +
                "nombreHotel='" + nombreHotel + '\'' +
                ", rucHotel='" + rucHotel + '\'' +
                ", estrellasHotel=" + estrellasHotel +
                ", direccionHotel='" + direccionHotel + '\'' +
                ", costoMinimoHotel=" + costoMinimoHotel +
                '}';
    }
}