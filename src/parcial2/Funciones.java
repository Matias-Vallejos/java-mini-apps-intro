package parcial2;

import javax.swing.JOptionPane;

public class Funciones {
	
	public void nombre () {
		String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
		while (nombre==null||nombre.equalsIgnoreCase("")) {
			nombre=JOptionPane.showInputDialog(null,"TE DIJE QUE PONGAS UN NOMBRE ヽ(ｏ`皿′ｏ)ﾉ", "ERROR", JOptionPane.ERROR_MESSAGE);	
		}
		JOptionPane.showMessageDialog(null, "¡Bienvenido/a " + nombre + "!");
	}
	
	public String validarNull (String a, String mensaje) {
		
		while (a==null||a.equals("")) {
			a = (JOptionPane.showInputDialog(mensaje));
		}
		return a;
		
	}
	//conversion
	
	public String monedaValida (String[] monedas, String monedaARevisar, String tipo, String textoMonedas) {
		boolean valido = false;
		monedaARevisar=monedaARevisar.toUpperCase();
		while(!valido) {
			for (int i = 0; i < monedas.length; i++) {		
				if (monedaARevisar.equals(monedas[i])) {
				valido= true;
				}
			}
			if(!valido) {
			monedaARevisar=JOptionPane.showInputDialog(null,
					"Ingrese una moneda de "+tipo+" valida" + textoMonedas,
					"Error",JOptionPane.ERROR_MESSAGE).toUpperCase();
			}
		}	return monedaARevisar;
	}

	//calculadora
	
	public String signo (String operacion) {
		
		String signo ="";
		if (operacion.contains("+")) {
			signo = "\\+";
		} else if (operacion.contains("*")) {
			signo = "\\*";
		} else if (operacion.contains("/")) {
			signo = "/";
		} else if (operacion.contains("-")) {
			signo = "-";
		}
		return signo;
	} 

	public double[] operacionNums (String operacion, String signo, String guardado, double numGuardado) {
		
		String[] xArray = operacion.split(signo);
		if (xArray.length>2) {
			if (xArray.length==3 && signo.equals("-")) {
				double[] y = new double[3];
				for (int i = 1; i < xArray.length; i++) {
					y[i]=Double.parseDouble(xArray[i]);	
				}
				y[0]=-y[1];
				y[1]=y[2];
				y[2]=0;
				return y;
			} else {
				double[] y = {1,1,1};
			JOptionPane.showMessageDialog(null, "Formato inválido","ERROR",JOptionPane.ERROR_MESSAGE);
			return y;
			}
		}	else{
			double[] y = new double[3];
			y[2] = 0; 
		if(guardado.equals("no")) {
			for (int i = 0; i < xArray.length; i++) {
				y[i]=Double.parseDouble(xArray[i]);	
			}
			return y;
		} else {
			double b = Double.parseDouble(xArray[1]);	
			y[0]= numGuardado;
			y[1]= b;
			return y;			
		}}

	}
	
}