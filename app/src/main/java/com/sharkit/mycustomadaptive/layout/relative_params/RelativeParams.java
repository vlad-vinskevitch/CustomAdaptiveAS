package com.sharkit.mycustomadaptive.layout.relative_params;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.sharkit.mycustomadaptive.layout.Params;

import java.util.List;

public class RelativeParams implements Params {
    private EditText editText;
//    private List<EditText> editTexts;

    public RelativeParams(Context mContext, EditText editText) {
        this.editText = editText;
        DEFAULT_HEIGHT = mContext.getResources().getDisplayMetrics().heightPixels/20;
        DEFAULT_WIDTH = mContext.getResources().getDisplayMetrics().widthPixels;
        DEFAULT_MARGE_LEFT = mContext.getResources().getDisplayMetrics().widthPixels/14;
        DEFAULT_MARGE_RIGHT = mContext.getResources().getDisplayMetrics().widthPixels/14;
        DEFAULT_MARGE_TOP = mContext.getResources().getDisplayMetrics().widthPixels/20;
        DEFAULT_MARGE_BOTTOM = mContext.getResources().getDisplayMetrics().widthPixels/20;
    }
//    public RelativeParams(Context mContext, List<EditText> editTexts) {
//        this.editTexts = editTexts;
//        DEFAULT_HEIGHT = mContext.getResources().getDisplayMetrics().heightPixels/20;
//        DEFAULT_WIDTH = mContext.getResources().getDisplayMetrics().widthPixels;
//        DEFAULT_MARGE_LEFT = mContext.getResources().getDisplayMetrics().widthPixels/14;
//        DEFAULT_MARGE_RIGHT = mContext.getResources().getDisplayMetrics().widthPixels/14;
//        DEFAULT_MARGE_TOP = mContext.getResources().getDisplayMetrics().widthPixels/20;
//        DEFAULT_MARGE_BOTTOM = mContext.getResources().getDisplayMetrics().widthPixels/20;
//    }
    private final int DEFAULT_HEIGHT;
    private final int DEFAULT_WIDTH;
    private final int DEFAULT_MARGE_LEFT;
    private final int DEFAULT_MARGE_RIGHT;
    private final int DEFAULT_MARGE_TOP;
    private final int DEFAULT_MARGE_BOTTOM;

    @Override
    public void setParams(int w, int h) {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(w, h);
        params.setMargins(DEFAULT_MARGE_LEFT, DEFAULT_MARGE_TOP, DEFAULT_MARGE_RIGHT, DEFAULT_MARGE_BOTTOM);
        editText.setLayoutParams(params);
        }

    @Override
    public void setParams() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        params.setMargins(DEFAULT_MARGE_LEFT, DEFAULT_MARGE_TOP, DEFAULT_MARGE_RIGHT, DEFAULT_MARGE_BOTTOM);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullScreen() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullScreenWithMarge(int left, int right, int top, int bottom) {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(left,top,right,bottom);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullWidth() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        editText.setLayoutParams(params);
    }

    @Override
    public void setFullWidthWithMerge(int left, int right) {

    }

}
