
import java.util.*;

public class JavaM4fase3 {

	static ArrayList<Producto> Menu = new ArrayList<Producto>();

	static ArrayList<Producto> PlatosElegidos = new ArrayList<Producto>();
	static int PrecioTotal;

	public static void main(String[] args) {

		// Comparar lista inicial con platos elegidos. Ticket de venta.

		CargarMenu();
		EligeMenu();
		Comparar();
		
	}

	private static void CargarMenu() {

		Producto[] Productos = new Producto[10];
		Productos[0] = new Producto("Ensalada clasica", 5);
		Productos[1] = new Producto("Ensalada griega", 15);
		Productos[2] = new Producto("Ensalada manzana y nueces", 10);
		Productos[3] = new Producto("Ensalada de pasta", 12);
		Productos[4] = new Producto("Rape a la pimienta ", 28);
		Productos[5] = new Producto("Bacalao a la portuguesa", 23);
		Productos[6] = new Producto("Solomillo ", 30);
		Productos[7] = new Producto("Steak Tartar", 25);
		Productos[8] = new Producto("Mato con miel ", 9);
		Productos[9] = new Producto("Helado de platano y fresa", 9);

		for (int i = 0; i < Productos.length; i++) {

			System.out.println((i) + " . " + Productos[i].getNombre() + " : " + Productos[i].getPrecio() + " euros");
			Menu.add(Productos[i]);
		}

	}

	private static void EligeMenu() {
		// Elige que quieres comer y elige cuando finalizar pedido

		try {
		boolean salir = false;

		while (!salir) {

			CargarMenu();
			System.out.println("Elige que platos deseas comer, gracias" + "\n");
			System.out.println("si deseas salir introduce un 10" + "\n");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			if (opcion>0 && opcion< 10) {
				System.out.println("has elegido :" + Menu.get(opcion));
				PlatosElegidos.add(Menu.get(opcion));
			} else {
				salir = true;
			}

		
		System.out.println("Su pedido es el siguiente: " + " " + PlatosElegidos + " , gracias");
	}
		}
	catch (Exception e) {
		throw new RuntimeException("no es una opcion");
	}
	}
	private static void Comparar() {
		// comprobar que tienen el mismo tamaño y que no son nulos. Sumar precio
		// producto

		for (int i = 0; i < Menu.size(); i++) { // Itera elementos del primer ArrayList
			for (int j = 0; j < PlatosElegidos.size(); j++) {// Itera elementos del segundo ArrayList
				if (Menu.get(i).equals(PlatosElegidos.get(j))) { // Compara si los valores son iguales.
					System.out.println(Menu.get(i) + "coincide el menu de la semana");
					PrecioTotal = PrecioTotal + Menu.get(i).getPrecio();

				}
			}

		}

		System.out.println("El precio de su pedido es :" + PrecioTotal + "" + " euros");

	}
	
}
