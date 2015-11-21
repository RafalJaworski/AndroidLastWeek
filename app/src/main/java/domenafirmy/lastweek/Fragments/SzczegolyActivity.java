package domenafirmy.lastweek.Fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import domenafirmy.lastweek.R;

public class SzczegolyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szczegoly);

        SzczegolyFragment fragment = new SzczegolyFragment();
        //w aktywnosciach jest fragment manager z suportem
        //chcemy dodac fragment
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit();
    }
}
