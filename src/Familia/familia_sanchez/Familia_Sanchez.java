package Familia.familia_sanchez;

import Familia.Familia;
import Familia.ModeloFamiliar;

public class Familia_Sanchez extends Familia {

	public Familia_Sanchez(String familia, String patriarca, String tioabuelo) {
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
			System.out.println("El abuelo y patriarca "+patriarca+" se dedica mayormente a dirigir a la familia S�nchez y encaminarlas en el buen camino.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El patriarca y abuelo "+patriarca+" se comporta de manera respetuosa y autoritaria frente a los dem�s miembros de la familia.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a del patriarca y abuelo "+patriarca+" se basa en la autoridad y la poca tolerancia.");
			
		}
		
	}
	
	public class Abuela extends Familia implements ModeloFamiliar {

		public Abuela(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("La abuela de la familia "+familia+" lleva el nombre de Gracia Peralta y es esposa del patriarca y abuelo "+patriarca+".");
		
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("La abuela de la familia "+familia+" se dedica mayormente a estar al pendiente de todos sus hijos y nietos, velar por su seguridad e integridad.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de la abuela de la familia "+familia+" es la de un inmenso respeto hacia el patriarca y abuelo y un excesivo cari�o a los dem�s miembros de la familia, incluyendo los yernos y las yernas.");
			
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de la abuela Gracia se basa en la pasividad de la gran mayor�a de las situaciones.");
			
		}
		
	}
	
	public class Padre extends Familia implements ModeloFamiliar {

		public Padre(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Uno de los padres de la familia "+familia+" es el primer hijo del abuelo y patriarca "+patriarca+" y Gracia Peralta, lleva el nombre de Kendry S�nchez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Kendry S�nchez al ser uno de los padres de la familia "+familia+" se dedica a apoyar al abuelo y patriarca "+patriarca+" en regir y guiar a la familia al camino correcto.");
			
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de Kendry es el de una respetuosa, pero algo pasiva como el de su madre.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Kendry S�nchez se basa en su mayor parte a la pasividad, como su madre.");
		}
		
	}
	
	public class Madre extends Familia implements ModeloFamiliar {

		public Madre(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Una de las madres de la familia "+familia+" es esposa de Kendry S�nchez y lleva el nombre de Susana Caballero.");
			
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Susana Caballero se dedica en mayor medida a cuidar a sus hijos y cuando visita el hogar de sus suegros, colabora junto a la madre de Kendry en los quehaceres de el hogar.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Susana Caballero se basa en tener una buena conducta consistente en el respeto, suele tratar a sus suegros con formalidad, este �ltimo solo aplica para ellos.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Susana Caballero se basa en la introversi�n y la verguenza que siente al entablar conversaciones informales con los dem�s miembros de la familia "+familia+".");
		}
		
	}
	
	public class Primer_Hijo extends Familia implements ModeloFamiliar {

		public Primer_Hijo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El primer hijo de Kendry S�nchez y Susana Caballero lleva el nombre de Romero S�nchez, es perteneciente a la familia "+familia+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Romero es un joven que se dedica a estudios y a un trabajo de medio tiempo, suele enfocar todo su tiempo libre en aprender acerca de veh�culos de carrera.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de Romero se basa en la responsabilidad, el respeto no es su mayor fuerte, ya que considera no brindar respeto a ninguna persona que tampoco lo brinde a los dem�s.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Romero se basa mayormente en la igualdad, considera que si una persona no se ha ganado algo de �l, no tiene por qu� d�rselo.");
		}
		
	}
	
	public class Segundo_Hijo extends Familia implements ModeloFamiliar {

		public Segundo_Hijo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El segundo hijo de Kendry S�nchez y Susana Caballero lleva el nombre de Bernardo S�nchez, es perteneciente a la familia "+familia+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Bernardo es un joven menor que Kendry, pero tiene claro las responsabilidades a tomar, tambi�n es dedicado a los estudios, aunque aveces evade dichas responsabilidades por las malas influencias.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Bernardo se comporta de una manera respetuosa, pero de vez en cuando es desobediente con sus padres, al no hacerles caso en algunas prohibiciones que estos le hacen, tiene cierta rebeld�a.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Bernardo S�nchez se basa en el respeto y a la vez en la rebeld�a.");
		}
		
	}
	
	public class Tio extends Familia implements ModeloFamiliar {

		public Tio(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Uno de los tios de la familia "+familia+" lleva el nombre de Luis S�nchez y es hermano menor de Kendry y hijo menor de el patriarca y abuelo "+patriarca+".");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Luis S�nchez se dedica a apoyar a su hermano mayor en algunos que otros negocios que �mbos fundaron juntos, tambi�n ayuda a su hermano y a su padre a llevar las riendas de la familia.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("Luis es una persona amable, pero algo mas estricto que su hermano mayor y a la vez menos pasivo.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Luis se basa en su parte estricta y poca pasiva, justo lo contrario a su hermano mayor.");
		}
		
	}
	
	public class Tia extends Familia implements ModeloFamiliar {

		public Tia(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("Una de los tias de la familia "+familia+" lleva el nombre de Belinda Cabrera y es esposa de Luis S�nchez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("Belinda Cabrera se dedica mayormente a brindar apoyo econ�mico a su esposo e hijos, es una contable graduada y posee un bu�n empleo que le genera buenos ingresos.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento de Belinda se basa en la de una persona bien educada y respetuosa, entabla una buena relaci�n con la familia "+familia+" y es extrovertida con ellos.");
		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a de Belinda se basa mayormente en el respeto y las ganas de entablar buenas relaciones con los dem�s, siempre y cuando se pueda.");
		}
		
	}
	
	public class Tio_Abuelo extends Familia implements ModeloFamiliar {

		public Tio_Abuelo(String familia, String patriarca, String tioabuelo) {
			super(familia, patriarca, tioabuelo);
			// TODO Auto-generated constructor stub
			System.out.println("El tio-abuelo de la familia "+familia+" es "+tioabuelo+", es el esposo de la hermana del patriarca de la familia "+familia+", "+tioabuelo+" es patriarca y abuelo de la familia Mart�nez.");
		}

		@Override
		public void Acciones() {
			// TODO Auto-generated method stub
			System.out.println("El tio-abuelo "+tioabuelo+" se dedica a llevar las riendas de su propia familia, pero tambi�n dedica gran esfuerzo a que �mbas familias, tanto la Mart�nez como la S�nchez, tengan una buena relaci�n.");
		}

		@Override
		public void Comportamiento() {
			// TODO Auto-generated method stub
			System.out.println("El comportamiento del tio-abuelo de la familia "+familia+" se basa en el respeto y la humildad, es una persona sabia y le encanta compartir su sabidur�a.");

		}

		@Override
		public void Psicologia() {
			// TODO Auto-generated method stub
			System.out.println("La psicolog�a del tio-abuelo "+tioabuelo+" se basa en la de una persona sana mentalmente, sin ning�n vicio o trastorno da�ino, por ello ha podido guiar a toda la familia Mart�nez con �xito.");

		}
		
	}
	

}
