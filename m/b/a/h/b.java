package m.b.a.h;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import i.l.b.i;

/* compiled from: EventLogger.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    @Override // m.b.a.h.a
    public void a(Context context, String str, Bundle bundle) {
        i.e(context, "context");
        i.e(str, "key");
        i.e(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        FirebaseAnalytics.getInstance(context).logEvent(str, bundle);
    }
}
