package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	// Methods
	public static Pais paisMasVendedor() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
		int mayorCantidad = 0;
		Pais paisMasVendedor = null;
		for (Vehiculo vehiculo : vehiculos) {
			int cantidad = 0;
			for (Vehiculo vehiculo2 : vehiculos) {
				if (vehiculo.getFabricante().getPais().equals(vehiculo2.getFabricante().getPais())) {
					cantidad++;
				}
			}
			if (cantidad > mayorCantidad) {
				mayorCantidad = cantidad;
				paisMasVendedor = vehiculo.getFabricante().getPais();
			}
		}
		return paisMasVendedor;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
