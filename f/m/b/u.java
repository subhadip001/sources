package f.m.b;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;

/* compiled from: RemoteViewsAction.java */
/* loaded from: classes2.dex */
public abstract class u extends f.m.b.a<b> {

    /* renamed from: m  reason: collision with root package name */
    public final RemoteViews f6879m;
    public final int n;
    public e o;
    public b p;

    /* compiled from: RemoteViewsAction.java */
    /* loaded from: classes2.dex */
    public static class a extends u {
        public final int q;
        public final String r;
        public final Notification s;

        public a(Picasso picasso, v vVar, RemoteViews remoteViews, int i2, int i3, Notification notification, String str, int i4, int i5, String str2, Object obj, int i6, e eVar) {
            super(picasso, vVar, remoteViews, i2, i6, i4, i5, null, str2, eVar);
            this.q = i3;
            this.r = str;
            this.s = notification;
        }

        @Override // f.m.b.a
        public b d() {
            if (this.p == null) {
                this.p = new b(this.f6879m, this.n);
            }
            return this.p;
        }

        @Override // f.m.b.u
        public void e() {
            Context context = this.a.f1330e;
            StringBuilder sb = d0.a;
            ((NotificationManager) context.getSystemService("notification")).notify(this.r, this.q, this.s);
        }
    }

    /* compiled from: RemoteViewsAction.java */
    /* loaded from: classes2.dex */
    public static class b {
        public final RemoteViews a;
        public final int b;

        public b(RemoteViews remoteViews, int i2) {
            this.a = remoteViews;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }
    }

    public u(Picasso picasso, v vVar, RemoteViews remoteViews, int i2, int i3, int i4, int i5, Object obj, String str, e eVar) {
        super(picasso, null, vVar, i4, i5, i3, null, str, obj, false);
        this.f6879m = remoteViews;
        this.n = i2;
        this.o = eVar;
    }

    @Override // f.m.b.a
    public void a() {
        this.f6818l = true;
        if (this.o != null) {
            this.o = null;
        }
    }

    @Override // f.m.b.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.f6879m.setImageViewBitmap(this.n, bitmap);
        e();
        e eVar = this.o;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // f.m.b.a
    public void c(Exception exc) {
        int i2 = this.f6813g;
        if (i2 != 0) {
            this.f6879m.setImageViewResource(this.n, i2);
            e();
        }
        e eVar = this.o;
        if (eVar != null) {
            eVar.b(exc);
        }
    }

    public abstract void e();
}
