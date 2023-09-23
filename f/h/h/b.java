package f.h.h;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import f.h.h.n0;
import java.io.InputStream;

/* compiled from: AbstractParser.java */
/* loaded from: classes2.dex */
public abstract class b<MessageType extends n0> implements u0<MessageType> {
    public static final q a = q.a();

    @Override // f.h.h.u0
    public Object a(InputStream inputStream) {
        q qVar = a;
        k f2 = k.f(inputStream);
        GeneratedMessageLite parsePartialFrom = GeneratedMessageLite.parsePartialFrom(((GeneratedMessageLite.b) this).b, f2, qVar);
        try {
            f2.a(0);
            c(parsePartialFrom);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // f.h.h.u0
    public Object b(k kVar, q qVar) {
        GeneratedMessageLite parsePartialFrom = GeneratedMessageLite.parsePartialFrom(((GeneratedMessageLite.b) this).b, kVar, qVar);
        c(parsePartialFrom);
        return parsePartialFrom;
    }

    public final MessageType c(MessageType messagetype) {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        if (messagetype instanceof a) {
            uninitializedMessageException = ((a) messagetype).newUninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException a2 = uninitializedMessageException.a();
        a2.f1303f = messagetype;
        throw a2;
    }
}
