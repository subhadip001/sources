package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class FieldType {
    private static final /* synthetic */ FieldType[] $VALUES;
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;
    private static final FieldType[] VALUES;
    private final a collection;
    private final Class<?> elementType;
    private final int id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    /* loaded from: classes2.dex */
    public enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: f  reason: collision with root package name */
        public final boolean f1296f;

        a(boolean z) {
            this.f1296f = z;
        }
    }

    static {
        a aVar = a.SCALAR;
        JavaType javaType = JavaType.DOUBLE;
        DOUBLE = new FieldType("DOUBLE", 0, 0, aVar, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FLOAT = new FieldType("FLOAT", 1, 1, aVar, javaType2);
        JavaType javaType3 = JavaType.LONG;
        INT64 = new FieldType("INT64", 2, 2, aVar, javaType3);
        UINT64 = new FieldType("UINT64", 3, 3, aVar, javaType3);
        JavaType javaType4 = JavaType.INT;
        INT32 = new FieldType("INT32", 4, 4, aVar, javaType4);
        FIXED64 = new FieldType("FIXED64", 5, 5, aVar, javaType3);
        FIXED32 = new FieldType("FIXED32", 6, 6, aVar, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        BOOL = new FieldType("BOOL", 7, 7, aVar, javaType5);
        JavaType javaType6 = JavaType.STRING;
        STRING = new FieldType("STRING", 8, 8, aVar, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        MESSAGE = new FieldType("MESSAGE", 9, 9, aVar, javaType7);
        JavaType javaType8 = JavaType.BYTE_STRING;
        BYTES = new FieldType("BYTES", 10, 10, aVar, javaType8);
        UINT32 = new FieldType("UINT32", 11, 11, aVar, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        ENUM = new FieldType("ENUM", 12, 12, aVar, javaType9);
        SFIXED32 = new FieldType("SFIXED32", 13, 13, aVar, javaType4);
        SFIXED64 = new FieldType("SFIXED64", 14, 14, aVar, javaType3);
        SINT32 = new FieldType("SINT32", 15, 15, aVar, javaType4);
        SINT64 = new FieldType("SINT64", 16, 16, aVar, javaType3);
        GROUP = new FieldType("GROUP", 17, 17, aVar, javaType7);
        a aVar2 = a.VECTOR;
        DOUBLE_LIST = new FieldType("DOUBLE_LIST", 18, 18, aVar2, javaType);
        FLOAT_LIST = new FieldType("FLOAT_LIST", 19, 19, aVar2, javaType2);
        INT64_LIST = new FieldType("INT64_LIST", 20, 20, aVar2, javaType3);
        UINT64_LIST = new FieldType("UINT64_LIST", 21, 21, aVar2, javaType3);
        INT32_LIST = new FieldType("INT32_LIST", 22, 22, aVar2, javaType4);
        FIXED64_LIST = new FieldType("FIXED64_LIST", 23, 23, aVar2, javaType3);
        FIXED32_LIST = new FieldType("FIXED32_LIST", 24, 24, aVar2, javaType4);
        BOOL_LIST = new FieldType("BOOL_LIST", 25, 25, aVar2, javaType5);
        STRING_LIST = new FieldType("STRING_LIST", 26, 26, aVar2, javaType6);
        MESSAGE_LIST = new FieldType("MESSAGE_LIST", 27, 27, aVar2, javaType7);
        BYTES_LIST = new FieldType("BYTES_LIST", 28, 28, aVar2, javaType8);
        UINT32_LIST = new FieldType("UINT32_LIST", 29, 29, aVar2, javaType4);
        ENUM_LIST = new FieldType("ENUM_LIST", 30, 30, aVar2, javaType9);
        SFIXED32_LIST = new FieldType("SFIXED32_LIST", 31, 31, aVar2, javaType4);
        SFIXED64_LIST = new FieldType("SFIXED64_LIST", 32, 32, aVar2, javaType3);
        SINT32_LIST = new FieldType("SINT32_LIST", 33, 33, aVar2, javaType4);
        SINT64_LIST = new FieldType("SINT64_LIST", 34, 34, aVar2, javaType3);
        a aVar3 = a.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new FieldType("DOUBLE_LIST_PACKED", 35, 35, aVar3, javaType);
        FLOAT_LIST_PACKED = new FieldType("FLOAT_LIST_PACKED", 36, 36, aVar3, javaType2);
        INT64_LIST_PACKED = new FieldType("INT64_LIST_PACKED", 37, 37, aVar3, javaType3);
        UINT64_LIST_PACKED = new FieldType("UINT64_LIST_PACKED", 38, 38, aVar3, javaType3);
        INT32_LIST_PACKED = new FieldType("INT32_LIST_PACKED", 39, 39, aVar3, javaType4);
        FIXED64_LIST_PACKED = new FieldType("FIXED64_LIST_PACKED", 40, 40, aVar3, javaType3);
        FIXED32_LIST_PACKED = new FieldType("FIXED32_LIST_PACKED", 41, 41, aVar3, javaType4);
        BOOL_LIST_PACKED = new FieldType("BOOL_LIST_PACKED", 42, 42, aVar3, javaType5);
        UINT32_LIST_PACKED = new FieldType("UINT32_LIST_PACKED", 43, 43, aVar3, javaType4);
        ENUM_LIST_PACKED = new FieldType("ENUM_LIST_PACKED", 44, 44, aVar3, javaType9);
        SFIXED32_LIST_PACKED = new FieldType("SFIXED32_LIST_PACKED", 45, 45, aVar3, javaType4);
        JavaType javaType10 = JavaType.LONG;
        SFIXED64_LIST_PACKED = new FieldType("SFIXED64_LIST_PACKED", 46, 46, aVar3, javaType10);
        SINT32_LIST_PACKED = new FieldType("SINT32_LIST_PACKED", 47, 47, aVar3, JavaType.INT);
        SINT64_LIST_PACKED = new FieldType("SINT64_LIST_PACKED", 48, 48, aVar3, javaType10);
        GROUP_LIST = new FieldType("GROUP_LIST", 49, 49, aVar2, javaType7);
        MAP = new FieldType("MAP", 50, 50, a.MAP, JavaType.VOID);
        $VALUES = new FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
        EMPTY_TYPES = new Type[0];
        FieldType[] values = values();
        VALUES = new FieldType[51];
        for (FieldType fieldType : values) {
            VALUES[fieldType.id] = fieldType;
        }
    }

    public FieldType(String str, int i2, int i3, a aVar, JavaType javaType) {
        int ordinal;
        this.id = i3;
        this.collection = aVar;
        this.javaType = javaType;
        int ordinal2 = aVar.ordinal();
        boolean z = true;
        if (ordinal2 == 1) {
            this.elementType = javaType.getBoxedType();
        } else if (ordinal2 != 3) {
            this.elementType = null;
        } else {
            this.elementType = javaType.getBoxedType();
        }
        this.primitiveScalar = (aVar != a.SCALAR || (ordinal = javaType.ordinal()) == 6 || ordinal == 7 || ordinal == 9) ? false : false;
    }

    public static FieldType forId(int i2) {
        if (i2 >= 0) {
            FieldType[] fieldTypeArr = VALUES;
            if (i2 >= fieldTypeArr.length) {
                return null;
            }
            return fieldTypeArr[i2];
        }
        return null;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.f1296f;
    }

    public boolean isMap() {
        return this.collection == a.MAP;
    }

    public boolean isPacked() {
        return a.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == a.SCALAR;
    }

    public boolean isValidForField(Field field) {
        Type genericSuperclass;
        boolean z;
        if (a.VECTOR.equals(this.collection)) {
            Class<?> type = field.getType();
            if (this.javaType.getType().isAssignableFrom(type)) {
                Type[] typeArr = EMPTY_TYPES;
                if (field.getGenericType() instanceof ParameterizedType) {
                    typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
                }
                while (type != List.class) {
                    Type[] genericInterfaces = type.getGenericInterfaces();
                    int length = genericInterfaces.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            genericSuperclass = genericInterfaces[i2];
                            if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
                                break;
                            }
                            i2++;
                        } else {
                            genericSuperclass = type.getGenericSuperclass();
                            if (!(genericSuperclass instanceof ParameterizedType) || !List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
                                genericSuperclass = null;
                            }
                        }
                    }
                    if (genericSuperclass instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        for (int i3 = 0; i3 < actualTypeArguments.length; i3++) {
                            Type type2 = actualTypeArguments[i3];
                            if (type2 instanceof TypeVariable) {
                                TypeVariable<Class<?>>[] typeParameters = type.getTypeParameters();
                                if (typeArr.length != typeParameters.length) {
                                    throw new RuntimeException("Type array mismatch");
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= typeParameters.length) {
                                        z = false;
                                        break;
                                    } else if (type2 == typeParameters[i4]) {
                                        actualTypeArguments[i3] = typeArr[i4];
                                        z = true;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type2);
                                }
                            }
                        }
                        type = (Class) parameterizedType.getRawType();
                        typeArr = actualTypeArguments;
                    } else {
                        typeArr = EMPTY_TYPES;
                        Class<?>[] interfaces = type.getInterfaces();
                        int length2 = interfaces.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length2) {
                                Class<?> cls = interfaces[i5];
                                if (List.class.isAssignableFrom(cls)) {
                                    type = cls;
                                    break;
                                }
                                i5++;
                            } else {
                                type = type.getSuperclass();
                                break;
                            }
                        }
                    }
                }
                if (typeArr.length == 1) {
                    Type type3 = typeArr[0];
                    if (type3 instanceof Class) {
                        return this.elementType.isAssignableFrom((Class) type3);
                    }
                    return true;
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            return false;
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
