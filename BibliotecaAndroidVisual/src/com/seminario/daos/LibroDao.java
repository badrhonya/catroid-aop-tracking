package com.seminario.daos;

import java.util.ArrayList;

import com.seminario.clases.Libro;

public class LibroDao {

	ArrayList<Libro> libros; //otra opci�n es List
	
	public LibroDao() {
		libros.add(new Libro("The Java language specification", "James Gosling", "If you want to know the precise meaning of the languages constructs, this is the source for you..."));
		libros.add(new Libro("C�mo programar en Java", "Harvey M. Deitel", "Comprender un t�pico entorno de desarrollo en Java. � Entender el papel de Java en el desarrollo de aplicaciones cliente/servidor distribuidas para Internet y Web..."));
		libros.add(new Libro("Java: manual de referencia", "Patrick Naughton", ""));
		libros.add(new Libro("Java para estudiantes", "Douglas Bell", "El alcance de Java En este cap�tulo estableceremos el escenario. Veremos c�mo y por qu� Java se convirti� en lo que es y qu� novedades hay sobre este lenguaje de programaci�n..."));
		libros.add(new Libro("Java 5- Novedades del Lenguaje", "Marcello Valeri", "Java 5, nombre en c�digo Tiger, es la ultima versi�n de la plataforma desarrollo Java."));
		libros.add(new Libro("Aplicaciones distribuidas en Java con tecnolog�a RMI", "Fatos Xhafa","Introducci�n La programaci�n distribuida es uno de los paradigmas m�s importantes de la programaci�n."));
		libros.add(new Libro("Thinking in Java", "Bruce Eckel", "Thinking in Java� demonstrates advanced topics.Explains sound object-oriented principles as they apply to Java.Hands-on Java CD available online..."));
		
	}
	
	public ArrayList<Libro> devolverLibros()
	{
		return libros;
	}
}
