package com.google.protobuf;

import f.h.h.m1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class WireFormat$FieldType {
    private static final /* synthetic */ WireFormat$FieldType[] $VALUES;
    public static final WireFormat$FieldType BOOL;
    public static final WireFormat$FieldType BYTES;
    public static final WireFormat$FieldType DOUBLE;
    public static final WireFormat$FieldType ENUM;
    public static final WireFormat$FieldType FIXED32;
    public static final WireFormat$FieldType FIXED64;
    public static final WireFormat$FieldType FLOAT;
    public static final WireFormat$FieldType GROUP;
    public static final WireFormat$FieldType INT32;
    public static final WireFormat$FieldType INT64;
    public static final WireFormat$FieldType MESSAGE;
    public static final WireFormat$FieldType SFIXED32;
    public static final WireFormat$FieldType SFIXED64;
    public static final WireFormat$FieldType SINT32;
    public static final WireFormat$FieldType SINT64;
    public static final WireFormat$FieldType STRING;
    public static final WireFormat$FieldType UINT32;
    public static final WireFormat$FieldType UINT64;
    private final WireFormat$JavaType javaType;
    private final int wireType;

    static {
        WireFormat$FieldType wireFormat$FieldType = new WireFormat$FieldType("DOUBLE", 0, WireFormat$JavaType.DOUBLE, 1);
        DOUBLE = wireFormat$FieldType;
        WireFormat$FieldType wireFormat$FieldType2 = new WireFormat$FieldType("FLOAT", 1, WireFormat$JavaType.FLOAT, 5);
        FLOAT = wireFormat$FieldType2;
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.LONG;
        WireFormat$FieldType wireFormat$FieldType3 = new WireFormat$FieldType("INT64", 2, wireFormat$JavaType, 0);
        INT64 = wireFormat$FieldType3;
        WireFormat$FieldType wireFormat$FieldType4 = new WireFormat$FieldType("UINT64", 3, wireFormat$JavaType, 0);
        UINT64 = wireFormat$FieldType4;
        WireFormat$JavaType wireFormat$JavaType2 = WireFormat$JavaType.INT;
        WireFormat$FieldType wireFormat$FieldType5 = new WireFormat$FieldType("INT32", 4, wireFormat$JavaType2, 0);
        INT32 = wireFormat$FieldType5;
        WireFormat$FieldType wireFormat$FieldType6 = new WireFormat$FieldType("FIXED64", 5, wireFormat$JavaType, 1);
        FIXED64 = wireFormat$FieldType6;
        WireFormat$FieldType wireFormat$FieldType7 = new WireFormat$FieldType("FIXED32", 6, wireFormat$JavaType2, 5);
        FIXED32 = wireFormat$FieldType7;
        WireFormat$FieldType wireFormat$FieldType8 = new WireFormat$FieldType("BOOL", 7, WireFormat$JavaType.BOOLEAN, 0);
        BOOL = wireFormat$FieldType8;
        WireFormat$FieldType wireFormat$FieldType9 = new WireFormat$FieldType("STRING", 8, WireFormat$JavaType.STRING, 2) { // from class: com.google.protobuf.WireFormat$FieldType.a
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        STRING = wireFormat$FieldType9;
        WireFormat$JavaType wireFormat$JavaType3 = WireFormat$JavaType.MESSAGE;
        WireFormat$FieldType wireFormat$FieldType10 = new WireFormat$FieldType("GROUP", 9, wireFormat$JavaType3, 3) { // from class: com.google.protobuf.WireFormat$FieldType.b
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = wireFormat$FieldType10;
        WireFormat$FieldType wireFormat$FieldType11 = new WireFormat$FieldType("MESSAGE", 10, wireFormat$JavaType3, 2) { // from class: com.google.protobuf.WireFormat$FieldType.c
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = wireFormat$FieldType11;
        WireFormat$FieldType wireFormat$FieldType12 = new WireFormat$FieldType("BYTES", 11, WireFormat$JavaType.BYTE_STRING, 2) { // from class: com.google.protobuf.WireFormat$FieldType.d
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = wireFormat$FieldType12;
        WireFormat$FieldType wireFormat$FieldType13 = new WireFormat$FieldType("UINT32", 12, wireFormat$JavaType2, 0);
        UINT32 = wireFormat$FieldType13;
        WireFormat$FieldType wireFormat$FieldType14 = new WireFormat$FieldType("ENUM", 13, WireFormat$JavaType.ENUM, 0);
        ENUM = wireFormat$FieldType14;
        WireFormat$FieldType wireFormat$FieldType15 = new WireFormat$FieldType("SFIXED32", 14, wireFormat$JavaType2, 5);
        SFIXED32 = wireFormat$FieldType15;
        WireFormat$FieldType wireFormat$FieldType16 = new WireFormat$FieldType("SFIXED64", 15, wireFormat$JavaType, 1);
        SFIXED64 = wireFormat$FieldType16;
        WireFormat$FieldType wireFormat$FieldType17 = new WireFormat$FieldType("SINT32", 16, wireFormat$JavaType2, 0);
        SINT32 = wireFormat$FieldType17;
        WireFormat$FieldType wireFormat$FieldType18 = new WireFormat$FieldType("SINT64", 17, wireFormat$JavaType, 0);
        SINT64 = wireFormat$FieldType18;
        $VALUES = new WireFormat$FieldType[]{wireFormat$FieldType, wireFormat$FieldType2, wireFormat$FieldType3, wireFormat$FieldType4, wireFormat$FieldType5, wireFormat$FieldType6, wireFormat$FieldType7, wireFormat$FieldType8, wireFormat$FieldType9, wireFormat$FieldType10, wireFormat$FieldType11, wireFormat$FieldType12, wireFormat$FieldType13, wireFormat$FieldType14, wireFormat$FieldType15, wireFormat$FieldType16, wireFormat$FieldType17, wireFormat$FieldType18};
    }

    public WireFormat$FieldType(String str, int i2, WireFormat$JavaType wireFormat$JavaType, int i3) {
        this.javaType = wireFormat$JavaType;
        this.wireType = i3;
    }

    public static WireFormat$FieldType valueOf(String str) {
        return (WireFormat$FieldType) Enum.valueOf(WireFormat$FieldType.class, str);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[]) $VALUES.clone();
    }

    public WireFormat$JavaType getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    public WireFormat$FieldType(String str, int i2, WireFormat$JavaType wireFormat$JavaType, int i3, m1 m1Var) {
        this.javaType = wireFormat$JavaType;
        this.wireType = i3;
    }
}
