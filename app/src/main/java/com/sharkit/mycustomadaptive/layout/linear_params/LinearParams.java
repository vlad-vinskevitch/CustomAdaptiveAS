package com.sharkit.mycustomadaptive.layout.linear_params;

import static android.view.Gravity.CENTER;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.sharkit.mycustomadaptive.layout.Params;

import java.util.List;

public class LinearParams implements Params {
    private EditText editText;
    private List<EditText> editTexts;

    public LinearParams(Context mContext, EditText editText) {
        this.editText = editText;
        DEFAULT_HEIGHT = mContext.getResources().getDisplayMetrics().heightPixels/20;
        DEFAULT_WIDTH = mContext.getResources().getDisplayMetrics().widthPixels;
        DEFAULT_MARGE_LEFT = mContext.getResources().getDisplayMetrics().widthPixels/14;
        DEFAULT_MARGE_RIGHT = mContext.getResources().getDisplayMetrics().widthPixels/14;
        DEFAULT_MARGE_TOP = mContext.getResources().getDisplayMetrics().heightPixels/80;
        DEFAULT_MARGE_BOTTOM = mContext.getResources().getDisplayMetrics().heightPixels/80;
    }




    public LinearParams(Context mContext, List<EditText> editTexts) {
        this.editTexts = editTexts;
        DEFAULT_HEIGHT = mContext.getResources().getDisplayMetrics().heightPixels/20;
        DEFAULT_WIDTH = mContext.getResources().getDisplayMetrics().widthPixels;
        DEFAULT_MARGE_LEFT = mContext.getResources().getDisplayMetrics().widthPixels/14;
        DEFAULT_MARGE_RIGHT = mContext.getResources().getDisplayMetrics().widthPixels/14;
        DEFAULT_MARGE_TOP = mContext.getResources().getDisplayMetrics().heightPixels/80;
        DEFAULT_MARGE_BOTTOM = mContext.getResources().getDisplayMetrics().heightPixels/80;
    }
    private final int DEFAULT_HEIGHT;
    private final int DEFAULT_WIDTH;
    private final int DEFAULT_MARGE_LEFT;
    private final int DEFAULT_MARGE_RIGHT;
    private final int DEFAULT_MARGE_TOP;
    private final int DEFAULT_MARGE_BOTTOM;


    @Override
    public void setParams(int w, int h) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(w, h);
        params.gravity = CENTER;
        editText.setLayoutParams(params);
    }

    @Override
    public void setParams() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DEFAULT_HEIGHT);
        params.setMargins(DEFAULT_MARGE_LEFT, DEFAULT_MARGE_TOP, DEFAULT_MARGE_RIGHT, DEFAULT_MARGE_BOTTOM);
        if (editText != null){
            editText.setLayoutParams(params);
        }else if(editTexts.size() > 0){
            for (int i = 0; i < editTexts.size(); i++) {
                editTexts.get(i).setLayoutParams(params);
            }
        }
    }


    @Override
    public void setFullScreen() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullScreenWithMarge(int left, int right, int top, int bottom) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(left,top,right,bottom);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullWidth() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullWidthWithMerge(int left, int right) {

    }

}
