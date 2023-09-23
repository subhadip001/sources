package f.h.b.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class b implements Configurator {
    public static final Configurator a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class a implements ObjectEncoder<f.h.b.a.h.e.a> {
        public static final a a = new a();
        public static final FieldDescriptor b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        public static final FieldDescriptor c = FieldDescriptor.of("model");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f3651d = FieldDescriptor.of("hardware");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f3652e = FieldDescriptor.of("device");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f3653f = FieldDescriptor.of("product");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f3654g = FieldDescriptor.of("osBuild");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f3655h = FieldDescriptor.of("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f3656i = FieldDescriptor.of("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f3657j = FieldDescriptor.of("locale");

        /* renamed from: k  reason: collision with root package name */
        public static final FieldDescriptor f3658k = FieldDescriptor.of("country");

        /* renamed from: l  reason: collision with root package name */
        public static final FieldDescriptor f3659l = FieldDescriptor.of("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        public static final FieldDescriptor f3660m = FieldDescriptor.of("applicationBuild");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            f.h.b.a.h.e.a aVar = (f.h.b.a.h.e.a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, aVar.l());
            objectEncoderContext2.add(c, aVar.i());
            objectEncoderContext2.add(f3651d, aVar.e());
            objectEncoderContext2.add(f3652e, aVar.c());
            objectEncoderContext2.add(f3653f, aVar.k());
            objectEncoderContext2.add(f3654g, aVar.j());
            objectEncoderContext2.add(f3655h, aVar.g());
            objectEncoderContext2.add(f3656i, aVar.d());
            objectEncoderContext2.add(f3657j, aVar.f());
            objectEncoderContext2.add(f3658k, aVar.b());
            objectEncoderContext2.add(f3659l, aVar.h());
            objectEncoderContext2.add(f3660m, aVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: f.h.b.a.h.e.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095b implements ObjectEncoder<j> {
        public static final C0095b a = new C0095b();
        public static final FieldDescriptor b = FieldDescriptor.of("logRequest");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(b, ((j) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class c implements ObjectEncoder<ClientInfo> {
        public static final c a = new c();
        public static final FieldDescriptor b = FieldDescriptor.of("clientType");
        public static final FieldDescriptor c = FieldDescriptor.of("androidClientInfo");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, clientInfo.b());
            objectEncoderContext2.add(c, clientInfo.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class d implements ObjectEncoder<k> {
        public static final d a = new d();
        public static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.of("eventCode");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f3661d = FieldDescriptor.of("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f3662e = FieldDescriptor.of("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f3663f = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f3664g = FieldDescriptor.of("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f3665h = FieldDescriptor.of("networkConnectionInfo");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            k kVar = (k) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, kVar.b());
            objectEncoderContext2.add(c, kVar.a());
            objectEncoderContext2.add(f3661d, kVar.c());
            objectEncoderContext2.add(f3662e, kVar.e());
            objectEncoderContext2.add(f3663f, kVar.f());
            objectEncoderContext2.add(f3664g, kVar.g());
            objectEncoderContext2.add(f3665h, kVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class e implements ObjectEncoder<l> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.of("requestTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.of("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f3666d = FieldDescriptor.of("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f3667e = FieldDescriptor.of("logSource");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f3668f = FieldDescriptor.of("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f3669g = FieldDescriptor.of("logEvent");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f3670h = FieldDescriptor.of("qosTier");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            l lVar = (l) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, lVar.f());
            objectEncoderContext2.add(c, lVar.g());
            objectEncoderContext2.add(f3666d, lVar.a());
            objectEncoderContext2.add(f3667e, lVar.c());
            objectEncoderContext2.add(f3668f, lVar.d());
            objectEncoderContext2.add(f3669g, lVar.b());
            objectEncoderContext2.add(f3670h, lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class f implements ObjectEncoder<NetworkConnectionInfo> {
        public static final f a = new f();
        public static final FieldDescriptor b = FieldDescriptor.of("networkType");
        public static final FieldDescriptor c = FieldDescriptor.of("mobileSubtype");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, networkConnectionInfo.b());
            objectEncoderContext2.add(c, networkConnectionInfo.a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C0095b c0095b = C0095b.a;
        encoderConfig.registerEncoder(j.class, c0095b);
        encoderConfig.registerEncoder(f.h.b.a.h.e.d.class, c0095b);
        e eVar = e.a;
        encoderConfig.registerEncoder(l.class, eVar);
        encoderConfig.registerEncoder(g.class, eVar);
        c cVar = c.a;
        encoderConfig.registerEncoder(ClientInfo.class, cVar);
        encoderConfig.registerEncoder(f.h.b.a.h.e.e.class, cVar);
        a aVar = a.a;
        encoderConfig.registerEncoder(f.h.b.a.h.e.a.class, aVar);
        encoderConfig.registerEncoder(f.h.b.a.h.e.c.class, aVar);
        d dVar = d.a;
        encoderConfig.registerEncoder(k.class, dVar);
        encoderConfig.registerEncoder(f.h.b.a.h.e.f.class, dVar);
        f fVar = f.a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, fVar);
        encoderConfig.registerEncoder(i.class, fVar);
    }
}
