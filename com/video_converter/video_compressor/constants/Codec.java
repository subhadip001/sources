package com.video_converter.video_compressor.constants;

/* loaded from: classes2.dex */
public enum Codec {
    RECOMMENDED("RECOMMENDED"),
    FAST("FAST"),
    H264("h264"),
    X264("x264"),
    HEVC("hevc"),
    UNKNOWN("unknown"),
    H265("h265"),
    X265("X265"),
    MPEG2VIDEO("mpeg2video"),
    VP8("vp8"),
    WMV2("wmv2"),
    LIBX264("libx264"),
    LIBX265("libx265"),
    NONE("none"),
    MPEG4("mpeg4"),
    FLV1("flv1"),
    MPEG1VIDEO("mpeg1video"),
    VP6("vp6"),
    VP6F("vp6f"),
    VP9("vp9"),
    WMV1("wmv1"),
    AV1("av1"),
    LIBVPXVP9("libvpxvp9"),
    H261("h261"),
    H262("h262"),
    H266("h266"),
    H263("h263"),
    AAC("aac"),
    AMR_NB("amr_nb"),
    AMR_WB("amr_wb"),
    MP1("mp1"),
    MP2("mp2"),
    MP3("mp3"),
    AC3("ac3"),
    VORBIS("vorbis"),
    OPUS("opus"),
    WMAV1("wmav1"),
    WMAV2("wmav2"),
    ALAC("alac"),
    FLAC("flac"),
    SPEEX("speex"),
    PCM("pcm"),
    WMA("wma");
    
    private String codec;

    Codec(String str) {
        this.codec = str;
    }

    public String getCodec() {
        return this.codec;
    }
}
