package com.google.common.util.concurrent;

import f.h.c.b.a0;
import f.h.c.b.v;
import f.h.c.b.z;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class CycleDetectingLockFactory {
    public static final Logger a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class Policies {
        private static final /* synthetic */ Policies[] $VALUES;
        public static final Policies DISABLED;
        public static final Policies THROW;
        public static final Policies WARN;

        /* loaded from: classes.dex */
        public enum a extends Policies {
            public a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        }

        /* loaded from: classes.dex */
        public enum b extends Policies {
            public b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.a.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        }

        /* loaded from: classes.dex */
        public enum c extends Policies {
            public c(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        static {
            a aVar = new a("THROW", 0);
            THROW = aVar;
            b bVar = new b("WARN", 1);
            WARN = bVar;
            c cVar = new c("DISABLED", 2);
            DISABLED = cVar;
            $VALUES = new Policies[]{aVar, bVar, cVar};
        }

        public Policies(String str, int i2, a aVar) {
        }

        public static Policies valueOf(String str) {
            return (Policies) Enum.valueOf(Policies.class, str);
        }

        public static Policies[] values() {
            return (Policies[]) $VALUES.clone();
        }

        public abstract /* synthetic */ void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    /* loaded from: classes.dex */
    public static final class PotentialDeadlockException extends b {
        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            return new StringBuilder(message).toString();
        }
    }

    /* loaded from: classes.dex */
    public class a extends ThreadLocal<ArrayList<c>> {
        @Override // java.lang.ThreadLocal
        public ArrayList<c> initialValue() {
            f.h.b.c.a.w(3, "initialArraySize");
            return new ArrayList<>(3);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IllegalStateException {
        static {
            String name = CycleDetectingLockFactory.class.getName();
            String name2 = b.class.getName();
            String name3 = c.class.getName();
            int i2 = v.f5998h;
            v.k(3, name, name2, name3);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    static {
        z zVar = new z();
        a0.n nVar = a0.n.f5883g;
        a0.n nVar2 = zVar.b;
        f.h.b.c.a.D(nVar2 == null, "Key strength was already set to %s", nVar2);
        zVar.b = nVar;
        zVar.a = true;
        a0.z<Object, Object, a0.d> zVar2 = a0.o;
        a0.n a2 = zVar.a();
        a0.n nVar3 = a0.n.f5882f;
        if (a2 == nVar3 && zVar.b() == nVar3) {
            new a0(zVar, a0.o.a.a);
        } else if (zVar.a() == nVar3 && zVar.b() == nVar) {
            new a0(zVar, a0.q.a.a);
        } else if (zVar.a() == nVar && zVar.b() == nVar3) {
            new a0(zVar, a0.u.a.a);
        } else if (zVar.a() == nVar && zVar.b() == nVar) {
            new a0(zVar, a0.w.a.a);
        } else {
            throw new AssertionError();
        }
        a = Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new a();
    }
}
