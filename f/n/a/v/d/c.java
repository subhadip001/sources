package f.n.a.v.d;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;
import com.video_converter.video_compressor.constants.Preset;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.constants.VideoQuality;
import com.video_converter.video_compressor.dialogs.purchaseDialog.PurchaseDialogDismissedEvent;
import com.video_converter.video_compressor.dialogs.valueInputDialogue.ValueInputDialogDismissedEvent;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import e.p.c.n;
import f.n.a.v.a.j;
import f.n.a.v.o.b;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m.a.a.l;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: CustomOptionsScreenController.java */
/* loaded from: classes2.dex */
public class c implements f.n.a.v.d.b, b.a {
    public f.n.a.k.b b;
    public f.n.a.k.a c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f7135d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.k.f.a f7136e;

    /* renamed from: f  reason: collision with root package name */
    public g f7137f;

    /* renamed from: g  reason: collision with root package name */
    public n f7138g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.h.b f7139h;

    /* renamed from: i  reason: collision with root package name */
    public f.n.a.h.d.a f7140i;

    /* renamed from: j  reason: collision with root package name */
    public f.n.a.n.b f7141j;

    /* renamed from: k  reason: collision with root package name */
    public List<Item> f7142k;

    /* renamed from: l  reason: collision with root package name */
    public List<Item> f7143l;

    /* renamed from: m  reason: collision with root package name */
    public List<Item> f7144m;
    public List<Item> n;
    public List<Item> o;
    public f.n.a.m.c.a q;
    public boolean r;
    public b s;
    public RewardedAdManager t;
    public boolean a = false;
    public ProcessingInfo.b p = new ProcessingInfo.b();

    /* compiled from: CustomOptionsScreenController.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            cVar.a = true;
            cVar.p();
            c.this.f7135d = null;
        }
    }

    /* compiled from: CustomOptionsScreenController.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public c(n nVar, f.n.a.h.b bVar, f.n.a.k.a aVar, f.n.a.h.d.a aVar2) {
        this.f7138g = nVar;
        this.f7139h = bVar;
        this.f7140i = aVar2;
        this.b = aVar.d();
        this.c = aVar;
        if (bVar.f6941d == null) {
            bVar.f6941d = new f.n.a.n.b(bVar.a);
        }
        this.f7141j = bVar.f6941d;
    }

    @Override // f.n.a.v.d.b
    public void a() {
        q("DIALOG_CHANGE_PRESET", this.f7138g.getString(R.string.speed), null, this.o, false);
    }

    @Override // f.n.a.v.o.b.a
    public void b() {
        if (!User.a() && !this.a) {
            this.b.b(this.c.h(this.f7138g.getResources().getString(R.string.unlock_premium_feature), null, true), "CUSTOM_RESOLUTION");
            this.f7135d = new a();
            return;
        }
        p();
    }

    @Override // f.n.a.v.d.b
    public void c() {
        q("DIALOG_QUALITY", this.f7138g.getString(R.string.select_quality), this.f7138g.getString(R.string.select_quality_hint), this.f7144m, false);
    }

    @Override // f.n.a.v.d.b
    public void d() {
        q("DIALOG_FRAME_RATE", this.f7138g.getString(R.string.select_frame_rate), this.f7138g.getString(R.string.select_frame_rate_hint), this.n, false);
    }

    @Override // f.n.a.v.d.b
    public void e() {
        q("DIALOG_RESOLUTION", this.f7138g.getString(R.string.select_resolution), this.f7138g.getString(R.string.select_resolution_hint), this.f7142k, true);
    }

    @Override // f.n.a.v.d.b
    public void f() {
        String string = this.f7138g.getString(R.string.speed);
        q("DIALOG_CHANGE_PRESET", string, string, this.f7143l, false);
    }

    public final void g(List<Item> list, Item item) {
        for (Item item2 : list) {
            if (item2.f1395f.equals(item.f1395f)) {
                item2.f1399j = true;
            } else {
                item2.f1399j = false;
            }
        }
    }

    public final void h() {
        Log.d("AdvanceOptionsScreenCon", "dissmissProgressDialog: ");
        f.n.a.k.f.a aVar = this.f7136e;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f7136e.dismiss();
    }

    public boolean i(String str) {
        return "Original".equals(str);
    }

    public final Item j(List<Item> list) {
        for (Item item : list) {
            if (item.f1399j) {
                return item;
            }
        }
        return null;
    }

    @Override // f.n.a.v.o.b.a
    public void k(Item item, String str) {
        Preset preset;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2127713385:
                if (str.equals("DIALOG_CHANGE_PRESET")) {
                    c = 0;
                    break;
                }
                break;
            case -1978196760:
                if (str.equals("DIALOG_QUALITY")) {
                    c = 1;
                    break;
                }
                break;
            case -1621757181:
                if (str.equals("DIALOG_CUSTOM_RESOLUTION")) {
                    c = 2;
                    break;
                }
                break;
            case -1436328983:
                if (str.equals("DIALOG_FRAME_RATE")) {
                    c = 3;
                    break;
                }
                break;
            case -341420481:
                if (str.equals("DIALOG_CODEC")) {
                    c = 4;
                    break;
                }
                break;
            case 1499638787:
                if (str.equals("DIALOG_RESOLUTION")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f7138g);
                builder.setTitle(this.f7138g.getResources().getString(R.string.info)).setMessage(this.f7138g.getResources().getString(R.string.preset_premium_hint));
                builder.setPositiveButton("Subscribe", new d(this));
                builder.setNeutralButton("Cancel", new e(this));
                builder.setNegativeButton("Watch a Video", new f(this)).create().show();
                g(this.o, item);
                this.f7137f.q.setText(item.f1395f);
                ProcessingInfo.b bVar = this.p;
                String str2 = item.f1395f;
                if (str2 != null && !str2.equalsIgnoreCase("normal")) {
                    try {
                        preset = Preset.valueOf(str2.toUpperCase());
                    } catch (Exception unused) {
                        preset = Preset.NORMAL;
                    }
                } else {
                    preset = Preset.NORMAL;
                }
                bVar.s = preset;
                return;
            case 1:
                n(item);
                return;
            case 2:
            case 5:
                o(item);
                return;
            case 3:
                m(item);
                return;
            case 4:
                g(this.f7143l, item);
                this.f7137f.n.setText(item.f1395f);
                return;
            default:
                return;
        }
    }

    public final f.n.a.k.f.a l() {
        if (this.f7136e == null) {
            this.f7136e = new f.n.a.k.f.a(this.f7138g, null, null);
        }
        return this.f7136e;
    }

    public final void m(Item item) {
        g(this.n, item);
        this.f7137f.p.setText(item.f1395f);
        if (!i(item.f1395f) && !i(item.f1396g)) {
            Objects.requireNonNull(this.f7141j);
            this.p.J = Double.parseDouble(item.f1395f);
            return;
        }
        Objects.requireNonNull(this.f7141j);
        this.p.J = Double.parseDouble(IdManager.DEFAULT_VERSION_NAME);
    }

    public final void n(Item item) {
        VideoQuality videoQuality;
        g(this.f7144m, item);
        this.f7137f.o.setText(item.f1395f);
        f.n.a.n.b bVar = this.f7141j;
        Objects.requireNonNull(bVar);
        if (item.f1395f.equals(bVar.a.getString(R.string.high))) {
            videoQuality = VideoQuality.HIGH;
        } else {
            videoQuality = item.f1395f.equals(bVar.a.getString(R.string.medium)) ? VideoQuality.MEDIUM : VideoQuality.LOW;
        }
        this.p.K = videoQuality;
    }

    public final void o(Item item) {
        g(this.f7142k, item);
        this.f7137f.f7151m.setText(item.f1395f);
        if (i(item.f1395f)) {
            return;
        }
        int c = this.f7139h.a().c(item.f1395f);
        if (!this.r) {
            f.n.a.m.c.a aVar = this.q;
            if (!(aVar.n < aVar.o)) {
                this.p.o = c;
                return;
            }
        }
        this.p.n = c;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onPurchaseEvent(PurchaseDialogDismissedEvent purchaseDialogDismissedEvent) {
        String str = purchaseDialogDismissedEvent.a;
        if (str == null) {
            return;
        }
        str.hashCode();
        if (str.equals("CUSTOM_RESOLUTION")) {
            int ordinal = purchaseDialogDismissedEvent.b.ordinal();
            if (ordinal == 0) {
                j.k(this.f7138g);
                return;
            }
            if (ordinal != 1) {
                return;
            }
            if (f.l.b.c.i(this.f7138g)) {
                StringBuilder A = f.a.b.a.a.A("checkNetworkAndShowRewardedAd: TEEEST ");
                A.append(this.t == null);
                Log.d("AdvanceOptionsScreenCon", A.toString());
                this.t.o(new Runnable() { // from class: f.n.a.v.d.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        Objects.requireNonNull(cVar);
                        Log.d("AdvanceOptionsScreenCon", "executePendingTask: ");
                        if (cVar.f7135d != null) {
                            new Handler().post(cVar.f7135d);
                        } else {
                            cVar.h();
                            cVar.f7135d = null;
                        }
                        Log.d("AdvanceOptionsScreenCon", "showPremiumActivated: ");
                        if (!cVar.l().isShowing()) {
                            cVar.l().show();
                        }
                        cVar.l().a();
                        cVar.h();
                    }
                });
                this.t.k(this.f7138g);
                return;
            }
            this.b.b(this.c.f(), "NETWORK_UNAVAILABLE_DIALOG");
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onValueInputEvent(ValueInputDialogDismissedEvent valueInputDialogDismissedEvent) {
        boolean z;
        if (valueInputDialogDismissedEvent.b != ValueInputDialogDismissedEvent.ClickedButton.POSITIVE) {
            return;
        }
        String p = f.a.b.a.a.p(valueInputDialogDismissedEvent.c, "P");
        Iterator<Item> it = this.f7142k.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().f1395f.equalsIgnoreCase(p)) {
                z = true;
                break;
            }
        }
        Item item = new Item(p, true);
        if (!z) {
            this.f7142k.add(0, item);
        }
        k(item, "DIALOG_CUSTOM_RESOLUTION");
        g(this.f7142k, item);
    }

    public final void p() {
        try {
            f.n.a.k.j.a.m("DIALOG_CUSTOM_RESOLUTION", this.f7138g.getResources().getString(R.string.resolution), this.f7138g.getString(R.string.custom_res_hint), "", this.f7138g.getString(R.string.set_txt), this.f7138g.getString(R.string.cancel), "neutral").show(this.f7138g.H(), "customRes");
        } catch (Exception e2) {
            FirebaseCrashlytics.getInstance().recordException(e2);
        }
    }

    public void q(String str, String str2, String str3, List<Item> list, boolean z) {
        ((f.n.a.v.q.d) this.s).f7385e.b.C.setChecked(true);
        Bundle a2 = this.f7140i.a(str2, str3, list, z);
        f.n.a.v.o.b bVar = new f.n.a.v.o.b();
        bVar.setArguments(a2);
        bVar.f7364f = this;
        bVar.show(this.f7138g.H(), str);
    }

    public final void r() {
        o(j(this.f7142k));
        n(j(this.f7144m));
        m(j(this.n));
    }
}
