package io.grpc.stub;

import f.a.b.a.a;
import g.a.y0.c;

/* loaded from: classes2.dex */
public enum InternalClientCalls$StubType {
    BLOCKING(c.d.BLOCKING),
    ASYNC(c.d.ASYNC),
    FUTURE(c.d.FUTURE);
    
    private final c.d internalType;

    InternalClientCalls$StubType(c.d dVar) {
        this.internalType = dVar;
    }

    public static InternalClientCalls$StubType of(c.d dVar) {
        InternalClientCalls$StubType[] values = values();
        for (int i2 = 0; i2 < 3; i2++) {
            InternalClientCalls$StubType internalClientCalls$StubType = values[i2];
            if (internalClientCalls$StubType.internalType == dVar) {
                return internalClientCalls$StubType;
            }
        }
        StringBuilder A = a.A("Unknown StubType: ");
        A.append(dVar.name());
        throw new AssertionError(A.toString());
    }
}
