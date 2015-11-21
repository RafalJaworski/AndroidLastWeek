package Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder>{

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }


    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder {
        public CityViewHolder(View itemView) {
            super(itemView);
        }
    }
}
