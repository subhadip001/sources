package f.h.f;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes2.dex */
public abstract class p {
    public r a() {
        if (this instanceof r) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public s b() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            f.h.f.b0.b bVar = new f.h.f.b0.b(stringWriter);
            bVar.f6219k = true;
            f.h.f.z.z.o.X.b(bVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
