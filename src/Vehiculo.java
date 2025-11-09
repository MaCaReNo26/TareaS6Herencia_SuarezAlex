abstract class Vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private String propietario;

    public Vehiculo(String placa, String marca, int anio, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.propietario = propietario;
    }

    // Getters y Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }

    // Método abstracto
    public abstract double calcularValorMatricula();
}

// Subclase Auto
class Auto extends Vehiculo {
    private int cilindraje;

    public Auto(String placa, String marca, int anio, String propietario, int cilindraje) {
        super(placa, marca, anio, propietario);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularValorMatricula() {
        return cilindraje * 0.2;
    }
}

// Subclase Moto
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String placa, String marca, int anio, String propietario, int cilindrada) {
        super(placa, marca, anio, propietario);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorMatricula() {
        return cilindrada * 0.1;
    }
}

// Subclase Camion
class Camion extends Vehiculo {
    private double capacidadToneladas;

    public Camion(String placa, String marca, int anio, String propietario, double capacidadToneladas) {
        super(placa, marca, anio, propietario);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularValorMatricula() {
        return capacidadToneladas * 50;
    }
}
