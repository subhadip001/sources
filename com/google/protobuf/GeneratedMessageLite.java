package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.a;
import f.h.h.a;
import f.h.h.a1;
import f.h.h.e0;
import f.h.h.g;
import f.h.h.h1;
import f.h.h.j;
import f.h.h.k;
import f.h.h.k1;
import f.h.h.l;
import f.h.h.m;
import f.h.h.n;
import f.h.h.n0;
import f.h.h.o;
import f.h.h.q;
import f.h.h.u;
import f.h.h.u0;
import f.h.h.v;
import f.h.h.w0;
import f.h.h.x;
import f.h.h.x0;
import f.h.h.y;
import f.h.h.y0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends f.h.h.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public h1 unknownFields = h1.f6360f;
    public int memoizedSerializedSize = -1;

    /* loaded from: classes2.dex */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0148a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        public MessageType instance;
        public boolean isBuilt = false;

        public a(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            w0.c.b(messagetype).a(messagetype, messagetype2);
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.h.a.AbstractC0148a
        public /* bridge */ /* synthetic */ a.AbstractC0148a internalMergeFrom(f.h.h.a aVar) {
            return internalMergeFrom((a<MessageType, BuilderType>) ((GeneratedMessageLite) aVar));
        }

        @Override // f.h.h.o0
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // f.h.h.n0.a
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw a.AbstractC0148a.newUninitializedMessageException(buildPartial);
        }

        @Override // f.h.h.n0.a
        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        /* renamed from: clear */
        public final BuilderType m2clear() {
            this.instance = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // f.h.h.o0
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((a<MessageType, BuilderType>) messagetype);
        }

        @Override // f.h.h.a.AbstractC0148a
        /* renamed from: clone */
        public BuilderType mo4clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // f.h.h.a.AbstractC0148a
        /* renamed from: mergeFrom */
        public BuilderType mo7mergeFrom(byte[] bArr, int i2, int i3, q qVar) {
            copyOnWrite();
            try {
                w0.c.b(this.instance).f(this.instance, bArr, i2, i2 + i3, new f.h.h.e(qVar));
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // f.h.h.a.AbstractC0148a
        /* renamed from: mergeFrom */
        public BuilderType mo6mergeFrom(byte[] bArr, int i2, int i3) {
            return mo7mergeFrom(bArr, i2, i3, q.a());
        }

        @Override // f.h.h.a.AbstractC0148a
        /* renamed from: mergeFrom */
        public BuilderType mo5mergeFrom(k kVar, q qVar) {
            copyOnWrite();
            try {
                a1 b = w0.c.b(this.instance);
                MessageType messagetype = this.instance;
                l lVar = kVar.f6378d;
                if (lVar == null) {
                    lVar = new l(kVar);
                }
                b.e(messagetype, lVar, qVar);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b<T extends GeneratedMessageLite<T, ?>> extends f.h.h.b<T> {
        public final T b;

        public b(T t) {
            this.b = t;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        public u<d> extensions = u.f6426d;

        public u<d> a() {
            u<d> uVar = this.extensions;
            if (uVar.b) {
                this.extensions = uVar.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, f.h.h.o0
        public /* bridge */ /* synthetic */ n0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, f.h.h.n0
        public /* bridge */ /* synthetic */ n0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, f.h.h.n0
        public /* bridge */ /* synthetic */ n0.a toBuilder() {
            return super.toBuilder();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements u.a<d> {

        /* renamed from: f  reason: collision with root package name */
        public final y.d<?> f1297f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1298g;

        /* renamed from: h  reason: collision with root package name */
        public final WireFormat$FieldType f1299h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f1300i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f1301j;

        public d(y.d<?> dVar, int i2, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
            this.f1297f = dVar;
            this.f1298g = i2;
            this.f1299h = wireFormat$FieldType;
            this.f1300i = z;
            this.f1301j = z2;
        }

        @Override // f.h.h.u.a
        public boolean b() {
            return this.f1300i;
        }

        @Override // f.h.h.u.a
        public WireFormat$FieldType c() {
            return this.f1299h;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f1298g - ((d) obj).f1298g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.h.u.a
        public n0.a e(n0.a aVar, n0 n0Var) {
            return ((a) aVar).mergeFrom((a) ((GeneratedMessageLite) n0Var));
        }

        @Override // f.h.h.u.a
        public int getNumber() {
            return this.f1298g;
        }

        @Override // f.h.h.u.a
        public WireFormat$JavaType h() {
            return this.f1299h.getJavaType();
        }

        @Override // f.h.h.u.a
        public boolean isPacked() {
            return this.f1301j;
        }
    }

    /* loaded from: classes2.dex */
    public static class e<ContainingType extends n0, Type> extends o<ContainingType, Type> {
        public final ContainingType a;
        public final Type b;
        public final n0 c;

        /* renamed from: d  reason: collision with root package name */
        public final d f1302d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(n0 n0Var, Object obj, n0 n0Var2, d dVar) {
            if (n0Var != 0) {
                if (dVar.f1299h == WireFormat$FieldType.MESSAGE && n0Var2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.a = n0Var;
                this.b = obj;
                this.c = n0Var2;
                this.f1302d = dVar;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>, T> e<MessageType, T> checkIsLite(o<MessageType, T> oVar) {
        Objects.requireNonNull(oVar);
        return (e) oVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().a();
    }

    public static y.a emptyBooleanList() {
        return g.f6354i;
    }

    public static y.b emptyDoubleList() {
        return n.f6412i;
    }

    public static y.f emptyFloatList() {
        return v.f6427i;
    }

    public static y.g emptyIntList() {
        return x.f6430i;
    }

    public static y.h emptyLongList() {
        return e0.f6328i;
    }

    public static <E> y.i<E> emptyProtobufList() {
        return x0.f6433i;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == h1.f6360f) {
            this.unknownFields = h1.e();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) k1.c(cls)).getDefaultInstanceForType();
            if (generatedMessageLite != null) {
                defaultInstanceMap.put(cls, generatedMessageLite);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) generatedMessageLite;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            StringBuilder A = f.a.b.a.a.A("Generated message class \"");
            A.append(cls.getName());
            A.append("\" missing method \"");
            A.append(str);
            A.append("\".");
            throw new RuntimeException(A.toString(), e2);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static y.g mutableCopy(y.g gVar) {
        int i2 = ((x) gVar).f6432h;
        return ((x) gVar).p(i2 == 0 ? 10 : i2 * 2);
    }

    public static Object newMessageInfo(n0 n0Var, String str, Object[] objArr) {
        return new y0(n0Var, str, objArr);
    }

    public static <ContainingType extends n0, Type> e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, n0 n0Var, y.d<?> dVar, int i2, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new e<>(containingtype, Collections.emptyList(), n0Var, new d(dVar, i2, wireFormat$FieldType, true, z));
    }

    public static <ContainingType extends n0, Type> e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, n0 n0Var, y.d<?> dVar, int i2, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new e<>(containingtype, type, n0Var, new d(dVar, i2, wireFormat$FieldType, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, q.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, q qVar) {
        return (T) checkMessageInitialized(parseFrom(t, k.g(byteBuffer, false), qVar));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, q qVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            k f2 = k.f(new a.AbstractC0148a.C0149a(inputStream, k.t(read, inputStream)));
            T t2 = (T) parsePartialFrom(t, f2, qVar);
            try {
                f2.a(0);
                return t2;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            }
        } catch (InvalidProtocolBufferException e3) {
            if (e3.f1304g) {
                throw new InvalidProtocolBufferException(e3);
            }
            throw e3;
        } catch (IOException e4) {
            throw new InvalidProtocolBufferException(e4);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, k kVar, q qVar) {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            a1 b2 = w0.c.b(t2);
            l lVar = kVar.f6378d;
            if (lVar == null) {
                lVar = new l(kVar);
            }
            b2.e(t2, lVar, qVar);
            b2.c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            if (e2.f1304g) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (UninitializedMessageException e3) {
            throw e3.a();
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return w0.c.b(this).g(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // f.h.h.a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    @Override // f.h.h.n0
    public final u0<MessageType> getParserForType() {
        return (u0) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // f.h.h.n0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = w0.c.b(this).h(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int j2 = w0.c.b(this).j(this);
        this.memoizedHashCode = j2;
        return j2;
    }

    @Override // f.h.h.o0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        w0.c.b(this).c(this);
    }

    public void mergeLengthDelimitedField(int i2, j jVar) {
        ensureUnknownFieldsInitialized();
        h1 h1Var = this.unknownFields;
        h1Var.a();
        if (i2 != 0) {
            h1Var.f((i2 << 3) | 2, jVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(h1 h1Var) {
        this.unknownFields = h1.d(this.unknownFields, h1Var);
    }

    public void mergeVarintField(int i2, int i3) {
        ensureUnknownFieldsInitialized();
        h1 h1Var = this.unknownFields;
        h1Var.a();
        if (i2 != 0) {
            h1Var.f((i2 << 3) | 0, Long.valueOf(i3));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i2, k kVar) {
        if ((i2 & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.c(i2, kVar);
    }

    @Override // f.h.h.a
    public void setMemoizedSerializedSize(int i2) {
        this.memoizedSerializedSize = i2;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        f.h.b.c.a.M0(this, sb, 0);
        return sb.toString();
    }

    @Override // f.h.h.n0
    public void writeTo(CodedOutputStream codedOutputStream) {
        a1 b2 = w0.c.b(this);
        m mVar = codedOutputStream.a;
        if (mVar == null) {
            mVar = new m(codedOutputStream);
        }
        b2.b(this, mVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = w0.c.b(t).d(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, d2 ? t : null);
        }
        return d2;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // f.h.h.o0
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // f.h.h.n0
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // f.h.h.n0
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public static y.h mutableCopy(y.h hVar) {
        int i2 = ((e0) hVar).f6330h;
        return ((e0) hVar).p(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, q qVar) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, q.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, j jVar) {
        return (T) checkMessageInitialized(parseFrom(t, jVar, q.a()));
    }

    public static y.f mutableCopy(y.f fVar) {
        int i2 = ((v) fVar).f6429h;
        return ((v) fVar).p(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, j jVar, q qVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, jVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, q.a()));
    }

    public static y.b mutableCopy(y.b bVar) {
        int i2 = ((n) bVar).f6414h;
        return ((n) bVar).p(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, q qVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }

    public static y.a mutableCopy(y.a aVar) {
        int i2 = ((g) aVar).f6356h;
        return ((g) aVar).p(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, k.f(inputStream), q.a()));
    }

    public static <E> y.i<E> mutableCopy(y.i<E> iVar) {
        int size = iVar.size();
        return iVar.p(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, q qVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, k.f(inputStream), qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i2, int i3, q qVar) {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            a1 b2 = w0.c.b(t2);
            b2.f(t2, bArr, i2, i2 + i3, new f.h.h.e(qVar));
            b2.c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e2) {
            if (e2.f1304g) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (UninitializedMessageException e3) {
            throw e3.a();
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, k kVar) {
        return (T) parseFrom(t, kVar, q.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, k kVar, q qVar) {
        return (T) checkMessageInitialized(parsePartialFrom(t, kVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, k kVar) {
        return (T) parsePartialFrom(t, kVar, q.a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, j jVar, q qVar) {
        k j2 = jVar.j();
        T t2 = (T) parsePartialFrom(t, j2, qVar);
        try {
            j2.a(0);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
