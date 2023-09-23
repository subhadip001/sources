package com.google.firebase.encoders;

/* loaded from: classes2.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d2);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f2);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i2);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j2);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z);

    @Deprecated
    ObjectEncoderContext add(String str, double d2);

    @Deprecated
    ObjectEncoderContext add(String str, int i2);

    @Deprecated
    ObjectEncoderContext add(String str, long j2);

    @Deprecated
    ObjectEncoderContext add(String str, Object obj);

    @Deprecated
    ObjectEncoderContext add(String str, boolean z);

    ObjectEncoderContext inline(Object obj);

    ObjectEncoderContext nested(FieldDescriptor fieldDescriptor);

    ObjectEncoderContext nested(String str);
}
