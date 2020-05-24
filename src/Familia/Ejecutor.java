package Familia;

import Familia.familia_martinez.Familia_Martinez;
import Familia.familia_sanchez.Familia_Sanchez;

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
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia f2=new Familia("Sánchez", "Armando Sánchez", "Alfredo Martínez");
		Familia_Sanchez.Abuelo fsa=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Abuelo(f2.familia,f2.patriarca,f2.tioabuelo);
		fsa.Acciones();
		fsa.Comportamiento();
		fsa.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Abuela fsab=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Abuela(f2.familia,f2.patriarca,f2.tioabuelo);
		fsab.Acciones();
		fsab.Comportamiento();
		fsab.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Padre fsp=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Padre(f2.familia,f2.patriarca,f2.tioabuelo);
		fsp.Acciones();
		fsp.Comportamiento();
		fsp.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Madre fsm=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Madre(f2.familia,f2.patriarca,f2.tioabuelo);
		fsm.Acciones();
		fsm.Comportamiento();
		fsm.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Primer_Hijo fsph=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Primer_Hijo(f2.familia,f2.patriarca,f2.tioabuelo);
		fsph.Acciones();
		fsph.Comportamiento();
		fsph.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Segundo_Hijo fssh=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Segundo_Hijo(f2.familia,f2.patriarca,f2.tioabuelo);
		fssh.Acciones();
		fssh.Comportamiento();
		fssh.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Tio fstio=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Tio(f2.familia,f2.patriarca,f2.tioabuelo);
		fstio.Acciones();
		fstio.Comportamiento();
		fstio.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Tia fstia=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Tia(f2.familia,f2.patriarca,f2.tioabuelo);
		fstia.Acciones();
		fstia.Comportamiento();
		fstia.Psicologia();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Familia_Sanchez.Tio_Abuelo fstab=new Familia_Sanchez(f2.familia,f2.patriarca,f2.tioabuelo).new Tio_Abuelo(f2.familia,f2.patriarca,f2.tioabuelo);
		fstab.Acciones();
		fstab.Comportamiento();
		fstab.Psicologia();

	}

}
