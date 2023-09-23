package f.h.h;

import com.google.protobuf.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes2.dex */
public class w implements m0 {
    public static final w a = new w();

    @Override // f.h.h.m0
    public l0 a(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (l0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e2) {
                StringBuilder A = f.a.b.a.a.A("Unable to get message info for ");
                A.append(cls.getName());
                throw new RuntimeException(A.toString(), e2);
            }
        }
        StringBuilder A2 = f.a.b.a.a.A("Unsupported message type: ");
        A2.append(cls.getName());
        throw new IllegalArgumentException(A2.toString());
    }

    @Override // f.h.h.m0
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
