package Familia;

import Familia.familia_martinez.Familia_Martinez;

public class Ejecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Familia f=new Familia();
		Familia_Martinez.Abuelo fmab=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Abuelo(f.familia,f.patriarca,f.tioabuelo);
		fmab.Acciones();
		fmab.Comportamiento();
		fmab.Psicologia();
		Familia_Martinez.Abuela fmabua=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Abuela(f.familia,f.patriarca,f.tioabuelo);
		fmabua.Acciones();
		fmabua.Comportamiento();
		fmabua.Psicologia();

	}

}
