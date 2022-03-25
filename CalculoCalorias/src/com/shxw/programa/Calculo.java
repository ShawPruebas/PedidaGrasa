package com.shxw.programa;

public class Calculo extends Ventana{

	
	public String calculoCalorias(String p,String g,int a) {
		
		
		
		float peso = Float.parseFloat(p);
		float grasa = Float.parseFloat(g);
		
		float actividad = 0;
		
		switch (a) {
		case 0:
			actividad = 1.2f;
			break;
		case 1:
			actividad = 1.375f;
			break;
		case 2:
			actividad = 1.55f;
			break;
		case 3:
			actividad = 1.725f;
			break;
		case 4:
			actividad = 1.9f;
			break;
		default:
			break;
		}
		
		float calorias;
		
		calorias = (peso*22)*actividad;
		
		float sCalorias = (grasa/20);

		float totalSCalorias =  (peso / (sCalorias/10))*7;
		float diariaSCalorias =  peso / (sCalorias/10);
		float consumo = calorias - diariaSCalorias;
		float proteina = actividad * peso;
		
		String resultado = "Pedida semanal de peso: " + String.valueOf(sCalorias) + "%\n" +
						"Perdida calorias diaria: " + String.valueOf(diariaSCalorias) + " calorias\n" +
						"Perdida calorias semanal: " + String.valueOf(totalSCalorias) + " calorias\n" +
						"Calorias a consumir por día: " + String.valueOf(consumo) + " calorias\n" +
						"Proteinas diarias a consumir: " + String.valueOf(proteina) + " gramos" ;
	
		
		return resultado;
	}
}
