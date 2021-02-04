import java.util.*;

public class JavaM4Fase1 {

	static int PrecioTotal;
	
		

	public static void main(String[] args) {
		// afegim dades
	
		Producto[] Menu = new Producto[5];
	    Menu[0]  = new Producto ("Ensalada clasica",5);
		Menu [1]= new Producto("Ensalada griega",15);
		Menu[2]= new Producto("Ensalada manzana y nueces",10);
		Menu [3]= new Producto("Ensalada de pasta",20); 
		Menu[4]= new Producto("Ensalada de mango tropical",35);
	
		
		imprimeMenu(Menu);
		
        eligePlato(Menu);
        ContadorBilletes();
    
	}




	private static void ContadorBilletes() {
		// contar cantidad de billetes a pagar
		
		int contador []= new int [7];
		int billetes[]= {5,10,20,50,100,200,500};
		 
		for (int i=1; i<billetes.length; i++) {
			
			contador[i] = (PrecioTotal/ billetes[i]);
			
		}
		
		System.out.println ("cantidad billetes necesarios:");
		
		for (int i =0;i<7;i++) {
			if (contador[i]!=0)
				System.out.println (contador[i]+ " unidades de billetes de" + billetes[i]+ " euros" );
		}
			
		}
	




	static void   imprimeMenu (Producto [] array) {
	   	 for (int i=0; i<array.length;i++) {
	   		 System.out.println ((i+1)+ "."+array[i].getNombre() + " "+array[i].getPrecio());
	   	 }
	   	 }

	private static void eligePlato(Producto [] array) {
		
		// TODO Auto-generated method stub
		
			Scanner teclado = new Scanner (System.in);
			boolean salir= false;
			int opcion;
			
			
			while (!salir) {
			
			System.out.println ("Elige la opción, introduce un numero entre 1 y 5, la opcion 6 es para salir"+ "\n");
			
			
			 opcion = teclado.nextInt();
		
			
				switch(opcion) {
				
				case 1:
					System.out.println("has elegido: "+  array[0].getNombre()+" que vale "+array[0].getPrecio()+" euros");
					PrecioTotal =PrecioTotal+ array[0].getPrecio();
					break;
					
				case 2:
					System.out.println("has elegido: "+  array[1].getNombre()+" que vale "+array[1].getPrecio()+" euros");
					PrecioTotal =PrecioTotal+ array[1].getPrecio();
					break;
					
				case 3:
					System.out.println("has elegido: "+  array[2].getNombre()+" que vale "+array[2].getPrecio()+" euros");
					PrecioTotal =PrecioTotal+ array[2].getPrecio();
					break;
					
				case 4:
					System.out.println("has elegido: "+  array[3].getNombre()+" que vale "+array[3].getPrecio()+" euros");
					PrecioTotal =PrecioTotal+ array[3].getPrecio();
					break;
					
				case 5:
					System.out.println("has elegido: "+  array[4].getNombre()+" que vale "+array[4].getPrecio()+" euros");
					PrecioTotal =PrecioTotal+ array[4].getPrecio();
					break;
					
				case 6:
					salir=true;
					break;
					
				default:
					
					System.out.println("solo numeros entre 1 y 6");
			 
				}
		}
			System.out.println("El precio total del pedido es de "+PrecioTotal+ ""+ " euros");
			teclado.close();
			
			
	}
}

				
			
		
		
		
	
	
           

	    
	
