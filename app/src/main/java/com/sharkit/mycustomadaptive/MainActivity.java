package com.sharkit.mycustomadaptive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.sharkit.mycustomadaptive.layout.adaptive.linear.Linear;
import com.sharkit.mycustomadaptive.layout.adaptive.linear.LinearParams;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText = findViewById(R.id.editText);
        EditText editText1 = findViewById(R.id.editText1);





//
//        List<EditText> editTexts = Arrays.asList(editText,editText1);
//        new LinearParams(this, editTexts).setParams(-1,-1);

        Linear LInear = new LinearParams(editText)
                .setParams()
                .setMarge()
                .build();





        
//        new RelativeParams(this, editText).setParams(400,70);
//        new RelativeParams(this, editText1).setParams();


//        new LinearParams(this, editText).setParams();
//        new LinearParams(this, editText1).setParams(500,100);
    }
}