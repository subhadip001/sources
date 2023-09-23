package f.h.g.a.a.a.d;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;
import f.h.h.y;
import java.util.List;
import java.util.Objects;

/* compiled from: CampaignImpressionList.java */
/* loaded from: classes2.dex */
public final class b extends GeneratedMessageLite<b, C0147b> implements Object {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile u0<b> PARSER;
    private y.i<f.h.g.a.a.a.d.a> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: CampaignImpressionList.java */
    /* renamed from: f.h.g.a.a.a.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0147b extends GeneratedMessageLite.a<b, C0147b> implements Object {
        public C0147b() {
            super(b.DEFAULT_INSTANCE);
        }

        public C0147b(a aVar) {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
    }

    public static void b(b bVar, f.h.g.a.a.a.d.a aVar) {
        Objects.requireNonNull(bVar);
        aVar.getClass();
        y.i<f.h.g.a.a.a.d.a> iVar = bVar.alreadySeenCampaigns_;
        if (!iVar.m0()) {
            bVar.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(iVar);
        }
        bVar.alreadySeenCampaigns_.add(aVar);
    }

    public static b d() {
        return DEFAULT_INSTANCE;
    }

    public static C0147b e() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static C0147b f(b bVar) {
        return DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static u0<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public List<f.h.g.a.a.a.d.a> c() {
        return this.alreadySeenCampaigns_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", f.h.g.a.a.a.d.a.class});
            case 3:
                return new b();
            case 4:
                return new C0147b(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<b> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (b.class) {
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
}
