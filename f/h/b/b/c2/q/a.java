package f.h.b.b.c2.q;

import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaDecoder.java */
/* loaded from: classes.dex */
public final class a extends f.h.b.b.c2.d {
    public static final Pattern s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean n;
    public final b o;
    public Map<String, c> p;
    public float q;
    public float r;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.q = -3.4028235E38f;
        this.r = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.n = true;
            int i2 = b0.a;
            String str = new String(list.get(0), f.h.c.a.c.c);
            j.c(str.startsWith("Format:"));
            b a = b.a(str);
            Objects.requireNonNull(a);
            this.o = a;
            m(new t(list.get(1)));
            return;
        }
        this.n = false;
        this.o = null;
    }

    public static int k(long j2, List<Long> list, List<List<f.h.b.b.c2.c>> list2) {
        int i2;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            } else if (list.get(size).longValue() == j2) {
                return size;
            } else {
                if (list.get(size).longValue() < j2) {
                    i2 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i2, Long.valueOf(j2));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList(list2.get(i2 - 1)));
        return i2;
    }

    public static float l(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return i2 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    public static long n(String str) {
        Matcher matcher = s.matcher(str.trim());
        if (matcher.matches()) {
            String group = matcher.group(1);
            int i2 = b0.a;
            long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
            return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e4 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ff A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245 A[LOOP:2: B:117:0x0243->B:118:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    @Override // f.h.b.b.c2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f.h.b.b.c2.f j(byte[] r33, int r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.q.a.j(byte[], int, boolean):f.h.b.b.c2.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(f.h.b.b.g2.t r20) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.q.a.m(f.h.b.b.g2.t):void");
    }
}
