package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.a;
import f.h.b.c.n.b;
import f.h.b.c.n.k;
import f.h.b.c.n.l;
import f.h.b.c.n.q;
import f.h.b.c.n.x;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: f  reason: collision with root package name */
    public final Calendar f1153f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1154g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1153f = x.e();
        if (l.l(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f1154g = l.m(getContext(), R.attr.nestedScrollable);
        z.w(this, new k(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public q getAdapter2() {
        return (q) super.getAdapter();
    }

    public final View b(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a;
        int width;
        int a2;
        int width2;
        int width3;
        int i2;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        q adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f5346g;
        b bVar = adapter2.f5348i;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.d(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<e.i.i.b<Long, Long>> it = dateSelector.l().iterator();
        while (it.hasNext()) {
            e.i.i.b<Long, Long> next = it.next();
            Long l2 = next.a;
            if (l2 == null) {
                materialCalendarGridView = this;
            } else if (next.b != null) {
                long longValue = l2.longValue();
                long longValue2 = next.b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean y0 = a.y0(this);
                    if (longValue < item.longValue()) {
                        if (max % adapter2.f5345f.f1158i == 0) {
                            left2 = 0;
                        } else if (!y0) {
                            left2 = materialCalendarGridView.b(max - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.b(max - 1).getLeft();
                        }
                        width = left2;
                        a = max;
                    } else {
                        materialCalendarGridView.f1153f.setTimeInMillis(longValue);
                        a = adapter2.a(materialCalendarGridView.f1153f.get(5));
                        View b = materialCalendarGridView.b(a);
                        width = (b.getWidth() / 2) + b.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        if ((min + 1) % adapter2.f5345f.f1158i == 0) {
                            left = getWidth();
                        } else if (!y0) {
                            left = materialCalendarGridView.b(min).getRight();
                        } else {
                            left = materialCalendarGridView.b(min).getLeft();
                        }
                        width2 = left;
                        a2 = min;
                    } else {
                        materialCalendarGridView.f1153f.setTimeInMillis(longValue2);
                        a2 = adapter2.a(materialCalendarGridView.f1153f.get(5));
                        View b2 = materialCalendarGridView.b(a2);
                        width2 = (b2.getWidth() / 2) + b2.getLeft();
                    }
                    int itemId = (int) adapter2.getItemId(a);
                    int i3 = max;
                    int i4 = min;
                    int itemId2 = (int) adapter2.getItemId(a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b3 = materialCalendarGridView.b(numColumns);
                        int top = b3.getTop() + bVar.a.a.top;
                        q qVar = adapter2;
                        int bottom = b3.getBottom() - bVar.a.a.bottom;
                        if (!y0) {
                            i2 = numColumns > a ? 0 : width;
                            width3 = a2 > numColumns2 ? getWidth() : width2;
                        } else {
                            int i5 = a2 > numColumns2 ? 0 : width2;
                            width3 = numColumns > a ? getWidth() : width;
                            i2 = i5;
                        }
                        canvas.drawRect(i2, top, width3, bottom, bVar.f5307h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = qVar;
                    }
                    materialCalendarGridView = this;
                    max = i3;
                    min = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i2, rect);
        } else if (i2 == 33) {
            setSelection(getAdapter2().d());
        } else if (i2 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (super.onKeyDown(i2, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i2) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f1154g) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof q) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()));
    }
}
