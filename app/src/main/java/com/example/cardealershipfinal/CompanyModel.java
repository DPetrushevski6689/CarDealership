package com.example.cardealershipfinal;

import android.content.Context;
import android.content.Intent;
import android.location.Location;

import androidx.annotation.DrawableRes;

import java.util.Date;

public class CompanyModel {
    private final int companyLogo;
    private final String companyName;

    public CompanyModel(int companyLogo, String companyName) {
        this.companyLogo = companyLogo;
        this.companyName = companyName;
    }

    public int getCompanyLogo() {
        return companyLogo;
    }

    public String getCompanyName() {
        return companyName;
    }
}




