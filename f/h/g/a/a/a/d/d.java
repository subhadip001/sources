package f.h.g.a.a.a.d;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;
import f.h.h.y;
import java.util.List;
import java.util.Objects;

/* compiled from: FetchEligibleCampaignsRequest.java */
/* loaded from: classes2.dex */
public final class d extends GeneratedMessageLite<d, b> implements Object {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final d DEFAULT_INSTANCE;
    private static volatile u0<d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private f.h.d.a.a.a.b clientSignals_;
    private c requestingClientApp_;
    private String projectNumber_ = "";
    private y.i<f.h.g.a.a.a.d.a> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: FetchEligibleCampaignsRequest.java */
    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.a<d, b> implements Object {
        public b() {
            super(d.DEFAULT_INSTANCE);
        }

        public b(a aVar) {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
    }

    public static void b(d dVar, String str) {
        Objects.requireNonNull(dVar);
        str.getClass();
        dVar.projectNumber_ = str;
    }

    public static void c(d dVar, Iterable iterable) {
        y.i<f.h.g.a.a.a.d.a> iVar = dVar.alreadySeenCampaigns_;
        if (!iVar.m0()) {
            dVar.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(iVar);
        }
        f.h.h.a.addAll(iterable, (List) dVar.alreadySeenCampaigns_);
    }

    public static void d(d dVar, f.h.d.a.a.a.b bVar) {
        Objects.requireNonNull(dVar);
        bVar.getClass();
        dVar.clientSignals_ = bVar;
    }

    public static void e(d dVar, c cVar) {
        Objects.requireNonNull(dVar);
        cVar.getClass();
        dVar.requestingClientApp_ = cVar;
    }

    public static d f() {
        return DEFAULT_INSTANCE;
    }

    public static b g() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", f.h.g.a.a.a.d.a.class, "clientSignals_"});
            case 3:
                return new d();
            case 4:
                return new b(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<d> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (d.class) {
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
