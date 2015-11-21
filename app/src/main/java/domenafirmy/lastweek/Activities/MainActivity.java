package domenafirmy.lastweek.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import domenafirmy.lastweek.Adapters.CityAdapter;
import domenafirmy.lastweek.Fragments.SzczegolyFragment;
import domenafirmy.lastweek.R;

public class MainActivity extends AppCompatActivity
    implements CityAdapter.OnItemClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClick(String item) {
        //chcemy wyswietlic nazwe miasta na liscie z mozliwoscia powrotu do listy
        SzczegolyFragment fragment = new SzczegolyFragment();
        Bundle arguments = new Bundle();
        arguments.putString(SzczegolyFragment.ARG_TEXT,item);
        fragment.setArguments(arguments);

        //dodanie fragmenntu do aktywnosci
        getSupportFragmentManager().beginTransaction()
                .add(R.id.lista_fragment,fragment)
                .addToBackStack("szczegoly")
                .commit();

    }
}
