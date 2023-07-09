package appConversor;

public class OperacionesDivisa {
	
	double monedaIni;
	double monedaFin;
	
	public OperacionesDivisa(double moneda) {
		this.monedaIni = moneda;
	}
	
	public double conversion(double moneda, String monedaInicial, String monedaFinal) {
		
		switch (monedaInicial) {
			case "Pesos": {
				if(monedaFinal == "Dolares") {
					monedaFin = 0.00024; 
				}
				else {
					monedaFin = 0.00022;
				}
				break;
			}
			case "Dolares": {
				if(monedaFinal == "Pesos") {
					monedaFin = 4196.22; 
				}
				else {
					monedaFin = 0.91;
				}
				break;
			}
			case "Euros": {
				if(monedaFinal == "Pesos") {
					monedaFin = 4603.25 ;
				}
				else {
					monedaFin = 1.10 ;
				}
				break;
			}
		}
		return monedaIni * monedaFin;
	}

}
