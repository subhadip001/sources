package f.j.b.b;

import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.v.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: BillingDao_Impl.java */
/* loaded from: classes2.dex */
public class c implements Callable<List<f.j.b.c.a>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f6577f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f6578g;

    public c(b bVar, h hVar) {
        this.f6578g = bVar;
        this.f6577f = hVar;
    }

    @Override // java.util.concurrent.Callable
    public List<f.j.b.c.a> call() {
        int i2;
        boolean z;
        int i3;
        Integer valueOf;
        Cursor b = e.v.n.b.b(this.f6578g.a, this.f6577f, false, null);
        try {
            int g2 = e.p.a.g(b, "title");
            int g3 = e.p.a.g(b, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
            int g4 = e.p.a.g(b, "sku");
            int g5 = e.p.a.g(b, "freeTrialPeriod");
            int g6 = e.p.a.g(b, "subscriptionPeriod");
            int g7 = e.p.a.g(b, FirebaseAnalytics.Param.PRICE);
            int g8 = e.p.a.g(b, "originalPRice");
            int g9 = e.p.a.g(b, "priceCurrencyCode");
            int g10 = e.p.a.g(b, "introductoryPrice");
            int g11 = e.p.a.g(b, "introductoryPricePeriod");
            int g12 = e.p.a.g(b, "introductoryPriceCycle");
            int g13 = e.p.a.g(b, "originalPriceAmountMicros");
            int g14 = e.p.a.g(b, "introductoryPriceAmountMicros");
            int g15 = e.p.a.g(b, "originalJson");
            int g16 = e.p.a.g(b, "iconUrl");
            int g17 = e.p.a.g(b, "description");
            int g18 = e.p.a.g(b, "selected");
            int g19 = e.p.a.g(b, "payLoad");
            int g20 = e.p.a.g(b, Chapter.KEY_ID);
            int i4 = g15;
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                String string = b.getString(g2);
                String string2 = b.getString(g3);
                String string3 = b.getString(g4);
                String string4 = b.getString(g5);
                String string5 = b.getString(g6);
                String string6 = b.getString(g7);
                String string7 = b.getString(g8);
                String string8 = b.getString(g9);
                String string9 = b.getString(g10);
                String string10 = b.getString(g11);
                int i5 = b.getInt(g12);
                long j2 = b.getLong(g13);
                long j3 = b.getLong(g14);
                int i6 = i4;
                String string11 = b.getString(i6);
                int i7 = g2;
                int i8 = g16;
                String string12 = b.getString(i8);
                g16 = i8;
                int i9 = g17;
                String string13 = b.getString(i9);
                g17 = i9;
                int i10 = g18;
                if (b.getInt(i10) != 0) {
                    g18 = i10;
                    i2 = g19;
                    z = true;
                } else {
                    g18 = i10;
                    i2 = g19;
                    z = false;
                }
                g19 = i2;
                f.j.b.c.a aVar = new f.j.b.c.a(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, i5, j2, j3, string11, string12, string13, z, b.getString(i2));
                int i11 = g14;
                int i12 = g20;
                if (b.isNull(i12)) {
                    i3 = i12;
                    valueOf = null;
                } else {
                    i3 = i12;
                    valueOf = Integer.valueOf(b.getInt(i12));
                }
                aVar.s = valueOf;
                arrayList.add(aVar);
                g2 = i7;
                g14 = i11;
                g20 = i3;
                i4 = i6;
            }
            return arrayList;
        } finally {
            b.close();
        }
    }

    public void finalize() {
        this.f6577f.release();
    }
}
