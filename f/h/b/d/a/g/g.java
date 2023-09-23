package f.h.b.d.a.g;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import f.h.b.d.a.e.a;
import f.h.b.d.a.e.m;
import f.h.b.d.a.e.q;
import f.h.b.d.a.e.r;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class g {
    public static final f.h.b.d.a.e.f c = new f.h.b.d.a.e.f("ReviewService");
    public q a;
    public final String b;

    public g(Context context) {
        this.b = context.getPackageName();
        if (r.b(context)) {
            this.a = new q(context, c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new m() { // from class: f.h.b.d.a.g.d
                @Override // f.h.b.d.a.e.m
                public final Object a(IBinder iBinder) {
                    int i2 = f.h.b.d.a.e.b.f5789f;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    return queryLocalInterface instanceof f.h.b.d.a.e.c ? (f.h.b.d.a.e.c) queryLocalInterface : new a(iBinder);
                }
            }, null);
        }
    }
}
