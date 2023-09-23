package f.h.b.b.a2;

import com.google.android.exoplayer2.Format;

/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes.dex */
public interface c {
    public static final c a = new a();

    /* compiled from: MetadataDecoderFactory.java */
    /* loaded from: classes.dex */
    public class a implements c {
        @Override // f.h.b.b.a2.c
        public boolean a(Format format) {
            String str = format.q;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // f.h.b.b.a2.c
        public b b(Format format) {
            String str = format.q;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new f.h.b.b.a2.h.a();
                    case 1:
                        return new f.h.b.b.a2.j.a();
                    case 2:
                        return new f.h.b.b.a2.k.b();
                    case 3:
                        return new f.h.b.b.a2.i.a();
                    case 4:
                        return new f.h.b.b.a2.l.a();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(Format format);

    b b(Format format);
}
