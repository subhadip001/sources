package f.l.a.d.f.a;

import android.net.Uri;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import f.l.a.d.c.a;
import i.l.b.i;

/* compiled from: GetAudioDetailsFromUriUseCase.kt */
/* loaded from: classes2.dex */
public final class a {
    public final f.l.a.b.a.a a;

    public a(f.l.a.b.a.a aVar) {
        i.e(aVar, "localMediaRepository");
        this.a = aVar;
    }

    public f.l.a.d.c.a<f.l.a.d.d.a> a(Uri uri) {
        i.e(uri, CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY);
        try {
            return new a.b(this.a.b(uri));
        } catch (Exception e2) {
            return new a.C0157a(e2, e2.getMessage());
        }
    }
}
