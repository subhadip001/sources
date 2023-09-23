package com.video_converter.video_compressor.constants;

/* loaded from: classes2.dex */
public enum CompressionProfile {
    SMALL_FILE(3),
    MEDIUM_FILE(2),
    LARGE_FILE(1),
    HIGH_QUALITY_FILE(1),
    SMALL_HIGH_QUALITY_FILE(3),
    MEDIUM_HIGH_QUALITY_FILE(2),
    FIXED_SIZE_COMPRESSION(-1),
    FIXED_SIZE_COMPRESSION_LOSSY(-1),
    LOSSY_COMPRESSION(-1),
    CUSTOM_RESOLUTION(-1),
    CUSTOM(-1);
    
    private int resolutionDivisor;

    CompressionProfile(int i2) {
        this.resolutionDivisor = i2;
    }

    public int getResolutionDivisor() {
        return this.resolutionDivisor;
    }
}
