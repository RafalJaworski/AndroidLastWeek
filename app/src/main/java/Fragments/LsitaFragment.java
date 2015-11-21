package Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import Adapters.CityAdapter;
import butterknife.Bind;
import butterknife.ButterKnife;
import domenafirmy.lastweek.R;

public class LsitaFragment extends Fragment{ //fragment z support.v4

    @Bind(R.id.lista)
    protected RecyclerView lista;
    private CityAdapter adapter;

    @Nullable
    @Override
    //zwracamy
    //inflater tworzy z xmla
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //container - tu moze zostac zwrocone jak ostatni parametr bylby true
        // ale piszemy zawsze piszemy FALSE w metodzie ONCREATEVIEW
        //attach to Root = false - zwraca ale nie todaje do konttenera
        return inflater.inflate(R.layout.fragment_lista,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //pola sa we fragmencie a nie aktywnosci wiec metoda bind z 2 parametrami
        //target czyli tam gdzie sa bindy(pola)
        //view  - na podstawie czego ma sobie target uzupelnic
        ButterKnife.bind(this,view);

        //musimy powiedziec recyclerView jak ma wyswietlac
        //nie jestesmy w activity tylko we fragmencie wiec nit  mozemy uzyc this tylko getActivity
        lista.setLayoutManager(new LinearLayoutManager(getActivity()));

        //zamiast tworzyc obj i robic add("warszawa")
        adapter = new CityAdapter(getActivity(), Arrays.asList(
                "warszawa","lodz","wroclaw","zdunska","sieradz","opole"
        ));
    }
}
