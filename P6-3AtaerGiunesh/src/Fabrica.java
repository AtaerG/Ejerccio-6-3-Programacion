import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fabrica {
	static ArrayList<Coche> listaCochesFabricados = new ArrayList<Coche>();
	static Coche car1;
	static Coche car2;
	static Coche car3;
	static Coche car4;
	
	public static void main(String args[]) {
		Coche car1  = new Coche("1234-DF");
		Coche car2  = new Coche(3,2);
		Coche car3  = new Coche();
		Coche car4  = new Coche("VW","Caddy", "blanco");
		
		
		car1.tunear("azul");
		car1.setModelo("Toledo");
		car1.setNumPlazas(5);
		car1.setNumPuertas(3);
		car1.avanzar(200);
		
		car2.matricular("5678-AG");
		car2.setMarca("Fiar");
		car2.setModelo("Uno");
		car2.setColor("rojo");
		car2.tunear();
		car2.avanzar(300);
		
		car3.setMatricula("9012-HH");
		car3.setMarca("BMW");
		car3.setModelo("850");
		car3.setColor("gris");
		car3.avanzar(400);
		car3.setNumPlazas(5);
		car3.setNumPuertas(5);
		
		car4.setMatricula("3456-XS");
		car4.tunear();
		car4.setNumPlazas(7);
		car4.setNumPuertas(5);
		car4.avanzar(500);
		
		listaCochesFabricados.add(car1);
		listaCochesFabricados.add(car2);
		listaCochesFabricados.add(car3);
		listaCochesFabricados.add(car4);
		
		caracteristicas();
	}
	
	
	public static void caracteristicas() {
		for(Coche c: listaCochesFabricados) {
			JOptionPane.showMessageDialog(null, "Coche: "+c.getMatricula()+
		    "\n"+"Marca: "+c.getMarca()+
		    "\n"+"Modelo: "+c.getModelo()+
		    "\n"+"Color: "+c.getColor()+
		    "\n"+"Techo Solar: " +(c.isTechoSolar()? "Si": "No")+
		    "\n"+"Km: "+c.getKilometros()+
		    "\n"+"Nº puertas: "+c.getNumPuertas()+
		    "\n"+"Nº plazas: "+c.getNumPlazas());
		}
	}
}
