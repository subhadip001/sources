package f.h.b.d.a.e;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.play.core.review.zza;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class d extends z implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // f.h.b.d.a.e.z
    public final boolean p(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            Bundle bundle = (Bundle) a0.a(parcel, Bundle.CREATOR);
            f.h.b.d.a.g.f fVar = (f.h.b.d.a.g.f) this;
            q qVar = fVar.f5822h.a;
            if (qVar != null) {
                qVar.c(fVar.f5821g);
            }
            fVar.f5820f.d("onGetLaunchReviewFlowInfo", new Object[0]);
            fVar.f5821g.b(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
            return true;
        }
        return false;
    }
}
