package f.h.b.a.i;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class b implements Configurator {
    public static final Configurator a = new b();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes.dex */
    public static final class a implements ObjectEncoder<f.h.b.a.i.u.a.a> {
        public static final a a = new a();
        public static final FieldDescriptor b = f.a.b.a.a.W(1, FieldDescriptor.builder("window"));
        public static final FieldDescriptor c = f.a.b.a.a.W(2, FieldDescriptor.builder("logSourceMetrics"));

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f3692d = f.a.b.a.a.W(3, FieldDescriptor.builder("globalMetrics"));

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f3693e = f.a.b.a.a.W(4, FieldDescriptor.builder("appNamespace"));

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            f.h.b.a.i.u.a.a aVar = (f.h.b.a.i.u.a.a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, aVar.a);
            objectEncoderContext2.add(c, aVar.b);
            objectEncoderContext2.add(f3692d, aVar.c);
            objectEncoderContext2.add(f3693e, aVar.f3718d);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: f.h.b.a.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0096b implements ObjectEncoder<f.h.b.a.i.u.a.b> {
        public static final C0096b a = new C0096b();
        public static final FieldDescriptor b = f.a.b.a.a.W(1, FieldDescriptor.builder("storageMetrics"));

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(b, ((f.h.b.a.i.u.a.b) obj).a);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes.dex */
    public static final class c implements ObjectEncoder<LogEventDropped> {
        public static final c a = new c();
        public static final FieldDescriptor b = f.a.b.a.a.W(1, FieldDescriptor.builder("eventsDroppedCount"));
        public static final FieldDescriptor c = f.a.b.a.a.W(3, FieldDescriptor.builder("reason"));

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, logEventDropped.a);
            objectEncoderContext2.add(c, logEventDropped.b);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes.dex */
    public static final class d implements ObjectEncoder<f.h.b.a.i.u.a.c> {
        public static final d a = new d();
        public static final FieldDescriptor b = f.a.b.a.a.W(1, FieldDescriptor.builder("logSource"));
        public static final FieldDescriptor c = f.a.b.a.a.W(2, FieldDescriptor.builder("logEventDropped"));

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            f.h.b.a.i.u.a.c cVar = (f.h.b.a.i.u.a.c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, cVar.a);
            objectEncoderContext2.add(c, cVar.b);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes.dex */
    public static final class e implements ObjectEncoder<j> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.of("clientMetrics");

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(b, ((j) obj).a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes.dex */
    public static final class f implements ObjectEncoder<f.h.b.a.i.u.a.d> {
        public static final f a = new f();
        public static final FieldDescriptor b = f.a.b.a.a.W(1, FieldDescriptor.builder("currentCacheSizeBytes"));
        public static final FieldDescriptor c = f.a.b.a.a.W(2, FieldDescriptor.builder("maxCacheSizeBytes"));

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            f.h.b.a.i.u.a.d dVar = (f.h.b.a.i.u.a.d) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, dVar.a);
            objectEncoderContext2.add(c, dVar.b);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes.dex */
    public static final class g implements ObjectEncoder<f.h.b.a.i.u.a.e> {
        public static final g a = new g();
        public static final FieldDescriptor b = f.a.b.a.a.W(1, FieldDescriptor.builder("startMs"));
        public static final FieldDescriptor c = f.a.b.a.a.W(2, FieldDescriptor.builder("endMs"));

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            f.h.b.a.i.u.a.e eVar = (f.h.b.a.i.u.a.e) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, eVar.a);
            objectEncoderContext2.add(c, eVar.b);
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(j.class, e.a);
        encoderConfig.registerEncoder(f.h.b.a.i.u.a.a.class, a.a);
        encoderConfig.registerEncoder(f.h.b.a.i.u.a.e.class, g.a);
        encoderConfig.registerEncoder(f.h.b.a.i.u.a.c.class, d.a);
        encoderConfig.registerEncoder(LogEventDropped.class, c.a);
        encoderConfig.registerEncoder(f.h.b.a.i.u.a.b.class, C0096b.a);
        encoderConfig.registerEncoder(f.h.b.a.i.u.a.d.class, f.a);
    }
}
