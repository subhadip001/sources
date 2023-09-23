package com.google.android.exoplayer2.audio;

import f.h.b.b.g2.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface AudioProcessor {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$a):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f725e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f726d;

        public a(int i2, int i3, int i4) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.f726d = b0.y(i4) ? b0.r(i4, i3) : -1;
        }

        public String toString() {
            int i2 = this.a;
            int i3 = this.b;
            int i4 = this.c;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i2);
            sb.append(", channelCount=");
            sb.append(i3);
            sb.append(", encoding=");
            sb.append(i4);
            sb.append(']');
            return sb.toString();
        }
    }

    boolean a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    void d();

    a e(a aVar);

    void f();

    void flush();

    ByteBuffer getOutput();
}
