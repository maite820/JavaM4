


public class Producto {
	// Atributos
	
	private String  Nombre;
	private int Precio;
	
	public Producto () {
		
	}
	
	

	public Producto(String Nombre,int Precio) {
		//metodo constructor
		this.Nombre= Nombre;
		this.Precio= Precio;
	
		}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [Nombre=" + Nombre + ", Precio=" + Precio + "]";
	}



	

}
