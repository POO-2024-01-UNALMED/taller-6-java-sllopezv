package vehiculos;

public class Automovil extends Vehiculo {
	private int puertas;
	private static int CantidadAutomoviles = 0;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puertas) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puertas = puertas;
		CantidadAutomoviles++;
	}

	// Getters
	public int getPuertas() {
		return puertas;
	}
	
	public static int getCantidadAutomoviles() {
        return CantidadAutomoviles;
    }
	
	// Setters
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
}
