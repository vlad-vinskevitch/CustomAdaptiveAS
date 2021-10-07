package com.sharkit.mycustomadaptive.layout.adaptive.linear;

import android.widget.EditText;
import android.widget.TextView;

import com.sharkit.mycustomadaptive.layout.adaptive.linear.Linear;
import com.sharkit.mycustomadaptive.layout.adaptive.linear.LinearAdaptive;

public class LinearParams implements LinearAdaptive {
    private Linear linear;

    public LinearParams(EditText editText){
        linear = new Linear(editText);
    }
    public LinearParams(TextView textView){
        linear = new Linear(textView);
    }


    @Override
    public LinearAdaptive setParams() {
        linear.setParams();
        return this;
    }

    @Override
    public LinearAdaptive setParams(int width, int height) {
        linear.setParams(width, height);
        return this;
    }

    @Override
    public LinearAdaptive setMarge() {
        linear.setMarge();
        return this;
    }

    @Override
    public LinearAdaptive setMarge(int left, int top, int right, int bottom) {
        linear.setMarge(left, top, right, bottom);
        return this;
    }

    @Override
    public Linear build() {
        return linear;
    }

}
