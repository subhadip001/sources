package f.n.a.j;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.Toast;
import com.video_converter.video_compressor.R;
import e.b.c.h;
import f.n.a.j.b;
import f.n.a.v.a.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlayerChooserUseCase.java */
/* loaded from: classes2.dex */
public class d implements b.a {
    public b a;
    public h b;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public Intent f6969d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f6970e;

    /* renamed from: f  reason: collision with root package name */
    public String f6971f;

    /* compiled from: PlayerChooserUseCase.java */
    /* loaded from: classes2.dex */
    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // f.n.a.j.c
        public void a() {
            j.t(d.this.c, this.a, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    @Override // f.n.a.j.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.pm.PackageManager r6, android.content.pm.ResolveInfo r7) {
        /*
            r5 = this;
            f.n.a.j.b r0 = r5.a
            java.util.Set<f.n.a.j.b$a> r0 = r0.f6968i
            r0.remove(r5)
            e.b.c.h r0 = r5.b
            r0.dismiss()
            r0 = 0
            android.content.pm.ActivityInfo r1 = r7.activityInfo     // Catch: java.lang.Exception -> L14
            android.content.pm.ApplicationInfo r2 = r1.applicationInfo     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = r2.packageName     // Catch: java.lang.Exception -> L15
            goto L17
        L14:
            r1 = r0
        L15:
            java.lang.String r2 = r7.resolvePackageName
        L17:
            java.lang.CharSequence r6 = r7.loadLabel(r6)     // Catch: java.lang.Exception -> L20
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L20
            goto L28
        L20:
            android.content.Context r6 = r5.c
            int r7 = r7.labelRes
            java.lang.String r6 = r6.getString(r7)
        L28:
            android.content.Context r7 = r5.c
            r3 = 0
            r4 = 1
            android.content.Context r7 = r7.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r7.getPackageInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r7 = 1
            goto L3a
        L39:
            r7 = 0
        L3a:
            if (r7 != 0) goto L61
            android.content.Context r7 = r5.c
            r0 = 2131886431(0x7f12015f, float:1.940744E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            java.lang.String r7 = r7.getString(r0, r1)
            android.content.Context r0 = r5.c
            r1 = 2131886619(0x7f12021b, float:1.9407822E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r6
            java.lang.String r6 = r0.getString(r1, r4)
            android.content.Context r0 = r5.c
            f.n.a.j.d$a r1 = new f.n.a.j.d$a
            r1.<init>(r2)
            f.n.a.v.a.j.s(r0, r7, r6, r1)
            return
        L61:
            if (r1 != 0) goto La1
            android.content.Context r6 = r5.c
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.net.Uri r7 = r5.f6970e
            java.lang.String r1 = r5.f6971f
            java.util.List r6 = r5.b(r6, r7, r1)
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8c
            java.lang.Object r7 = r6.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ActivityInfo r1 = r7.activityInfo
            java.lang.String r1 = r1.packageName
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L75
            r0 = r7
        L8c:
            if (r0 != 0) goto L9f
            android.content.Context r6 = r5.c
            r7 = 2131886283(0x7f1200cb, float:1.940714E38)
            java.lang.String r7 = r6.getString(r7)
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r3)
            r6.show()
            return
        L9f:
            android.content.pm.ActivityInfo r1 = r0.activityInfo
        La1:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r5.f6969d = r6
            java.lang.String r7 = "android.intent.action.VIEW"
            r6.setAction(r7)
            android.content.Intent r6 = r5.f6969d
            r6.addFlags(r4)
            android.content.Intent r6 = r5.f6969d
            android.net.Uri r7 = r5.f6970e
            java.lang.String r0 = r5.f6971f
            r6.setDataAndType(r7, r0)
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.pm.ApplicationInfo r7 = r1.applicationInfo
            java.lang.String r7 = r7.packageName
            java.lang.String r0 = r1.name
            r6.<init>(r7, r0)
            android.content.Intent r7 = r5.f6969d
            r7.setComponent(r6)
            android.content.Context r6 = r5.c
            android.content.Intent r7 = r5.f6969d
            r6.startActivity(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.j.d.a(android.content.pm.PackageManager, android.content.pm.ResolveInfo):void");
    }

    public final List<ResolveInfo> b(PackageManager packageManager, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.setDataAndType(uri, str);
        return packageManager.queryIntentActivities(intent, 0);
    }

    public final ResolveInfo c(String str) {
        ResolveInfo resolveInfo = new ResolveInfo();
        if (str.equals("org.videolan.vlc")) {
            resolveInfo.icon = R.drawable.vlc_palyer_icon;
            resolveInfo.labelRes = R.string.vlc_player;
        } else if (str.equals("com.mxtech.videoplayer.ad")) {
            resolveInfo.icon = R.drawable.mx_player_icon;
            resolveInfo.labelRes = R.string.mx_player;
        } else if (str.equals("com.kmplayer")) {
            resolveInfo.icon = R.drawable.kmp_player_icon;
            resolveInfo.labelRes = R.string.kmp_player;
        } else if (str.equals("video.player.videoplayer")) {
            resolveInfo.icon = R.drawable.video_player_icon;
            resolveInfo.labelRes = R.string.video_player;
        }
        resolveInfo.resolvePackageName = str;
        return resolveInfo;
    }

    public void d(Context context, Uri uri, String str) {
        char c;
        this.c = context;
        this.f6970e = uri;
        this.f6971f = str;
        b bVar = new b(context);
        this.a = bVar;
        bVar.f6968i.add(this);
        h.a aVar = new h.a(context, R.style.FullScreenDialog);
        aVar.setView(this.a.b);
        aVar.a.f107l = true;
        h create = aVar.create();
        this.b = create;
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        try {
            this.b.getWindow().setGravity(80);
            this.b.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#DF0C0909")));
        } catch (Exception unused) {
        }
        this.b.show();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> b = b(packageManager, uri, str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ResolveInfo resolveInfo = null;
        char c2 = 0;
        for (ResolveInfo resolveInfo2 : b) {
            String str2 = resolveInfo2.activityInfo.packageName;
            if (str2.equals("org.videolan.vlc") || str2.equals("com.mxtech.videoplayer.ad") || str2.equals("com.kmplayer") || str2.equals("video.player.videoplayer") || str2.equals("com.mxtech.videoplayer.pro")) {
                if (str2.equals("org.videolan.vlc")) {
                    c = 5;
                } else if (str2.equals("com.mxtech.videoplayer.pro")) {
                    c = 4;
                } else if (str2.equals("com.mxtech.videoplayer.ad")) {
                    c = 3;
                } else {
                    c = str2.equals("com.kmplayer") ? (char) 2 : (char) 1;
                }
                if (c > c2) {
                    c2 = c;
                    resolveInfo = resolveInfo2;
                }
            } else {
                arrayList.add(resolveInfo2);
            }
        }
        if (resolveInfo != null) {
            a(packageManager, resolveInfo);
            return;
        }
        arrayList2.add(c("com.mxtech.videoplayer.ad"));
        arrayList2.add(c("org.videolan.vlc"));
        arrayList2.add(c("com.kmplayer"));
        arrayList2.add(c("video.player.videoplayer"));
        if (str.contains("audio")) {
            arrayList2.clear();
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            Toast.makeText(context, context.getString(R.string.no_apps_found_msg), 0).show();
            this.b.dismiss();
            return;
        }
        b bVar2 = this.a;
        f.n.a.j.a aVar2 = bVar2.f6964e;
        aVar2.f6960i = packageManager;
        aVar2.f6958g = arrayList;
        aVar2.notifyDataSetChanged();
        bVar2.f6964e.f6959h.add(bVar2);
        if (arrayList2.isEmpty()) {
            bVar2.f6963d.setVisibility(8);
            bVar2.f6965f.setVisibility(8);
            bVar2.f6966g.setVisibility(8);
        } else {
            f.n.a.j.a aVar3 = bVar2.f6967h;
            aVar3.f6960i = packageManager;
            aVar3.f6958g = arrayList2;
            aVar3.notifyDataSetChanged();
            bVar2.f6967h.f6959h.add(bVar2);
        }
        if (arrayList.isEmpty()) {
            bVar2.f6966g.setVisibility(8);
            bVar2.c.setVisibility(8);
        }
    }
}
