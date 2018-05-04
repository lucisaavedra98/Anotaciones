package es.aytos.main;

public interface Anotaciones {
	public void almacenarFicheroDeTextoEnElServidor (int codigoAnotacion,String descripcion);
	
	public String leerAnotaciones(int codigoAnotacion);
}
