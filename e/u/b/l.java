package e.u.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes.dex */
public class l extends RecyclerView.l {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2874d = {16843284};
    public Drawable a;
    public int b;
    public final Rect c = new Rect();

    public l(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2874d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        int height;
        int i2;
        int width;
        int i3;
        if (recyclerView.getLayoutManager() == null || this.a == null) {
            return;
        }
        int i4 = 0;
        if (this.b == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i3 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i3, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i3 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                RecyclerView.N(childAt, this.c);
                int round = Math.round(childAt.getTranslationY()) + this.c.bottom;
                this.a.setBounds(i3, round - this.a.getIntrinsicHeight(), width, round);
                this.a.draw(canvas);
                i4++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i4 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i4);
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            Rect rect = this.c;
            Objects.requireNonNull(layoutManager);
            RecyclerView.N(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationX()) + this.c.right;
            this.a.setBounds(round2 - this.a.getIntrinsicWidth(), i2, round2, height);
            this.a.draw(canvas);
            i4++;
        }
        canvas.restore();
    }
}
