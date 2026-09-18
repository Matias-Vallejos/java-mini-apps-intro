package parcial2;

import javax.swing.JOptionPane;

public class Calculadora {
	public void calculadora() {
		Funciones abc = new Funciones();
		
		String otraCuenta = "si"; 
		String guardarResultado="no";
		double resultado = 0;
		
		while (otraCuenta.equalsIgnoreCase("si")) {
			
			boolean valido = true;
			
			//input
			String texto= "";
			if (guardarResultado.equalsIgnoreCase("si")) {
				texto = "Ingrese la operacion\nHay un resultado guardado\nRespete el formato 'operacion num2'\nOperaciones validas: suma (+)  resta(-)  multiplicacion(*)  division(/)";	
			} else {
				texto = "Ingrese la operacion\nRespete el formato 'num1 operacion num2'\nOperaciones validas: suma (+)  resta(-)  multiplicacion(*)  division(/)";
			} 
			String operacionString = JOptionPane.showInputDialog(null,texto,"Matematica", JOptionPane.DEFAULT_OPTION);
			operacionString = abc.validarNull(operacionString, "No existe una operación, o la operación no es admitida por el programa\n" + texto);
			
			String operacionSigno = abc.signo(operacionString);
			double operacion[] = abc.operacionNums(operacionString,operacionSigno, guardarResultado, resultado);
			if (operacion[2]==1) {
				valido = false;
			}
				//cuenta
				switch (operacionSigno) {
					case "\\+":
							resultado= operacion[0]+operacion[1];
							operacionSigno = "+";
								break;
					case "-":
							resultado= operacion[0]-operacion[1];
								break;
					case "\\*":
							resultado= operacion[0]*operacion[1];
							operacionSigno = "*";
								break;
					case "/":
							if (operacion[1]==0) {
								JOptionPane.showMessageDialog(null, "No se puede dividir por 0", "ERROR GARRAFAL", JOptionPane.ERROR_MESSAGE);
								valido = false;
							}	else {
								resultado= operacion[0]/operacion[1];
							}
								break;
					default:
						JOptionPane.showMessageDialog(null, "No existe una operación, o la operación no es admitida por el programa", "Inválido",JOptionPane.ERROR_MESSAGE);
						valido = false;
								break;
					}
				if (valido) {
					JOptionPane.showMessageDialog(null, operacion[0]+ " " + operacionSigno+" "+operacion[1]+" = " + resultado);
					guardarResultado = JOptionPane.showInputDialog("¿Quiere guardar el resultado para la proxima operacion? (si/no)");
					guardarResultado = abc.validarNull(guardarResultado, "¿Quiere guardar el resultado para la proxima operacion? (si/no)");
				} 
				if (guardarResultado.equalsIgnoreCase("no") || valido==false) {
				otraCuenta=JOptionPane.showInputDialog("¿Quiere realizar otra operacion?(si/no)");
				otraCuenta = abc.validarNull(otraCuenta, "¿Quiere realizar otra operacion?(si/no)");
				
			}
		}
	}
}