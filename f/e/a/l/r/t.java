package f.e.a.l.r;

import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamEncoder.java */
/* loaded from: classes.dex */
public class t implements f.e.a.l.a<InputStream> {
    public final f.e.a.l.q.b0.b a;

    public t(f.e.a.l.q.b0.b bVar) {
        this.a = bVar;
    }

    @Override // f.e.a.l.a
    public boolean a(InputStream inputStream, File file, f.e.a.l.l lVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.a.e(LogFileManager.MAX_LOG_SIZE, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.a.d(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.a.d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException unused2) {
        }
        this.a.d(bArr);
        return z;
    }
}
