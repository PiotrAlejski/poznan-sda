package com.example.md.adrian.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        showBasicData();
    }

    public void showBasicData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null) {
            detailFragment.showBasicData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.BASIC_DATA);
            startActivity(intent);
        }
    }

    public void showDetailsData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null) {
            detailFragment.showDetailsData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.DETAILS);
            startActivity(intent);
        }
    }

    private DetailFragment getDetailFragment() {
        return (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
    }
}
