package com.video_converter.video_compressor.constants;

/* loaded from: classes2.dex */
public enum TwoPass {
    PASS_1("PASS_1"),
    PASS_2("PASS_2"),
    FINISHED("FINISHED");
    
    public String passName;

    TwoPass(String str) {
        this.passName = str;
    }

    public String getPassName() {
        return this.passName;
    }
}
