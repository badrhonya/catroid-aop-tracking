package com.seminario.daos;

import java.util.ArrayList;

import com.seminario.clases.Libro;
import com.seminario.interfaces.LibroInterfaz;

public class LibroDao implements LibroInterfaz {

	ArrayList<Libro> libros; //otra opci�n es List
	
	public LibroDao() {
		libros = new ArrayList<Libro>();
		libros.add(new Libro("The Java language specification", "James Gosling", "If you want to know the precise meaning of the languages constructs, this is the source for you..."));
		libros.add(new Libro("C�mo programar en Java", "Harvey M. Deitel", "Comprender un t�pico entorno de desarrollo en Java. � Entender el papel de Java en el desarrollo de aplicaciones cliente/servidor distribuidas para Internet y Web..."));
		libros.add(new Libro("Java: manual de referencia", "Patrick Naughton", ""));
		libros.add(new Libro("Java para estudiantes", "Douglas Bell", "El alcance de Java En este cap�tulo estableceremos el escenario. Veremos c�mo y por qu� Java se convirti� en lo que es y qu� novedades hay sobre este lenguaje de programaci�n..."));
		libros.add(new Libro("Java 5- Novedades del Lenguaje", "Marcello Valeri", "Java 5, nombre en c�digo Tiger, es la ultima versi�n de la plataforma desarrollo Java."));
		libros.add(new Libro("Aplicaciones distribuidas en Java con tecnolog�a RMI", "Fatos Xhafa","Introducci�n La programaci�n distribuida es uno de los paradigmas m�s importantes de la programaci�n."));
		libros.add(new Libro("Thinking in Java", "Bruce Eckel", "Thinking in Java� demonstrates advanced topics.Explains sound object-oriented principles as they apply to Java.Hands-on Java CD available online..."));
		
	}
	
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibros()
	 */
	@Override
	public ArrayList<Libro> devolverLibros()
	{
		return libros;
	}
	
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibrosNombre()
	 */
	@Override
	public String[] devolverLibrosNombre()
	{
		int i = 0;
		String[] nombres = new String[libros.size()];
		while(i<libros.size())
		{
			nombres[i]=libros.get(i).getTitulo();
			i++;
		}
		return nombres;
	}
	
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibro(java.lang.String)
	 */
	@Override
	public Libro devolverLibro(String nombre)
	{
		int i = 0;
		Libro rta = null;
		while(i<libros.size())
		{
			if(libros.get(i).getTitulo().equals(nombre))
			{
				rta = libros.get(i);
			}
			i++;
		}
		return rta;
	}
}
