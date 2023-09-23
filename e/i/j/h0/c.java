package e.i.j.h0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e.i.j.z;
import f.h.b.c.b0.h;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        AutoCompleteTextView autoCompleteTextView;
        h.g gVar = (h.g) this.a;
        TextInputLayout textInputLayout = h.this.a;
        if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null) {
            return;
        }
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        CheckableImageButton checkableImageButton = h.this.c;
        int i2 = z ? 2 : 1;
        AtomicInteger atomicInteger = z.a;
        z.d.s(checkableImageButton, i2);
    }
}
