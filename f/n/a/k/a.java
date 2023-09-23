package f.n.a.k;

import android.app.Activity;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.common.DialogEnterAnimation;
import e.p.c.n;
import f.c.a.a.h;
import f.c.a.a.o;
import f.n.a.z.c;
import i.l.b.i;
import java.util.Locale;
import java.util.Objects;

/* compiled from: DialogFactory.java */
/* loaded from: classes2.dex */
public class a {
    public Activity a;
    public b b;

    public a(Activity activity) {
        this.a = activity;
    }

    public f.n.a.k.g.a a() {
        return f.n.a.k.g.a.m("Original Delete Fail", this.a.getString(R.string.original_delete_fail_message), this.a.getString(R.string.dismiss), null);
    }

    public f.n.a.k.g.a b() {
        return f.n.a.k.g.a.m(this.a.getString(R.string.warning), this.a.getString(R.string.delete_file_warning_message), this.a.getString(R.string.yes), this.a.getString(R.string.no));
    }

    public f.n.a.k.g.a c() {
        return f.n.a.k.g.a.m(this.a.getString(R.string.warning), this.a.getString(R.string.delete_file_original_warning_message), this.a.getString(R.string.yes), this.a.getString(R.string.no));
    }

    public b d() {
        if (this.b == null) {
            this.b = new b(((n) this.a).H());
        }
        return this.b;
    }

    public f.n.a.k.g.a e(String str) {
        return f.n.a.k.g.a.m(this.a.getString(R.string.file_save_in), str, this.a.getString(R.string.dismiss), null);
    }

    public f.n.a.k.e.a f() {
        return f.n.a.k.e.a.m(this.a.getString(R.string.network_unavailable_msg), this.a.getString(R.string.ok));
    }

    public f.n.a.k.h.a g() {
        String format = String.format(Locale.US, "%s %s", this.a.getString(R.string.content_file_limit), this.a.getString(R.string.purchase_dialog_content));
        f.n.a.k.h.a aVar = new f.n.a.k.h.a();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_CONTENT", format);
        bundle.putString("ARG_NEGATIVE_BTN_LABEL", null);
        bundle.putBoolean("ARG_VIDEO", true);
        aVar.setArguments(bundle);
        aVar.f6974h = DialogEnterAnimation.SLIDE_IN_FROM_RIGHT;
        return aVar;
    }

    public f.n.a.k.h.a h(String str, String str2, boolean z) {
        f.n.a.k.h.a aVar = new f.n.a.k.h.a();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_CONTENT", str2);
        bundle.putString("ARG_TITLE", str);
        bundle.putString("ARG_NEGATIVE_BTN_LABEL", null);
        bundle.putBoolean("ARG_VIDEO", z);
        aVar.setArguments(bundle);
        aVar.f6974h = DialogEnterAnimation.SLIDE_IN_FROM_RIGHT;
        return aVar;
    }

    public void i(h hVar, String str) {
        n nVar = (n) this.a;
        i.e(hVar, "payload");
        Bundle bundle = new Bundle();
        bundle.putSerializable("details.extra", hVar);
        o oVar = new o();
        oVar.setArguments(bundle);
        oVar.f3131f = new f.n.a.k.d.a(nVar, str);
        Objects.requireNonNull(c.a());
        Bundle bundle2 = new Bundle();
        bundle2.putString("impression", str);
        FirebaseAnalytics.getInstance(nVar).logEvent("sale_banner_dialog_events", bundle2);
        oVar.show(nVar.H(), "");
    }

    public f.n.a.k.e.a j() {
        return f.n.a.k.e.a.m(this.a.getString(R.string.selected_files_retrieve_error), this.a.getString(R.string.dismiss));
    }
}
