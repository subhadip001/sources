package androidx.work.impl;

import androidx.room.RoomDatabase;
import e.g0.t.s.b;
import e.g0.t.s.e;
import e.g0.t.s.h;
import e.g0.t.s.k;
import e.g0.t.s.n;
import e.g0.t.s.q;
import e.g0.t.s.t;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: k  reason: collision with root package name */
    public static final long f639k = TimeUnit.DAYS.toMillis(1);

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f640l = 0;

    public abstract b m();

    public abstract e n();

    public abstract h o();

    public abstract k p();

    public abstract n q();

    public abstract q r();

    public abstract t s();
}
