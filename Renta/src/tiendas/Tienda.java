package tiendas;
public class Tienda {
	
	
	int caja;
	Producto pro1;
	Producto pro2;
	Producto pro3;
	Producto pro4;
	
	public void hacerpedido(String nombre, String id, Double precio){
		Producto pro1 = new Producto(nombre, id, precio);		
		Producto pro2 = new Producto(nombre, id, precio);		
		Producto pro3 = new Producto(nombre, id, precio);		
		Producto pro4 = new Producto(nombre, id, precio);		
	}
	
	public Producto getPro1() {
		return pro1;
	}
	public void setP1(Producto pro1) {
		this.pro1 = pro1;
	}
	public Producto getPro2() {
		return pro2;
	}
	public void setPro2(Producto pro2) {
		this.pro2 = pro2;
	}
	public Producto getPro3() {
		return pro3;
	}
	public void setPro3(Producto pro3) {
		this.pro3 = pro3;
	}
	public Producto getPro4() {
		return pro4;
	}
	public void setP4(Producto pro4) {
		this.pro4 = pro4;
	}


	
}