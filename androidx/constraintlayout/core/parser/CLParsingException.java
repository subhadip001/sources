package androidx.constraintlayout.core.parser;

import f.a.b.a.a;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {
    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A = a.A("CLParsingException (");
        A.append(hashCode());
        A.append(") : ");
        A.append("null (null at line 0)");
        return A.toString();
    }
}
