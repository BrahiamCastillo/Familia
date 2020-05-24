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
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Abuela fmabua=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Abuela(f.familia,f.patriarca,f.tioabuelo);
		fmabua.Acciones();
		fmabua.Comportamiento();
		fmabua.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Padre fmp=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Padre(f.familia,f.patriarca,f.tioabuelo);
		fmp.Acciones();
		fmp.Comportamiento();
		fmp.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Madre fmm=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Madre(f.familia,f.patriarca,f.tioabuelo);
		fmm.Acciones();
		fmm.Comportamiento();
		fmm.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Primer_Hijo fmph=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Primer_Hijo(f.familia,f.patriarca,f.tioabuelo);
		fmph.Acciones();
		fmph.Comportamiento();
		fmph.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Segundo_Hijo fmsh=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Segundo_Hijo(f.familia,f.patriarca,f.tioabuelo);
		fmsh.Acciones();
		fmsh.Comportamiento();
		fmsh.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Tio fmt=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Tio(f.familia,f.patriarca,f.tioabuelo);
		fmt.Acciones();
		fmt.Comportamiento();
		fmt.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Tia fmtia=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Tia(f.familia,f.patriarca,f.tioabuelo);
		fmtia.Acciones();
		fmtia.Comportamiento();
		fmtia.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Martinez.Tio_Abuelo fmtab=new Familia_Martinez(f.familia,f.patriarca,f.tioabuelo).new Tio_Abuelo(f.familia,f.patriarca,f.tioabuelo);
		fmtab.Acciones();
		fmtab.Comportamiento();
		fmtab.Psicologia();
		
	}

}
