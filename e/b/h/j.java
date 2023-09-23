package e.b.h;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.video_converter.video_compressor.R;
import e.i.j.e;
import java.util.Objects;

/* compiled from: AppCompatEditText.java */
/* loaded from: classes.dex */
public class j extends EditText implements e.i.j.s {

    /* renamed from: f  reason: collision with root package name */
    public final e f1792f;

    /* renamed from: g  reason: collision with root package name */
    public final y f1793g;

    /* renamed from: h  reason: collision with root package name */
    public final x f1794h;

    /* renamed from: i  reason: collision with root package name */
    public final e.i.k.h f1795i;

    /* renamed from: j  reason: collision with root package name */
    public final k f1796j;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // e.i.j.s
    public e.i.j.e a(e.i.j.e eVar) {
        return this.f1795i.a(this, eVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1792f;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1793g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e.i.a.k0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1792f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1792f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.f1794h) != null) {
            return xVar.a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        String[] l2;
        String[] stringArray;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1793g.g(this, onCreateInputConnection, editorInfo);
        e.b.a.c(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && (i2 = Build.VERSION.SDK_INT) <= 30 && (l2 = e.i.j.z.l(this)) != null) {
            if (i2 >= 25) {
                editorInfo.contentMimeTypes = l2;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", l2);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", l2);
            }
            e.i.j.i0.d dVar = new e.i.j.i0.d(this);
            Objects.requireNonNull(editorInfo, "editorInfo must be non-null");
            if (i2 >= 25) {
                cVar = new e.i.j.i0.b(onCreateInputConnection, false, dVar);
            } else {
                if (i2 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray == null) {
                        stringArray = e.i.j.i0.a.a;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle == null) {
                        stringArray = e.i.j.i0.a.a;
                    } else {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray == null) {
                            stringArray = e.i.j.i0.a.a;
                        }
                    }
                }
                if (stringArray.length != 0) {
                    cVar = new e.i.j.i0.c(onCreateInputConnection, false, dVar);
                }
            }
            onCreateInputConnection = cVar;
        }
        return this.f1796j.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 < 31 && i2 >= 24 && dragEvent.getLocalState() == null && e.i.j.z.l(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = t.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        e.b cVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && e.i.j.z.l(this) != null && (i2 == 16908322 || i2 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i3 >= 31) {
                    cVar = new e.a(primaryClip, 1);
                } else {
                    cVar = new e.c(primaryClip, 1);
                }
                cVar.b(i2 != 16908322 ? 1 : 0);
                e.i.j.z.r(this, cVar.build());
            }
            r1 = 1;
        }
        if (r1 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1792f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1792f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e.i.a.m0(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1796j.b.a.c(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1796j.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1792f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1792f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1793g;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.f1794h) != null) {
            xVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1792f = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f1793g = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
        this.f1794h = new x(this);
        this.f1795i = new e.i.k.h();
        k kVar = new k(this);
        this.f1796j = kVar;
        kVar.b(attributeSet, i2);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a = kVar.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
