package com.google.gson;

import f.h.f.p;
import f.h.f.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    /* loaded from: classes2.dex */
    public enum a extends LongSerializationPolicy {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.LongSerializationPolicy
        public p serialize(Long l2) {
            return new s(l2);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        LongSerializationPolicy longSerializationPolicy = new LongSerializationPolicy("STRING", 1) { // from class: com.google.gson.LongSerializationPolicy.b
            @Override // com.google.gson.LongSerializationPolicy
            public p serialize(Long l2) {
                return new s(String.valueOf(l2));
            }
        };
        STRING = longSerializationPolicy;
        $VALUES = new LongSerializationPolicy[]{aVar, longSerializationPolicy};
    }

    public LongSerializationPolicy(String str, int i2, a aVar) {
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) $VALUES.clone();
    }

    public abstract p serialize(Long l2);
}
