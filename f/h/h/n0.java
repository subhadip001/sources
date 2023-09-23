package f.h.h;

import com.google.protobuf.CodedOutputStream;
import java.io.OutputStream;

/* compiled from: MessageLite.java */
/* loaded from: classes2.dex */
public interface n0 extends o0 {

    /* compiled from: MessageLite.java */
    /* loaded from: classes2.dex */
    public interface a extends o0, Cloneable {
        n0 build();

        n0 buildPartial();

        a mergeFrom(n0 n0Var);
    }

    u0<? extends n0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    j toByteString();

    void writeTo(CodedOutputStream codedOutputStream);

    void writeTo(OutputStream outputStream);
}
