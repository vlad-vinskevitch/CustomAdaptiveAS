package com.sharkit.mycustomadaptive.layout;

public interface Params {
    void setParams(int width, int height);
    void setParams();
    void setFullScreen();
    void setFullScreenWithMarge(int left, int right, int top, int bottom);
    void setFullWidth();
    void setFullWidthWithMerge(int left, int right);
}
