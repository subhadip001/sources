package defpackage;

/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public /* synthetic */ class b {
    public static /* synthetic */ int a(double d2) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
