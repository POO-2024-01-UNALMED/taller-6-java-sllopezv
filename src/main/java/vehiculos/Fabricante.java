package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	// Methods
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
		int mayorCantidad = 0;
		Fabricante fabricanteMasVentas = null;
		for (Vehiculo vehiculo : vehiculos) {
			int cantidad = 0;
			for (Vehiculo vehiculo2 : vehiculos) {
				if (vehiculo.getFabricante().equals(vehiculo2.getFabricante())) {
					cantidad++;
				}
			}
			if (cantidad > mayorCantidad) {
				mayorCantidad = cantidad;
				fabricanteMasVentas = vehiculo.getFabricante();
			}
		}
		return fabricanteMasVentas;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public Pais getPais() {
		return pais;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
