package casasmap.com.retro7.adapater;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import casasmap.com.retro7.R;

/**
 * Created by ramiro on 3/20/16.
 */
public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.Holder> {
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new Holder(row);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class Holder extends RecyclerView.ViewHolder {
        public Holder(View itemView) {
            super(itemView);
        }
    }
}
