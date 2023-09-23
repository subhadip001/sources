package j.a;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class h1 {
    public static final j.a.y1.s a = new j.a.y1.s("COMPLETING_ALREADY");
    public static final j.a.y1.s b = new j.a.y1.s("COMPLETING_WAITING_CHILDREN");
    public static final j.a.y1.s c = new j.a.y1.s("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    public static final j.a.y1.s f8751d = new j.a.y1.s("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    public static final j.a.y1.s f8752e = new j.a.y1.s("SEALED");

    /* renamed from: f  reason: collision with root package name */
    public static final o0 f8753f = new o0(false);

    /* renamed from: g  reason: collision with root package name */
    public static final o0 f8754g = new o0(true);

    public static final Object a(Object obj) {
        x0 x0Var;
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        return (y0Var == null || (x0Var = y0Var.a) == null) ? obj : x0Var;
    }
}
