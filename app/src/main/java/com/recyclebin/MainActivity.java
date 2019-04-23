package com.recyclebin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        editText = findViewById(R.id.etsearch);

        //Create a list of Contact
        final List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("saugat Malla","9860345213","kathmandu","saugatmalla@gmail.com",R.drawable.saugat ));
        contactsList.add(new Contacts("Bhuwan","9860345217","Lalitpur", "bhuban@gmail.com",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dhayang", "9865021450","Bhaktapur", "dhayang@gmail.com", R.drawable.dahayang ));
        contactsList.add(new Contacts("Rajesh","9860345567","Banepa", "bhuban@gmail.com", R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","no address", "no email", R.drawable.noavatar));
        contactsList.add(new Contacts("saugat Malla","9860345213","kathmandu","saugatmalla@gmail.com",R.drawable.saugat ));
        contactsList.add(new Contacts("Bhuwan","9860345217","Lalitpur", "bhuban@gmail.com",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dhayang", "9865021450","Bhaktapur", "dhayang@gmail.com", R.drawable.dahayang ));
        contactsList.add(new Contacts("Rajesh","9860345567","Banepa", "bhuban@gmail.com", R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","no address", "no email", R.drawable.noavatar));
        contactsList.add(new Contacts("saugat Malla","9860345213","kathmandu","saugatmalla@gmail.com",R.drawable.saugat ));
        contactsList.add(new Contacts("Bhuwan","9860345217","Lalitpur", "bhuban@gmail.com",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dhayang", "9865021450","Bhaktapur", "dhayang@gmail.com", R.drawable.dahayang ));
        contactsList.add(new Contacts("Rajesh","9860345567","Banepa", "bhuban@gmail.com", R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","no address", "no email", R.drawable.noavatar));
        contactsList.add(new Contacts("saugat Malla","9860345213","kathmandu","saugatmalla@gmail.com",R.drawable.saugat ));
        contactsList.add(new Contacts("Bhuwan","9860345217","Lalitpur", "bhuban@gmail.com",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dhayang", "9865021450","Bhaktapur", "dhayang@gmail.com", R.drawable.dahayang ));
        contactsList.add(new Contacts("Rajesh","9860345567","Banepa", "bhuban@gmail.com", R.drawable.rajesh));
        contactsList.add(new Contacts("noavatar","no phone","no address", "no email", R.drawable.noavatar));

        //pass this list to adapter




        final ContactsAdapter contactAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }


            public void filter(String text) {
                ArrayList<Contacts> filteredList = new ArrayList<>();
                for (Contacts contacts : contactsList) {
                    if (contacts.getName().toLowerCase().contains((text.toLowerCase()))) {
                        filteredList.add(contacts);
                    }

                }
                contactAdapter.filterList(filteredList);
            }
        });
    }
}
