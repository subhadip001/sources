package com.google.firebase.platforminfo;

import i.b;

/* loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return b.f8601j.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
