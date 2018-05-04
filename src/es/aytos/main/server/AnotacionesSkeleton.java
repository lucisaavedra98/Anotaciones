
/**
 * AnotacionesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package es.aytos.main.server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * AnotacionesSkeleton java skeleton for the axisService
 */
public class AnotacionesSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param leerAnotaciones
	 */

	public es.aytos.main.LeerAnotacionesResponse leerAnotaciones(es.aytos.main.LeerAnotaciones leerAnotaciones) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#leerAnotaciones");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param almacenarFicheroDeTextoEnElServidor
	 */

	public void almacenarFicheroDeTextoEnElServidor(
			es.aytos.main.AlmacenarFicheroDeTextoEnElServidor almacenarFicheroDeTextoEnElServidor) {
		String ruta = "Anotaciones.txt";
		File archivo = new File(ruta);
		FileWriter file = null;
		PrintWriter pw = null;

		if (archivo.exists()) {
			System.out.println("Modificando fichero existente...");
		}

		else {
			System.out.println("Creando fichero nuevo...");
		}

		try {
			file = new FileWriter(ruta, true);

			pw = new PrintWriter(file);
			pw.println("****************************************************************************************");
			pw.println("Código de anotación:"+almacenarFicheroDeTextoEnElServidor.getArgs0());
			pw.println("Descripción:"+almacenarFicheroDeTextoEnElServidor.getArgs1());
			pw.println("****************************************************************************************");
			pw.println("");
			
			pw.close();
			System.out.println("Fin escritura de fichero...");
		} catch (IOException e) {
			e.printStackTrace();
			pw.close();
			System.out.println("Fin escritura de fichero...");
		}
		System.out.println("FIN");

	}

}
