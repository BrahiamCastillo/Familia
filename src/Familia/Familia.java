package Familia;

public class Familia {
protected String familia, patriarca, tioabuelo, miembro;

public Familia(String familia, String patriarca, String tioabuelo, String miembro) {
	this.familia=familia;
	this.patriarca=patriarca;
	this.tioabuelo=tioabuelo;
	this.miembro=miembro;
}

Familia() {
	familia="Martínez";
	patriarca="Alfredo Martínez";
	tioabuelo="Armando Sánchez";
}

}
