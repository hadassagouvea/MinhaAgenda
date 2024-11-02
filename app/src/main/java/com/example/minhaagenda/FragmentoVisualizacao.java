package com.example.minhaagenda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class FragmentoVisualizacao extends Fragment {

    private TextView listaCompromissos;
    private Button botaoHoje;
    private Button botaoOutraData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_visualizacao, container, false);

        listaCompromissos = view.findViewById(R.id.listaCompromissos);
        botaoHoje = view.findViewById(R.id.botaoHoje);
        botaoOutraData = view.findViewById(R.id.botaoOutraData);

        return view;
    }
}
