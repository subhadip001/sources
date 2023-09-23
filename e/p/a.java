package e.p;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import com.video_converter.video_compressor.R;
import e.p.c.r;
import e.s.b0;
import e.s.c0;
import e.s.e0;
import e.s.i0;
import e.u.b.v;
import f.a.a.a.q;
import i.c;
import i.j.d;
import i.j.f;
import i.l.b.i;
import j.a.l0;
import j.a.p;
import j.a.q1;
import j.a.y1.n;
import j.a.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {
    public static long a;
    public static Method b;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x005a -> B:33:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.g0.d a(byte[] r7) {
        /*
            e.g0.d r0 = new e.g0.d
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r7 = r2.readInt()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            e.g0.d$a r5 = new e.g0.d$a     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            r5.<init>(r3, r4)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            java.util.Set<e.g0.d$a> r3 = r0.a     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            r3.add(r5)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L5e
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r7 = move-exception
            r7.printStackTrace()
        L3a:
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L3e:
            r7 = move-exception
            goto L48
        L40:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L5f
        L44:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L48:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r7 = move-exception
            r7.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r7 = move-exception
            r7.printStackTrace()
        L5d:
            return r0
        L5e:
            r7 = move-exception
        L5f:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            r1.close()     // Catch: java.io.IOException -> L6d
            goto L71
        L6d:
            r0 = move-exception
            r0.printStackTrace()
        L71:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.p.a.a(byte[]):e.g0.d");
    }

    public static int b(RecyclerView.x xVar, v vVar, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mVar.S(view) - mVar.S(view2)) + 1;
        }
        return Math.min(vVar.l(), vVar.b(view2) - vVar.e(view));
    }

    public static int c(RecyclerView.x xVar, v vVar, View view, View view2, RecyclerView.m mVar, boolean z, boolean z2) {
        int max;
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(mVar.S(view), mVar.S(view2));
        int max2 = Math.max(mVar.S(view), mVar.S(view2));
        if (z2) {
            max = Math.max(0, (xVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(vVar.b(view2) - vVar.e(view)) / (Math.abs(mVar.S(view) - mVar.S(view2)) + 1))) + (vVar.k() - vVar.e(view)));
        }
        return max;
    }

    public static int d(RecyclerView.x xVar, v vVar, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return xVar.b();
        }
        return (int) (((vVar.b(view2) - vVar.e(view)) / (Math.abs(mVar.S(view) - mVar.S(view2)) + 1)) * xVar.b());
    }

    public static final <VM extends b0> c<VM> e(Fragment fragment, i.o.b<VM> bVar, i.l.a.a<? extends i0> aVar, i.l.a.a<? extends e0> aVar2) {
        i.e(fragment, "$this$createViewModelLazy");
        i.e(bVar, "viewModelClass");
        i.e(aVar, "storeProducer");
        return new c0(bVar, aVar, aVar2);
    }

    public static <T extends RoomDatabase> RoomDatabase.a<T> f(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new RoomDatabase.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static int g(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final j.a.c0 h(b0 b0Var) {
        i.e(b0Var, "$this$viewModelScope");
        j.a.c0 c0Var = (j.a.c0) b0Var.a("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (c0Var != null) {
            return c0Var;
        }
        q1 q1Var = new q1(null);
        z zVar = l0.a;
        Object c = b0Var.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new e.s.c(f.a.C0222a.d(q1Var, n.c.i0())));
        i.d(c, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (j.a.c0) c;
    }

    public static BackoffPolicy i(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return BackoffPolicy.LINEAR;
            }
            throw new IllegalArgumentException(f.a.b.a.a.j("Could not convert ", i2, " to BackoffPolicy"));
        }
        return BackoffPolicy.EXPONENTIAL;
    }

    public static NetworkType j(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
                                return NetworkType.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(f.a.b.a.a.j("Could not convert ", i2, " to NetworkType"));
                        }
                        return NetworkType.METERED;
                    }
                    return NetworkType.NOT_ROAMING;
                }
                return NetworkType.UNMETERED;
            }
            return NetworkType.CONNECTED;
        }
        return NetworkType.NOT_REQUIRED;
    }

    public static OutOfQuotaPolicy k(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return OutOfQuotaPolicy.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(f.a.b.a.a.j("Could not convert ", i2, " to OutOfQuotaPolicy"));
        }
        return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static WorkInfo$State l(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return WorkInfo$State.CANCELLED;
                            }
                            throw new IllegalArgumentException(f.a.b.a.a.j("Could not convert ", i2, " to State"));
                        }
                        return WorkInfo$State.BLOCKED;
                    }
                    return WorkInfo$State.FAILED;
                }
                return WorkInfo$State.SUCCEEDED;
            }
            return WorkInfo$State.RUNNING;
        }
        return WorkInfo$State.ENQUEUED;
    }

    public static boolean m() {
        try {
            if (b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }

    public static r n(Context context, Fragment fragment, boolean z, boolean z2) {
        int exitAnim;
        int nextTransition = fragment.getNextTransition();
        if (z2) {
            if (z) {
                exitAnim = fragment.getPopEnterAnim();
            } else {
                exitAnim = fragment.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = fragment.getEnterAnim();
        } else {
            exitAnim = fragment.getExitAnim();
        }
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, exitAnim);
            if (onCreateAnimation != null) {
                return new r(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, exitAnim);
            if (onCreateAnimator != null) {
                return new r(onCreateAnimator);
            }
            if (exitAnim == 0 && nextTransition != 0) {
                exitAnim = nextTransition != 4097 ? nextTransition != 4099 ? nextTransition != 8194 ? -1 : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            }
            if (exitAnim != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                        if (loadAnimation != null) {
                            return new r(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                        if (loadAnimator != null) {
                            return new r(loadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                            if (loadAnimation2 != null) {
                                return new r(loadAnimation2);
                            }
                        } else {
                            throw e3;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static <T> ObjectAnimator o(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }

    @RecentlyNonNull
    public static final Object p(@RecentlyNonNull f.a.a.a.c cVar, @RecentlyNonNull String str, @RecentlyNonNull d<? super f.a.a.a.n> dVar) {
        p pVar = new p(null);
        final f.a.a.a.f fVar = new f.a.a.a.f(pVar);
        f.a.a.a.d dVar2 = (f.a.a.a.d) cVar;
        if (!dVar2.b()) {
            fVar.a(f.a.a.a.v.f3091l, zzu.zzh());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzn("BillingClient", "Please provide a valid product type.");
            fVar.a(f.a.a.a.v.f3086g, zzu.zzh());
        } else if (dVar2.g(new q(dVar2, str, fVar), 30000L, new Runnable() { // from class: f.a.a.a.f0
            @Override // java.lang.Runnable
            public final void run() {
                ((f) m.this).a(v.f3092m, zzu.zzh());
            }
        }, dVar2.c()) == null) {
            fVar.a(dVar2.e(), zzu.zzh());
        }
        return pVar.Z(dVar);
    }

    public static int q(WorkInfo$State workInfo$State) {
        int ordinal = workInfo$State.ordinal();
        if (ordinal != 0) {
            int i2 = 1;
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    i2 = 3;
                    if (ordinal != 3) {
                        i2 = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + workInfo$State + " to int");
                        }
                    }
                }
            }
            return i2;
        }
        return 0;
    }
}
