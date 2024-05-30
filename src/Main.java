public class Main {
    public static void main(String[] args) {
        // 2. Crear 5 instancias de la clase Hotel con valores quemados
        Hotel hotel1 = new Hotel("Dann Carlton", "1804445044001", true, "Iñaquito", 40.00f);
        Hotel hotel2 = new Hotel("Marriott", "1804445044002", true, "Quicentro", 50.00f);
        Hotel hotel3 = new Hotel("Hilton", "1804445044003", true, "La Carolina", 60.00f);
        Hotel hotel4 = new Hotel("Sheraton", "1804445044004", true, "Gonzalez Suarez", 55.00f);
        Hotel hotel5 = new Hotel("Holiday Inn", "1804445044005", true, "El Ejido", 45.00f);


        // 3. Crear dos objetos con valores nulos y posteriormente setear sus valores

        // Creación de objeto hotel6 con valores nulos
        Hotel hotel6 = new Hotel(null, null, false, null, 0.0f);
        Hotel hotel7 = new Hotel(null, null, false, null, 0.0f);
        // Establecimiento de valores para el objeto hotel6
        hotel6.setNombreHotel("Swissotel");
        hotel6.setRucHotel("1804445044006");
        hotel6.setEstrellasHotel(true);
        hotel6.setDireccionHotel("La Floresta");
        hotel6.setCostoMinimoHotel(70.00f);

        // Establecimiento de valores para el objeto hotel7
        hotel7.setNombreHotel("JW Marriott");
        hotel7.setRucHotel("1804445044007");
        hotel7.setEstrellasHotel(true);
        hotel7.setDireccionHotel("Av. Amazonas");
        hotel7.setCostoMinimoHotel(80.00f);

        // 4a. Modificar los objetos previamente creados
        // mODIFICACION de valores para el objeto hotel1 Y2
        modifyHotel(hotel1, "Dann Carlton", "1804445044008", true, "La Mariscal", 45.00f);
        modifyHotel(hotel2, "Marriott", "1804445044009", true, "Quicentro Norte", 55.00f);

        // 4b. Imprimir todos los objetos
        printAllHotels(hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7);

        // 4c. Modificar todos los atributos de al menos tres objetos con el valor de NULL y mostrar su nuevo valor
        setAttributesToNull(hotel3);
        setAttributesToNull(hotel4);
        setAttributesToNull(hotel5);

        printAllHotels(hotel3, hotel4, hotel5);
    }

    public static void modifyHotel(Hotel hotel, String nombre, String ruc, boolean estrellas, String direccion, float costo) {
        hotel.setNombreHotel(nombre);
        hotel.setRucHotel(ruc);
        hotel.setEstrellasHotel(estrellas);
        hotel.setDireccionHotel(direccion);
        hotel.setCostoMinimoHotel(costo);
    }

    public static void printAllHotels(Hotel... hotels) {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

    public static void setAttributesToNull(Hotel hotel) {
        hotel.setNombreHotel(null);
        hotel.setRucHotel(null);
        hotel.setEstrellasHotel(false);
        hotel.setDireccionHotel(null);
        hotel.setCostoMinimoHotel(0.0f);
    }
}