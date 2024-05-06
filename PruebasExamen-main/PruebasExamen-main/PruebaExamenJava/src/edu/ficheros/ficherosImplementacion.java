package edu.ficheros;

import java.io.FileWriter;
import java.time.LocalDate;
import java.util.List;

import edu.Dtos.Citas;

public class ficherosImplementacion implements ficherosInterfaz{

	public String escribir(List<Citas> listaCitas) {
		
		LocalDate fechaHoy = LocalDate.now();
		
		String ruta = "C:\\Users\\Carlos\\Downloads\\PruebasExamen-main\\PruebasExamen-main\\PruebaExamenJava\\src\\edu\\" + fechaHoy;
		
		return ruta;
		
	}
	
	
	
}
