package f.e.a.l.q;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes.dex */
public abstract class k {
    public static final k a = new a();
    public static final k b = new b();
    public static final k c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final k f3349d = new d();

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class a extends k {
        @Override // f.e.a.l.q.k
        public boolean a() {
            return false;
        }

        @Override // f.e.a.l.q.k
        public boolean b() {
            return false;
        }

        @Override // f.e.a.l.q.k
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // f.e.a.l.q.k
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class b extends k {
        @Override // f.e.a.l.q.k
        public boolean a() {
            return true;
        }

        @Override // f.e.a.l.q.k
        public boolean b() {
            return false;
        }

        @Override // f.e.a.l.q.k
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // f.e.a.l.q.k
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class c extends k {
        @Override // f.e.a.l.q.k
        public boolean a() {
            return false;
        }

        @Override // f.e.a.l.q.k
        public boolean b() {
            return true;
        }

        @Override // f.e.a.l.q.k
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // f.e.a.l.q.k
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class d extends k {
        @Override // f.e.a.l.q.k
        public boolean a() {
            return true;
        }

        @Override // f.e.a.l.q.k
        public boolean b() {
            return true;
        }

        @Override // f.e.a.l.q.k
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // f.e.a.l.q.k
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
