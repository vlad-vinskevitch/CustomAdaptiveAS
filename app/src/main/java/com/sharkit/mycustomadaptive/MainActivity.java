package com.sharkit.mycustomadaptive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.sharkit.mycustomadaptive.layout.linear_params.LinearParams;
import com.sharkit.mycustomadaptive.layout.relative_params.RelativeParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editText);
        EditText editText1 = findViewById(R.id.editText1);






        List<EditText> editTexts = Arrays.asList(editText,editText1);
        new LinearParams(this, editTexts).setParams();



        
//        new RelativeParams(this, editText).setParams(400,70);
//        new RelativeParams(this, editText1).setParams();


//        new LinearParams(this, editText).setParams();
//        new LinearParams(this, editText1).setParams(500,100);
    }
}