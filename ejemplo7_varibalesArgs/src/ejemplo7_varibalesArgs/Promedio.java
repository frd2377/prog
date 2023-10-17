package ejemplo7_varibalesArgs;

import patron_generico.Generica;

public class Promedio {
	private Generica<Double> resultado;
	private Generica<String> datos;
	
	public Promedio(String nombre, String notas) {
		datos = new Generica<String>(nombre,notas);
		resultado = new Generica<>();
	}
	
	private void getData() {
		resultado.setAtributo1(0.0);
		datos.atributoArray = datos.getAtributo2().split(";");
		resultado.atributoArray = new Double[datos.atributoArray.length];
		for (int i = 0; i < resultado.atributoArray.length; i++) {
			resultado.atributoArray[i] = Double.parseDouble(datos.atributoArray[i]);
		}
	}
	
	private double getPromedio() {
		resultado.setAtributo1(0.0);
		for (Double nota : resultado.atributoArray) {
			resultado.setAtributo1(nota+=resultado.getAtributo1());
		}
		return resultado.getAtributo1()/resultado.atributoArray.length;
	}
	
	@Override
	public String toString() {
		return datos.getAtributo1()+"\t"+getPromedio();
	}
}
