package com.padcmyanmar.padc9.end_module1_assignment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.padcmyanmar.padc9.end_module1_assignment.R;
import com.padcmyanmar.padc9.end_module1_assignment.adapters.NavigationRecyclerItemViewAdapter;

public class NavigationSearchFragment extends Fragment {


    public NavigationSearchFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.navigation_search_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.navigation_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayout.HORIZONTAL, false));

        NavigationRecyclerItemViewAdapter navigationRecyclerItemViewAdapter = new NavigationRecyclerItemViewAdapter();
        recyclerView.setAdapter(navigationRecyclerItemViewAdapter);

        ConstraintLayout constraintLayout = view.findViewById(R.id.constraint_Layout);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
                bottomSheetFragment.show(getFragmentManager(), bottomSheetFragment.getTag());
            }
        });

        ImageView imageView = view.findViewById(R.id.imageView4);
        imageView.setRotation(-30);
    }
}
