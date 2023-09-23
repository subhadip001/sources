package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class FieldNamingPolicy implements f.h.f.d {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;

    /* loaded from: classes2.dex */
    public enum a extends FieldNamingPolicy {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.FieldNamingPolicy, f.h.f.d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.FieldNamingPolicy.b
            @Override // com.google.gson.FieldNamingPolicy, f.h.f.d
            public String translateName(Field field) {
                return FieldNamingPolicy.d(field.getName());
            }
        };
        UPPER_CAMEL_CASE = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.FieldNamingPolicy.c
            @Override // com.google.gson.FieldNamingPolicy, f.h.f.d
            public String translateName(Field field) {
                return FieldNamingPolicy.d(FieldNamingPolicy.a(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = fieldNamingPolicy2;
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.FieldNamingPolicy.d
            @Override // com.google.gson.FieldNamingPolicy, f.h.f.d
            public String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = fieldNamingPolicy3;
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.FieldNamingPolicy.e
            @Override // com.google.gson.FieldNamingPolicy, f.h.f.d
            public String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = fieldNamingPolicy4;
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.FieldNamingPolicy.f
            @Override // com.google.gson.FieldNamingPolicy, f.h.f.d
            public String translateName(Field field) {
                return FieldNamingPolicy.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = fieldNamingPolicy5;
        $VALUES = new FieldNamingPolicy[]{aVar, fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5};
    }

    public FieldNamingPolicy(String str, int i2, a aVar) {
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String d(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char charAt = str.charAt(i2);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }

    @Override // f.h.f.d
    public abstract /* synthetic */ String translateName(Field field);
}
