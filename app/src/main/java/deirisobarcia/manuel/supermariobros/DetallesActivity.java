package deirisobarcia.manuel.supermariobros;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetallesActivity extends AppCompatActivity {

    private ImageView imagenPersonaje;
    private TextView nombrePersonaje, descripcionPersonaje, habilidadesPersonaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles); // Se refiere al diseño de la pantalla de detalles

        // Inicializamos los componentes gráficos
        imagenPersonaje = findViewById(R.id.imagen_personaje);
        nombrePersonaje = findViewById(R.id.nombre_personaje);
        descripcionPersonaje = findViewById(R.id.descripcion_personaje);
        habilidadesPersonaje = findViewById(R.id.habilidades_personaje);

        // Obtener el ID del personaje que fue seleccionado
        Intent intent = getIntent();
        int personajeId = intent.getIntExtra("personaje_id", -1); // Recibimos el ID del personaje

        // Aquí se podria usar el ID del personaje para mostrar los detalles
        // Por simplicidad, lo vamos a manejar con un switch
        switch (personajeId) {
            case 1: // Mario
                imagenPersonaje.setImageResource(R.drawable.mario_image); // Muestra imagen de Mario
                nombrePersonaje.setText("Mario");
                descripcionPersonaje.setText("Héroe del Reino Champiñón");
                habilidadesPersonaje.setText("Salta alto\nHéroe del Reino Champiñón");
                break;
            case 2: // Luigi

                imagenPersonaje.setImageResource(R.drawable.luigi_image); // Muestra imagen de Luigi
                nombrePersonaje.setText("Luigi");
                descripcionPersonaje.setText("Hermano de Mario, fontanero valiente");
                habilidadesPersonaje.setText("Resistente a los fantasmas\nGran saltador");
                break;
            case 3: // Peach
                imagenPersonaje.setImageResource(R.drawable.peach_image); // Muestra imagen de Peach
                nombrePersonaje.setText("Peach");
                descripcionPersonaje.setText("Princesa del Reino Champiñón");
                habilidadesPersonaje.setText("Lidera su reino\nHabilidad para usar paraguas");
                break;
            case 4: // Toad
                imagenPersonaje.setImageResource(R.drawable.toad_image); // Muestra imagen de Toad
                nombrePersonaje.setText("Toad");
                descripcionPersonaje.setText("Fiel asistente de la Princesa Peach");
                habilidadesPersonaje.setText("Valiente\nRápido y ágil");
                break;
            default:
                break;
        }
    }



}

