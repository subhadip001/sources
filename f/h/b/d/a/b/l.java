package f.h.b.d.a.b;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class l extends j {
    public l(r rVar, f.h.b.d.a.i.m mVar) {
        super(rVar, mVar);
    }

    @Override // f.h.b.d.a.b.j, f.h.b.d.a.e.k0
    public final void a(Bundle bundle, Bundle bundle2) {
        this.f5645g.f5688d.c(this.f5644f);
        r.f5686g.d("onGetChunkFileDescriptor", new Object[0]);
        this.f5644f.b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
