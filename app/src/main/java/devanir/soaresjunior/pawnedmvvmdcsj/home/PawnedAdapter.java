package devanir.soaresjunior.pawnedmvvmdcsj.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import devanir.soaresjunior.pawnedmvvmdcsj.R;
import devanir.soaresjunior.pawnedmvvmdcsj.model.Repo;

public class PawnedAdapter extends RecyclerView.Adapter<PawnedAdapter.ViewHolder> {

    private final List<Repo> repoList= new ArrayList<>();

    public void setData(List<Repo> data){
        repoList.clear();
        repoList.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View rootView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rv_layout, viewGroup, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder vh, int i) {
      Repo repo = repoList.get(i);
        vh.tvName.setText(repo.getName());
        vh.tvTitle.setText(repo.getTitle());
        vh.tvBreachDate.setText(repo.getBreachDate());
        vh.tvDescription.setText(repo.getDescription());
    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvTitle;
        TextView tvBreachDate;
        TextView tvDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvBreachDate = itemView.findViewById(R.id.tvBreachDate);
            tvDescription = itemView.findViewById(R.id.tvDescription);
        }

    }
}
