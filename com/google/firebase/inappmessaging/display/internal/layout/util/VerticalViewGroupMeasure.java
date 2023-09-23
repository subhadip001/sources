package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import com.google.firebase.inappmessaging.display.internal.Logging;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class VerticalViewGroupMeasure {

    /* renamed from: h  reason: collision with root package name */
    private int f1281h;
    private List<ViewMeasure> vms;
    private int w;

    public VerticalViewGroupMeasure(int i2, int i3) {
        this.vms = new ArrayList();
        this.w = i2;
        this.f1281h = i3;
    }

    public void add(View view, boolean z) {
        ViewMeasure viewMeasure = new ViewMeasure(view, z);
        viewMeasure.setMaxDimens(this.w, this.f1281h);
        this.vms.add(viewMeasure);
    }

    public void allocateSpace(int i2) {
        float f2;
        ArrayList arrayList = new ArrayList();
        for (ViewMeasure viewMeasure : this.vms) {
            if (viewMeasure.isFlex()) {
                arrayList.add(viewMeasure);
            }
        }
        Collections.sort(arrayList, new Comparator<ViewMeasure>() { // from class: com.google.firebase.inappmessaging.display.internal.layout.util.VerticalViewGroupMeasure.1
            @Override // java.util.Comparator
            public int compare(ViewMeasure viewMeasure2, ViewMeasure viewMeasure3) {
                if (viewMeasure2.getDesiredHeight() > viewMeasure3.getDesiredHeight()) {
                    return -1;
                }
                return viewMeasure2.getDesiredHeight() < viewMeasure3.getDesiredHeight() ? 1 : 0;
            }
        });
        int i3 = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i3 += ((ViewMeasure) it.next()).getDesiredHeight();
        }
        int size = arrayList.size();
        if (size < 6) {
            float f3 = 1.0f - ((size - 1) * 0.2f);
            Logging.logdPair("VVGM (minFrac, maxFrac)", 0.2f, f3);
            float f4 = 0.0f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ViewMeasure viewMeasure2 = (ViewMeasure) it2.next();
                float desiredHeight = viewMeasure2.getDesiredHeight() / i3;
                if (desiredHeight > f3) {
                    f4 += desiredHeight - f3;
                    f2 = f3;
                } else {
                    f2 = desiredHeight;
                }
                if (desiredHeight < 0.2f) {
                    float min = Math.min(0.2f - desiredHeight, f4);
                    f4 -= min;
                    f2 = desiredHeight + min;
                }
                Logging.logdPair("\t(desired, granted)", desiredHeight, f2);
                viewMeasure2.setMaxDimens(this.w, (int) (f2 * i2));
            }
            return;
        }
        throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
    }

    public int getTotalFixedHeight() {
        int i2 = 0;
        for (ViewMeasure viewMeasure : this.vms) {
            if (!viewMeasure.isFlex()) {
                i2 = viewMeasure.getDesiredHeight() + i2;
            }
        }
        return i2;
    }

    public int getTotalHeight() {
        int i2 = 0;
        for (ViewMeasure viewMeasure : this.vms) {
            i2 += viewMeasure.getDesiredHeight();
        }
        return i2;
    }

    public List<ViewMeasure> getViews() {
        return this.vms;
    }

    public void reset(int i2, int i3) {
        this.w = i2;
        this.f1281h = i3;
        this.vms = new ArrayList();
    }

    public VerticalViewGroupMeasure() {
        this.vms = new ArrayList();
        this.w = 0;
        this.f1281h = 0;
    }
}
