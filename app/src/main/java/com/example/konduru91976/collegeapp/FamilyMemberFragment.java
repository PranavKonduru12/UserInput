package com.example.konduru91976.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by pranavkonduru on 3/3/17.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    FamilyMemberFragment FamilyMember = new FamilyMemberFragment();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        return rootView;
    }


}
