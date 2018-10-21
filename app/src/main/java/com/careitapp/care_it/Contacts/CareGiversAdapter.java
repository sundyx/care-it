package com.careitapp.care_it.Contacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.careitapp.care_it.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CareGiversAdapter extends RecyclerView.Adapter<CareGiversAdapter.ContactHolder> {
    private List<AndroidContacts> listOfContacts;
    private Context context;

    public class ContactHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.contact_name)
        TextView name;
        @BindView(R.id.phone_number)
        TextView phone;
        @BindView(R.id.rowCard)
        CardView rowCard;

        ContactHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public CareGiversAdapter(List<AndroidContacts> listOfContacts, Context context) {
        this.listOfContacts = listOfContacts;
        this.context = context;
    }

    @Override
    @NonNull
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_contact, parent, false);
        return new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        AndroidContacts contact = this.listOfContacts.get(position);
        holder.name.setText(contact.getContactName());
        holder.phone.setText(contact.getPhoneNumber());

        holder.rowCard.setOnClickListener(view -> {

        });
    }

    public int getItemCount() {
        return listOfContacts.size();
    }

}
