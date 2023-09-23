package f.n.a.c;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.inverseai.adhelper.util.AdType;

/* compiled from: FullScreenAdLoader.kt */
/* loaded from: classes2.dex */
public final class f implements f.j.a.m.a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f6911f;

    /* compiled from: FullScreenAdLoader.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            AdType.values();
            int[] iArr = new int[4];
            iArr[1] = 1;
            a = iArr;
        }
    }

    public f(h hVar) {
        this.f6911f = hVar;
    }

    @Override // f.j.a.m.a
    public void c(AdType adType) {
        i.l.b.i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
    }

    @Override // f.j.a.m.a
    public void f(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "message");
        if (a.a[adType.ordinal()] == 1) {
            this.f6911f.a(f.j.a.m.c.a.b(context));
        }
    }

    @Override // f.j.a.m.a
    public void g(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        d dVar = this.f6911f.a;
        if (dVar != null) {
            dVar.a(adType);
        }
        this.f6911f.a = null;
    }

    @Override // f.j.a.m.a
    public void h(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "message");
    }

    @Override // f.j.a.m.a
    public void j(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        e.f(context, adType);
        d dVar = this.f6911f.a;
        if (dVar == null) {
            return;
        }
        dVar.d(adType);
    }
}
