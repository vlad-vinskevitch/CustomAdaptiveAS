package com.sharkit.mycustomadaptive.layout.adaptive.linear;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Linear implements LinearMethods {
    private EditText editText;
    private TextView textView;
    private LinearLayout.LayoutParams params;

    public Linear(EditText editText) {
        this.editText = editText;
    }

    public Linear(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void setParams() {
        params = new LinearLayout.LayoutParams(-1,-1);
        if (editText != null) {
            editText.setLayoutParams(params);
        }else if (textView != null){
            textView.setLayoutParams(params);
        }

    }


    @Override
    public void setParams(int width, int height) {

    }

    @Override
    public void setMarge() {

    }

    @Override
    public void setMarge(int left, int top, int right, int bottom) {

    }


}
