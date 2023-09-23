package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import f.h.b.b.c1;
import f.h.b.b.u1.n;
import f.h.b.b.u1.t;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface AudioSink {

    /* loaded from: classes.dex */
    public static final class InitializationException extends Exception {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f728f;

        /* renamed from: g  reason: collision with root package name */
        public final Format f729g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InitializationException(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.Format r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = " "
                r2.append(r4)
                java.lang.String r4 = "Config("
                r2.append(r4)
                java.lang.String r4 = ", "
                f.a.b.a.a.P(r2, r5, r4, r6, r4)
                r2.append(r7)
                java.lang.String r4 = ")"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4, r10)
                r3.f728f = r9
                r3.f729g = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, com.google.android.exoplayer2.Format, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class WriteException extends Exception {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f730f;

        /* renamed from: g  reason: collision with root package name */
        public final Format f731g;

        public WriteException(int i2, Format format, boolean z) {
            super(f.a.b.a.a.d(36, "AudioTrack write failed: ", i2));
            this.f730f = z;
            this.f731g = format;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    boolean a(Format format);

    boolean b();

    c1 c();

    void d();

    void e();

    void flush();

    void h(c1 c1Var);

    void i();

    boolean j();

    void k(int i2);

    long l(boolean z);

    void m();

    void n(n nVar);

    void o();

    void p(float f2);

    void q();

    void r();

    boolean s(ByteBuffer byteBuffer, long j2, int i2);

    void t(a aVar);

    int u(Format format);

    void v(Format format, int i2, int[] iArr);

    void w(boolean z);

    void x(t tVar);

    /* loaded from: classes.dex */
    public static final class ConfigurationException extends Exception {

        /* renamed from: f  reason: collision with root package name */
        public final Format f727f;

        public ConfigurationException(Throwable th, Format format) {
            super(th);
            this.f727f = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.f727f = format;
        }
    }
}
