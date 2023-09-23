package e.v;

import android.content.Context;
import androidx.room.RoomDatabase;
import e.x.a.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public class a {
    public final c.InterfaceC0061c a;
    public final Context b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final RoomDatabase.c f2933d;

    /* renamed from: e  reason: collision with root package name */
    public final List<RoomDatabase.b> f2934e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2935f;

    /* renamed from: g  reason: collision with root package name */
    public final RoomDatabase.JournalMode f2936g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f2937h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f2938i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2939j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2940k;

    public a(Context context, String str, c.InterfaceC0061c interfaceC0061c, RoomDatabase.c cVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = interfaceC0061c;
        this.b = context;
        this.c = str;
        this.f2933d = cVar;
        this.f2934e = list;
        this.f2935f = z;
        this.f2936g = journalMode;
        this.f2937h = executor;
        this.f2938i = executor2;
        this.f2939j = z3;
        this.f2940k = z4;
    }

    public boolean a(int i2, int i3) {
        return !((i2 > i3) && this.f2940k) && this.f2939j;
    }
}
