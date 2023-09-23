package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import e.g0.e;
import e.g0.f;
import e.g0.n;
import e.g0.s;
import e.g0.t.t.o;
import e.g0.t.t.p;
import e.g0.t.t.q;
import e.g0.t.t.t.b;
import f.h.c.g.a.c;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f634f;
    }

    public c<f> getForegroundInfoAsync() {
        e.g0.t.t.s.c cVar = new e.g0.t.t.s.c();
        cVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final e getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f632d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f633e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public e.g0.t.t.t.a getTaskExecutor() {
        return this.mWorkerParams.f635g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f632d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f632d.b;
    }

    public s getWorkerFactory() {
        return this.mWorkerParams.f636h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final c<Void> setForegroundAsync(f fVar) {
        this.mRunInForeground = true;
        return ((o) this.mWorkerParams.f638j).a(getApplicationContext(), getId(), fVar);
    }

    public c<Void> setProgressAsync(e eVar) {
        n nVar = this.mWorkerParams.f637i;
        getApplicationContext();
        UUID id = getId();
        q qVar = (q) nVar;
        Objects.requireNonNull(qVar);
        e.g0.t.t.s.c cVar = new e.g0.t.t.s.c();
        e.g0.t.t.t.a aVar = qVar.b;
        ((b) aVar).a.execute(new p(qVar, id, eVar, cVar));
        return cVar;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract c<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0002a extends a {
            public final e a = e.c;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0002a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0002a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (C0002a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder A = f.a.b.a.a.A("Failure {mOutputData=");
                A.append(this.a);
                A.append('}');
                return A.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final e a;

            public c() {
                this.a = e.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder A = f.a.b.a.a.A("Success {mOutputData=");
                A.append(this.a);
                A.append('}');
                return A.toString();
            }

            public c(e eVar) {
                this.a = eVar;
            }
        }
    }
}
