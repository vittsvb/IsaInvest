package info.androidhive.materialdesign.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import info.androidhive.materialdesign.R;


import java.util.List;

import info.androidhive.materialdesign.model.Emprestimo;

/**
 * Created by vvilas on 24/09/2017.
 */


public class EmprestimoListAdapter extends RecyclerView.Adapter<EmprestimoListAdapter.ViewHolder> {
    private List<Emprestimo> emprestimos;
    private Dialog dialog;
    private Context context;

    public EmprestimoListAdapter(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public EmprestimoListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_emprestimo, parent, false);
        EmprestimoListAdapter.ViewHolder viewHolder = new EmprestimoListAdapter.ViewHolder(view);

        context = parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EmprestimoListAdapter.ViewHolder holder, final int position) {

        final Emprestimo emprestimo = emprestimos.get(position);
        holder.valores.setText(emprestimo.getValores());
        holder.parcelas.setText(emprestimo.getParcelas());
        holder.juros.setText(emprestimo.getJuros());

        final String nome = emprestimo.getNome();
//
//        if (nome.equalsIgnoreCase("just")) {
//            holder.imageView.setImageResource(R.mipmap.just_online);
//        } else if (nome.equalsIgnoreCase("lendico")) {
//            holder.imageView.setImageResource(R.mipmap.lendico_logo);
//        } else if (nome.equalsIgnoreCase("bompracredito")) {
//            holder.imageView.setImageResource(R.mipmap.bompracredito);
//        } else if (nome.equalsIgnoreCase("Simplic")) {
//            holder.imageView.setImageResource(R.mipmap.simplic_logo);
//        } else if (nome.equalsIgnoreCase("geru")) {
//            holder.imageView.setImageResource(R.mipmap.geru);
//        } else if (nome.equalsIgnoreCase("noverde")) {
//            holder.imageView.setImageResource(R.mipmap.noverde);
//        }

        ((ViewHolder) holder).maisinfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return emprestimos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView valores;
        public TextView parcelas;
        public TextView juros;
        public ImageView imageView;
        public Button maisinfo;

        public ViewHolder(View view) {
            super(view);
            valores = (TextView) view.findViewById(R.id.valores);
            parcelas = (TextView) view.findViewById(R.id.parcelas);
            juros = (TextView) view.findViewById(R.id.juros);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            maisinfo = (Button) view.findViewById(R.id.maisinfo);
        }
    }
}
