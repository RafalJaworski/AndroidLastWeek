package Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import domenafirmy.lastweek.R;

public class LsitaFragment extends Fragment{ //fragment z support.v4

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
}
