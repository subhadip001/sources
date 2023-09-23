package f.n.a.v.a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.core.content.FileProvider;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzc;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.screens.purchaseScreen.PurchaseScreenActivity;
import e.b.c.h;
import e.p.c.n;
import f.h.b.d.a.i.p;
import f.l.a.d.c.a;
import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Utilities.java */
/* loaded from: classes2.dex */
public class j {
    public static int a;
    public static MediaScannerConnection b;
    public static int c;

    /* compiled from: Utilities.java */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ DialogInterface.OnClickListener f7091f;

        public a(DialogInterface.OnClickListener onClickListener) {
            this.f7091f = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            this.f7091f.onClick(dialogInterface, i2);
        }
    }

    /* compiled from: Utilities.java */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ DialogInterface.OnClickListener f7092f;

        public b(DialogInterface.OnClickListener onClickListener) {
            this.f7092f = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            this.f7092f.onClick(dialogInterface, i2);
        }
    }

    /* compiled from: Utilities.java */
    /* loaded from: classes2.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.n.a.j.c f7093f;

        public c(f.n.a.j.c cVar) {
            this.f7093f = cVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            this.f7093f.a();
        }
    }

    /* compiled from: Utilities.java */
    /* loaded from: classes2.dex */
    public class d implements MediaScannerConnection.MediaScannerConnectionClient {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            if (j.b.isConnected()) {
                j.b.scanFile(this.a, "audio/*");
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            j.c++;
            if (j.a == j.c) {
                j.b.disconnect();
                j.c = 0;
                j.a = 0;
            }
        }
    }

    /* compiled from: Utilities.java */
    /* loaded from: classes2.dex */
    public class e implements f.l.b.d {
        public final /* synthetic */ n a;

        public e(n nVar) {
            this.a = nVar;
        }

        public List<f.l.b.b> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new f.l.b.b("fb_process_failed", this.a.getString(R.string.fb_process_failed)));
            arrayList.add(new f.l.b.b("fb_low_quality", this.a.getString(R.string.fb_low_quality)));
            arrayList.add(new f.l.b.b("fb_slow_compress", this.a.getString(R.string.fb_slow_compress)));
            arrayList.add(new f.l.b.b("fb_poor_translation", this.a.getString(R.string.fb_poor_translation)));
            return arrayList;
        }
    }

    public static void a(Context context, String str) {
        try {
            new File(str);
            a++;
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context, new d(str));
            b = mediaScannerConnection;
            mediaScannerConnection.connect();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File("file://" + str)));
            context.sendBroadcast(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        if (((Boolean) f.l.b.c.b(context, Boolean.class, "is_rated")).booleanValue()) {
            return false;
        }
        int intValue = ((Integer) f.l.b.c.b(context, Integer.class, "rate_us_process_count_p")).intValue();
        FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
        int i2 = firebaseRemoteConfig == null ? 3 : (int) firebaseRemoteConfig.getLong("rate_us_frequency");
        if (((Boolean) f.l.b.c.b(context, Boolean.class, "feedback_sent")).booleanValue()) {
            i2 *= 2;
        }
        if (((Integer) f.l.b.c.b(context, Integer.class, "last_rating_shown_for")).intValue() == intValue) {
            return false;
        }
        return intValue == 1 || intValue % i2 == 0;
    }

    public static void c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String d(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            query.close();
                            return string;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String e(long j2) {
        char c2;
        long j3 = 0;
        if (j2 >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long days = timeUnit.toDays(j2);
            long millis = j2 - TimeUnit.DAYS.toMillis(days);
            long hours = timeUnit.toHours(millis);
            long millis2 = millis - TimeUnit.HOURS.toMillis(hours);
            long minutes = timeUnit.toMinutes(millis2);
            long millis3 = millis2 - TimeUnit.MINUTES.toMillis(minutes);
            long seconds = timeUnit.toSeconds(millis3);
            long millis4 = millis3 - TimeUnit.SECONDS.toMillis(seconds);
            StringBuilder sb = new StringBuilder(64);
            if (days > 0) {
                Long valueOf = Long.valueOf(days);
                c2 = 0;
                sb.append(String.format("%02d", valueOf));
                sb.append(":");
                j3 = 0;
            } else {
                c2 = 0;
            }
            if (hours > j3) {
                Object[] objArr = new Object[1];
                objArr[c2] = Long.valueOf(hours);
                sb.append(String.format("%02d", objArr));
                sb.append(": ");
            }
            if (minutes > 0) {
                sb.append(String.format("%02d", Long.valueOf(minutes)));
                sb.append(":");
            } else if (seconds >= 0) {
                sb.append("00");
                sb.append(":");
            }
            if (millis4 >= 0 && seconds <= 0) {
                seconds++;
            }
            if (seconds >= 0) {
                sb.append(String.format("%02d", Long.valueOf(seconds)));
            } else {
                sb.append("00");
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }

    public static String f(long j2) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        if (j2 / 1024 < 1024) {
            return decimalFormat.format(j2 / 1024.0d) + "KB";
        } else if (j2 / 1048576 < 1024) {
            return decimalFormat.format(j2 / 1048576.0d) + "MB";
        } else {
            return decimalFormat.format(j2 / 1.073741824E9d) + "GB";
        }
    }

    public static long g(long j2, long j3) {
        return Math.max(0, Math.min(100, Math.round((float) ((j2 / j3) * 100.0d))));
    }

    public static Uri h(Context context, File file) {
        return FileProvider.a(context, "com.video_converter.video_compressor").b(file);
    }

    public static Uri i(Context context, String str, boolean z) {
        Uri uri;
        ContentResolver contentResolver = context.getContentResolver();
        if (z) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        Cursor query = contentResolver.query(uri, new String[]{"_id"}, f.a.b.a.a.p("_data", "=? "), new String[]{str}, null);
        if (query != null && query.moveToFirst()) {
            int i2 = query.getInt(query.getColumnIndex("_id"));
            query.close();
            Uri uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            return Uri.withAppendedPath(uri2, "" + i2);
        } else if (new File(str).exists()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", str);
            return context.getContentResolver().insert(z ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            return null;
        }
    }

    public static ProgressDialog j(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context, 2);
        progressDialog.setProgressStyle(0);
        if (str == null) {
            str = context.getString(R.string.please_wait);
        }
        progressDialog.setMessage(str);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public static void k(Activity activity) {
        activity.startActivity(new Intent(activity, PurchaseScreenActivity.class));
    }

    public static void l(Activity activity, boolean z) {
        if (z) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }

    public static void m(Context context, String str) {
        Uri i2;
        if (str == null) {
            return;
        }
        File file = new File(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268468225);
        try {
            i2 = h(context, file);
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                i2 = i(context, str, false);
            } catch (Exception unused) {
                Toast.makeText(context, context.getResources().getString(R.string.error_playing_file), 0).show();
                return;
            }
        }
        f.n.a.j.d dVar = new f.n.a.j.d();
        try {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "video";
            }
            dVar.d(context, i2, mimeTypeFromExtension);
        } catch (Exception e3) {
            e3.printStackTrace();
            try {
                dVar.d(context, i2, "video");
            } catch (Exception unused2) {
                Toast.makeText(context, context.getResources().getString(R.string.error_opening_file), 0).show();
            }
        }
    }

    public static void n(final n nVar) {
        p pVar;
        StringBuilder A = f.a.b.a.a.A("proceedRateus: ");
        A.append(nVar.getClass().getSimpleName());
        Log.d("rateusDebug", A.toString());
        Context applicationContext = nVar.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = nVar;
        }
        final f.h.b.d.a.g.c cVar = new f.h.b.d.a.g.c(new f.h.b.d.a.g.g(applicationContext));
        f.h.b.d.a.g.g gVar = cVar.a;
        f.h.b.d.a.e.f fVar = f.h.b.d.a.g.g.c;
        fVar.d("requestInAppReview (%s)", gVar.b);
        if (gVar.a == null) {
            fVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            pVar = f.h.b.c.a.h1(new ReviewException(-1));
        } else {
            f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
            gVar.a.b(new f.h.b.d.a.g.e(gVar, mVar, mVar), mVar);
            pVar = mVar.a;
        }
        pVar.a(new f.h.b.d.a.i.a() { // from class: f.n.a.v.a.a
            @Override // f.h.b.d.a.i.a
            public final void a(p pVar2) {
                p pVar3;
                f.h.b.d.a.g.c cVar2 = f.h.b.d.a.g.c.this;
                final n nVar2 = nVar;
                StringBuilder A2 = f.a.b.a.a.A("proceedRateus: task ");
                A2.append(pVar2.d());
                Log.d("RateUs", A2.toString());
                if (pVar2.d()) {
                    ReviewInfo reviewInfo = (ReviewInfo) pVar2.c();
                    Objects.requireNonNull(cVar2);
                    if (reviewInfo.c()) {
                        pVar3 = new p();
                        pVar3.f(null);
                    } else {
                        Intent intent = new Intent(nVar2, PlayCoreDialogWrapperActivity.class);
                        intent.putExtra("confirmation_intent", reviewInfo.b());
                        intent.putExtra("window_flags", nVar2.getWindow().getDecorView().getWindowSystemUiVisibility());
                        f.h.b.d.a.i.m mVar2 = new f.h.b.d.a.i.m();
                        intent.putExtra("result_receiver", new zzc(cVar2.b, mVar2));
                        nVar2.startActivity(intent);
                        pVar3 = mVar2.a;
                    }
                    pVar3.a(new f.h.b.d.a.i.a() { // from class: f.n.a.v.a.b
                        @Override // f.h.b.d.a.i.a
                        public final void a(p pVar4) {
                            f.l.b.c.j(n.this, Integer.class, "rate_us_process_count_p", 0);
                        }
                    });
                }
            }
        });
    }

    public static void o(Context context, Uri uri, boolean z) {
        String str = z ? "audio/*" : "video/*";
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.share_via)));
    }

    public static void p(Context context, ProcessingInfo processingInfo, boolean z) {
        Uri i2;
        Uri i3;
        if (processingInfo.f1378i != null) {
            try {
                try {
                    f.l.a.e.a.b bVar = new f.l.a.e.a.b(context);
                    i.l.b.i.e(bVar, "outputMediaRepository");
                    String name = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getName();
                    f.l.a.d.d.f fVar = new f.l.a.d.d.f(null, name + File.separator + "VideoCompressor", processingInfo.e(), null, null);
                    i.l.b.i.e(fVar, CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY);
                    f.l.a.d.c.a<f.l.a.d.d.g> e2 = bVar.e(fVar);
                    Log.d("TAG", "shareFile:DATATEST " + e2);
                    if (e2 instanceof a.b) {
                        Log.d("YESTHISISOK", "showOutputInfo: ");
                        f.l.a.d.d.g gVar = (f.l.a.d.d.g) ((a.b) e2).a;
                        Log.d("TAG", "shareFile:DATATEST " + gVar);
                        o(context, Uri.parse(gVar.e()), z);
                    } else if (e2 instanceof a.C0157a) {
                        Log.d("TAG", "showOutputInfo: fetch error " + ((a.C0157a) e2).a);
                        try {
                            i3 = h(context, new File(processingInfo.f1378i));
                        } catch (Exception unused) {
                            i3 = i(context, processingInfo.f1378i, z);
                        }
                        o(context, i3, z);
                    }
                } catch (Exception unused2) {
                    i2 = i(context, processingInfo.f1378i, z);
                    o(context, i2, z);
                }
            } catch (Exception unused3) {
                i2 = h(context, new File(processingInfo.f1378i));
                o(context, i2, z);
            }
        }
    }

    public static void q(n nVar) {
        try {
            f.l.b.c.j(nVar, Integer.class, "last_rating_shown_for", (Integer) f.l.b.c.b(nVar, Integer.class, "rate_us_process_count_p"));
        } catch (Exception unused) {
        }
        f.l.b.e eVar = new f.l.b.e(nVar);
        eVar.o = new e(nVar);
        FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
        eVar.f6797g = firebaseRemoteConfig == null ? 5 : (int) firebaseRemoteConfig.getLong("play_rating_enable_min");
        eVar.show();
    }

    public static void r(Context context, DialogInterface.OnClickListener onClickListener) {
        h.a aVar = new h.a(context, R.style.MyDialogTheme);
        aVar.setTitle(context.getResources().getString(R.string.required_permission));
        String string = context.getResources().getString(R.string.permission_msg);
        AlertController.b bVar = aVar.a;
        bVar.f102g = string;
        bVar.f107l = false;
        String string2 = context.getResources().getString(R.string.allow);
        a aVar2 = new a(onClickListener);
        AlertController.b bVar2 = aVar.a;
        bVar2.f103h = string2;
        bVar2.f104i = aVar2;
        String string3 = context.getResources().getString(R.string.dont_allow);
        b bVar3 = new b(onClickListener);
        AlertController.b bVar4 = aVar.a;
        bVar4.f105j = string3;
        bVar4.f106k = bVar3;
        aVar.create().show();
    }

    public static void s(Context context, String str, String str2, f.n.a.j.c cVar) {
        h.a aVar = new h.a(context);
        aVar.a.c = R.drawable.ic_warning_yellow;
        aVar.setTitle(str);
        aVar.a.f102g = str2;
        String string = context.getString(R.string.cancel);
        AlertController.b bVar = aVar.a;
        bVar.f105j = string;
        bVar.f106k = null;
        String string2 = context.getString(R.string.confirm);
        c cVar2 = new c(cVar);
        AlertController.b bVar2 = aVar.a;
        bVar2.f103h = string2;
        bVar2.f104i = cVar2;
        e.b.c.h create = aVar.create();
        try {
            create.getWindow().setSoftInputMode(4);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        create.show();
    }

    public static void t(Context context, String str, boolean z) {
        boolean z2;
        new Bundle().putString("user_clicked_for", str);
        if (!z) {
            try {
                z2 = true;
                context.getApplicationContext().getPackageManager().getPackageInfo(str, 1);
            } catch (PackageManager.NameNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                try {
                    context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
        StringBuilder E = f.a.b.a.a.E("https://play.google.com/store/apps/details?id=", str, "&referrer=utm_source%3D");
        E.append(context.getApplicationContext().getPackageName());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(E.toString()));
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public static void u(Context context) {
        f.l.b.c.j(context, Integer.class, "rate_us_process_count_p", Integer.valueOf(((Integer) f.l.b.c.b(context, Integer.class, "rate_us_process_count_p")).intValue() + 1));
    }
}
