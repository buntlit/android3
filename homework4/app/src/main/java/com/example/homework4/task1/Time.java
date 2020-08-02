package com.example.homework4.task1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time {

    @Expose
    @SerializedName("time_of_year")
    public String timeOfYear;

    @Expose
    @SerializedName("year")
    public String year;
}
