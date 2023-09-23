package com.video_converter.video_compressor.constants;

import e.s.s;

/* loaded from: classes2.dex */
public class User {
    public static s<Type> a = new s<>(Type.FREE);

    /* loaded from: classes2.dex */
    public enum Type {
        FREE,
        SUBSCRIBED
    }

    public static boolean a() {
        return a.d() == Type.SUBSCRIBED;
    }
}
