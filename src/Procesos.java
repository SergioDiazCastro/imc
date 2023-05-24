import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procesos {
		// TODO Auto-generated method stub
		ArrayList<String>listaPersonas;
		ArrayList<Double>listaPeso, listaAltura, res;
		int cantidad;
		double resultado;
	public Procesos() {
		listaPersonas=new ArrayList<String>();
		listaAltura=new ArrayList<Double>();
		listaPeso=new ArrayList<Double>();
		res=new ArrayList<Double>();
		iniciar();
	}
	public void iniciar() {
		ingresarDatos();
		calcular();
		imprimirResultados();
	}
	
	private void ingresarDatos() {
		String nombre ="";
		double peso;
		double altura;
		cantidad =Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de personas"));
		for (int i = 0; i < cantidad; i++) {
			nombre=JOptionPane.showInputDialog("ingrese el nombre");
			listaPersonas.add(nombre);
			for (int j = 0; j < 1; j++) {
				peso=Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso"));
				listaPeso.add(peso);
				for (int j2 = 0; j2 < 1; j2++) {
					altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la estatura"));
					listaAltura.add(altura);
				}
			}
		}
	}
	
	private void calcular() {
		double resultado;
		for (int i = 0; i < cantidad; i++) {
			resultado=listaPeso.get(i)/(listaAltura.get(i)*listaAltura.get(i));
			res.add(resultado);
		}
	}
	
	private void imprimirResultados() {
		double imc;
		System.out.println(listaPersonas);
		System.out.println(listaAltura);
		System.out.println(listaPeso);
		System.out.println(res);
		
		for (int i = 0; i < res.size(); i++) {
			imc = res.get(i);
		if (imc < 18) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted tiene anorexia");
		}else if(imc>=18 && imc<20) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted tiene delgadez");
		}else if(imc>=20 && imc<27) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted esta en un peso adecuado");
		}else if(imc>=27 && imc<30) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted tiene obesidad grado 1");
		}else if(imc>=30 && imc<35) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted tiene obesidad grado 2");
		}else if(imc>=35 && imc<40) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted tiene obesidad grado 3");
		}else if(imc>=40) {
			System.out.println("señor/a "+listaPersonas.get(i)+ " su IMC es: "+res.get(i)+" usted tiene obesidad morbids");
		}
		}
	}
}
