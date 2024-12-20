package deirisobarcia.manuel.supermariobros;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {

    private Context mContext;
    private List<Personaje> mPersonajes;

    // Constructor
    public PersonajeAdapter(Context context, List<Personaje> personajes) {
        mContext = context;
        mPersonajes = personajes;
    }



    public PersonajeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(view);
    }



    public void onBindViewHolder(PersonajeViewHolder holder, int position) {
        final Personaje personaje = mPersonajes.get(position);
        holder.nombre.setText(personaje.getNombre());
        holder.descripcion.setText(personaje.getDescripcion());
        holder.imagen.setImageResource(personaje.getImagenId());

        // Hacer que la tarjeta sea clicable
        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, DetallesActivity.class);
            intent.putExtra("personaje_id", personaje.getId()); // Pasar el ID del personaje
            mContext.startActivity(intent);
        });
    }



    public int getItemCount() {
        return mPersonajes.size();
    }

    // Vista de cada elemento (CardView)
    public static class PersonajeViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, descripcion;
        ImageView imagen;
        CardView cardView;

        public PersonajeViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.personaje_name);
            descripcion = itemView.findViewById(R.id.personaje_description);
            imagen = itemView.findViewById(R.id.personaje_image);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}

