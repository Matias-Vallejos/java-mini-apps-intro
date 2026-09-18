package parcial2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Adivinanza {
	public void adivinanza() {

		int numPregunta, correctas=0, incorrectas=0, ronda=1, preguntaAnterior = -1;
		String jugar="si";
		
		while(!jugar.equalsIgnoreCase("no")) {
			
			numPregunta = (int)(Math.random()*10);			
			while (preguntaAnterior==numPregunta) {
				numPregunta = (int)(Math.random()*10);
			}
			preguntaAnterior = numPregunta;
			
			String respuesta = "Respuesta del Jugador";
			
			respuesta= (String)JOptionPane.showInputDialog(null,
					"¿Quien es ese Pokemon?", "Ronda " + ronda,
					JOptionPane.DEFAULT_OPTION,
					new ImageIcon(
							Adivinanza.class.getResource("imgs/pokemon"+numPregunta+".png")
							),
					null,null);
			ronda++;
			
			String pokemon = "Agumon";
			switch (numPregunta) {
			case 0, 4:
				pokemon = "Gastly";
				break;
			case 1:
				pokemon = "Greninja";
				break;
			case 2:
				pokemon = "Togepi";
				break;
			case 3:
				pokemon = "Slowpoke";
				break;
			case 5:
				pokemon = "Psyduck";
				break;
			case 6:
				pokemon = "Gengar";
				break;
			case 7:
				pokemon = "Wartortle";
				break;
			case 8:
				pokemon = "Spearow";
				break;
			case 9:
				pokemon = "Machamp";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Como te metiste aca????");
				break;
			}
			
			String correcto = "correcto/incorrecto";
			
			if (respuesta.equalsIgnoreCase(pokemon)) {
				correcto="Correcto";
			} else {
				correcto="Incorrecto";
			}
			
			String textoRespuesta = "";
			if(correcto.equals("Correcto")) {
				correctas++; 
				textoRespuesta = "Muy bien, el Pokemon era " + pokemon +".\nTu conocimiento es Pokemon es muy superior, debes ser una experto";
			} else {
				incorrectas++;
				textoRespuesta = "UFF cerquísima, pero el Pokemon correcto era "+pokemon+".\nTu conocimiento en Pokemon es bajísimo.";
			}
			JOptionPane.showMessageDialog(null, textoRespuesta,correcto,JOptionPane.DEFAULT_OPTION,new ImageIcon(
							Adivinanza.class.getResource("imgs/respuesta"+numPregunta+".png")
							));
			
			String textoPuntaje = "Respuestas correctas: "+ correctas +" Respuestas incorrectas: "+ incorrectas;
			
			jugar=JOptionPane.showInputDialog(null,textoPuntaje+"\n¿Queres jugar otra ronda? (si/no)","Puntaje Final",JOptionPane.INFORMATION_MESSAGE);
			if (jugar.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "¡Hasta la próxima!");
			} else if (!jugar.equalsIgnoreCase("si")) {
					int a = 0;
				while (jugar==null||!jugar.equalsIgnoreCase("si")&&!jugar.equalsIgnoreCase("no")) {
					if (a>4) {
						JOptionPane.showMessageDialog(null, "No hay salida para los que no saben leer", "...", JOptionPane.ERROR_MESSAGE);
					}
					jugar=JOptionPane.showInputDialog(null,"¿Queres jugar otra ronda? (si/no)\n RESPONDE SI PARA SEGUIR Y NO PARA PARAR",null,JOptionPane.WARNING_MESSAGE);
					a++;
				}				
			}
		}
		
	}
}

