package tiendas;

public class Producto {
	String nombre;
	String id;
	Double  precio;

	public Producto(String nombre, String id, Double precio) {
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return id;
	}
	public void setCodigo(String id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}