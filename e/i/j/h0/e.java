package e.i.j.h0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class e {
    public final Object a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final e a;

        public a(e eVar) {
            this.a = eVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            d a = this.a.a(i2);
            if (a == null) {
                return null;
            }
            return a.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            Objects.requireNonNull(this.a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.a.c(i2, i3, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            d b = this.a.b(i2);
            if (b == null) {
                return null;
            }
            return b.a;
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.a);
        }
    }

    public e() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new c(this);
        } else {
            this.a = new b(this);
        }
    }

    public d a(int i2) {
        return null;
    }

    public d b(int i2) {
        return null;
    }

    public boolean c(int i2, int i3, Bundle bundle) {
        return false;
    }

    public e(Object obj) {
        this.a = obj;
    }
}
