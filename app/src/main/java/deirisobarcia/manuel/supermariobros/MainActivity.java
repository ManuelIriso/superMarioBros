package deirisobarcia.manuel.supermariobros;


import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonajeAdapter adapter;
    private List<Personaje> listaPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear una lista de personajes
        listaPersonajes = new ArrayList<>();
        listaPersonajes.add(new Personaje(1, "Mario", "El fontanero heroico", R.drawable.mario_image));
        listaPersonajes.add(new Personaje(2, "Luigi", "Hermano de Mario, también fontanero", R.drawable.mario_image));
        listaPersonajes.add(new Personaje(3, "Peach", "Princesa de Mushroom Kingdom", R.drawable.peach_image));
        listaPersonajes.add(new Personaje(4, "Toad", "El fiel ayudante de la princesa Peach", R.drawable.toad_image));

        // Configuramos el Adapter para el RecyclerView
        adapter = new PersonajeAdapter(this, listaPersonajes);
        recyclerView.setAdapter(adapter);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Identificamos la opción seleccionada
        int id = item.getItemId();

        if (id == R.id.action_about) {
            // Mostramos el AlertDialog con la información
            showAboutDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    private void showAboutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Acerca de...");
        builder.setMessage("Aplicación desarrollada por Manuel De Iriso Barcia.\nVersión 1.0.");
        builder.setIcon(R.mipmap.ic_launcher); // Icono de la aplicación
        builder.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


}
