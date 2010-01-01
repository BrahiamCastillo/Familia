package Familia;

import Familia.familia_martinez.Familia_Martinez;

public class Ejecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Familia f=new Familia();
		Familia_Martinez fm=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo,f.miembro);
		Familia_Martinez.Abuelo fmab=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo, f.miembro).new Abuelo(f.familia,f.patriarca,f.tioabuelo, f.miembro);
		System.out.println(fm.toString());
		fmab.Acciones();
		fmab.Comportamiento();
		fmab.Psicologia();

	}

}
