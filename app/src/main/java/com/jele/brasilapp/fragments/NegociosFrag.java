package com.jele.brasilapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jele.brasilapp.R;
import com.jele.brasilapp.adapters.InfoAdapter;
import com.jele.brasilapp.fragments.nego_model.NegoInfoManager;

/**
 * Created by Edmundo on 12/1/14.
 */
public class NegociosFrag extends Fragment {

    private InfoAdapter mAdapter;
    private RecyclerView mRecyclerView;

    public NegociosFrag() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_negocios, container, false);
        // This block creates the recyclerView and add info to the card.
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardListNego);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new InfoAdapter(NegoInfoManager.getInstance().getInformationCards(), R.layout.card_layout, getActivity());
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
