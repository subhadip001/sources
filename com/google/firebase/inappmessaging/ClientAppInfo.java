package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.j;
import f.h.h.k;
import f.h.h.q;
import f.h.h.u0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ClientAppInfo extends GeneratedMessageLite<ClientAppInfo, Builder> implements ClientAppInfoOrBuilder {
    private static final ClientAppInfo DEFAULT_INSTANCE;
    public static final int FIREBASE_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile u0<ClientAppInfo> PARSER;
    private int bitField0_;
    private String googleAppId_ = "";
    private String firebaseInstanceId_ = "";

    /* renamed from: com.google.firebase.inappmessaging.ClientAppInfo$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            GeneratedMessageLite.MethodToInvoke.values();
            int[] iArr = new int[7];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends GeneratedMessageLite.a<ClientAppInfo, Builder> implements ClientAppInfoOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearFirebaseInstanceId() {
            copyOnWrite();
            ((ClientAppInfo) this.instance).clearFirebaseInstanceId();
            return this;
        }

        public Builder clearGoogleAppId() {
            copyOnWrite();
            ((ClientAppInfo) this.instance).clearGoogleAppId();
            return this;
        }

        @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
        public String getFirebaseInstanceId() {
            return ((ClientAppInfo) this.instance).getFirebaseInstanceId();
        }

        @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
        public j getFirebaseInstanceIdBytes() {
            return ((ClientAppInfo) this.instance).getFirebaseInstanceIdBytes();
        }

        @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
        public String getGoogleAppId() {
            return ((ClientAppInfo) this.instance).getGoogleAppId();
        }

        @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
        public j getGoogleAppIdBytes() {
            return ((ClientAppInfo) this.instance).getGoogleAppIdBytes();
        }

        @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
        public boolean hasFirebaseInstanceId() {
            return ((ClientAppInfo) this.instance).hasFirebaseInstanceId();
        }

        @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
        public boolean hasGoogleAppId() {
            return ((ClientAppInfo) this.instance).hasGoogleAppId();
        }

        public Builder setFirebaseInstanceId(String str) {
            copyOnWrite();
            ((ClientAppInfo) this.instance).setFirebaseInstanceId(str);
            return this;
        }

        public Builder setFirebaseInstanceIdBytes(j jVar) {
            copyOnWrite();
            ((ClientAppInfo) this.instance).setFirebaseInstanceIdBytes(jVar);
            return this;
        }

        public Builder setGoogleAppId(String str) {
            copyOnWrite();
            ((ClientAppInfo) this.instance).setGoogleAppId(str);
            return this;
        }

        public Builder setGoogleAppIdBytes(j jVar) {
            copyOnWrite();
            ((ClientAppInfo) this.instance).setGoogleAppIdBytes(jVar);
            return this;
        }

        private Builder() {
            super(ClientAppInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        ClientAppInfo clientAppInfo = new ClientAppInfo();
        DEFAULT_INSTANCE = clientAppInfo;
        GeneratedMessageLite.registerDefaultInstance(ClientAppInfo.class, clientAppInfo);
    }

    private ClientAppInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirebaseInstanceId() {
        this.bitField0_ &= -3;
        this.firebaseInstanceId_ = getDefaultInstance().getFirebaseInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    public static ClientAppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientAppInfo parseDelimitedFrom(InputStream inputStream) {
        return (ClientAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientAppInfo parseFrom(ByteBuffer byteBuffer) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u0<ClientAppInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirebaseInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.firebaseInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirebaseInstanceIdBytes(j jVar) {
        this.firebaseInstanceId_ = jVar.n();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppIdBytes(j jVar) {
        this.googleAppId_ = jVar.n();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "googleAppId_", "firebaseInstanceId_"});
            case 3:
                return new ClientAppInfo();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<ClientAppInfo> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (ClientAppInfo.class) {
                        u0Var = PARSER;
                        if (u0Var == null) {
                            u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                            PARSER = u0Var;
                        }
                    }
                }
                return u0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
    public String getFirebaseInstanceId() {
        return this.firebaseInstanceId_;
    }

    @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
    public j getFirebaseInstanceIdBytes() {
        return j.d(this.firebaseInstanceId_);
    }

    @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
    public j getGoogleAppIdBytes() {
        return j.d(this.googleAppId_);
    }

    @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
    public boolean hasFirebaseInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.inappmessaging.ClientAppInfoOrBuilder
    public boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ClientAppInfo clientAppInfo) {
        return DEFAULT_INSTANCE.createBuilder(clientAppInfo);
    }

    public static ClientAppInfo parseDelimitedFrom(InputStream inputStream, q qVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static ClientAppInfo parseFrom(ByteBuffer byteBuffer, q qVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static ClientAppInfo parseFrom(j jVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static ClientAppInfo parseFrom(j jVar, q qVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }

    public static ClientAppInfo parseFrom(byte[] bArr) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientAppInfo parseFrom(byte[] bArr, q qVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static ClientAppInfo parseFrom(InputStream inputStream) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientAppInfo parseFrom(InputStream inputStream, q qVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static ClientAppInfo parseFrom(k kVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static ClientAppInfo parseFrom(k kVar, q qVar) {
        return (ClientAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
    }
}
