package f.h.b.b.u1;

import java.util.Arrays;

/* compiled from: AudioCapabilities.java */
/* loaded from: classes.dex */
public final class o {
    public static final o c = new o(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    public static final o f4578d = new o(new int[]{2, 5, 6}, 8);
    public final int[] a;
    public final int b;

    public o(int[] iArr, int i2) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return Arrays.equals(this.a, oVar.a) && this.b == oVar.b;
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public String toString() {
        int i2 = this.b;
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
