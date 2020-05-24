package Familia.familia_martinez;

import Familia.Familia;
import Familia.ModeloFamiliar;

public class Familia_Martinez extends Familia {

	public Familia_Martinez(String familia, String patriarca, String tioabuelo) {
		super(familia, patriarca, tioabuelo);
		// TODO Auto-generated constructor stub
		System.out.println("Miembro de la familia "+familia+".");
	
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
			System.out.println("El patriarca "+patriarca+" se dedica a llevar las riendas de la familia, es una persona con un gran liderazgo y es capaz de dirigir a su familia con �xito por ello, se dedica a la agricultura.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento del abuelo y patriarca de la familia Mart�nez "+patriarca+" se basa en el respeto y la humildad, es una persona sabia y le encanta compartir su sabidur�a.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a del abuelo "+patriarca+" se basa en la de una persona sana mentalmente, sin ning�n vicio o trastorno da�ino, por ello ha podido guiar a toda la familia con �xito.");
		}
		
	}
	
	public class Abuela extends Familia implements ModeloFamiliar {

		public Abuela(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Abuela de la familia "+familia+" con nombre Griselda S�nchez.");

		
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("La abuela de la familia "+familia+" se dedica atender a los nietos, a velar por su salud y por los dem�s miembros de la familia.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de la abuela es de una mujer bastante amable, aunque es dura cuando es necesario y la ocasi�n lo amerita.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de la abuela de la familia "+familia+" se basa en la tolerancia y el exceso de amabilidad dirigida a los dem�s miembros de la familia.");
			
		}
		
	}
	
	public class Padre extends Familia implements ModeloFamiliar {

		public Padre(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El padre de la familia "+familia+" con nombre de Ricardo Mart�nez, es hijo de el abuelo y patriarca "+patriarca+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Uno de los padres de la familia "+familia+" se dedica normalmente a mantener el orden y la armon�a de toda la familia, todo en conjunto al patriarca.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de uno de los padres, como es el caso de Ricardo, es de pura rectitud, pero siempre mostrando amor a todo miembro de la familia "+familia+".");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Ricardo Mart�nez se basa en una gran preocupaci�n por la armon�a y el bienestar de todos.");
		}
		
	}
	
	public class Madre extends Familia implements ModeloFamiliar {

		public Madre(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("La madre de la familia "+familia+" con nombre de Esperanza G�mez, es esposa de uno de los padres de la familia, Ricardo Mart�nez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Esperanza, como una de las madres de la familia "+familia+" se dedica a atender sus hijos y a cooperar en los quehaceres del hogar.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de Esperanza, como una de las madres de la familia "+familia+" es de una persona bastante cari�osa y amorosa, tanto con sus sobrinos leg�timos como los pol�ticos.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Esperanza, se basa en ser una persona normalmente amable, pero algo explosiva en ciertas situaciones que las incomodan.");
		}
		
	}
	
	public class Primer_Hijo extends Familia implements ModeloFamiliar {

		public Primer_Hijo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El primer hijo de Ricardo Mart�nez y Esperanza G�mez y primer nieto de el patriarca "+patriarca+" de la familia "+familia+", lleva el nombre de Rogelio Mart�nez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Rogelio Mart�nez, miembro de la familia "+familia+" es un joven universitario y dedica todo su tiempo al estudio de su carrera de medicina.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Rogelio Mart�nez es un j�ven bastante tranquilo y un poco hogare�o, solo se la pasa estudiando y por lo tanto no est� metido en actividades que alteren su buen comportamiento.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Rogelio Mart�nez se basa en ser una persona amable, pero muy poco expresivo, no suele hablar mucho y se reprime bastante");
		}
		
	}
	
	public class Segundo_Hijo extends Familia implements ModeloFamiliar {

		public Segundo_Hijo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Armando Mart�nez es el segundo hijo de Ricardo y Esperanza, tambi�n forma parte de la familia "+familia+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Armando es un joven que est� apunto de terminar la secundaria, al igual que Rogelio es totalmente dedicado a sus estudios acad�micos.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Armando es un joven mas andariego, le gusta bastante mas las actividades sociales.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Armando se basa en ser bastante expresivo, a diferencia de su hermano, le encantan las actividades sociales y tener participaci�n activa en ellas.");
		}
		
	}
	
	public class Tio extends Familia implements ModeloFamiliar {

		public Tio(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El tio de la familia "+familia+" es hermano menor de Ricardo Mart�nez y hijo menor del patriarca y abuelo "+patriarca+", su nombre es David Mart�nez.");
			
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("David Mart�nez es el hermano menor de Ricardo y considerado como uno de los tios de la familia, se dedica a ellos con mucho amor y sirve de soporte para el patriarcada y el padre.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("David Mart�nez se comporta de una manera recta frente a las cabecillas de la familia y no duda en brindar amor a todos sus sobrinos de �mbas partes.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de David Mart�nez se basa en la estabildad emocional y en la tolerancia en cuando a los actos de los miembros familiares.");
		}
		
	}
	
	public class Tia extends Familia implements ModeloFamiliar {

		public Tia(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Una de las t�as de la familia "+familia+", es esposa de David Mart�nez, su nombre es Isabella Castillo.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Isabella es una persona responsable en cuanto a sus empleos y encargos, suele dedicarse mayormente a estos y por lo tanto no es muy unida a la familia.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Isabella no siente tanto apego a sus sobrinos pol�ticos, que vienen siendo los miembros de la familia "+familia+" pero tampoco el desapego es tan grande como para considerarlo como desprecio.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Isabella se basa en la seguridad en s� misma y la poca expresi�n que posee en cuanto sus sentimientos.");
		}
		
	}
	
	public class Tio_Abuelo extends Familia implements ModeloFamiliar {

		public Tio_Abuelo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El tio-abuelo de la familia Mart�nez es "+tioabuelo+", es el hermano de la esposa de "+patriarca+" y patriarca de la familia S�nchez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("El tio-abuelo "+tioabuelo+" se dedica mayormente a dirigir a la familia S�nchez y encaminarlas en el buen camino.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El tio-abuelo "+tioabuelo+" de la familia "+familia+" se comporta de manera respetuosa con la familia y por ello siempre vela por la uni�n de la familia S�nchez y la familia "+familia+".");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a del tio-abuelo "+tioabuelo+" es parecieda al patriarca "+patriarca+" salvo por ligeras diferencias, diferencias como la tolerancia, ya que este individuo tiene muy poca.");
		}
		
	}

}
