package Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


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

    public static class CityViewHolder extends RecyclerView.ViewHolder {

        public TextView poleTextowe;

        public CityViewHolder(View itemView) {
            super(itemView);

            poleTextowe = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }
}
