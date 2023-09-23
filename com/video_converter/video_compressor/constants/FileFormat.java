package com.video_converter.video_compressor.constants;

/* loaded from: classes2.dex */
public enum FileFormat {
    GP3("3gp"),
    AVI("avi"),
    FLV("flv"),
    WEBM("webm"),
    MP4("mp4"),
    MPG("mpg"),
    MOV("mov"),
    MTS("mts"),
    M2TS("m2ts"),
    TS("ts"),
    MKV("mkv"),
    M4V("m4v"),
    MPEG("mpeg"),
    WMV("wmv"),
    VOB("vob"),
    F4V("f4v"),
    DAT("dat"),
    DAV("dav"),
    MOD("mod"),
    MOVIE("movie"),
    ORIGINAL("original"),
    UNKNOWN("unknown");
    
    private String extension;

    FileFormat(String str) {
        this.extension = str;
    }

    public String getExtension() {
        return this.extension;
    }
}
