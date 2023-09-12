package com.myapps.whatsappclone.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.FirebaseDatabase;
import com.myapps.whatsappclone.Adapters.UsersAdapter;
import com.myapps.whatsappclone.Models.Users;
import com.myapps.whatsappclone.R;
import com.myapps.whatsappclone.databinding.FragmentChatsBinding;

import java.util.ArrayList;

public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }

    FragmentChatsBinding binding;
    ArrayList<Users> list = new ArrayList<>();
    FirebaseDatabase Database;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentChatsBinding.inflate(inflater,container,false);

        UsersAdapter adapter = new UsersAdapter(list,getContext());
        binding.

        return binding.getRoot();
    }
}