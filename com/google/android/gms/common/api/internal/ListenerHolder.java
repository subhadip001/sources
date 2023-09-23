package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;
    private volatile L zab;
    private volatile ListenerKey<L> zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class ListenerKey<L> {
        private final L zaa;
        private final String zab;

        @KeepForSdk
        public ListenerKey(L l2, String str) {
            this.zaa = l2;
            this.zab = str;
        }

        @KeepForSdk
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ListenerKey) {
                ListenerKey listenerKey = (ListenerKey) obj;
                return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
            }
            return false;
        }

        @KeepForSdk
        public int hashCode() {
            return this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        @KeepForSdk
        public String toIdString() {
            String str = this.zab;
            int identityHashCode = System.identityHashCode(this.zaa);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(L l2);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(Looper looper, L l2, String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = (L) Preconditions.checkNotNull(l2, "Listener must not be null");
        this.zac = new ListenerKey<>(l2, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @KeepForSdk
    public void notifyListener(final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.zaa(notifier);
            }
        });
    }

    public final void zaa(Notifier<? super L> notifier) {
        Object obj = (L) this.zab;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (RuntimeException e2) {
            notifier.onNotifyListenerFailed();
            throw e2;
        }
    }

    @KeepForSdk
    public ListenerHolder(Executor executor, L l2, String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = (L) Preconditions.checkNotNull(l2, "Listener must not be null");
        this.zac = new ListenerKey<>(l2, Preconditions.checkNotEmpty(str));
    }
}
