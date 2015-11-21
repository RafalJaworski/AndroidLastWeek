package domenafirmy.lastweek.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import domenafirmy.lastweek.Adapters.CityAdapter;
import domenafirmy.lastweek.R;

public class MainActivity extends AppCompatActivity
    implements CityAdapter.OnItemClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
