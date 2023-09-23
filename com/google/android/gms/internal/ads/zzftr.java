package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzftr<V> extends zzfwb implements zzfvj<V> {
    private static final Logger zzaT;
    private static final zza zzaU;
    private static final Object zzaX;
    public static final boolean zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public abstract class zza {
        public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
        }

        public abstract zzd zza(zzftr zzftrVar, zzd zzdVar);

        public abstract zzk zzb(zzftr zzftrVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzftr zzftrVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzftr zzftrVar, Object obj, Object obj2);

        public abstract boolean zzg(zzftr zzftrVar, zzk zzkVar, zzk zzkVar2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzb {
        public static final zzb zza;
        public static final zzb zzb;
        public final boolean zzc;
        public final Throwable zzd;

        static {
            if (zzftr.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        public zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzftr.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzd {
        public static final zzd zza = new zzd();
        public zzd next;
        public final Runnable zzb;
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zze extends zza {
        public final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        public final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        public final AtomicReferenceFieldUpdater<zzftr, zzk> zzc;
        public final AtomicReferenceFieldUpdater<zzftr, zzd> zzd;
        public final AtomicReferenceFieldUpdater<zzftr, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final zzd zza(zzftr zzftrVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzftrVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final zzk zzb(zzftr zzftrVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzftrVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zze(zzftr zzftrVar, zzd zzdVar, zzd zzdVar2) {
            return zzfts.zza(this.zzd, zzftrVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zzf(zzftr zzftrVar, Object obj, Object obj2) {
            return zzfts.zza(this.zze, zzftrVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zzg(zzftr zzftrVar, zzk zzkVar, zzk zzkVar2) {
            return zzfts.zza(this.zzc, zzftrVar, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzf<V> implements Runnable {
        public final zzftr<V> zza;
        public final zzfvj<? extends V> zzb;

        public zzf(zzftr zzftrVar, zzfvj zzfvjVar) {
            this.zza = zzftrVar;
            this.zzb = zzfvjVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzftr) this.zza).value != this) {
                return;
            }
            if (zzftr.zzaU.zzf(this.zza, this, zzftr.zzf(this.zzb))) {
                zzftr.zzy(this.zza);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzg extends zza {
        private zzg() {
            super(null);
        }

        public /* synthetic */ zzg(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final zzd zza(zzftr zzftrVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzftrVar) {
                zzdVar2 = zzftrVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzftrVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final zzk zzb(zzftr zzftrVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzftrVar) {
                zzkVar2 = zzftrVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzftrVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zze(zzftr zzftrVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzftrVar) {
                if (zzftrVar.listeners == zzdVar) {
                    zzftrVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zzf(zzftr zzftrVar, Object obj, Object obj2) {
            synchronized (zzftrVar) {
                if (zzftrVar.value == obj) {
                    zzftrVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zzg(zzftr zzftrVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzftrVar) {
                if (zzftrVar.waiters == zzkVar) {
                    zzftrVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public interface zzh<V> extends zzfvj<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public abstract class zzi<V> extends zzftr<V> implements zzh<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzj extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzftr.zzj.1
                        public static final Unsafe zza() {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() {
                            return zza();
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzftr.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzftr.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzftr.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (Exception e2) {
                    zzfpi.zzb(e2);
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private zzj() {
            super(null);
        }

        public /* synthetic */ zzj(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final zzd zza(zzftr zzftrVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzftrVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzftrVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final zzk zzb(zzftr zzftrVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzftrVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzftrVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zze(zzftr zzftrVar, zzd zzdVar, zzd zzdVar2) {
            return zzftt.zza(zza, zzftrVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zzf(zzftr zzftrVar, Object obj, Object obj2) {
            return zzftt.zza(zza, zzftrVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzftr.zza
        public final boolean zzg(zzftr zzftrVar, zzk zzkVar, zzk zzkVar2) {
            return zzftt.zza(zza, zzftrVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
    /* loaded from: classes.dex */
    public final class zzk {
        public static final zzk zza = new zzk(false);
        public volatile zzk next;
        public volatile Thread thread;

        public zzk() {
            zzftr.zzaU.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaT = Logger.getLogger(zzftr.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzftr.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzftr.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzftr.class, Object.class, "value"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzgVar = new zzg(null);
            }
        }
        zzaU = zzgVar;
        if (th != null) {
            Logger logger = zzaT;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzaX = new Object();
    }

    private final void zzA(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzaU.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) {
        if (!(obj instanceof zzb)) {
            if (obj instanceof zzc) {
                throw new ExecutionException(((zzc) obj).zzb);
            }
            if (obj == zzaX) {
                return null;
            }
            return obj;
        }
        Throwable th = ((zzb) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzf(zzfvj zzfvjVar) {
        Throwable zzp;
        if (zzfvjVar instanceof zzh) {
            Object obj = ((zzftr) zzfvjVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzfvjVar instanceof zzfwb) && (zzp = ((zzfwb) zzfvjVar).zzp()) != null) {
            return new zzc(zzp);
        } else {
            boolean isCancelled = zzfvjVar.isCancelled();
            if ((!zzd) & isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzg2 = zzg(zzfvjVar);
                if (!isCancelled) {
                    return zzg2 == null ? zzaX : zzg2;
                }
                String valueOf = String.valueOf(zzfvjVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzb(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(zzfvjVar);
                    valueOf2.length();
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(valueOf2), e2));
                }
                return new zzb(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(zzfvjVar);
                    valueOf3.length();
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(valueOf3), e3));
                }
                return new zzc(e3.getCause());
            } catch (Throwable th2) {
                return new zzc(th2);
            }
        }
    }

    private static Object zzg(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb.append("null");
            } else if (zzg2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private final void zzw(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzx(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfpg.zza(zza());
            } catch (RuntimeException | StackOverflowError e2) {
                String valueOf = String.valueOf(e2.getClass());
                valueOf.length();
                concat = "Exception thrown from implementation: ".concat(valueOf);
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzv(sb);
        }
    }

    private final void zzx(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzy(zzftr zzftrVar) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzaU.zzb(zzftrVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzftrVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzaU.zza(zzftrVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzftrVar = zzfVar.zza;
                    if (zzftrVar.value == zzfVar) {
                        if (zzaU.zzf(zzftrVar, zzfVar, zzf(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = zzaT;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a.w(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof zzf)) {
            if (zzd) {
                zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    zzbVar = zzb.zza;
                } else {
                    zzbVar = zzb.zzb;
                }
                zzbVar.getClass();
            }
            boolean z2 = false;
            zzftr<V> zzftrVar = this;
            while (true) {
                if (zzaU.zzf(zzftrVar, obj, zzbVar)) {
                    if (z) {
                        zzftrVar.zzr();
                    }
                    zzy(zzftrVar);
                    if (!(obj instanceof zzf)) {
                        break;
                    }
                    zzfvj<? extends V> zzfvjVar = ((zzf) obj).zzb;
                    if (zzfvjVar instanceof zzh) {
                        zzftrVar = (zzftr) zzfvjVar;
                        obj = zzftrVar.value;
                        if (!(obj == null) && !(obj instanceof zzf)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        zzfvjVar.cancel(z);
                        break;
                    }
                } else {
                    obj = zzftrVar.value;
                    if (!(obj instanceof zzf)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzaU;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzA(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return zzB(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public String zza() {
        if (this instanceof ScheduledFuture) {
            return a.f(41, "remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    public void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public void zzc(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfos.zzc(runnable, "Runnable was null.");
        zzfos.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzaU.zze(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzaX;
        }
        if (zzaU.zzf(this, null, obj)) {
            zzy(this);
            return true;
        }
        return false;
    }

    public boolean zze(Throwable th) {
        Objects.requireNonNull(th);
        if (zzaU.zzf(this, null, new zzc(th))) {
            zzy(this);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    public final Throwable zzp() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public void zzr() {
    }

    public final void zzs(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzt(zzfvj zzfvjVar) {
        zzc zzcVar;
        Objects.requireNonNull(zzfvjVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzfvjVar.isDone()) {
                if (zzaU.zzf(this, null, zzf(zzfvjVar))) {
                    zzy(this);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, zzfvjVar);
            if (zzaU.zzf(this, null, zzfVar)) {
                try {
                    zzfvjVar.zzc(zzfVar, zzfuo.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Throwable unused) {
                        zzcVar = zzc.zza;
                    }
                    zzaU.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfvjVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long j3 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzaU;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzB(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzA(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzA(zzkVar2);
                            j3 = 0;
                        } else {
                            zzkVar = this.waiters;
                            if (zzkVar == zzk.zza) {
                                break;
                            }
                        }
                    }
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            while (nanos > j3) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzB(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j3 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzftrVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            a.Q(sb, "Waited ", j2, " ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = sb2.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i2 != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i2 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    a.Q(sb3, valueOf, convert, " ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = sb4.concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(a.v(new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzftrVar).length()), sb2, " for ", zzftrVar));
        }
        throw new InterruptedException();
    }
}
