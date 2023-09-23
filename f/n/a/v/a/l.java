package f.n.a.v.a;

import android.content.DialogInterface;

/* compiled from: Utilities.java */
/* loaded from: classes2.dex */
public class l implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DialogInterface.OnClickListener f7094f;

    public l(DialogInterface.OnClickListener onClickListener) {
        this.f7094f = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f7094f.onClick(dialogInterface, i2);
    }
}
