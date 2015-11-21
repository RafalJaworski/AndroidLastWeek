package domenafirmy.lastweek.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import domenafirmy.lastweek.R;


public class SzczegolyFragment extends Fragment{

    public static final String ARG_TEXT = "text";

    @Bind(R.id.nazwa_miasta)
    public TextView poleTekstowe;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_szczegoly,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);

        //nie mamy intentu bo nie sa wywolane systemowo
        //sprawdzamy czy fragment zawiera argumenty i czy zawiera ARG_TEXT
        //parametry moga byc wrzucane do fragmentu jako bundle
        if(getArguments() != null && getArguments().containsKey(ARG_TEXT))
        {
            String text = getArguments().getString(ARG_TEXT);
            poleTekstowe.setText(text);
        }
    }
}
