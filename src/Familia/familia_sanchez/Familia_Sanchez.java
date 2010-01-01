package Familia.familia_sanchez;

import Familia.Familia;
import Familia.ModeloFamiliar;

public class Familia_Sanchez extends Familia {

	public Familia_Sanchez(String familia, String patriarca, String tioabuelo, String miembro) {
		super(familia, patriarca, tioabuelo, miembro);
		// TODO Auto-generated constructor stub
	}
	
	public class Abuelo extends Familia implements ModeloFamiliar {

		public Abuelo(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Abuelo";
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
	
	public class Abuela extends Familia implements ModeloFamiliar {

		public Abuela(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Abuela";
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
	
	public class Padre extends Familia implements ModeloFamiliar {

		public Padre(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Padre";
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
	
	public class Madre extends Familia implements ModeloFamiliar {

		public Madre(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Madre";
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
	
	public class Primer_Hijo extends Familia implements ModeloFamiliar {

		public Primer_Hijo(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Primer hijo";
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
	
	public class Segundo_Hijo extends Familia implements ModeloFamiliar {

		public Segundo_Hijo(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Segundo hijo";
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
	
	public class Tio extends Familia implements ModeloFamiliar {

		public Tio(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Tio";
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

		public Tia(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Tia";
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

		public Tio_Abuelo(String familia, String patriarca, String tioabuelo, String miembro) {
			super(familia, patriarca, tioabuelo, miembro);
			// TODO Auto-generated constructor stub
			miembro="Tio abuelo";
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
	
	@Override
	public String toString() {
		return miembro+"miembro de la familia "+familia+".";
	}

}
