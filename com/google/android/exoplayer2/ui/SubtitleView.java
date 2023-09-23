package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import f.h.b.b.c2.b;
import f.h.b.b.c2.c;
import f.h.b.b.c2.k;
import f.h.b.b.e2.g;
import f.h.b.b.e2.q;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements k {

    /* renamed from: f  reason: collision with root package name */
    public List<c> f962f;

    /* renamed from: g  reason: collision with root package name */
    public b f963g;

    /* renamed from: h  reason: collision with root package name */
    public int f964h;

    /* renamed from: i  reason: collision with root package name */
    public float f965i;

    /* renamed from: j  reason: collision with root package name */
    public float f966j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f967k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f968l;

    /* renamed from: m  reason: collision with root package name */
    public int f969m;
    public a n;
    public View o;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<c> list, b bVar, float f2, int i2, float f3);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f962f = Collections.emptyList();
        this.f963g = b.f3918g;
        this.f964h = 0;
        this.f965i = 0.0533f;
        this.f966j = 0.08f;
        this.f967k = true;
        this.f968l = true;
        g gVar = new g(context, attributeSet);
        this.n = gVar;
        this.o = gVar;
        addView(gVar);
        this.f969m = 1;
    }

    private List<c> getCuesWithStylingPreferencesApplied() {
        if (this.f967k && this.f968l) {
            return this.f962f;
        }
        ArrayList arrayList = new ArrayList(this.f962f.size());
        for (int i2 = 0; i2 < this.f962f.size(); i2++) {
            c cVar = this.f962f.get(i2);
            CharSequence charSequence = cVar.a;
            if (!this.f967k) {
                c.b a2 = cVar.a();
                a2.f3938j = -3.4028235E38f;
                a2.f3937i = Integer.MIN_VALUE;
                a2.f3941m = false;
                if (charSequence != null) {
                    a2.a = charSequence.toString();
                }
                cVar = a2.a();
            } else if (!this.f968l && charSequence != null) {
                c.b a3 = cVar.a();
                a3.f3938j = -3.4028235E38f;
                a3.f3937i = Integer.MIN_VALUE;
                if (charSequence instanceof Spanned) {
                    SpannableString valueOf = SpannableString.valueOf(charSequence);
                    for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                        valueOf.removeSpan(absoluteSizeSpan);
                    }
                    for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                        valueOf.removeSpan(relativeSizeSpan);
                    }
                    a3.a = valueOf;
                }
                cVar = a3.a();
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (b0.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private b getUserCaptionStyle() {
        int i2 = b0.a;
        if (i2 >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
                if (i2 >= 21) {
                    return new b(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
                }
                return new b(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return b.f3918g;
        }
        return b.f3918g;
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.o);
        View view = this.o;
        if (view instanceof q) {
            ((q) view).f4141g.destroy();
        }
        this.o = t;
        this.n = t;
        addView(t);
    }

    public void a() {
        setStyle(getUserCaptionStyle());
    }

    public void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.n.a(getCuesWithStylingPreferencesApplied(), this.f963g, this.f965i, this.f964h, this.f966j);
    }

    @Override // f.h.b.b.c2.k
    public void l(List<c> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f968l = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f967k = z;
        c();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f966j = f2;
        c();
    }

    public void setCues(List<c> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f962f = list;
        c();
    }

    public void setFractionalTextSize(float f2) {
        this.f964h = 0;
        this.f965i = f2;
        c();
    }

    public void setStyle(b bVar) {
        this.f963g = bVar;
        c();
    }

    public void setViewType(int i2) {
        if (this.f969m == i2) {
            return;
        }
        if (i2 == 1) {
            setView(new g(getContext(), null));
        } else if (i2 == 2) {
            setView(new q(getContext()));
        } else {
            throw new IllegalArgumentException();
        }
        this.f969m = i2;
    }
}
