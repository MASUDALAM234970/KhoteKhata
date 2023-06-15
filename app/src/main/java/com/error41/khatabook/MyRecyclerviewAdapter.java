package com.error41.khatabook;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerviewAdapter extends RecyclerView.Adapter<MyRecyclerviewAdapter.ViewHolder>
        {
               Context ctx;
                List<Contact> mycontact;

                public MyRecyclerviewAdapter(Context ctx, List<Contact> mycontact) {
                        this.ctx = ctx;
                        this.mycontact = mycontact;
                }

                @NonNull
                @Override
                public MyRecyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        LayoutInflater inflater=LayoutInflater.from(ctx);
                        View view= inflater.inflate(R.layout.cd_rv_item, parent ,false);

                        return new ViewHolder(view);
                }

                @Override
                public void onBindViewHolder(@NonNull MyRecyclerviewAdapter.ViewHolder holder, int position) {



                   holder.cd_fname.setText( ""+mycontact.get(position).getFname()+" "+mycontact.get());
                   holder.cd_ph0ne.setText(" "+mycontact.get(position).getPhone().toUpperCase());
                }

                @Override
                public int getItemCount() {
                        return 0;
                }

                public class ViewHolder extends RecyclerView.ViewHolder{
                    TextView cd_fname, cd_ph0ne;
                        public ViewHolder(@NonNull View itemView) {
                                super(itemView);

                            cd_fname=itemView.findViewById(R.id.cd_name);
                            cd_ph0ne=itemView.findViewById(R.id.cd_phone);




                        }
                }
        }
