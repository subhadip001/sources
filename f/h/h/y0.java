package f.h.h;

import com.google.protobuf.ProtoSyntax;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes2.dex */
public final class y0 implements l0 {
    public final n0 a;
    public final String b;
    public final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6436d;

    public y0(n0 n0Var, String str, Object[] objArr) {
        this.a = n0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6436d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f6436d = i2 | (charAt2 << i3);
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i4 = i5;
        }
    }

    @Override // f.h.h.l0
    public boolean a() {
        return (this.f6436d & 2) == 2;
    }

    @Override // f.h.h.l0
    public n0 b() {
        return this.a;
    }

    @Override // f.h.h.l0
    public ProtoSyntax c() {
        return (this.f6436d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
