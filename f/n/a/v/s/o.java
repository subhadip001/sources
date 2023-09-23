package f.n.a.v.s;

import android.content.DialogInterface;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class o implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7452f;

    public o(j jVar) {
        this.f7452f = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f7452f.o.finish();
    }
}
