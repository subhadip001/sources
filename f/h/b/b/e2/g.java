package f.h.b.b.e2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CanvasSubtitleOutput.java */
/* loaded from: classes.dex */
public final class g extends View implements SubtitleView.a {

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f4113f;

    /* renamed from: g  reason: collision with root package name */
    public List<f.h.b.b.c2.c> f4114g;

    /* renamed from: h  reason: collision with root package name */
    public int f4115h;

    /* renamed from: i  reason: collision with root package name */
    public float f4116i;

    /* renamed from: j  reason: collision with root package name */
    public f.h.b.b.c2.b f4117j;

    /* renamed from: k  reason: collision with root package name */
    public float f4118k;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4113f = new ArrayList();
        this.f4114g = Collections.emptyList();
        this.f4115h = 0;
        this.f4116i = 0.0533f;
        this.f4117j = f.h.b.b.c2.b.f3918g;
        this.f4118k = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<f.h.b.b.c2.c> list, f.h.b.b.c2.b bVar, float f2, int i2, float f3) {
        this.f4114g = list;
        this.f4117j = bVar;
        this.f4116i = f2;
        this.f4115h = i2;
        this.f4118k = f3;
        while (this.f4113f.size() < list.size()) {
            this.f4113f.add(new m(getContext()));
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03e8, code lost:
        if (r3 < r6) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.g.dispatchDraw(android.graphics.Canvas):void");
    }
}
