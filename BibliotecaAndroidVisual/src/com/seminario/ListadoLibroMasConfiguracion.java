package com.seminario;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.seminario.controladoras.LibroControladora;

public class ListadoLibroMasConfiguracion extends Activity {

	private ListView listLibros;

	private boolean filtroSeguimiento = true;

	private LibroControladora libroControladora;

	public ListadoLibroMasConfiguracion() {
		libroControladora = new LibroControladora();
	}

	private void levantarXml() {
		listLibros = (ListView) findViewById(R.id.list_libros);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.lista_libro_mas_configuracion);
		levantarXml();

		ArrayAdapter<String> nombres = new ArrayAdapter<String>(
				getApplicationContext(), android.R.layout.simple_list_item_1,
				libroControladora.devolverLibrosNombre());
		listLibros.setAdapter(nombres);

		listLibros.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View view, int pos,
					long id) {
				// Ir a la otra actividad pasando el libro seleccionado{
				Intent intento = new Intent(ListadoLibroMasConfiguracion.this,
						DescripcionLibro.class);

				// Libro aux =
				// libroControladora.devolverLibro(((TextView)view).getText().toString());//recuperar
				// el id con el titulo del libro, no hace falta ya que no
				// existen libros con el mismo nombre

				intento.putExtra("nombreLibro", ((TextView) view).getText()
						.toString());// pasar como extra el id... Correcci�n
										// pasar el nombre del libro
				startActivity(intento);
				// }otra actividad

			}

		});



	}
	public void mostrarConfiguracion() {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				ListadoLibroMasConfiguracion.this);
		builder.setTitle("Configuraci�n");
		// en un futuro se pueden agregar m�s opciones
		final CharSequence[] items = { "Seguimiento" };
		final boolean[] states = { filtroSeguimiento };
		builder.setMultiChoiceItems(items, states,
				new DialogInterface.OnMultiChoiceClickListener() {

					public void onClick(DialogInterface dialog,
							int item, boolean estado) {
						if (item == 0) {
							filtroSeguimiento = estado;
							// aca se podr�a desactivar el seguimiento
						}
					}
				});
		AlertDialog d = builder.create();
		d.show();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.listado_menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.opcionConfig:
	    	mostrarConfiguracion();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}
