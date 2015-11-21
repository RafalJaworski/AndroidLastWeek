package Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder>{

    private List<String> dane;

    public CityAdapter(List<String> dane) {
        this.dane = dane;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }


    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {

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
