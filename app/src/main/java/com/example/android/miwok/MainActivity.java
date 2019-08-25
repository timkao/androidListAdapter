/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NumbersFragment.OnFragmentInteractionListeners, FamilyFragment.OnFragmentInteractionListeners {


    private final String TAG = "MainActivity";

    @Override
    public void onFragmentItemClick(int position){
        //you can leave it empty
        Log.d(TAG, "Numbers have position " + position);
    }

    @Override
    public void onFamilyFragmentItemClick(int position){
        //you can leave it empty
        Log.d(TAG, "Family have position " + position);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

//
//        TextView numbersView = (TextView) findViewById(R.id.numbers);
//        numbersView.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        TextView pharseView = (TextView) findViewById(R.id.phrases);
//        pharseView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}
