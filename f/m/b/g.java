package f.m.b;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import f.m.b.x;

/* compiled from: ContentStreamRequestHandler.java */
/* loaded from: classes2.dex */
public class g extends x {
    public final Context a;

    public g(Context context) {
        this.a = context;
    }

    @Override // f.m.b.x
    public boolean c(v vVar) {
        return FirebaseAnalytics.Param.CONTENT.equals(vVar.c.getScheme());
    }

    @Override // f.m.b.x
    public x.a f(v vVar, int i2) {
        return new x.a(l.o.f(this.a.getContentResolver().openInputStream(vVar.c)), Picasso.LoadedFrom.DISK);
    }
}
