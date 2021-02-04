

public class Coche {
	private String matricula=null;
	private String marca="SEAT";
	private String modelo="ALTEA";
	private String color="blanco";
	private boolean techoSolar=false;
	private float kilometros=0;
	private int numPuertas=3;
	private int numPlazas=5;
	
	public Coche() {
	}
	
	public Coche(String matricula) {
		this();
		this.matricula=matricula;
	}
	
	public Coche(int numPuertas, int numPlazas) {
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
	}
	

	public Coche(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTechoSolar() {
		return techoSolar;
	}
	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}
	public float getKilometros() {
		return kilometros;
	}
	public void setKilometros(float kilometros) {
	    if(kilometros >=0) {
	    	this.kilometros = kilometros;
	    }	
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		if(numPuertas > 0 && numPuertas<=5)
		this.numPuertas = numPuertas;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		if(numPlazas > 0 && numPlazas <=7) {
			this.numPlazas = numPlazas;
		}
	}
	
	public void avanzar(float kilometros) {
		kilometros+=getKilometros();
		setKilometros(kilometros);
	}
	
	public void tunear() {
		if(techoSolar==false) {
			techoSolar= true;
		}
	}
	
	public void tunear(String color) {
		setColor(color);
	}
	
	public void matricular(String matricula) {
		setMatricula(matricula);
	}
	
}
