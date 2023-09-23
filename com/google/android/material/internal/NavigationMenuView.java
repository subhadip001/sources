package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.b.g.i.g;
import e.b.g.i.n;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // e.b.g.i.n
    public void b(g gVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
