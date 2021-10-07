package com.sharkit.mycustomadaptive.layout.adaptive.linear;

public interface LinearAdaptive {

    LinearAdaptive setParams();
    LinearAdaptive setParams(int width, int height);
    LinearAdaptive setMarge();
    LinearAdaptive setMarge(int left, int top, int right, int bottom);
    Linear build();
}
