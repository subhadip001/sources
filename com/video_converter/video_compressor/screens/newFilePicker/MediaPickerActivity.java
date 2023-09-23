package com.video_converter.video_compressor.screens.newFilePicker;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.PermissionStatus;
import com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.dialogs.purchaseDialog.PurchaseDialogDismissedEvent;
import com.video_converter.video_compressor.model.MediaFile;
import com.video_converter.video_compressor.model.VideoFile;
import com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity;
import com.video_converter.video_compressor.screens.vidCompInputScreen.VidCompInputScreenActivity;
import f.l.a.d.c.a;
import f.l.a.d.d.g;
import f.n.a.o.i;
import f.n.a.v.a.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import m.a.a.l;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class MediaPickerActivity extends MediaFilePickerActivity {
    public static final /* synthetic */ int d0 = 0;
    public Handler K;
    public f.n.a.y.d L;
    public f.n.a.k.f.a M;
    public ProgressDialog N;
    public Runnable P;
    public int Q;
    public ArrayList<String> R;
    public ArrayList<f.l.a.d.d.e> S;
    public f.n.a.k.b T;
    public f.n.a.k.a U;
    public m.a.a.c X;
    public RewardedAdManager Y;
    public AdLoader a0;
    public f.n.a.h.d.c b0;
    public Boolean O = Boolean.FALSE;
    public boolean V = false;
    public int W = 0;
    public Handler Z = new Handler(Looper.getMainLooper());
    public boolean c0 = false;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPickerActivity mediaPickerActivity = MediaPickerActivity.this;
            int i2 = MediaPickerActivity.d0;
            mediaPickerActivity.k0();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPickerActivity mediaPickerActivity = MediaPickerActivity.this;
            int i2 = MediaPickerActivity.d0;
            mediaPickerActivity.k0();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Uri f1389f;

        public c(Uri uri) {
            this.f1389f = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1389f != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1389f);
                MediaPickerActivity.X(MediaPickerActivity.this, arrayList);
                return;
            }
            MediaPickerActivity mediaPickerActivity = MediaPickerActivity.this;
            int i2 = MediaPickerActivity.d0;
            mediaPickerActivity.g0();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f1391f;

        public d(List list) {
            this.f1391f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f1391f;
            if (list != null && !list.isEmpty()) {
                MediaPickerActivity.X(MediaPickerActivity.this, new ArrayList(this.f1391f));
                return;
            }
            MediaPickerActivity mediaPickerActivity = MediaPickerActivity.this;
            int i2 = MediaPickerActivity.d0;
            mediaPickerActivity.g0();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (i2 == -2) {
                MediaPickerActivity.this.j0();
            } else if (i2 != -1) {
            } else {
                ActivityCompat.requestPermissions(MediaPickerActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 777);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f extends AsyncTask<List<? extends f.l.a.d.d.e>, Void, List<MediaFile>> {
        public f() {
        }

        @Override // android.os.AsyncTask
        public List<MediaFile> doInBackground(List<? extends f.l.a.d.d.e>[] listArr) {
            ArrayList arrayList = new ArrayList();
            List<? extends f.l.a.d.d.e> list = listArr[0];
            for (int i2 = 0; i2 < list.size(); i2++) {
                g gVar = (g) list.get(i2);
                arrayList.add(new VideoFile(gVar.a(), gVar.d(), String.valueOf(gVar.c()), Uri.parse(gVar.e()), gVar.g().longValue()));
                Log.d("TestInfoData", "handleNextButtonClick: " + gVar.c());
            }
            MediaPickerActivity mediaPickerActivity = MediaPickerActivity.this;
            int i3 = MediaPickerActivity.d0;
            Objects.requireNonNull(mediaPickerActivity);
            f.n.a.x.c cVar = new f.n.a.x.c();
            f.n.a.x.b bVar = new f.n.a.x.b();
            cVar.a(MediaFile.class, new f.n.a.o.b());
            cVar.a(Uri.class, new i());
            bVar.g(cVar.a.a().h(arrayList), f.n.a.i.b.f6954d);
            return arrayList;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(List<MediaFile> list) {
            List<MediaFile> list2 = list;
            super.onPostExecute(list2);
            if (MediaPickerActivity.this.isFinishing() || MediaPickerActivity.this.isDestroyed()) {
                return;
            }
            Intent intent = new Intent(MediaPickerActivity.this, VidCompInputScreenActivity.class);
            if (list2.size() == 1) {
                intent.putExtra("SELECTED_FILE", list2.get(0));
            }
            intent.putExtra("rewarded_for_batch_file", MediaPickerActivity.this.V);
            MediaPickerActivity.this.startActivityForResult(intent, 999);
        }
    }

    public static void X(MediaPickerActivity mediaPickerActivity, ArrayList arrayList) {
        Objects.requireNonNull(mediaPickerActivity);
        Log.d("MediaPickerActivity", "processData: " + arrayList.size());
        mediaPickerActivity.R = new ArrayList<>();
        mediaPickerActivity.S = new ArrayList<>();
        if (arrayList.size() > 1) {
            arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mediaPickerActivity.a0((Uri) it.next());
            }
        } else if (arrayList.size() == 1) {
            mediaPickerActivity.a0((Uri) arrayList.get(0));
        }
        if (!mediaPickerActivity.R.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator<String> it2 = mediaPickerActivity.R.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Boolean bool = Boolean.FALSE;
                String str = "";
                for (int i2 = 0; i2 < next.length(); i2++) {
                    if (bool.booleanValue()) {
                        StringBuilder A = f.a.b.a.a.A(str);
                        A.append(next.charAt(i2));
                        str = A.toString();
                    }
                    if (next.charAt(i2) == '.') {
                        bool = Boolean.TRUE;
                    }
                }
                hashSet.add(str);
            }
            mediaPickerActivity.c0().post(new f.n.a.v.j.c(mediaPickerActivity, hashSet));
        }
        int size = mediaPickerActivity.S.size();
        if (size > 0) {
            if (mediaPickerActivity.h0(size)) {
                Log.d("MediaPickerActivity", "isValidSelection: ");
                mediaPickerActivity.B(mediaPickerActivity.S);
                Log.d("MediaPickerActivity", "isValidSelection2: ");
                return;
            }
            mediaPickerActivity.k0();
            mediaPickerActivity.P = new f.n.a.v.j.d(mediaPickerActivity);
        }
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, f.l.a.d.e.b
    public void B(List<? extends f.l.a.d.d.e> list) {
        if (h0(list.size())) {
            if (this.c0) {
                this.c0 = false;
                U(list);
                return;
            }
            super.B(list);
            return;
        }
        c0().post(new b());
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, f.l.a.f.b.h
    public void Q(Bundle bundle) {
        LinearLayout linearLayout;
        super.Q(bundle);
        Log.d("MediaPickerActivity", "initView: ");
        this.Q = new Random().nextInt(10);
        LinearLayout linearLayout2 = P().c;
        i.l.b.i.d(linearLayout2, "binding.adHolderContainerTop");
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = P().b;
        i.l.b.i.d(linearLayout3, "binding.adHolderContainer");
        linearLayout3.setVisibility(8);
        Log.d("MediaPickerActivity", "rand: " + this.Q);
        if (this.Q % 2 == 0) {
            linearLayout = P().c;
            i.l.b.i.d(linearLayout, "binding.adHolderContainerTop");
        } else {
            linearLayout = P().b;
            i.l.b.i.d(linearLayout, "binding.adHolderContainer");
        }
        if (!User.a()) {
            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
            if (!(firebaseRemoteConfig == null ? false : firebaseRemoteConfig.getBoolean("disable_banner_ad_in_MFPA"))) {
                this.Z.postDelayed(new f.n.a.v.j.b(this, linearLayout), 250L);
                return;
            }
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity
    public void U(List<? extends f.l.a.d.d.e> list) {
        try {
            if (!isFinishing() && !isDestroyed()) {
                if (this.N == null) {
                    this.N = j.j(this, null);
                }
                this.N.show();
            }
        } catch (Exception unused) {
        }
        new f().execute(list);
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity
    public boolean V(Uri uri) {
        new Thread(new c(uri)).start();
        return true;
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity
    public boolean W(List<? extends Uri> list) {
        StringBuilder A = f.a.b.a.a.A("onActivityResultIntercept: ");
        A.append(list.size());
        Log.d("MediaPickerActivity", A.toString());
        new Thread(new d(list)).start();
        return true;
    }

    public final void Y(Intent intent) {
        if (intent == null || intent.getType() == null || intent.getClipData() == null) {
            return;
        }
        if (((Boolean) f.l.b.c.b(this, Boolean.class, "process_active")).booleanValue() || ((Boolean) f.l.b.c.b(this, Boolean.class, "batch_active")).booleanValue()) {
            f.n.a.k.a b2 = b0().b();
            b0().b().d().b(f.n.a.k.e.a.m(b2.a.getString(R.string.process_on_going_warning), b2.a.getString(R.string.close)), "PROCESS_ON_GOING_WARNING");
        } else if (intent.getType().startsWith("video/")) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < intent.getClipData().getItemCount(); i2++) {
                arrayList.add(intent.getClipData().getItemAt(i2).getUri());
            }
            this.c0 = true;
            W(arrayList);
        }
    }

    public final void Z() {
        Log.d("REWARDED_AD", "dissmissProgressDialog: ");
        try {
            f.n.a.k.f.a aVar = this.M;
            if (aVar == null || !aVar.isShowing()) {
                return;
            }
            this.M.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void a0(Uri uri) {
        boolean z;
        try {
            getContentResolver().takePersistableUriPermission(uri, 3);
        } catch (Exception unused) {
        }
        try {
            Log.d("MediaPickerActivity", "gatherRequiredInfo: ELSE " + uri);
            f.l.a.d.c.a<g> a2 = ((f.l.a.d.f.e.a) this.x.getValue()).a(uri);
            Log.d("MediaPickerActivity", "gatherRequiredInfo: ->RD " + a2);
            if (a2 instanceof a.b) {
                g gVar = (g) ((a.b) a2).a;
                Log.d("MediaPickerActivity", "gatherRequiredInfo: " + gVar.e());
                String e0 = e0(gVar.d());
                if (!"mp4 mkv 3gp 3gpp mov flv avi mpg m4v mpeg vob wmv webm mts ts m2ts dav dat f4v mod movie lvf mxf h264".contains(e0)) {
                    try {
                        Long.parseLong(e0);
                        z = true;
                    } catch (Exception unused2) {
                        z = false;
                    }
                    if (!z) {
                        Log.d("TelegramShare", "unsupported: " + gVar.d() + " " + e0);
                        this.R.add(gVar.d());
                        return;
                    }
                }
                Log.d("TelegramShare", "supported: ");
                String d2 = gVar.d();
                String valueOf = String.valueOf(uri);
                long c2 = gVar.c();
                String a3 = gVar.a();
                String i2 = gVar.i();
                String h2 = gVar.h();
                Long g2 = gVar.g();
                i.l.b.i.e(d2, "title");
                i.l.b.i.e(valueOf, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                this.S.add(new g(d2, valueOf, c2, a3, i2, h2, g2));
            }
        } catch (Exception e2) {
            FirebaseCrashlytics.getInstance().recordException(e2);
        }
    }

    public f.n.a.h.d.c b0() {
        if (this.b0 == null) {
            this.b0 = new f.n.a.h.d.c(f.n.a.h.d.b.c(), this);
        }
        return this.b0;
    }

    public final Handler c0() {
        if (this.K == null) {
            this.K = new Handler(Looper.getMainLooper());
        }
        return this.K;
    }

    public final f.n.a.k.f.a d0() {
        if (this.M == null) {
            this.M = new f.n.a.k.f.a(this, null, null);
        }
        return this.M;
    }

    public final String e0(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(str.lastIndexOf(46) + 1).toLowerCase();
        } catch (Exception unused) {
            return null;
        }
    }

    public int f0() {
        if (w().d() != null) {
            return w().d().size();
        }
        return 0;
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, f.l.a.d.e.b
    public MediaType g() {
        return MediaType.VIDEO;
    }

    public final void g0() {
        try {
            if (this.N == null) {
                this.N = j.j(this, null);
            }
            this.N.dismiss();
        } catch (Exception unused) {
        }
    }

    public boolean h0(int i2) {
        if (!this.V && !User.a()) {
            if (f0() + b0().a().c() > f.n.a.i.a.c - (this.W + i2)) {
                return false;
            }
        }
        return true;
    }

    public void i0() {
        PermissionStatus permissionStatus = PermissionStatus.DENIED;
        i.l.b.i.e(permissionStatus, "permissionStatus");
        m.a.a.c.b().f(permissionStatus);
    }

    public void j0() {
        PermissionStatus permissionStatus = PermissionStatus.GRANTED;
        i.l.b.i.e(permissionStatus, "permissionStatus");
        m.a.a.c.b().f(permissionStatus);
    }

    public final void k0() {
        b0().b().d().b(b0().b().g(), "PURCHASE_FOR_BATCH_LIMIT");
    }

    @Override // e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 888 && e.i.c.a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            j0();
        } else if (i2 == 999) {
            R();
            g0();
        }
    }

    @Override // f.l.a.f.b.h, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseCrashlytics.getInstance().setCustomKey("CURRENT_ACTIVITY", "MediaPickerActivity");
        FirebaseCrashlytics.getInstance().setCustomKey("IS_SUBSCRIBED_USER", User.a.d() == User.Type.SUBSCRIBED);
        this.L = new f.n.a.y.d(this);
        this.T = new f.n.a.k.b(H());
        this.U = new f.n.a.k.a(this);
        this.X = m.a.a.c.b();
        TextView textView = (TextView) findViewById(R.id.pbText);
        if (getIntent() != null && getIntent().getExtras() != null) {
            getIntent().getExtras().getBoolean("key_add_more_file", false);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.V |= getIntent().getExtras().getBoolean("key_rewarded_for_multiple_file", false);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.W = getIntent().getExtras().getInt("key_total_file_size", 0);
        }
        RewardedAdManager rewardedAdManager = new RewardedAdManager();
        this.Y = rewardedAdManager;
        rewardedAdManager.n(this, null, this);
        Y(getIntent());
        f.n.a.z.d.a(this, "MediaPickerActivity");
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Y.p(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(PurchaseDialogDismissedEvent purchaseDialogDismissedEvent) {
        Log.d("dismissEvent", "onEvent: ");
        if (purchaseDialogDismissedEvent.a.equals("PURCHASE_FOR_BATCH_LIMIT")) {
            int ordinal = purchaseDialogDismissedEvent.b.ordinal();
            if (ordinal == 0) {
                f.n.a.z.b.a().b = "multiple_files";
                j.k(this);
            } else if (ordinal != 1) {
            } else {
                this.Y.o(new Runnable() { // from class: f.n.a.v.j.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaPickerActivity mediaPickerActivity = MediaPickerActivity.this;
                        mediaPickerActivity.V = true;
                        mediaPickerActivity.O = Boolean.TRUE;
                        StringBuilder A = f.a.b.a.a.A("executePendingTask: ");
                        A.append(mediaPickerActivity.O);
                        Log.d("REWARDED_AD", A.toString());
                        if (mediaPickerActivity.P != null && mediaPickerActivity.O.booleanValue()) {
                            new Handler().post(mediaPickerActivity.P);
                        } else {
                            mediaPickerActivity.Z();
                            mediaPickerActivity.P = null;
                        }
                        mediaPickerActivity.Z();
                        if (!mediaPickerActivity.d0().isShowing()) {
                            mediaPickerActivity.d0().show();
                        }
                        mediaPickerActivity.d0().a();
                    }
                });
                this.Y.k(this);
            }
        }
    }

    @Override // e.p.c.n, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("ShareIssue", "onNewIntent: ");
        Y(intent);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 777) {
            if (iArr.length > 0 && iArr[0] == 0) {
                j0();
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                j.r(this, new e());
            } else {
                i0();
            }
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        f.n.a.y.d dVar = this.L;
        if (!(e.i.c.a.checkSelfPermission(dVar.a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(dVar.a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                j.r(dVar.a, new f.n.a.y.a(dVar));
            } else if (dVar.b.getBoolean("android.permission.WRITE_EXTERNAL_STORAGE", false)) {
                j.r(dVar.a, new f.n.a.y.b(dVar));
            } else {
                ActivityCompat.requestPermissions(dVar.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 777);
            }
            SharedPreferences.Editor edit = dVar.b.edit();
            edit.putBoolean("android.permission.WRITE_EXTERNAL_STORAGE", true);
            edit.commit();
        }
        f.n.a.z.d.a(this, "MediaPickerActivity");
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        this.X.j(this);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        this.X.l(this);
        g0();
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, f.l.a.d.e.b
    public boolean u() {
        return true;
    }

    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, f.l.a.d.e.b
    public boolean y() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity, f.l.a.d.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(f.l.a.d.d.e r5) {
        /*
            r4 = this;
            boolean r0 = r4.V
            r1 = 0
            if (r0 != 0) goto L26
            boolean r0 = com.video_converter.video_compressor.constants.User.a()
            if (r0 != 0) goto L26
            f.n.a.h.d.c r0 = r4.b0()
            f.n.a.d.b r0 = r0.a()
            int r0 = r0.c()
            int r2 = r4.f0()
            int r2 = r2 + r0
            int r0 = f.n.a.i.a.c
            int r3 = r4.W
            int r0 = r0 - r3
            if (r2 >= r0) goto L24
            goto L26
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            if (r0 == 0) goto L3f
            boolean r0 = r4.c0
            if (r0 == 0) goto L3b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            r4.c0 = r1
            r4.U(r0)
            return
        L3b:
            super.z(r5)
            goto L4b
        L3f:
            android.os.Handler r5 = r4.c0()
            com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity$a r0 = new com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity$a
            r0.<init>()
            r5.post(r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity.z(f.l.a.d.d.e):void");
    }
}
