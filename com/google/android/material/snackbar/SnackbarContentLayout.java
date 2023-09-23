package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public TextView f1189f;

    /* renamed from: g  reason: collision with root package name */
    public Button f1190g;

    /* renamed from: h  reason: collision with root package name */
    public int f1191h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f1189f.getPaddingTop() == i3 && this.f1189f.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.f1189f;
        AtomicInteger atomicInteger = z.a;
        if (z.e.g(textView)) {
            z.e.k(textView, z.e.f(textView), i3, z.e.e(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f1190g;
    }

    public TextView getMessageView() {
        return this.f1189f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1189f = (TextView) findViewById(R.id.snackbar_text);
        this.f1190g = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (a(1, r0, r0 - r2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (a(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131166100(0x7f070394, float:1.7946436E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131166099(0x7f070393, float:1.7946434E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f1189f
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.f1191h
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.f1190g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f1191h
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f1191h = i2;
    }
}
