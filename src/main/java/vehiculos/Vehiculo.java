package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos = 0;
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.nombre = nombre;
		this.traccion = traccion;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		CantidadVehiculos++;
		vehiculos.add(this);
	}
	
	// Methods
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: "
				+ Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
	}
	
	// Getters
	public String getPlaca() {
		return placa;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	
	public static ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	// Setters
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}

}
