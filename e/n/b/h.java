package e.n.b;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes.dex */
public class h implements TransformationMethod {

    /* renamed from: f  reason: collision with root package name */
    public final TransformationMethod f2651f;

    public h(TransformationMethod transformationMethod) {
        this.f2651f = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2651f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || e.n.a.h.a().b() != 1) ? charSequence : e.n.a.h.a().h(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f2651f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i2, rect);
        }
    }
}
