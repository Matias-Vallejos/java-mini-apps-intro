package parcial2;

import javax.swing.JOptionPane;

public class Conversor {
	public void conversor() {
		Funciones abc = new Funciones(); 
		
		String otraConversion="si";
		while (!otraConversion.equalsIgnoreCase("no")) {
			
			//monedas (a dia 13/11/2025)
			
			String [] monedasTexto = {"USD", "EUR", "JPY", "ARS", "BRL", "RUB", "CNY"};
			double [] monedasCotiz = {0.00071, 0.00061, 0.11, 1, 0.0038, 0.057, 0.005};
			//double USD=0.00071, EUR=0.00061, JPY=0.11, ARS=1, BRL=0.0038, RUB=0.057, CNY=0.005;
			String textoMonedas = "\nMonedas disponibles: ARS, USD, EUR, JPY, BRL, RUB, CNY";
			
			//inputs
			
			String monedaOrigen=JOptionPane.showInputDialog("Seleccione la moneda de origen"+textoMonedas);
			monedaOrigen=abc.monedaValida(monedasTexto, monedaOrigen,"origen",textoMonedas);
			String monedaDestino=JOptionPane.showInputDialog("Seleccione la moneda de destino"+textoMonedas);
			monedaDestino=abc.monedaValida(monedasTexto, monedaDestino,"destino",textoMonedas);
			
			double cantCambio=Double.parseDouble(JOptionPane.showInputDialog("Seleccione cantidad a cambiar"));
			while (cantCambio<=0) {
				cantCambio=Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccione una cantidad valida","Error", JOptionPane.ERROR_MESSAGE));
			}
			
			//conversion, la consigna pedia un switch por eso no esta hecho mas corto
			double cotizOrigen=0;
			double resultadoConversion = 0;
			switch (monedaOrigen) {
			case "USD":
				cotizOrigen=monedasCotiz[0];
				break;
			case "EUR":
				cotizOrigen=monedasCotiz[1];
				break;
			case "JPY":
				cotizOrigen=monedasCotiz[2];
				break;
			case "ARS":
				cotizOrigen=monedasCotiz[3];
				break;
			case "BRL":
				cotizOrigen=monedasCotiz[4];
				break;
			case "RUB":
				cotizOrigen=monedasCotiz[5];
				break;
			case "CNY":
				cotizOrigen=monedasCotiz[6];
				break;
			default:
				JOptionPane.showMessageDialog(null, "como te metiste aca????");
				break;
			}
			
			//podria hacer lo mismo aca para la moneda origen pero la consigna pedia el switch
			double cotizDestino=1;
			for (int i = 0; i < monedasTexto.length; i++) {
				if (monedaDestino.equals(monedasTexto[i])) {
					cotizDestino=monedasCotiz[i]; 
				}
			}
			resultadoConversion = (cantCambio*cotizDestino)/cotizOrigen;
			
			//output
			
			JOptionPane.showMessageDialog(null, cantCambio +" "+ monedaOrigen + " se convierten en " + resultadoConversion + " " + monedaDestino);
				
			otraConversion=JOptionPane.showInputDialog("¿Realizar otra conversion? (si/no)");
			if (otraConversion.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "¡Hasta la próxima!");
			} else if (!otraConversion.equalsIgnoreCase("si")) {
					int a = 0;
				while (otraConversion==null||!otraConversion.equalsIgnoreCase("si")&&!otraConversion.equalsIgnoreCase("no")) {
					if (a>4) {
						JOptionPane.showMessageDialog(null, "Por favor leer las instrucciones");
					}
					otraConversion=JOptionPane.showInputDialog("Escribi 'Si' para realizar otra conversión, 'no' para salir del programa");
					a++;
				}				
			}
		}
	}
}
	