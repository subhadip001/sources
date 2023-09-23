package f.f.a;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: CrossPromoFragment.java */
/* loaded from: classes.dex */
public class c implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f3607f;

    public c(e eVar) {
        this.f3607f = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f3607f.f3614j.setVisibility(8);
        SharedPreferences.Editor edit = this.f3607f.getContext().getSharedPreferences("video_compressor_shared_pref", 0).edit();
        edit.putBoolean("key_hide_recommended_apps", true);
        edit.commit();
    }
}
