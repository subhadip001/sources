package e.n.a;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import e.n.a.h;
import e.n.a.n;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class k {
    public final h.i a;
    public final n b;
    public h.d c;

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static class a implements h.d {
        public static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
        public final TextPaint a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.a = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class b {
        public int a = 1;
        public final n.a b;
        public n.a c;

        /* renamed from: d  reason: collision with root package name */
        public n.a f2626d;

        /* renamed from: e  reason: collision with root package name */
        public int f2627e;

        /* renamed from: f  reason: collision with root package name */
        public int f2628f;

        public b(n.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
        }

        public int a(int i2) {
            SparseArray<n.a> sparseArray = this.c.a;
            n.a aVar = sparseArray == null ? null : sparseArray.get(i2);
            int i3 = 3;
            if (this.a == 2) {
                if (aVar != null) {
                    this.c = aVar;
                    this.f2628f++;
                } else {
                    if (i2 == 65038) {
                        b();
                    } else {
                        if (!(i2 == 65039)) {
                            n.a aVar2 = this.c;
                            if (aVar2.b != null) {
                                if (this.f2628f == 1) {
                                    if (c()) {
                                        this.f2626d = this.c;
                                        b();
                                    } else {
                                        b();
                                    }
                                } else {
                                    this.f2626d = aVar2;
                                    b();
                                }
                            } else {
                                b();
                            }
                        }
                    }
                    i3 = 1;
                }
                i3 = 2;
            } else if (aVar == null) {
                b();
                i3 = 1;
            } else {
                this.a = 2;
                this.c = aVar;
                this.f2628f = 1;
                i3 = 2;
            }
            this.f2627e = i2;
            return i3;
        }

        public final int b() {
            this.a = 1;
            this.c = this.b;
            this.f2628f = 0;
            return 1;
        }

        public final boolean c() {
            e.n.a.q.a e2 = this.c.b.e();
            int a = e2.a(6);
            if ((a == 0 || e2.b.get(a + e2.a) == 0) ? false : true) {
                return true;
            }
            return this.f2627e == 65039;
        }
    }

    public k(n nVar, h.i iVar, h.d dVar, boolean z, int[] iArr) {
        this.a = iVar;
        this.b = nVar;
        this.c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        l[] lVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (lVarArr = (l[]) editable.getSpans(selectionStart, selectionEnd, l.class)) != null && lVarArr.length > 0) {
            for (l lVar : lVarArr) {
                int spanStart = editable.getSpanStart(lVar);
                int spanEnd = editable.getSpanEnd(lVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (r6 >= r7) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.CharSequence r10, int r11, int r12, e.n.a.j r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.a.k.b(java.lang.CharSequence, int, int, e.n.a.j):boolean");
    }
}
