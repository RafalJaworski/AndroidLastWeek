package domenafirmy.lastweek.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import domenafirmy.lastweek.Fragments.SzczegolyActivity;
import domenafirmy.lastweek.Fragments.SzczegolyFragment;


public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder>{

    private List<String> dane;
    private LayoutInflater inflater;
    public OnItemClick clickListener;

    //musimy dodac context bo inflater bierze sie z contextu
    public CityAdapter(Context context, List<String> dane) {
        this.dane = dane;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setClickListener(OnItemClick clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //nie wiemy gdzie wcisnac ten widok wiec piszemy null
        View view = inflater.inflate(android.R.layout.simple_list_item_1,null);
        //nizej dopisalismy adapter jako parametr wiec dopisujemy this - bierzacy adapter
        return new CityViewHolder(this,view);
    }


    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        holder.poleTextowe.setText(dane.get(position));
    }

    @Override
    public int getItemCount() {
        return dane.size();
    }

    //interfejs definiujacy sposob powiadamiania o kliknieciu elementu
    public interface OnItemClick
    {
        public void onItemClick(String item);
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView poleTextowe;
        private CityAdapter adapter;

        //przesylamy adapter zeby moc wykonywac metody na polu clickListener
        public CityViewHolder(CityAdapter adapter, View itemView) {
            super(itemView);
            //itemView to jeden el listy ktory mozemy kliknac
            itemView.setOnClickListener(this);
            poleTextowe = (TextView) itemView.findViewById(android.R.id.text1);
            this.adapter = adapter;
        }

        @Override
        public void onClick(View v) {
            if(adapter.clickListener != null)
            {
                //informujemy clickListener o kliknieciu danego elementu
                adapter.clickListener.onItemClick(
                        poleTextowe.getText().toString()
                );
            }

        }
    }
}
