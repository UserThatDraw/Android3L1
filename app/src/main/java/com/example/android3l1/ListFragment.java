package com.example.android3l1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private RecyclerView rvBook;
    private RecyclerAdapter adapter;
    List<BookModel> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        rvBook = view.findViewById(R.id.rv_book);
        rvBook.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new BookModel("Чисто английское убийство", R.drawable.angliyskoeubiystvo));
        list.add(new BookModel("Весь мир в кармане", R.drawable.mirvkarmane));
        list.add(new BookModel("Переправа", R.drawable.pereprava));
        list.add(new BookModel("Голос ночной птицы", R.drawable.golosptici));
        list.add(new BookModel("Талантливый мистер Рипли", R.drawable.misterripli));
        rvBook.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerAdapter(list, getActivity());
        rvBook.setAdapter(adapter);
        return view;
    }
}