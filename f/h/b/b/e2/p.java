package f.h.b.b.e2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
public class p extends WebView {
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return false;
    }
}
