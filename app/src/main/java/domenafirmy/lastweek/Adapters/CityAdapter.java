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

    //musimy dodac context bo inflater bierze sie z contextu
    public CityAdapter(Context context, List<String> dane) {
        this.dane = dane;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //nie wiemy gdzie wcisnac ten widok wiec piszemy null
        View view = inflater.inflate(android.R.layout.simple_list_item_1,null);
        return new CityViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        holder.poleTextowe.setText(dane.get(position));
    }

    @Override
    public int getItemCount() {
        return dane.size();
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView poleTextowe;

        public CityViewHolder(View itemView) {
            super(itemView);
            //itemView to jeden el listy ktory mozemy kliknac
            itemView.setOnClickListener(this);
            poleTextowe = (TextView) itemView.findViewById(android.R.id.text1);
        }

        @Override
        public void onClick(View v) {
            String text = poleTextowe.getText().toString();

            //wysylamy intent po kliknieciu
            Intent detailsIntent = new Intent(v.getContext(), SzczegolyActivity.class);
            //pobieramy klucz z fragmentu
            detailsIntent.putExtra(SzczegolyFragment.ARG_TEXT,text);

            v.getContext().startActivity(detailsIntent);
        }
    }
}
