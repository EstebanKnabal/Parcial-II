package PLANETAS;

public class Planetas {
    private String nombre;
    private int cantidad_Satelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distancia_Sol;
    private boolean observable;

    public Planetas (String nombre, int cantidad_Satelites, double masa, double volumen, double diametro, double distancia_Sol, boolean observable) {

        this.nombre = nombre;
        this.cantidad_Satelites = cantidad_Satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_Sol = distancia_Sol;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDeSatelites() {
        return cantidad_Satelites;
    }

    public double getMasa() {
        return masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getDistanciaAlSol() {
        return distancia_Sol;
    }

    public boolean isObservable() {
        return observable;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadDeSatelites(int cantidad_Satelites) {
        this.cantidad_Satelites = cantidad_Satelites;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setDistanciaAlSol(double distancia_Sol) {
        this.distancia_Sol = distancia_Sol;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }


    public void datos_Impresos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidad_Satelites);
        System.out.println("Masa del planeta: " + masa + " Kg");
        System.out.println("Volumen del planeta: " + volumen + " m^3");
        System.out.println("Diámetro del planeta: "+  diametro + " Km");
        System.out.println("Distancia a el sol: " + distancia_Sol + " Millones de Kilometros" );
        System.out.println("Se puede observar: " + (observable ? "Sí" : "No"));
    }

    public double CalcularDensidad(){
        return masa / volumen;
    }

    public static void main(String[] args){
        Planetas P1 = new Planetas("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planetas P2 = new Planetas("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);


        System.out.println("Información del Planeta Tierra:");
        P1.datos_Impresos();
        System.out.print("Densidad de " + P1.getNombre() + ": " + P1.CalcularDensidad() + " kg/m^3");
        System.out.println("\n");
        System.out.println("Información del Planeta Jupiter:");
        P2.datos_Impresos();
        System.out.print("Densidad de " + P2.getNombre() + ": " + P2.CalcularDensidad() + " kg/m^3");
    }

}

