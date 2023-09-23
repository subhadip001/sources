package com.google.common.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class RemovalCause {
    private static final /* synthetic */ RemovalCause[] $VALUES;
    public static final RemovalCause COLLECTED;
    public static final RemovalCause EXPIRED;
    public static final RemovalCause EXPLICIT;
    public static final RemovalCause REPLACED;
    public static final RemovalCause SIZE;

    /* loaded from: classes.dex */
    public enum a extends RemovalCause {
        public a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("EXPLICIT", 0);
        EXPLICIT = aVar;
        RemovalCause removalCause = new RemovalCause("REPLACED", 1) { // from class: com.google.common.cache.RemovalCause.b
        };
        REPLACED = removalCause;
        RemovalCause removalCause2 = new RemovalCause("COLLECTED", 2) { // from class: com.google.common.cache.RemovalCause.c
        };
        COLLECTED = removalCause2;
        RemovalCause removalCause3 = new RemovalCause("EXPIRED", 3) { // from class: com.google.common.cache.RemovalCause.d
        };
        EXPIRED = removalCause3;
        RemovalCause removalCause4 = new RemovalCause("SIZE", 4) { // from class: com.google.common.cache.RemovalCause.e
        };
        SIZE = removalCause4;
        $VALUES = new RemovalCause[]{aVar, removalCause, removalCause2, removalCause3, removalCause4};
    }

    public RemovalCause(String str, int i2, a aVar) {
    }

    public static RemovalCause valueOf(String str) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, str);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) $VALUES.clone();
    }
}
