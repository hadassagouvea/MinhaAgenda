package com.example.minhaagenda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;

public class FragmentoEntrada extends Fragment {

    private Button botaoData;
    private Button botaoHora;
    private EditText descricaoCompromisso;
    private Button botaoOk;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_entrada, container, false);

        botaoData = view.findViewById(R.id.botaoData);
        botaoHora = view.findViewById(R.id.botaoHora);
        descricaoCompromisso = view.findViewById(R.id.descricaoCompromisso);
        botaoOk = view.findViewById(R.id.botaoOk);

        return view;
    }
}
