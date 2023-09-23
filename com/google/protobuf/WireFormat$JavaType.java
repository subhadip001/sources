package com.google.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.h.h.j;

/* loaded from: classes2.dex */
public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(j.f6366g),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }
}
