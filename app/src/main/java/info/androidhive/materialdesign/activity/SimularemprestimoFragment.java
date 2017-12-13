package info.androidhive.materialdesign.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialdesign.R;

/**
 * Created by Ravi on 29/07/15.
 */
public class SimularemprestimoFragment extends Fragment {

    private Button btn;
    private EditText valor;
    private EditText juros;
    private EditText meses;
    private TextView valorFinalEmp;

    public SimularemprestimoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_simularemprestimo, container, false);
        btn = (Button) rootView.findViewById(R.id.simular);
        valor = (EditText) rootView.findViewById(R.id.valor);
        juros = (EditText) rootView.findViewById(R.id.juros);
        meses = (EditText) rootView.findViewById(R.id.meses);
        valorFinalEmp = (TextView) rootView.findViewById(R.id.valorFinalEmp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nMeses = Integer.parseInt(meses.getText().toString());
                double valorPrincipal = Double.parseDouble(valor.getText().toString());
                double valorJuros = Double.parseDouble(juros.getText().toString())/100;

                double valorFinal = valorPrincipal*(valorJuros/(1-Math.pow((1+valorJuros),-nMeses)));

                valorFinalEmp.setText(nMeses + " Parcelas de R$" + String.format("%.2f", valorFinal));
                valorFinalEmp.setVisibility(View.VISIBLE);


            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
