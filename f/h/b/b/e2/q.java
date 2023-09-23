package f.h.b.b.e2;

import android.content.Context;
import android.text.Layout;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
public final class q extends FrameLayout implements SubtitleView.a {

    /* renamed from: f  reason: collision with root package name */
    public final g f4140f;

    /* renamed from: g  reason: collision with root package name */
    public final WebView f4141g;

    /* renamed from: h  reason: collision with root package name */
    public List<f.h.b.b.c2.c> f4142h;

    /* renamed from: i  reason: collision with root package name */
    public f.h.b.b.c2.b f4143i;

    /* renamed from: j  reason: collision with root package name */
    public float f4144j;

    /* renamed from: k  reason: collision with root package name */
    public int f4145k;

    /* renamed from: l  reason: collision with root package name */
    public float f4146l;

    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public q(Context context) {
        super(context, null);
        this.f4142h = Collections.emptyList();
        this.f4143i = f.h.b.b.c2.b.f3918g;
        this.f4144j = 0.0533f;
        this.f4145k = 0;
        this.f4146l = 0.08f;
        g gVar = new g(context, null);
        this.f4140f = gVar;
        p pVar = new p(context, null);
        this.f4141g = pVar;
        pVar.setBackgroundColor(0);
        addView(gVar);
        addView(pVar);
    }

    public static int b(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : -100;
        }
        return -50;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<f.h.b.b.c2.c> list, f.h.b.b.c2.b bVar, float f2, int i2, float f3) {
        this.f4143i = bVar;
        this.f4144j = f2;
        this.f4145k = i2;
        this.f4146l = f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f.h.b.b.c2.c cVar = list.get(i3);
            if (cVar.c != null) {
                arrayList.add(cVar);
            } else {
                arrayList2.add(cVar);
            }
        }
        if (!this.f4142h.isEmpty() || !arrayList2.isEmpty()) {
            this.f4142h = arrayList2;
            d();
        }
        this.f4140f.a(arrayList, bVar, f2, i2, f3);
        invalidate();
    }

    public final String c(int i2, float f2) {
        float t = j.t(i2, f2, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return t == -3.4028235E38f ? "unset" : b0.k("%.2fpx", Float.valueOf(t / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03e1, code lost:
        if (((android.text.style.TypefaceSpan) r9).getFamily() != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c3, code lost:
        if (r12 != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c6, code lost:
        if (r12 != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c8, code lost:
        r18 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ca, code lost:
        r0 = 2;
        r19 = "top";
        r20 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.q.d():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!z || this.f4142h.isEmpty()) {
            return;
        }
        d();
    }
}
