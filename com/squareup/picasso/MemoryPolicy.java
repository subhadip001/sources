package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    public final int index;

    MemoryPolicy(int i2) {
        this.index = i2;
    }

    public static boolean a(int i2) {
        return (i2 & NO_CACHE.index) == 0;
    }
}
