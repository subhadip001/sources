package e.p.c;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public final class r0 extends Writer {

    /* renamed from: f  reason: collision with root package name */
    public final String f2772f;

    /* renamed from: g  reason: collision with root package name */
    public StringBuilder f2773g = new StringBuilder(128);

    public r0(String str) {
        this.f2772f = str;
    }

    public final void a() {
        if (this.f2773g.length() > 0) {
            Log.d(this.f2772f, this.f2773g.toString());
            StringBuilder sb = this.f2773g;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c = cArr[i2 + i4];
            if (c == '\n') {
                a();
            } else {
                this.f2773g.append(c);
            }
        }
    }
}
