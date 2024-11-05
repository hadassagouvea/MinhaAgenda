package com.example.minhaagenda;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FragmentoVisualizacao extends Fragment {

    private TextView listaCompromissos;
    private Button botaoHoje;
    private Button botaoOutraData;
    private Calendar dataSelecionada = Calendar.getInstance();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_visualizacao, container, false);

        listaCompromissos = view.findViewById(R.id.listaCompromissos);
        botaoHoje = view.findViewById(R.id.botaoHoje);
        botaoOutraData = view.findViewById(R.id.botaoOutraData);

        botaoHoje.setOnClickListener(v -> atualizarDataParaHoje());

        botaoOutraData.setOnClickListener(v -> abrirDatePicker());

        return view;
    }

    private void atualizarDataParaHoje() {
        dataSelecionada = Calendar.getInstance();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String dataFormatada = formatoData.format(dataSelecionada.getTime());
        listaCompromissos.setText("Data selecionada: " + dataFormatada);
    }

    private void abrirDatePicker() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                requireContext(),
                (view, year, month, dayOfMonth) -> {
                    dataSelecionada.set(Calendar.YEAR, year);
                    dataSelecionada.set(Calendar.MONTH, month);
                    dataSelecionada.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                    String dataFormatada = formatoData.format(dataSelecionada.getTime());
                    listaCompromissos.setText("Data selecionada: " + dataFormatada);
                },
                dataSelecionada.get(Calendar.YEAR),
                dataSelecionada.get(Calendar.MONTH),
                dataSelecionada.get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }
}
