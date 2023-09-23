package f.h.b.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class z1 implements u3 {

    /* renamed from: g  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5783g = new f.h.b.d.a.e.f("FakeAssetPackService");
    public final String a;
    public final x b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final n2 f5784d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5785e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f5786f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public z1(File file, x xVar, c1 c1Var, Context context, n2 n2Var, f.h.b.d.a.e.u uVar, l2 l2Var) {
        this.a = file.getAbsolutePath();
        this.b = xVar;
        this.c = context;
        this.f5784d = n2Var;
        this.f5785e = uVar;
    }

    public static long f(int i2, long j2) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return j2;
            }
            return 0L;
        }
        return j2 / 2;
    }

    @Override // f.h.b.d.a.b.u3
    public final void a(final int i2, final String str) {
        f5783g.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f5785e.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.x1
            @Override // java.lang.Runnable
            public final void run() {
                z1 z1Var = z1.this;
                int i3 = i2;
                String str2 = str;
                Objects.requireNonNull(z1Var);
                try {
                    z1Var.g(i3, str2, 4);
                } catch (LocalTestingException e2) {
                    z1.f5783g.e("notifyModuleCompleted failed", e2);
                }
            }
        });
    }

    @Override // f.h.b.d.a.b.u3
    public final f.h.b.d.a.i.p b(int i2, String str, String str2, int i3) {
        File[] h2;
        int i4;
        f5783g.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        f.h.b.d.a.i.p pVar = new f.h.b.d.a.i.p();
        try {
        } catch (LocalTestingException e2) {
            f5783g.e("getChunkFileDescriptor failed", e2);
            pVar.e(e2);
        } catch (FileNotFoundException e3) {
            f5783g.e("getChunkFileDescriptor failed", e3);
            pVar.e(new LocalTestingException("Asset Slice file not found.", e3));
        }
        for (File file : h(str)) {
            if (f.h.b.c.a.i1(file).equals(str2)) {
                pVar.f(ParcelFileDescriptor.open(file, 268435456));
                return pVar;
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // f.h.b.d.a.b.u3
    public final void c(int i2, String str, String str2, int i3) {
        f5783g.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // f.h.b.d.a.b.u3
    public final f.h.b.d.a.i.p d(Map map) {
        f5783g.d("syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        f.h.b.d.a.i.p pVar = new f.h.b.d.a.i.p();
        pVar.f(arrayList);
        return pVar;
    }

    @Override // f.h.b.d.a.b.u3
    public final void e(List list) {
        f5783g.d("cancelDownload(%s)", list);
    }

    public final Bundle g(int i2, String str, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f5784d.a());
        bundle.putInt("session_id", i2);
        File[] h2 = h(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j2 = 0;
        for (File file : h2) {
            j2 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String i1 = f.h.b.c.a.i1(file);
            bundle.putParcelableArrayList(f.h.b.c.a.m1("chunk_intents", str, i1), arrayList2);
            try {
                bundle.putString(f.h.b.c.a.m1("uncompressed_hash_sha256", str, i1), f.h.b.c.a.k1(Arrays.asList(file)));
                bundle.putLong(f.h.b.c.a.m1("uncompressed_size", str, i1), file.length());
                arrayList.add(i1);
            } catch (IOException e2) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), e2);
            } catch (NoSuchAlgorithmException e3) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e3);
            }
        }
        bundle.putStringArrayList(f.h.b.c.a.j1("slice_ids", str), arrayList);
        bundle.putLong(f.h.b.c.a.j1("pack_version", str), this.f5784d.a());
        bundle.putInt(f.h.b.c.a.j1("status", str), i3);
        bundle.putInt(f.h.b.c.a.j1("error_code", str), 0);
        bundle.putLong(f.h.b.c.a.j1("bytes_downloaded", str), f(i3, j2));
        bundle.putLong(f.h.b.c.a.j1("total_bytes_to_download", str), j2);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", f(i3, j2));
        bundle.putLong("total_bytes_to_download", j2);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f5786f.post(new Runnable() { // from class: f.h.b.d.a.b.y1
            @Override // java.lang.Runnable
            public final void run() {
                z1 z1Var = z1.this;
                z1Var.b.a(z1Var.c, putExtra);
            }
        });
        return bundle;
    }

    public final File[] h(final String str) {
        File file = new File(this.a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: f.h.b.d.a.b.w1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (f.h.b.c.a.i1(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // f.h.b.d.a.b.u3
    public final void zzf() {
        f5783g.d("keepAlive", new Object[0]);
    }

    @Override // f.h.b.d.a.b.u3
    public final void zzi(int i2) {
        f5783g.d("notifySessionFailed", new Object[0]);
    }
}
