package f.n.a.v.s;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;
import com.video_converter.video_compressor.constants.Codec;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.FileFormat;
import com.video_converter.video_compressor.constants.Preset;
import com.video_converter.video_compressor.constants.TwoPass;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.dialogs.infoDialog.InfoDialogDismissedEvent;
import com.video_converter.video_compressor.dialogs.inputDialog.InputDialogDismissedEvent;
import com.video_converter.video_compressor.dialogs.promptdialog.PromptDialogDismissedEvent;
import com.video_converter.video_compressor.dialogs.purchaseDialog.PurchaseDialogDismissedEvent;
import com.video_converter.video_compressor.model.MediaFile;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import com.video_converter.video_compressor.processorFactory.ProcessorType;
import com.video_converter.video_compressor.screens.batchProcessingScreen.BatchScreenActivity;
import com.video_converter.video_compressor.screens.processingScreen.ProcessingScreenActivity;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import f.n.a.d.a;
import f.n.a.m.b;
import f.n.a.v.o.b;
import f.n.a.v.q.d;
import f.n.a.v.u.f;
import f.n.a.x.e;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class j implements i, e.a, d.b, b.a, b.a, f.d {
    public f.n.a.k.f.a A;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public f.n.a.v.e.c O;
    public AdLoader P;
    public RewardedAdManager Q;
    public int R;
    public Handler S;
    public c0 a;
    public h b;
    public MediaFile c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.n.e f7430d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.m.c.a f7431e;

    /* renamed from: f  reason: collision with root package name */
    public m.a.a.c f7432f;

    /* renamed from: g  reason: collision with root package name */
    public f.n.a.k.b f7433g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.k.a f7434h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7435i;

    /* renamed from: j  reason: collision with root package name */
    public f.n.a.h.c f7436j;

    /* renamed from: k  reason: collision with root package name */
    public f.n.a.d.b f7437k;

    /* renamed from: l  reason: collision with root package name */
    public f.n.a.v.g.d f7438l;

    /* renamed from: m  reason: collision with root package name */
    public f.n.a.v.g.b f7439m;
    public List<MediaFile> n;
    public e.p.c.n o;
    public f.n.a.n.d p;
    public FileFormat q;
    public f.n.a.m.b s;
    public f.n.a.h.d.a t;
    public List<Item> u;
    public f.n.a.n.b v;
    public Runnable y;
    public List<Item> z;
    public FileFormat r = FileFormat.ORIGINAL;
    public Preset w = Preset.NORMAL;
    public Codec x = Codec.X264;
    public List<f.n.a.m.c.a> B = new ArrayList();
    public List<String> C = new ArrayList();
    public List<f.n.a.m.d.a> D = new ArrayList();

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.J = true;
        }
    }

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.K = true;
        }
    }

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.L = true;
            Fragment I = jVar.o.H().I("inputDialog");
            if (I instanceof f.n.a.v.e.c) {
                ((f.n.a.v.e.c) I).k();
            }
        }
    }

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.M = true;
            Fragment I = jVar.o.H().I("inputDialog");
            if (I instanceof f.n.a.v.e.c) {
                ((f.n.a.v.e.c) I).k();
            }
        }
    }

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* compiled from: VidCompInputScreenController.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.q();
                j.this.e();
            }
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.E = true;
            jVar.y = null;
            jVar.o.runOnUiThread(new a());
        }
    }

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class f extends Handler {
        public f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                Log.d("VidCompInputScreenL", "handleMessageREC: Called");
                Locale locale = Locale.getDefault();
                Locale locale2 = e.i.h.e.a;
                if (TextUtils.getLayoutDirectionFromLocale(locale) == 0) {
                    if (j.this.a.B.canScrollHorizontally(-10)) {
                        j.this.a.f(-10);
                        j.this.S.sendEmptyMessageDelayed(0, 100L);
                    }
                } else if (j.this.a.B.canScrollHorizontally(10)) {
                    j.this.a.f(10);
                    j.this.S.sendEmptyMessageDelayed(0, 100L);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* compiled from: VidCompInputScreenController.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.J();
                j.this.q();
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.G = true;
            jVar.o.runOnUiThread(new a());
            j.this.y = null;
        }
    }

    public j(e.p.c.n nVar, f.n.a.v.c.b bVar, f.n.a.k.a aVar, f.n.a.h.b bVar2, f.n.a.h.c cVar, f.n.a.v.c.c cVar2, f.n.a.m.b bVar3, f.n.a.d.b bVar4, f.n.a.v.g.b bVar5, f.n.a.n.d dVar, f.n.a.h.d.a aVar2) {
        new ArrayList();
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = -1;
        this.S = new f();
        this.o = nVar;
        this.b = new h(bVar.a);
        this.f7434h = aVar;
        this.f7433g = aVar.d();
        this.f7436j = cVar;
        if (bVar2.b == null) {
            bVar2.b = new f.n.a.n.e();
        }
        this.f7430d = bVar2.b;
        this.t = aVar2;
        this.f7432f = m.a.a.c.b();
        this.s = bVar3;
        this.f7437k = bVar4;
        this.f7439m = bVar5;
        this.f7438l = new f.n.a.v.g.d(cVar2.a, null);
        this.p = dVar;
        if (bVar2.f6941d == null) {
            bVar2.f6941d = new f.n.a.n.b(bVar2.a);
        }
        this.v = bVar2.f6941d;
    }

    public final MediaFile A() {
        if (this.c == null) {
            this.c = (MediaFile) this.o.getIntent().getParcelableExtra("SELECTED_FILE");
        }
        return this.c;
    }

    public String B(ArrayList<f.n.a.o.h> arrayList) {
        Iterator<f.n.a.o.h> it = arrayList.iterator();
        while (it.hasNext()) {
            f.n.a.o.h next = it.next();
            if (next.f7062j && "_none".equals(next.f7059g)) {
                return "_none";
            }
            if (next.f7062j && "_default".equals(next.f7059g)) {
                return "_default";
            }
            if (next.f7062j && "_all".equals(next.f7059g)) {
                return "_all";
            }
        }
        return "";
    }

    public final FragmentManager C() {
        return this.o.H();
    }

    public final boolean D(List<f.n.a.o.h> list) {
        for (f.n.a.o.h hVar : list) {
            if (hVar.f7062j && "_none".equals(hVar.f7059g)) {
                return true;
            }
        }
        return false;
    }

    public final void E() {
        try {
            f.n.a.n.d dVar = this.p;
            CompressionProfile compressionProfile = x(u(0)).H;
            Objects.requireNonNull(dVar);
            dVar.a(compressionProfile.name());
            dVar.a("TOTAL_COMPRESSION");
            f.n.a.n.d dVar2 = this.p;
            Preset preset = this.w;
            Objects.requireNonNull(dVar2);
            dVar2.a(preset.name());
            f.n.a.n.d dVar3 = this.p;
            Codec codec = this.x;
            Objects.requireNonNull(dVar3);
            dVar3.a(codec.name());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void F(int i2, int i3) {
        if (i2 == 232 && i3 == -1 && f.n.a.u.a.e().c()) {
            f.n.a.v.a.j.n(this.o);
        }
    }

    public void G(FileFormat fileFormat) {
        Codec codec;
        this.r = fileFormat;
        Codec codec2 = this.x;
        if (codec2 == null || codec2 != (codec = Codec.X265)) {
            return;
        }
        if ((fileFormat != null && fileFormat == FileFormat.GP3) || fileFormat == FileFormat.FLV || fileFormat == FileFormat.M4V) {
            if (codec2 == null || codec2 == codec) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
                builder.setTitle(this.o.getResources().getString(R.string.warning)).setMessage(this.o.getResources().getString(R.string.hevc_unsupported_msg)).setPositiveButton(this.o.getResources().getString(R.string.ok), new t(this));
                builder.create().show();
                Codec m2 = f.l.b.c.m("X264");
                this.x = m2;
                this.a.p.setText(m2.getCodec());
                o(this.z, "X264");
            }
        }
    }

    public final void H() {
        FileFormat fileFormat = this.r;
        this.o.getString(R.string.pro);
        User.a();
        ArrayList arrayList = new ArrayList();
        if (fileFormat == null) {
            fileFormat = FileFormat.MP4;
        }
        int ordinal = fileFormat.ordinal();
        if (ordinal != 20) {
            switch (ordinal) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                case 3:
                    arrayList.add(new Item(Codec.VP8.getCodec().toUpperCase(), true));
                    break;
                case 5:
                case 12:
                case 14:
                    arrayList.add(new Item(Codec.MPEG2VIDEO.getCodec().toUpperCase(), true));
                    break;
                case 13:
                    arrayList.add(new Item(Codec.WMV2.getCodec().toUpperCase(), true));
                    break;
                default:
                    arrayList.add(new Item(Codec.LIBX264.getCodec().toUpperCase(), true));
                    break;
            }
            this.z = arrayList;
            if (arrayList == null && !arrayList.isEmpty()) {
                N(this.z.get(0));
                return;
            } else {
                this.z = new ArrayList();
            }
        }
        arrayList.add(new Item(Codec.X264.getCodec().toUpperCase(), true));
        arrayList.add(new Item(Codec.X265.getCodec().toUpperCase(), "HEVC"));
        this.z = arrayList;
        if (arrayList == null) {
        }
        this.z = new ArrayList();
    }

    public final void I() {
        String[] strArr;
        Item item;
        Item item2;
        String a2 = this.f7435i ? "Original" : this.f7430d.a(String.valueOf(A().f1372j));
        f.n.a.n.e eVar = this.f7430d;
        String string = this.o.getString(R.string.pro);
        int i2 = 0;
        boolean z = User.a() || this.H;
        Objects.requireNonNull(eVar);
        ArrayList arrayList = new ArrayList();
        for (String str : eVar.a) {
            if (str.equalsIgnoreCase(a2)) {
                item2 = new Item(str.toUpperCase(), "Original");
            } else {
                if (!str.equalsIgnoreCase("mp4") && !z) {
                    item = new Item(str.toUpperCase(), (String) null, string);
                } else {
                    item = new Item(str.toUpperCase(), (String) null);
                }
                item2 = item;
            }
            arrayList.add(item2);
        }
        if (a2.equals("Original")) {
            arrayList.add(0, new Item("Original", (String) null));
        }
        h hVar = this.b;
        boolean z2 = this.f7435i;
        Objects.requireNonNull(this.f7430d);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            String str2 = ((Item) arrayList.get(i3)).f1396g;
            if (str2 != null && str2.equals("Original")) {
                i2 = i3;
                break;
            }
            i3++;
        }
        c0 c0Var = hVar.b;
        c0Var.x.clear();
        c0Var.x.addAll(arrayList);
        c0Var.x.notifyDataSetChanged();
        if (z2) {
            hVar.b.o.setSelection(i2);
        } else {
            hVar.b.n.setSelection(i2);
        }
    }

    public final void J() {
        TwoPass twoPass;
        this.p.b("watch_preview");
        f.n.a.v.l.a aVar = new f.n.a.v.l.a();
        Bundle bundle = new Bundle();
        ProcessingInfo x = x(this.B.get(0));
        f.n.a.m.c.a aVar2 = this.B.get(0);
        if (x != null) {
            x.f1375f = String.valueOf(aVar2.f7024l);
            x.f1376g = aVar2.b();
            x.f1380k = aVar2.f7023k;
            x.f1381l = aVar2.t;
            x.f1379j = aVar2.c();
            int i2 = x.B;
            if (i2 != 100 && i2 != 0) {
                x.n = ((int) ((aVar2.n / 100.0d) * i2)) & (-2);
                x.o = ((int) ((aVar2.o / 100.0d) * i2)) & (-2);
            } else {
                int i3 = x.n;
                if (i3 == 0 && x.o == 0) {
                    x.n = aVar2.n;
                    x.o = aVar2.o;
                } else if (i3 != 0 && x.o == 0) {
                    int i4 = aVar2.n;
                    int i5 = aVar2.o;
                    if (i4 < i5) {
                        x.o = ((int) ((i3 / i4) * i5)) & (-2);
                    } else {
                        x.o = i3;
                        x.n = ((int) ((i3 / i5) * i4)) & (-2);
                    }
                }
            }
            int i6 = x.C;
            if (i6 != 100 && i6 != 0) {
                if (!(x.H == CompressionProfile.FIXED_SIZE_COMPRESSION && (twoPass = x.t) != null && twoPass == TwoPass.PASS_1)) {
                    x.f1382m = ((int) ((aVar2.f7025m / 100.0d) * i6)) & (-2);
                }
            }
            int i7 = aVar2.n;
            int i8 = aVar2.o;
            if (i7 < i8) {
                x.w = x.n != i7;
            } else {
                x.w = x.o != i8;
            }
            bundle.putSerializable("PROCESSING_INFO_KEY", x);
            bundle.putString("selected_format", this.r.getExtension());
            aVar.setArguments(bundle);
            Objects.requireNonNull(this.a);
            try {
                e.p.c.a aVar3 = new e.p.c.a(C());
                aVar3.p = true;
                aVar3.h(R.id.fragment_container_fullScreen, aVar, null);
                aVar3.c(null);
                aVar3.e();
                return;
            } catch (Exception unused) {
                f.l.b.c.n(this.o);
                return;
            }
        }
        throw new IllegalStateException("ProcessingInfo must be provided before calling this");
    }

    public final void K() {
        if (!z().isShowing()) {
            z().show();
        }
        z().a();
    }

    public final void L(String str) {
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1423642430:
                if (str.equals("purchase_for_batch_limit")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1270416853:
                if (str.equals("purchase_for_format")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1115632498:
                if (str.equals("purchase_for_cut")) {
                    c2 = 2;
                    break;
                }
                break;
            case -432381768:
                if (str.equals("purchase_for_all_audio_streams")) {
                    c2 = 3;
                    break;
                }
                break;
            case -386602076:
                if (str.equals("purchase_for_watch_preview")) {
                    c2 = 4;
                    break;
                }
                break;
            case 660509004:
                if (str.equals("purchase_for_subtitle")) {
                    c2 = 5;
                    break;
                }
                break;
            case 902255070:
                if (str.equals("purchase_for_all_subtitle_streams")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1617134370:
                if (str.equals("purchase_for_audio")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1618802530:
                if (str.equals("purchase_for_codec")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1633609619:
                if (str.equals("purchase_for_speed")) {
                    c2 = '\t';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f7434h.d().b(this.f7434h.g(), "purchase_for_batch_limit");
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                this.f7433g.b(this.f7434h.h(this.o.getResources().getString(R.string.unlock_premium_feature), "You can use this feature by being a premium user or watching Ad", true), str);
                return;
            default:
                return;
        }
    }

    public void M(String str, String str2, String str3, List<Item> list) {
        Bundle a2 = this.t.a(str2, str3, list, false);
        f.n.a.v.o.b bVar = new f.n.a.v.o.b();
        bVar.setArguments(a2);
        bVar.f7364f = this;
        bVar.show(this.o.H(), str);
    }

    public final void N(Item item) {
        Codec m2 = f.l.b.c.m(item.f1395f);
        this.x = m2;
        this.a.p.setText(m2.getCodec());
        o(this.z, item.f1395f);
    }

    public void O(boolean z) {
        if (z) {
            this.b.b.u.setVisibility(0);
        } else {
            this.b.b.u.setVisibility(8);
        }
    }

    public void P(Item item) {
        Preset preset;
        o(this.u, item.f1395f);
        this.a.f7421k.setText(item.f1395f);
        String str = item.f1398i;
        if (str != null && !str.equalsIgnoreCase("normal")) {
            try {
                preset = Preset.valueOf(str.toUpperCase());
            } catch (Exception unused) {
                preset = Preset.NORMAL;
            }
        } else {
            preset = Preset.NORMAL;
        }
        this.w = preset;
    }

    public final void a(String str, boolean z, boolean z2, boolean z3, int i2, String str2, String str3, List<f.n.a.o.h> list) {
        Iterator<MediaFile> it;
        boolean z4 = z3;
        String str4 = str2;
        Iterator<MediaFile> it2 = this.n.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            MediaFile next = it2.next();
            Log.d("VidCompInputScreenL", "test data : " + i3);
            int i4 = i3 + 1;
            f.n.a.m.c.a u = u(i3);
            ProcessingInfo x = x(u);
            x.f1377h = String.valueOf(next.f1372j);
            f.n.a.n.e eVar = this.f7430d;
            x.p = eVar.b(eVar.a(String.valueOf(next.f1372j)));
            x.I = z2;
            x.q(z4);
            if (this.r == null) {
                this.r = FileFormat.MP4;
            }
            FileFormat fileFormat = this.r;
            if (fileFormat == FileFormat.ORIGINAL) {
                x.q = v(this.f7430d.a(x.f1377h));
            } else {
                x.q = fileFormat;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (true) {
                it = it2;
                if (i5 >= u.a().size()) {
                    break;
                }
                int i6 = i4;
                StringBuilder A = f.a.b.a.a.A("Audio ");
                MediaFile mediaFile = next;
                int i7 = i5 + 1;
                A.append(i7);
                arrayList.add(new f.n.a.o.h(A.toString(), u.a().get(i5).f7030f, null, false, (i5 == 0 && "_default".equals(str4)) || "_all".equals(str4)));
                i5 = i7;
                it2 = it;
                i4 = i6;
                next = mediaFile;
            }
            MediaFile mediaFile2 = next;
            int i8 = i4;
            int i9 = 0;
            while (i9 < u.d().size()) {
                StringBuilder A2 = f.a.b.a.a.A("Subtitle ");
                int i10 = i9 + 1;
                A2.append(i10);
                arrayList2.add(new f.n.a.o.h(A2.toString(), u.d().get(i9).f7030f, null, false, (i9 == 0 && "_default".equals(str3)) || "_all".equals(str3)));
                i9 = i10;
            }
            boolean equals = "_none".equals(str4);
            boolean equals2 = "_none".equals(str3);
            int t = t(u.f7024l, i2);
            Log.d("VidCompInputScreenL", "Test data: " + equals + " " + equals2 + " " + t);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                f.n.a.o.h hVar = (f.n.a.o.h) it3.next();
                StringBuilder A3 = f.a.b.a.a.A("Test data audio: ");
                A3.append(hVar.f7062j);
                A3.append(" ");
                A3.append(hVar.f7059g);
                Log.d("VidCompInputScreenL", A3.toString());
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                f.n.a.o.h hVar2 = (f.n.a.o.h) it4.next();
                StringBuilder A4 = f.a.b.a.a.A("Test data subtitle: ");
                A4.append(hVar2.f7062j);
                A4.append(" ");
                A4.append(hVar2.f7059g);
                Log.d("VidCompInputScreenL", A4.toString());
            }
            x.n(arrayList);
            x.I = equals;
            x.t(arrayList2);
            x.m(list);
            x.p(equals2);
            if (!z4) {
                x.f1375f = String.valueOf(t);
            }
            x.s = this.w;
            x.r = this.x;
            x.y = x.p != x.q;
            e.p.c.n nVar = this.o;
            String b2 = z ? mediaFile2.b() : str;
            String extension = x.q.getExtension();
            List<String> list2 = this.C;
            String h2 = f.l.b.c.h(b2);
            if (new File(f.l.b.c.f(b2, extension)).exists() || (!list2.isEmpty() && list2.contains(h2))) {
                int intValue = ((Integer) f.l.b.c.b(nVar, Integer.class, "batch_name_counter")).intValue() + 1;
                while (true) {
                    String str5 = f.l.b.c.h(b2) + "_" + intValue;
                    if (!(new File(f.l.b.c.f(str5, extension)).exists() || (!list2.isEmpty() && list2.contains(str5)))) {
                        break;
                    }
                    intValue++;
                }
                f.l.b.c.j(nVar, Integer.class, "batch_name_counter", Integer.valueOf(intValue));
                h2 = f.l.b.c.h(b2) + "_" + intValue;
            }
            list2.add(h2);
            x.f1378i = new File(f.l.b.c.f(h2, extension)).getPath();
            f.n.a.d.b bVar = this.f7437k;
            a.C0170a c0170a = new a.C0170a();
            c0170a.b = x;
            c0170a.a = mediaFile2;
            c0170a.f6924d = ProcessorType.VIDEO_COMPRESSOR;
            bVar.a(new f.n.a.d.a(c0170a));
            z4 = z3;
            str4 = str2;
            it2 = it;
            i3 = i8;
        }
    }

    @Override // f.n.a.v.o.b.a
    public void b() {
    }

    @Override // f.n.a.x.e.a
    public void c() {
        this.b.a();
        this.f7433g.b(this.f7434h.j(), "selected_files_retrieve_error_dialog");
    }

    @Override // f.n.a.v.s.i
    public void d() {
        Log.d("VidCompInputScreenL", "onCompressBtnClicked: ");
        List<f.n.a.m.c.a> list = this.B;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = this.B.get(0).w;
        if (str == null) {
            str = "";
        }
        boolean z = this.f7435i;
        int i2 = (z || this.B.size() < 1) ? 0 : this.B.get(0).f7024l;
        ArrayList<f.n.a.o.h> s = s();
        ArrayList arrayList = new ArrayList();
        if (!this.f7435i && this.B.size() >= 1) {
            f.n.a.m.c.a aVar = this.B.get(0);
            arrayList.add(new f.n.a.o.h("None", "_none", null, false, true));
            int i3 = 0;
            while (i3 < aVar.d().size()) {
                f.n.a.m.d.b bVar = aVar.d().get(i3);
                StringBuilder A = f.a.b.a.a.A("Subtitle ");
                i3++;
                A.append(i3);
                arrayList.add(new f.n.a.o.h(A.toString(), bVar.f7030f, bVar.f7031g, false, false));
            }
        } else {
            arrayList.add(new f.n.a.o.h("None", "_none", null, false, false));
            arrayList.add(new f.n.a.o.h("First Stream", "_default", null, false, true));
            arrayList.add(new f.n.a.o.h("All", "_all", null, true, false));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f.n.a.o.h("Original", "audio_channel_default", null, false, true));
        arrayList2.add(new f.n.a.o.h("Mono", "audio_channel_mono", null, false, false));
        arrayList2.add(new f.n.a.o.h("Stereo", "audio_channel_mono", null, false, false));
        arrayList2.add(new f.n.a.o.h("2.1", "audio_channel_2_1", null, false, false));
        arrayList2.add(new f.n.a.o.h("5.1", "audio_channel_5_1", null, false, false));
        arrayList2.add(new f.n.a.o.h("7.1", "audio_channel_7_1", null, false, false));
        String name = this.r.name();
        f.n.a.v.e.c cVar = new f.n.a.v.e.c();
        Bundle bundle = new Bundle();
        bundle.putString("fileId", "file_name_input_dialog");
        bundle.putBoolean("isBatch", z);
        bundle.putInt("audioBitrate", i2);
        bundle.putSerializable("audioOptions", s);
        bundle.putSerializable("subtitleOptions", arrayList);
        bundle.putString("outputFormat", name);
        bundle.putString("inputFileName", str);
        bundle.putSerializable("audioChannelOptions", arrayList2);
        cVar.setArguments(bundle);
        cVar.setCancelable(false);
        this.O = cVar;
        cVar.show(this.o.H(), "inputDialog");
    }

    @Override // f.n.a.v.s.i
    public void e() {
        Log.d("VidCompInputScreenL", "onExpandFileList: ");
        if (this.B == null) {
            f.l.b.c.n(this.o);
            return;
        }
        this.p.a("click_trim");
        Log.d("VidCompInputScreenL", "onExpandFileList: click_trim");
        if (!User.a() && !this.E) {
            this.y = new e();
            L("purchase_for_cut");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("SELECTED_FILE", (Serializable) this.B);
        Objects.requireNonNull(this.a);
        bundle.putInt("selected_index", 0);
        f.n.a.v.u.e eVar = new f.n.a.v.u.e();
        eVar.f7492j = this;
        eVar.setArguments(bundle);
        Objects.requireNonNull(this.a);
        try {
            e.p.c.a aVar = new e.p.c.a(C());
            aVar.h(R.id.fragment_container_fullScreen, eVar, null);
            aVar.c(null);
            aVar.e();
        } catch (Exception unused) {
            f.l.b.c.n(this.o);
        }
    }

    @Override // f.n.a.v.s.i
    public void f(Item item, int i2) {
        FileFormat b2 = this.f7430d.b(item.f1395f);
        boolean z = false;
        if (this.f7435i && !User.a() && !this.H && b2 != FileFormat.ORIGINAL && b2 != FileFormat.MP4) {
            this.y = new s(this, item, i2);
            L("purchase_for_format");
            this.b.b(0);
            return;
        }
        if (!this.f7435i && !User.a() && !this.H) {
            if (b2 != this.q && b2 != FileFormat.MP4) {
                z = true;
            }
            if (z) {
                this.y = new s(this, item, i2);
                L("purchase_for_format");
                int indexOf = Arrays.asList(this.f7430d.a).indexOf(this.q.getExtension().toLowerCase());
                if (indexOf == -1) {
                    f.n.a.n.e eVar = this.f7430d;
                    Objects.requireNonNull(eVar);
                    indexOf = Arrays.asList(eVar.a).indexOf("mp4".toLowerCase());
                }
                this.b.b(indexOf);
                return;
            }
        }
        G(b2);
    }

    @Override // f.n.a.v.s.i
    public void g(f.n.a.m.c.a aVar) {
        int indexOf = this.B.indexOf(aVar);
        this.R = indexOf;
        if (indexOf < 0) {
            return;
        }
        this.f7433g.b(this.f7434h.b(), "delete_file_dialog_new");
    }

    @Override // f.n.a.x.e.a
    public void h(ArrayList<MediaFile> arrayList) {
        this.n = arrayList;
        if (arrayList != null && arrayList.size() == 1) {
            this.f7435i = false;
            this.c = arrayList.get(0);
        }
        r(arrayList);
    }

    @Override // f.n.a.v.s.i
    public void i() {
        M("change_speed_dg", this.o.getResources().getString(R.string.speed), this.o.getResources().getString(R.string.higher_speed_high_size), this.u);
    }

    @Override // f.n.a.v.s.i
    public void j() {
        Log.d("VidCompInputScreenL", "onFileListSpinnerClicked: ");
        this.S.removeCallbacksAndMessages(null);
    }

    @Override // f.n.a.v.o.b.a
    public void k(Item item, String str) {
        FileFormat fileFormat;
        str.hashCode();
        if (str.equals("change_speed_dg")) {
            if (!User.a() && !this.I) {
                this.y = new w(this, item);
                L("purchase_for_speed");
                return;
            }
            P(item);
        } else if (str.equals("change_codec_dg")) {
            if (f.l.b.c.m(item.f1395f) == Codec.X265 && (fileFormat = this.r) != null && (fileFormat == FileFormat.GP3 || fileFormat == FileFormat.FLV || fileFormat == FileFormat.M4V)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
                builder.setTitle(this.o.getResources().getString(R.string.warning)).setMessage(this.o.getResources().getString(R.string.hevc_unsupported_msg)).setPositiveButton(this.o.getResources().getString(R.string.ok), new u(this));
                builder.create().show();
                Codec m2 = f.l.b.c.m("X264");
                this.x = m2;
                this.a.p.setText(m2.getCodec());
                o(this.z, "X264");
            } else if (!User.a() && !this.F) {
                this.y = new v(this, item);
                L("purchase_for_codec");
            } else {
                N(item);
            }
        }
    }

    @Override // f.n.a.v.s.i
    public void l() {
        M("change_codec_dg", "", this.o.getResources().getString(R.string.h265_compatibility), this.z);
    }

    @Override // f.n.a.v.s.i
    public void m() {
        if (!User.a() && !this.G) {
            this.y = new g();
            L("purchase_for_watch_preview");
            return;
        }
        J();
    }

    public final void n(String str, boolean z, int i2, List list, List list2, List list3, f.n.a.m.c.a aVar) {
        f.n.a.d.b bVar = this.f7437k;
        ProcessingInfo y = y(str, z, i2, list, list2, list3, aVar);
        MediaFile A = A();
        a.C0170a c0170a = new a.C0170a();
        c0170a.b = y;
        c0170a.a = A;
        c0170a.f6924d = ProcessorType.VIDEO_COMPRESSOR;
        bVar.a(new f.n.a.d.a(c0170a));
        this.f7439m.b();
    }

    public final void o(List<Item> list, String str) {
        for (Item item : list) {
            if (item.f1395f.equals(str)) {
                item.f1399j = true;
            } else {
                item.f1399j = false;
            }
        }
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(InfoDialogDismissedEvent infoDialogDismissedEvent) {
        if (infoDialogDismissedEvent.a.equals("video_not_found_dialog") && infoDialogDismissedEvent.b == InfoDialogDismissedEvent.ClickedButton.POSITIVE) {
            this.o.finish();
        } else if (infoDialogDismissedEvent.a.equals("selected_files_retrieve_error_dialog") && infoDialogDismissedEvent.b == InfoDialogDismissedEvent.ClickedButton.POSITIVE) {
            this.o.finish();
        }
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onPromptEvent(PromptDialogDismissedEvent promptDialogDismissedEvent) {
        List<f.n.a.m.c.a> list;
        if (promptDialogDismissedEvent.a == "delete_file_dialog_new" && promptDialogDismissedEvent.b == PromptDialogDismissedEvent.ClickedButton.POSITIVE && this.R >= 0 && (list = this.B) != null && list.size() > 1 && this.R < this.B.size()) {
            this.B.remove(this.R);
            List<MediaFile> list2 = this.n;
            if (list2 != null) {
                int size = list2.size();
                int i2 = this.R;
                if (size > i2) {
                    this.n.remove(i2);
                }
            }
            this.a.d(this.B);
        }
        this.R = -1;
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onPurchaseDialogEvent(f.n.a.v.a.i iVar) {
        String str = iVar.a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1444416481:
                if (str.equals("subtitle_purchase_dialog")) {
                    c2 = 0;
                    break;
                }
                break;
            case -136640547:
                if (str.equals("audio_purchase_dialog")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1555529393:
                if (str.equals("all_subtitle_streams_purchase_dialog")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1882753907:
                if (str.equals("all_audio_streams_purchase_dialog")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.y = new b();
                L("purchase_for_subtitle");
                return;
            case 1:
                this.y = new a();
                L("purchase_for_audio");
                return;
            case 2:
                this.y = new d();
                L("purchase_for_all_subtitle_streams");
                return;
            case 3:
                this.y = new c();
                L("purchase_for_all_audio_streams");
                return;
            default:
                return;
        }
    }

    public final List<f.n.a.o.h> p(List<f.n.a.o.h> list) {
        Iterator<f.n.a.o.h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f.n.a.o.h next = it.next();
            if ("_none".equals(next.f7059g)) {
                list.remove(next);
                break;
            }
        }
        return list;
    }

    public final void q() {
        Log.d("VidCompInputScreenL", "dissmissProgressDialog: ");
        f.n.a.k.f.a aVar = this.A;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.A.dismiss();
    }

    public final void r(ArrayList<MediaFile> arrayList) {
        this.b.c();
        Iterator<MediaFile> it = arrayList.iterator();
        while (it.hasNext()) {
            MediaFile next = it.next();
            this.D.add(new f.n.a.m.d.a(next.f1368f, next.f1370h, next.f1372j.toString(), Long.parseLong(next.f1369g), 0L));
        }
        this.b.d(0, 0);
        f.n.a.m.b bVar = this.s;
        List<f.n.a.m.d.a> list = this.D;
        bVar.b.clear();
        bVar.b.addAll(list);
        f.n.a.m.b bVar2 = this.s;
        bVar2.f7014g = this;
        bVar2.e();
    }

    public final ArrayList<f.n.a.o.h> s() {
        ArrayList<f.n.a.o.h> arrayList = new ArrayList<>();
        if (!this.f7435i && this.B.size() >= 1) {
            f.n.a.m.c.a aVar = this.B.get(0);
            arrayList.add(new f.n.a.o.h("None", "_none", null, false, aVar.a().size() == 0));
            int i2 = 0;
            while (i2 < aVar.a().size()) {
                f.n.a.m.d.b bVar = aVar.a().get(i2);
                StringBuilder A = f.a.b.a.a.A("Audio ");
                int i3 = i2 + 1;
                A.append(i3);
                arrayList.add(new f.n.a.o.h(A.toString(), bVar.f7030f, bVar.f7031g, false, i2 == 0));
                i2 = i3;
            }
        } else {
            arrayList.add(new f.n.a.o.h("None", "_none", null, false, false));
            arrayList.add(new f.n.a.o.h("First Stream", "_default", null, false, true));
            arrayList.add(new f.n.a.o.h("All", "_all", null, true, false));
        }
        return arrayList;
    }

    public final int t(int i2, int i3) {
        int i4 = (i2 * i3) / 100;
        Log.d("VidCompInputScreenL", "getCalculatedBitrate: " + i4);
        return i4 % 2 == 1 ? i4 + 1 : i4;
    }

    public final f.n.a.m.c.a u(int i2) {
        List<f.n.a.m.c.a> list = this.B;
        if (list == null || list.size() <= i2) {
            return null;
        }
        return this.B.get(i2);
    }

    public final FileFormat v(String str) {
        if (str == null) {
            return FileFormat.MP4;
        }
        if (!str.equalsIgnoreCase("3GP") && !str.equalsIgnoreCase("3GPP")) {
            return str.equalsIgnoreCase("FLV") ? FileFormat.FLV : str.equalsIgnoreCase("MP4") ? FileFormat.MP4 : str.equalsIgnoreCase("MOV") ? FileFormat.MOV : str.equalsIgnoreCase("MTS") ? FileFormat.MTS : str.equalsIgnoreCase("M2TS") ? FileFormat.M2TS : str.equalsIgnoreCase("TS") ? FileFormat.TS : str.equalsIgnoreCase("MKV") ? FileFormat.MKV : str.equalsIgnoreCase("M4V") ? FileFormat.M4V : FileFormat.MP4;
        }
        return FileFormat.GP3;
    }

    public final float w(String str, long j2) {
        try {
            float parseLong = (float) ((Long.parseLong(str) * 1.0d) / (((float) j2) / 1048576.0f));
            if (parseLong > 1.0d) {
                return 1.0f;
            }
            return parseLong;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    public final ProcessingInfo x(f.n.a.m.c.a aVar) {
        f.n.a.v.q.e eVar;
        int resolutionDivisor;
        CompressionProfile compressionProfile;
        int i2;
        int i3;
        boolean z;
        ProcessingInfo processingInfo = null;
        try {
            eVar = (f.n.a.v.q.e) this.a.e(this.o);
        } catch (Exception unused) {
            f.l.b.c.n(this.o);
            eVar = null;
        }
        if (eVar == null) {
            f.l.b.c.n(this.o);
            return null;
        }
        f.n.a.v.q.d dVar = eVar.f7395i;
        CompressionProfile compressionProfile2 = dVar.f7392l;
        CompressionProfile compressionProfile3 = CompressionProfile.CUSTOM;
        if (compressionProfile2 == compressionProfile3) {
            f.n.a.v.d.c cVar = dVar.o;
            Objects.requireNonNull(cVar);
            try {
                ProcessingInfo.b bVar = cVar.p;
                bVar.H = compressionProfile3;
                bVar.z = ProcessStatus.IN_QUEUE;
                if (cVar.r) {
                    processingInfo = bVar.v();
                } else {
                    f.n.a.m.c.a aVar2 = cVar.q;
                    bVar.f1377h = aVar2.f7022j;
                    bVar.f1380k = aVar2.f7023k;
                    bVar.f1381l = aVar2.t;
                    bVar.f1379j = aVar2.c();
                    f.n.a.m.c.a aVar3 = cVar.q;
                    int i4 = aVar3.n;
                    int i5 = aVar3.o;
                    if (i4 < i5) {
                        ProcessingInfo.b bVar2 = cVar.p;
                        int i6 = bVar2.n;
                        z = i6 != i4;
                        bVar2.w = z;
                        if (z) {
                            bVar2.o = ((int) ((i6 / i4) * i5)) & (-2);
                        } else {
                            bVar2.o = i5;
                        }
                    } else {
                        ProcessingInfo.b bVar3 = cVar.p;
                        int i7 = bVar3.o;
                        z = i7 != i5;
                        bVar3.w = z;
                        if (z) {
                            bVar3.n = ((int) ((i7 / i5) * i4)) & (-2);
                        } else {
                            bVar3.n = i4;
                        }
                    }
                    processingInfo = cVar.p.v();
                }
            } catch (Exception e2) {
                FirebaseCrashlytics.getInstance().recordException(e2);
                FirebaseCrashlytics.getInstance().log("CustomOptionScreenController");
            }
        } else {
            ProcessingInfo.b bVar4 = dVar.f7393m;
            bVar4.H = compressionProfile2;
            bVar4.z = ProcessStatus.IN_QUEUE;
            if (compressionProfile2 == CompressionProfile.FIXED_SIZE_COMPRESSION || compressionProfile2 == (compressionProfile = CompressionProfile.FIXED_SIZE_COMPRESSION_LOSSY)) {
                bVar4.x = true;
                bVar4.u = dVar.a;
                bVar4.t = TwoPass.PASS_1;
            } else if (compressionProfile2 == compressionProfile) {
                bVar4.u = dVar.a;
            } else {
                bVar4.t = null;
            }
            if (dVar.f7389i) {
                int i8 = 100;
                if (compressionProfile2 == CompressionProfile.LOSSY_COMPRESSION) {
                    resolutionDivisor = dVar.f7384d.f7408m.getProgress();
                    i8 = dVar.f7384d.n.getProgress() + 5;
                } else {
                    resolutionDivisor = compressionProfile2.getResolutionDivisor() != -1 ? 100 / dVar.f7392l.getResolutionDivisor() : 100;
                }
                ProcessingInfo.b bVar5 = dVar.f7393m;
                bVar5.C = i8;
                bVar5.B = resolutionDivisor;
            } else {
                bVar4.f1377h = String.valueOf(dVar.f7391k.f1372j);
                dVar.f7393m.T = String.valueOf(dVar.f7391k.f1372j);
                ProcessingInfo.b bVar6 = dVar.f7393m;
                f.n.a.m.c.a aVar4 = dVar.f7390j;
                bVar6.f1380k = aVar4.f7023k;
                bVar6.f1381l = aVar4.t;
                bVar6.f1379j = aVar4.c();
                dVar.f7393m.f1382m = dVar.f7388h.f7041e;
                if (dVar.f7392l.getResolutionDivisor() != -1) {
                    ProcessingInfo.b bVar7 = dVar.f7393m;
                    f.n.a.n.h hVar = dVar.f7387g;
                    f.n.a.m.c.a aVar5 = dVar.f7390j;
                    int resolutionDivisor2 = dVar.f7392l.getResolutionDivisor();
                    Objects.requireNonNull(hVar);
                    bVar7.n = (aVar5.n / resolutionDivisor2) & (-2);
                    ProcessingInfo.b bVar8 = dVar.f7393m;
                    f.n.a.n.h hVar2 = dVar.f7387g;
                    f.n.a.m.c.a aVar6 = dVar.f7390j;
                    int resolutionDivisor3 = dVar.f7392l.getResolutionDivisor();
                    Objects.requireNonNull(hVar2);
                    bVar8.o = (aVar6.o / resolutionDivisor3) & (-2);
                } else {
                    ProcessingInfo.b bVar9 = dVar.f7393m;
                    f.n.a.n.j jVar = dVar.f7388h;
                    bVar9.n = jVar.f7040d;
                    bVar9.o = jVar.b();
                }
                ProcessingInfo.b bVar10 = dVar.f7393m;
                bVar10.w = bVar10.n != dVar.f7390j.n;
            }
            processingInfo = dVar.f7393m.v();
        }
        processingInfo.T = aVar.f7022j;
        processingInfo.r = this.x;
        processingInfo.s = this.w;
        processingInfo.L = aVar.f7018f;
        processingInfo.M = aVar.f7019g;
        processingInfo.u(aVar.t);
        CompressionProfile compressionProfile4 = processingInfo.H;
        if (compressionProfile4 == CompressionProfile.FIXED_SIZE_COMPRESSION) {
            processingInfo.w = true;
            if (processingInfo.x) {
                new f.n.a.n.h();
                int i9 = aVar.n;
                int i10 = aVar.o;
                int min = Math.min(i9, i10);
                int i11 = 1080;
                if (min <= 1080) {
                    i11 = 720;
                    if (min <= 720) {
                        i11 = 480;
                        if (min <= 480) {
                            i11 = 360;
                            if (min <= 360) {
                                i11 = 240;
                                if (min <= 240) {
                                    i11 = min;
                                }
                            }
                        }
                    }
                }
                int i12 = min - i11;
                if (i9 < i10) {
                    i2 = i9 - i12;
                    i3 = ((int) ((i2 / i9) * i10)) & (-2);
                } else {
                    int i13 = i10 - i12;
                    i2 = ((int) ((i13 / i10) * i9)) & (-2);
                    i3 = i13;
                }
                Pair pair = new Pair(Integer.valueOf(i2 - (i2 % 2)), Integer.valueOf(i3 - (i3 % 2)));
                processingInfo.n = ((Integer) pair.first).intValue();
                processingInfo.o = ((Integer) pair.second).intValue();
            } else {
                int i14 = aVar.n;
                processingInfo.n = i14 - (i14 % 2);
                int i15 = aVar.o;
                processingInfo.o = i15 - (i15 % 2);
            }
            long max = (Math.max(Long.parseLong(processingInfo.u) - 1, 1L) * 8190) / (aVar.t / 1000);
            int i16 = aVar.f7025m;
            if (i16 >= max) {
                i16 = (int) max;
            }
            processingInfo.f1382m = i16;
        } else if (compressionProfile4 == CompressionProfile.FIXED_SIZE_COMPRESSION_LOSSY) {
            processingInfo.w = true;
            float w = w(processingInfo.u, aVar.u);
            float max2 = Math.max(0.01f, w - 0.05f);
            if (w > 1.0d) {
                max2 = 0.9f;
            }
            int i17 = (int) (aVar.f7025m * max2);
            f.a.b.a.a.N("getBitrateForLossyFixedSize: bitrate ", i17, "COMMAND_DEBUG");
            processingInfo.f1382m = i17;
            float max3 = Math.max(0.01f, w(processingInfo.u, aVar.u) + 0.1f);
            float f2 = ((double) max3) <= 1.0d ? max3 : 0.9f;
            int i18 = (int) (aVar.o * f2);
            int i19 = (int) (aVar.n * f2);
            Log.d("VidCompInputScreenL", "getResolutionForLossyFixedSize: " + f2);
            if (i18 % 2 != 0) {
                i18++;
            }
            if (i19 % 2 != 0) {
                i19++;
            }
            Log.d("COMMAND_DEBUG", "getResForLossyFixedSize: resolution " + i18 + "x" + i19);
            Pair pair2 = new Pair(Integer.valueOf(i18), Integer.valueOf(i19));
            processingInfo.o = ((Integer) pair2.first).intValue();
            processingInfo.n = ((Integer) pair2.second).intValue();
        }
        processingInfo.U = aVar.u;
        String str = aVar.w;
        if (str == null) {
            str = "";
        }
        processingInfo.V = str;
        if (aVar.x == 1) {
            processingInfo.X = ProcessingInfo.PROCESS_MODE.TRIM;
        } else {
            processingInfo.X = ProcessingInfo.PROCESS_MODE.CUT;
        }
        processingInfo.a0 = this.r.getExtension();
        processingInfo.Y = ProcessingInfo.PROCESS_STATUS.FIRST_PROCESS;
        return processingInfo;
    }

    public final ProcessingInfo y(String str, boolean z, int i2, List<f.n.a.o.h> list, List<f.n.a.o.h> list2, List<f.n.a.o.h> list3, f.n.a.m.c.a aVar) {
        ProcessingInfo x = x(aVar);
        if (x == null) {
            return null;
        }
        x.q(z);
        if (!this.f7435i) {
            x.f1375f = String.valueOf(this.f7431e.f7024l);
            x.f1376g = this.f7431e.b();
        }
        int t = t(aVar.f7024l, i2);
        StringBuilder A = f.a.b.a.a.A("Testbit: ");
        f.a.b.a.a.P(A, aVar.f7024l, " ", i2, " ");
        A.append(t);
        Log.d("VidCompInputScreenL", A.toString());
        boolean D = D(list);
        boolean D2 = D(list2);
        if (!this.f7435i) {
            p(list);
            p(list2);
            x.n(list);
            x.t(list2);
            x.m(list3);
            x.I = D;
            x.p(D2);
            if (!z) {
                x.f1375f = String.valueOf(t);
            }
        }
        x.f1375f = String.valueOf(t);
        x.s = this.w;
        x.r = this.x;
        f.n.a.n.e eVar = this.f7430d;
        x.p = eVar.b(eVar.a(x.f1377h));
        if (this.r == null) {
            this.r = FileFormat.MP4;
        }
        FileFormat fileFormat = this.r;
        if (fileFormat == FileFormat.ORIGINAL) {
            x.q = v(this.f7430d.a(x.f1377h));
        } else {
            x.q = fileFormat;
        }
        FileFormat fileFormat2 = x.p;
        FileFormat fileFormat3 = x.q;
        x.y = fileFormat2 != fileFormat3;
        x.f1378i = String.format(Locale.US, "%s%s.%s", f.n.a.i.b.a, str, fileFormat3.getExtension());
        return x;
    }

    public final f.n.a.k.f.a z() {
        if (this.A == null) {
            this.A = new f.n.a.k.f.a(this.o, null, null);
        }
        return this.A;
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(InputDialogDismissedEvent inputDialogDismissedEvent) {
        if (inputDialogDismissedEvent.a.equals("file_name_input_dialog")) {
            try {
                this.f7439m.b();
                if (!this.N && !User.a()) {
                    if (this.f7437k.c() + (this.f7435i ? this.n.size() : 1) > f.n.a.i.a.c) {
                        this.y = new r(this);
                        L("purchase_for_batch_limit");
                        return;
                    }
                }
            } catch (Exception unused) {
            }
            int ordinal = inputDialogDismissedEvent.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                }
                String str = inputDialogDismissedEvent.c;
                boolean z = inputDialogDismissedEvent.f1362d;
                boolean z2 = inputDialogDismissedEvent.f1367i;
                int i2 = inputDialogDismissedEvent.f1363e;
                ArrayList<f.n.a.o.h> arrayList = inputDialogDismissedEvent.f1364f;
                ArrayList<f.n.a.o.h> arrayList2 = inputDialogDismissedEvent.f1365g;
                List<f.n.a.o.h> list = inputDialogDismissedEvent.f1366h;
                Iterator<f.n.a.o.h> it = s().iterator();
                boolean z3 = false;
                while (it.hasNext()) {
                    f.n.a.o.h next = it.next();
                    if (next.f7062j && "_none".equals(next.f7059g)) {
                        z3 = true;
                    }
                }
                if (this.f7435i) {
                    a(str, z, z3, z2, i2, B(arrayList), B(arrayList2), list);
                    this.f7439m.b();
                } else {
                    n(str, z2, i2, arrayList, arrayList2, list, u(0));
                }
                E();
                return;
            }
            String str2 = inputDialogDismissedEvent.c;
            boolean z4 = inputDialogDismissedEvent.f1362d;
            boolean z5 = inputDialogDismissedEvent.f1367i;
            int i3 = inputDialogDismissedEvent.f1363e;
            ArrayList<f.n.a.o.h> arrayList3 = inputDialogDismissedEvent.f1364f;
            ArrayList<f.n.a.o.h> arrayList4 = inputDialogDismissedEvent.f1365g;
            List<f.n.a.o.h> list2 = inputDialogDismissedEvent.f1366h;
            Iterator<f.n.a.o.h> it2 = s().iterator();
            boolean z6 = false;
            while (it2.hasNext()) {
                f.n.a.o.h next2 = it2.next();
                StringBuilder A = f.a.b.a.a.A("onInputDialogStartBtnClicked: ");
                A.append(next2.f7059g);
                Log.d("VidCompInputScreenL", A.toString());
                if (next2.f7062j && "_none".equals(next2.f7059g)) {
                    z6 = true;
                }
            }
            Log.d("VidCompInputScreenL", "onInputDialogStartBtnClicked: " + z6);
            if (this.f7435i) {
                a(str2, z4, z6, z5, i3, B(arrayList3), B(arrayList4), list2);
                Intent intent = new Intent(this.o, BatchScreenActivity.class);
                intent.putExtra("START_BATCH_PROCESS", true);
                this.o.startActivity(intent);
            } else if (this.f7437k.c() == 0) {
                this.o.startActivityForResult(new Intent(this.o, ProcessingScreenActivity.class).putExtra("PROCESSING_INFO_KEY", y(str2, z5, i3, arrayList3, arrayList4, list2, u(0))), 232);
            } else {
                n(str2, z5, i3, arrayList3, arrayList4, list2, u(0));
                Intent intent2 = new Intent(this.o, BatchScreenActivity.class);
                intent2.putExtra("START_BATCH_PROCESS", true);
                this.o.startActivity(intent2);
            }
            E();
        }
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PurchaseDialogDismissedEvent purchaseDialogDismissedEvent) {
        if (purchaseDialogDismissedEvent.a.equals("purchase_for_format") || purchaseDialogDismissedEvent.a.equals("purchase_for_speed") || purchaseDialogDismissedEvent.a.equals("purchase_for_codec") || purchaseDialogDismissedEvent.a.equals("purchase_for_cut") || purchaseDialogDismissedEvent.a.equals("purchase_for_batch_limit") || purchaseDialogDismissedEvent.a.equals("purchase_for_audio") || purchaseDialogDismissedEvent.a.equals("purchase_for_subtitle") || purchaseDialogDismissedEvent.a.equals("purchase_for_all_audio_streams") || purchaseDialogDismissedEvent.a.equals("purchase_for_all_subtitle_streams") || purchaseDialogDismissedEvent.a.equals("purchase_for_watch_preview")) {
            int ordinal = purchaseDialogDismissedEvent.b.ordinal();
            if (ordinal == 0) {
                this.y = null;
                f.n.a.z.b.a().b = f.a.b.a.a.p(purchaseDialogDismissedEvent.a.substring(13), "_feature");
                f.n.a.v.a.j.k(this.o);
            } else if (ordinal != 1) {
            } else {
                if (purchaseDialogDismissedEvent.a.equals("purchase_for_speed") || purchaseDialogDismissedEvent.a.equals("purchase_for_codec") || purchaseDialogDismissedEvent.a.equals("purchase_for_format") || purchaseDialogDismissedEvent.a.equals("purchase_for_cut") || purchaseDialogDismissedEvent.a.equals("purchase_for_audio") || purchaseDialogDismissedEvent.a.equals("purchase_for_subtitle") || purchaseDialogDismissedEvent.a.equals("purchase_for_all_audio_streams") || purchaseDialogDismissedEvent.a.equals("purchase_for_all_subtitle_streams") || purchaseDialogDismissedEvent.a.equals("purchase_for_batch_limit") || purchaseDialogDismissedEvent.a.equals("purchase_for_watch_preview")) {
                    if (f.l.b.c.i(this.o)) {
                        this.Q.o(new Runnable() { // from class: f.n.a.v.s.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                j jVar = j.this;
                                Objects.requireNonNull(jVar);
                                Log.d("VidCompInputScreenL", "executePendingTask: ");
                                if (jVar.y != null) {
                                    new Handler().post(jVar.y);
                                } else {
                                    jVar.q();
                                    jVar.y = null;
                                }
                                jVar.K();
                            }
                        });
                        this.Q.k(this.o);
                        return;
                    }
                    this.f7433g.b(this.f7434h.f(), "NETWORK_UNAVAILABLE_DIALOG");
                }
            }
        }
    }
}
