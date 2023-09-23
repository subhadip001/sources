package i.l.b;

/* compiled from: PackageReference.kt */
/* loaded from: classes2.dex */
public final class k implements b {
    public final Class<?> a;

    public k(Class<?> cls, String str) {
        i.e(cls, "jClass");
        i.e(str, "moduleName");
        this.a = cls;
    }

    @Override // i.l.b.b
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(this.a, ((k) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
