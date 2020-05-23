package Familia.familia_martinez;

import Familia.Familia;
import Familia.ModeloFamiliar;

public class Familia_Martinez extends Familia {

	public Familia_Martinez(String familia, String patriarca, String tioabuelo) {
		super(familia, patriarca, tioabuelo);
		// TODO Auto-generated constructor stub
	
	}
	
	public class Abuelo extends Familia implements ModeloFamiliar {

		public Abuelo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Abuelo y patriarca de la familia "+familia+" con nombre "+patriarca+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("El patriarca "+patriarca+" se dedica a llevar las riendas de la familia, es una persona con un gran liderazgo y es capaz de dirigir a su familia con éxito por ello, se dedica a la agricultura.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento del abuelo y patriarca de la familia Martínez "+patriarca+" se basa en el respeto y la humildad, es una persona sabia y le encanta compartir su sabiduría.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicología del abuelo "+patriarca+" se basa en la de una persona sana mentalmente, sin ningún vicio o trastorno dañino, por ello ha podido guiar a toda la familia con éxito.");
		}
		
	}
	
	public class Abuela extends Familia implements ModeloFamiliar {

		public Abuela(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Abuela de la familia "+familia+" con nombre Griselda Rojas.");

		
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("La abuela de la familia "+familia+" se dedica atender a los nietos, a velar por su salud y por los demás miembros de la familia.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de la abuela es de una mujer bastante amable, aunque es dura cuando es necesario y la ocasión lo amerita.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicología de la abuela de la familia "+familia+" se basa en la tolerancia y el exceso de amabilidad dirigida a los demás miembros de la familia.");
			
		}
		
	}
	
	public class Padre extends Familia implements ModeloFamiliar {

		public Padre(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El padre de la familia "+familia+" con nombre de Ricardo Martínez, es hijo de el abuelo y patriarca "+patriarca+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Uno de los padres de la familia "+familia+" se dedica normalmente a mantener el orden y la armonía de toda la familia, todo en conjunto al patriarca.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de uno de los padres, como es el caso de Ricardo, es de pura rectitud, pero siempre mostrando amor a todo miembro de la familia "+familia+".");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicología de Ricardo Martínez se basa en una gran preocupación por la armonía y el bienestar de todos.");
		}
		
	}
	
	public class Madre extends Familia implements ModeloFamiliar {

		public Madre(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("La madre de la familia "+familia+" con nombre de Esperanza Gómez, es esposa de uno de los padres de la familia, Ricardo Martínez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Esperanza, como una de las madres de la familia "+familia+" se dedica a atender sus hijos y a cooperar en los quehaceres del hogar.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de Esperanza, como una de las madres de la familia "+familia+" es de una persona bastante cariñosa y amorosa, tanto con sus sobrinos legítimos como los políticos.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicología de Esperanza, se basa en ser una persona normalmente amable, pero algo explosiva en ciertas situaciones que las incomodan.");
		}
		
	}
	
	public class Primer_Hijo extends Familia implements ModeloFamiliar {

		public Primer_Hijo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El primer hijo de Ricardo Martínez y Esperanza Gómez y primer nieto de el patriarca "+patriarca+" de la familia "+familia+", lleva el nombre de Rogelio Martínez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Rogelio Martínez, miembro de la familia "+familia+" es un joven universitario y dedica todo su tiempo al estudio de su carrera de medicina.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Rogelio Martínez es un jóven bastante tranquilo y un poco hogareño, solo se la pasa estudiando y por lo tanto no está metido en actividades que alteren su buen comportamiento.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicología de Rogelio Martínez se basa en ser una persona amable, pero muy poco expresivo, no suele hablar mucho y se reprime bastante");
		}
		
	}
	
	public class Segundo_Hijo extends Familia implements ModeloFamiliar {

		public Segundo_Hijo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Armando Martínez es el segundo hijo de Ricardo y Esperanza, también forma parte de la familia "+familia+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Armando es un joven que está apunto de terminar la secundaria, al igual que Rogelio, es totalmente dedicado a sus estudios académicos.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class Tio extends Familia implements ModeloFamiliar {

		public Tio(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class Tia extends Familia implements ModeloFamiliar {

		public Tia(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class Tio_Abuelo extends Familia implements ModeloFamiliar {

		public Tio_Abuelo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
