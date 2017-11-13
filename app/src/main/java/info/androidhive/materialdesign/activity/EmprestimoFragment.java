package info.androidhive.materialdesign.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialdesign.R;
import info.androidhive.materialdesign.adapter.EmprestimoListAdapter;
import info.androidhive.materialdesign.model.Emprestimo;

/**
 * Created by Ravi on 29/07/15.
 */
public class EmprestimoFragment extends Fragment {

    public EmprestimoFragment() {
        // Required empty public constructor
    }

    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_emprestimo, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_emprestimo);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        criaEmprestimo();

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

    public void criaEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();

        emprestimo.setNome("JUST");
        emprestimo.setValores("Valores: R$500,00 até R$3.000,00");
        emprestimo.setParcelas("Parcelas: 12 até 36 meses");
        emprestimo.setJuros("Juros: 15,8% até 17,9%");
        emprestimos.add(emprestimo);

        adapter = new EmprestimoListAdapter(emprestimos);
        recyclerView.setAdapter(adapter);

    }
}
