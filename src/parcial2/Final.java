package parcial2;

import javax.swing.JOptionPane;

public class Final {
	public static void main(String[] args) {
		
		Funciones funciones = new Funciones();
		Adivinanza juego = new Adivinanza();
		Conversor conversor = new Conversor();
		Calculadora calculadora = new Calculadora();
		funciones.nombre();
		int menu = -1;
		do {
			String mensajito = "Bienvenido al segundo parcial, seleccione un programa: \n 1:Calculadora   2:Conversor de Monedas   3:Adivinanzas\n 0:Salir"; 
			String menuString = (JOptionPane.showInputDialog(mensajito));
			menuString = funciones.validarNull(menuString, mensajito+"\n por favor seleccione una opcion");
			menu = Integer.parseInt(menuString);
			switch (menu) {
			case 1:
				calculadora.calculadora();
				break;
			case 2:
				conversor.conversor();
				break;
			case 3:
				juego.adivinanza();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Que lástima pero adios, me despido de ti y me voy");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Seleccione una opcion válida");
				break;
			}
		} while (menu != 0);
		
		
		
	}
}
