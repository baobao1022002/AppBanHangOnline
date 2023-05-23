package vn.manager.appbanhang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.manager.appbanhang.model.User;
import vn.name.appbanhang.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    Context context;
    List<User> userList;


    public UserAdapter( Context context,List<User> userList) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user,parent,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.txtId.setText(userList.get(position).getId()+ " ");
    holder.txtUser.setText(userList.get(position).getUsername());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder {
        TextView txtId, txtUser;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtId = itemView.findViewById(R.id.iduser);
            txtUser = itemView.findViewById(R.id.username);
        }
    }
}
