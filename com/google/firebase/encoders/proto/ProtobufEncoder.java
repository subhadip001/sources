package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ProtobufEncoder {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    public ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(Object obj, OutputStream outputStream) {
        new ProtobufDataEncoderContext(outputStream, this.objectEncoders, this.valueEncoders, this.fallbackEncoder).encode(obj);
    }

    /* loaded from: classes2.dex */
    public static final class Builder implements EncoderConfig<Builder> {
        private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new ObjectEncoder() { // from class: f.h.e.l.b.b
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
                int i2 = ProtobufEncoder.Builder.a;
                StringBuilder A = f.a.b.a.a.A("Couldn't find encoder for type ");
                A.append(obj.getClass().getCanonicalName());
                throw new EncodingException(A.toString());
            }
        };
        public static final /* synthetic */ int a = 0;
        private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
        private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
        private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.objectEncoders), new HashMap(this.valueEncoders), this.fallbackEncoder);
        }

        public Builder configureWith(Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        public Builder registerFallbackEncoder(ObjectEncoder<Object> objectEncoder) {
            this.fallbackEncoder = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public <U> Builder registerEncoder(Class<U> cls, ObjectEncoder<? super U> objectEncoder) {
            this.objectEncoders.put(cls, objectEncoder);
            this.valueEncoders.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public <U> Builder registerEncoder(Class<U> cls, ValueEncoder<? super U> valueEncoder) {
            this.valueEncoders.put(cls, valueEncoder);
            this.objectEncoders.remove(cls);
            return this;
        }
    }

    public byte[] encode(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
