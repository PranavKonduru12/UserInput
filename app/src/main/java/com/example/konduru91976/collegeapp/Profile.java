package com.example.konduru91976.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pranavkonduru on 3/3/17.
 */

public class Profile extends android.support.v4.app.Fragment{

    private String ProfileContent;
    private String Alan;
    private String Turning;
    public String getProfileContent() {
        return ProfileContent;
    }

    public void setProfileContent(String profileContent) {
        ProfileContent = profileContent;
    }

    public String getAlan() {
        return Alan;
    }

    public void setAlan(String alan) {
        Alan = alan;
    }

    public String getTurning() {
        return Turning;
    }

    public void setTurning(String turning) {
        Turning = turning;
    }

}
