package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e.i.i.b;
import f.h.b.c.n.t;
import java.util.Collection;

/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, t<S> tVar);

    int M(Context context);

    boolean O();

    Collection<Long> T();

    S X();

    String a(Context context);

    void i0(long j2);

    Collection<b<Long, Long>> l();
}
