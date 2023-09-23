package f.h.h;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import f.h.h.a;
import f.h.h.a.AbstractC0148a;
import f.h.h.j;
import f.h.h.n0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0148a<MessageType, BuilderType>> implements n0 {
    public int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0148a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(j jVar) {
        if (!jVar.i()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder A = f.a.b.a.a.A("Serializing ");
        A.append(getClass().getName());
        A.append(" to a ");
        A.append(str);
        A.append(" threw an IOException (should never happen).");
        return A.toString();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(a1 a1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize == -1) {
            int h2 = a1Var.h(this);
            setMemoizedSerializedSize(h2);
            return h2;
        }
        return memoizedSerializedSize;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public void setMemoizedSerializedSize(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // f.h.h.n0
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.b;
            CodedOutputStream.c cVar = new CodedOutputStream.c(bArr, 0, serializedSize);
            writeTo(cVar);
            cVar.b();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e2);
        }
    }

    @Override // f.h.h.n0
    public j toByteString() {
        try {
            int serializedSize = getSerializedSize();
            j jVar = j.f6366g;
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.b;
            CodedOutputStream.c cVar = new CodedOutputStream.c(bArr, 0, serializedSize);
            writeTo(cVar);
            cVar.b();
            return new j.f(bArr);
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e2);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int A = CodedOutputStream.A(serializedSize) + serializedSize;
        if (A > 4096) {
            A = 4096;
        }
        CodedOutputStream.d dVar = new CodedOutputStream.d(outputStream, A);
        dVar.a0(serializedSize);
        writeTo(dVar);
        dVar.i0();
    }

    @Override // f.h.h.n0
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = CodedOutputStream.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream.d dVar = new CodedOutputStream.d(outputStream, serializedSize);
        writeTo(dVar);
        dVar.i0();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: f.h.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0148a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0148a<MessageType, BuilderType>> implements n0.a {
        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = y.a;
            Objects.requireNonNull(iterable);
            if (iterable instanceof c0) {
                List<?> C = ((c0) iterable).C();
                c0 c0Var = (c0) list;
                int size = list.size();
                for (Object obj : C) {
                    if (obj == null) {
                        StringBuilder A = f.a.b.a.a.A("Element at index ");
                        A.append(c0Var.size() - size);
                        A.append(" is null.");
                        String sb = A.toString();
                        int size2 = c0Var.size();
                        while (true) {
                            size2--;
                            if (size2 < size) {
                                break;
                            }
                            c0Var.remove(size2);
                        }
                        throw new NullPointerException(sb);
                    } else if (obj instanceof j) {
                        c0Var.q((j) obj);
                    } else {
                        c0Var.add((String) obj);
                    }
                }
            } else if (iterable instanceof v0) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder A = f.a.b.a.a.A("Element at index ");
                    A.append(list.size() - size);
                    A.append(" is null.");
                    String sb = A.toString();
                    int size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        list.remove(size2);
                    }
                    throw new NullPointerException(sb);
                }
                list.add(t);
            }
        }

        private String getReadingExceptionMessage(String str) {
            StringBuilder A = f.a.b.a.a.A("Reading ");
            A.append(getClass().getName());
            A.append(" from a ");
            A.append(str);
            A.append(" threw an IOException (should never happen).");
            return A.toString();
        }

        public static UninitializedMessageException newUninitializedMessageException(n0 n0Var) {
            return new UninitializedMessageException();
        }

        public abstract BuilderType clone();

        /* renamed from: clone */
        public abstract /* bridge */ /* synthetic */ n0.a mo3clone();

        /* renamed from: clone */
        public abstract /* bridge */ /* synthetic */ Object mo4clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, q qVar) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            m12mergeFrom((InputStream) new C0149a(inputStream, k.t(read, inputStream)), qVar);
            return true;
        }

        public abstract BuilderType mergeFrom(k kVar, q qVar);

        public abstract BuilderType mergeFrom(byte[] bArr, int i2, int i3);

        public abstract BuilderType mergeFrom(byte[] bArr, int i2, int i3, q qVar);

        /* renamed from: mergeFrom */
        public abstract /* bridge */ /* synthetic */ n0.a mo5mergeFrom(k kVar, q qVar);

        /* renamed from: mergeFrom */
        public abstract /* bridge */ /* synthetic */ n0.a mo6mergeFrom(byte[] bArr, int i2, int i3);

        /* renamed from: mergeFrom */
        public abstract /* bridge */ /* synthetic */ n0.a mo7mergeFrom(byte[] bArr, int i2, int i3, q qVar);

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: f.h.h.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0149a extends FilterInputStream {

            /* renamed from: f  reason: collision with root package name */
            public int f6322f;

            public C0149a(InputStream inputStream, int i2) {
                super(inputStream);
                this.f6322f = i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f6322f);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f6322f <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f6322f--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) {
                int skip = (int) super.skip(Math.min(j2, this.f6322f));
                if (skip >= 0) {
                    this.f6322f -= skip;
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) {
                int i4 = this.f6322f;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f6322f -= read;
                }
                return read;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, q.a());
        }

        /* renamed from: mergeFrom */
        public BuilderType m10mergeFrom(k kVar) {
            return mergeFrom(kVar, q.a());
        }

        /* renamed from: mergeFrom */
        public BuilderType m8mergeFrom(j jVar) {
            try {
                k j2 = jVar.j();
                m10mergeFrom(j2);
                j2.a(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e3);
            }
        }

        /* renamed from: mergeFrom */
        public BuilderType m9mergeFrom(j jVar, q qVar) {
            try {
                k j2 = jVar.j();
                mergeFrom(j2, qVar);
                j2.a(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e3);
            }
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        /* renamed from: mergeFrom */
        public BuilderType m13mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        /* renamed from: mergeFrom */
        public BuilderType m14mergeFrom(byte[] bArr, q qVar) {
            return mergeFrom(bArr, 0, bArr.length, qVar);
        }

        /* renamed from: mergeFrom */
        public BuilderType m11mergeFrom(InputStream inputStream) {
            k f2 = k.f(inputStream);
            m10mergeFrom(f2);
            f2.a(0);
            return this;
        }

        /* renamed from: mergeFrom */
        public BuilderType m12mergeFrom(InputStream inputStream, q qVar) {
            k f2 = k.f(inputStream);
            mergeFrom(f2, qVar);
            f2.a(0);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.h.n0.a
        public BuilderType mergeFrom(n0 n0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(n0Var)) {
                return (BuilderType) internalMergeFrom((a) n0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0148a.addAll((Iterable) iterable, (List) list);
    }
}
