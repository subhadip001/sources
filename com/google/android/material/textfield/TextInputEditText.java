package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.video_converter.video_compressor.R;
import e.b.h.j;
import f.h.b.c.b;
import f.h.b.c.c0.a.a;
import f.h.b.c.s.r;
import java.util.Locale;

/* loaded from: classes.dex */
public class TextInputEditText extends j {

    /* renamed from: k  reason: collision with root package name */
    public final Rect f1220k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1221l;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, R.attr.editTextStyle);
        this.f1220k = new Rect();
        int[] iArr = b.I;
        r.a(context, attributeSet, R.attr.editTextStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputEditText);
        r.b(context, attributeSet, iArr, R.attr.editTextStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean b(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f1221l;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!b(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f1220k);
        rect.bottom = this.f1220k.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (b(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.J) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.J && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // e.b.h.j, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        str = "";
        String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : "";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) text);
            sb.append(TextUtils.isEmpty(charSequence) ? "" : f.a.b.a.a.p(", ", charSequence));
            str = sb.toString();
        } else if (!TextUtils.isEmpty(charSequence)) {
            str = charSequence;
        }
        accessibilityNodeInfo.setText(str);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (b(textInputLayout) && rect != null) {
            this.f1220k.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f1220k);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f1221l = z;
    }
}
