package com.video_converter.video_compressor.constants;

/* loaded from: classes2.dex */
public enum Preset {
    VERYFAST("veryfast"),
    SUPERFAST("superfast"),
    ULTRAFAST("ultrafast"),
    FAST("fast"),
    NORMAL("normal");
    
    private String preset;

    Preset(String str) {
        this.preset = str;
    }

    public String getPreset() {
        return this.preset;
    }
}
