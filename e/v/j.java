package e.v;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
public class j implements e.x.a.c {

    /* renamed from: f  reason: collision with root package name */
    public final Context f2969f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2970g;

    /* renamed from: h  reason: collision with root package name */
    public final File f2971h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2972i;

    /* renamed from: j  reason: collision with root package name */
    public final e.x.a.c f2973j;

    /* renamed from: k  reason: collision with root package name */
    public a f2974k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2975l;

    @Override // e.x.a.c
    public synchronized e.x.a.b E() {
        if (!this.f2975l) {
            f();
            this.f2975l = true;
        }
        return this.f2973j.E();
    }

    public final void a(File file) {
        ReadableByteChannel channel;
        if (this.f2970g != null) {
            channel = Channels.newChannel(this.f2969f.getAssets().open(this.f2970g));
        } else if (this.f2971h != null) {
            channel = new FileInputStream(this.f2971h).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2969f.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT > 23) {
                channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            } else {
                InputStream newInputStream = Channels.newInputStream(channel);
                OutputStream newOutputStream = Channels.newOutputStream(channel2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            }
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder A = f.a.b.a.a.A("Failed to create directories for ");
                A.append(file.getAbsolutePath());
                throw new IOException(A.toString());
            } else if (createTempFile.renameTo(file)) {
            } else {
                StringBuilder A2 = f.a.b.a.a.A("Failed to move intermediate file (");
                A2.append(createTempFile.getAbsolutePath());
                A2.append(") to destination (");
                A2.append(file.getAbsolutePath());
                A2.append(").");
                throw new IOException(A2.toString());
            }
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    @Override // e.x.a.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2973j.close();
        this.f2975l = false;
    }

    public final void f() {
        String databaseName = this.f2973j.getDatabaseName();
        File databasePath = this.f2969f.getDatabasePath(databaseName);
        e.v.n.a aVar = new e.v.n.a(databaseName, this.f2969f.getFilesDir(), this.f2974k == null);
        try {
            aVar.b.lock();
            if (aVar.c) {
                try {
                    FileChannel channel = new FileOutputStream(aVar.a).getChannel();
                    aVar.f2982d = channel;
                    channel.lock();
                } catch (IOException e2) {
                    throw new IllegalStateException("Unable to grab copy lock.", e2);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar.a();
                    return;
                } catch (IOException e3) {
                    throw new RuntimeException("Unable to copy database file.", e3);
                }
            } else if (this.f2974k == null) {
                aVar.a();
                return;
            } else {
                try {
                    int c = e.v.n.b.c(databasePath);
                    int i2 = this.f2972i;
                    if (c == i2) {
                        aVar.a();
                        return;
                    } else if (this.f2974k.a(c, i2)) {
                        aVar.a();
                        return;
                    } else {
                        if (this.f2969f.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException e4) {
                                Log.w("ROOM", "Unable to copy database file.", e4);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.a();
                        return;
                    }
                } catch (IOException e5) {
                    Log.w("ROOM", "Unable to read database version.", e5);
                    aVar.a();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
        aVar.a();
        throw th;
    }

    @Override // e.x.a.c
    public String getDatabaseName() {
        return this.f2973j.getDatabaseName();
    }

    @Override // e.x.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f2973j.setWriteAheadLoggingEnabled(z);
    }
}
