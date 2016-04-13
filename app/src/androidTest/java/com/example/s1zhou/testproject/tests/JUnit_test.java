package com.example.s1zhou.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.s1zhou.testproject.MainActivity;
import com.example.s1zhou.testproject.R;

/**
 * Created by s1zhou on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);

    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }


}
