
import java.util.*;
import java.util.Map.Entry;

public class JavaM4fase2 {

	static HashMap<Integer, Producto> Productos = new HashMap<>();
	static ArrayList<Producto> PlatosElegidos = new ArrayList<Producto>();

	public static void main(String[] args) {
		// Restaurante introducir platos en array

		CargarMenu();
		EligeMenu();
		
	}

	private static void CargarMenu() {

		for (int i = 0; i < 10; i++) {
			Productos.put(i, new Producto("Plat " + i, 10 + i));
		}
		}



	private static void MostrarMenu() {
		// mostrar el menu

		Iterator<Map.Entry<Integer, Producto>> iterator = Productos.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Producto> entrada = iterator.next();
			System.out.println(entrada.getKey() + " " + entrada.getValue().toString());
		}
	}

	private static void EligeMenu() {
		// Elige que quieres comer y elige cuando finalizar pedido

		boolean salir = false;

		while (!salir) {
			MostrarMenu();
			System.out.println("Elige que platos deseas comer, gracias" + "\n");
			System.out.println("si deseas salir introduce un 10" + "\n");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			if (opcion == 10) {
				salir = true;
				
			} else if (opcion < 0 || opcion > 9) {
				System.out.println("solo numeros entre 0 y 9");
			} else {
				System.out.println("has elegido :" + Productos.get(opcion));
				PlatosElegidos.add(Productos.get(opcion));
			}
		
		}
		System.out.println("Su pedido es el siguiente: " +" "+PlatosElegidos+ " , gracias");
		
		
			
	}
}
