package f.n.a.v.a;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;

/* compiled from: FileOperationHandler.java */
/* loaded from: classes2.dex */
public class e {

    /* compiled from: FileOperationHandler.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f7086f;

        public a(String str) {
            this.f7086f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f7086f);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* compiled from: FileOperationHandler.java */
    /* loaded from: classes2.dex */
    public class b implements MediaScannerConnection.OnScanCompletedListener {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            if (uri != null) {
                try {
                    this.a.getContentResolver().delete(uri, null, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void a(String str) {
        try {
            File file = new File(str);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    a(file2.getPath());
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void b(Context context, String str) {
        try {
            File file = new File(str);
            MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, null, new b(context));
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
            c(str);
        }
    }

    public static void c(String str) {
        Log.d("_FileOperationHandler", "deleteFileFromPath: " + str);
        if (str == null) {
            return;
        }
        try {
            new Thread(new a(str)).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static long d(String str) {
        if (str != null && new File(str).exists()) {
            return new File(str).length();
        }
        return 0L;
    }

    public static String e(Context context, Uri uri) {
        Throwable th;
        if (uri.toString().startsWith("content://org.telegram.messenger.provider")) {
            Log.d("_FileOperationHandler", "getPath: comes here");
            return (Environment.getExternalStorageDirectory().getPath() + uri.getPath()).replaceAll("/media", "");
        }
        int i2 = Build.VERSION.SDK_INT;
        Uri uri2 = null;
        Cursor cursor = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                String str = split[0];
                if ("primary".equalsIgnoreCase(str)) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
                StringBuilder E = f.a.b.a.a.E("/storage/", str, "/");
                E.append(split[1]);
                String sb = E.toString();
                if (new File(sb).exists()) {
                    return sb;
                }
                StringBuilder A = f.a.b.a.a.A("/storage/sdcard1/");
                A.append(split[1]);
                return A.toString();
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (i2 >= 26) {
                    try {
                        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    try {
                                        String str2 = Environment.getExternalStorageDirectory().toString() + "/Download/" + query.getString(query.getColumnIndexOrThrow("_display_name"));
                                        if (!TextUtils.isEmpty(str2)) {
                                            query.close();
                                            return str2;
                                        }
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (query != null) {
                            query.close();
                            return null;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    return j.d(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
            } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str3 = split2[0];
                if ("image".equals(str3)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str3)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return j.d(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if (FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(uri.getScheme())) {
            if (DocumentsContract.isDocumentUri(context, uri)) {
                String str4 = DocumentsContract.getDocumentId(uri).split(":")[0];
            }
            String d2 = j.d(context, uri, null, null);
            if (d2 == null) {
                try {
                    return new File(uri.getPath()).getPath().replace("external_files", "storage");
                } catch (Exception unused2) {
                    return d2;
                }
            }
            return d2;
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }
}
