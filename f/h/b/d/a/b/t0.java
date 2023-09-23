package f.h.b.d.a.b;

import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: g  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5719g = new f.h.b.d.a.e.f("ExtractChunkTaskHandler");
    public final byte[] a = new byte[8192];
    public final c0 b;
    public final f.h.b.d.a.e.u c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5720d;

    /* renamed from: e  reason: collision with root package name */
    public final c1 f5721e;

    /* renamed from: f  reason: collision with root package name */
    public final l2 f5722f;

    public t0(c0 c0Var, f.h.b.d.a.e.u uVar, f.h.b.d.a.e.u uVar2, c1 c1Var, l2 l2Var) {
        this.b = c0Var;
        this.c = uVar;
        this.f5720d = uVar2;
        this.f5721e = c1Var;
        this.f5722f = l2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|5|6|(1:8)(2:142|143)|9|10|11|(2:13|(12:15|(1:(1:(6:19|20|(2:21|(2:23|24)(1:103))|26|27|(1:29)(2:101|102))(2:104|105))(2:106|(10:108|(7:32|(4:33|(2:37|(1:46)(4:41|(1:43)|44|45))|47|(1:49)(1:73))|51|52|(1:54)|55|(2:57|(1:59)(2:60|(1:62)(3:63|(2:65|(1:67)(2:69|70))(1:72)|68))))|74|75|(2:95|96)|77|78|79|80|(4:82|353|87|88)(1:92))(2:109|110)))(2:111|(4:113|(4:114|(1:116)|117|(1:120)(1:128))|123|(3:125|126|127))(2:129|130))|30|(0)|74|75|(0)|77|78|79|80|(0)(0))(2:131|132))|133|(0)|74|75|(0)|77|78|79|80|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0324, code lost:
        f.h.b.d.a.b.t0.f5719g.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f5709h), r23.f5707f, r23.b);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0389 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b6 A[Catch: all -> 0x02bc, TryCatch #5 {all -> 0x02bc, blocks: (B:63:0x01b6, B:64:0x01bf, B:66:0x01ca, B:68:0x01ce, B:70:0x01d4, B:72:0x01da, B:74:0x0200, B:75:0x020c, B:76:0x0210, B:77:0x0218, B:79:0x021c, B:81:0x0220, B:83:0x0224, B:84:0x0235, B:86:0x023b, B:88:0x0242, B:89:0x0255, B:91:0x0259, B:92:0x0268, B:94:0x026f, B:100:0x02af, B:97:0x0296, B:98:0x029d, B:99:0x029e, B:55:0x0180, B:57:0x0186, B:58:0x0190, B:59:0x0191, B:60:0x01b1), top: B:143:0x0043 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [f.h.b.d.a.b.c0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(f.h.b.d.a.b.s0 r23) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.d.a.b.t0.a(f.h.b.d.a.b.s0):void");
    }

    public final File b(s0 s0Var) {
        File s = this.b.s(s0Var.b, s0Var.c, s0Var.f5705d, s0Var.f5707f);
        if (!s.exists()) {
            s.mkdirs();
        }
        return s;
    }
}
