package com.google.common.base;

import f.h.c.a.b;
import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final f.h.c.a.b wordBoundary;
    private final String wordSeparator;

    /* loaded from: classes.dex */
    public enum a extends CaseFormat {
        public a(String str, int i2, f.h.c.a.b bVar, String str2) {
            super(str, i2, bVar, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String d(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return f.h.b.c.a.d1(str.replace('-', '_'));
            }
            return super.d(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String g(String str) {
            return f.h.b.c.a.b1(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends f.h.c.a.d<String, String> implements Serializable {

        /* renamed from: g  reason: collision with root package name */
        public final CaseFormat f1270g;

        /* renamed from: h  reason: collision with root package name */
        public final CaseFormat f1271h;

        public f(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.f1270g = caseFormat;
            Objects.requireNonNull(caseFormat2);
            this.f1271h = caseFormat2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f1270g.equals(fVar.f1270g) && this.f1271h.equals(fVar.f1271h);
            }
            return false;
        }

        public int hashCode() {
            return this.f1270g.hashCode() ^ this.f1271h.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f1270g);
            String valueOf2 = String.valueOf(this.f1271h);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(".converterTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        a aVar = new a("LOWER_HYPHEN", 0, new b.c('-'), "-");
        LOWER_HYPHEN = aVar;
        CaseFormat caseFormat = new CaseFormat("LOWER_UNDERSCORE", 1, new b.c('_'), "_") { // from class: com.google.common.base.CaseFormat.b
            @Override // com.google.common.base.CaseFormat
            public String d(CaseFormat caseFormat2, String str) {
                if (caseFormat2 == CaseFormat.LOWER_HYPHEN) {
                    return str.replace('_', '-');
                }
                if (caseFormat2 == CaseFormat.UPPER_UNDERSCORE) {
                    return f.h.b.c.a.d1(str);
                }
                return super.d(caseFormat2, str);
            }

            @Override // com.google.common.base.CaseFormat
            public String g(String str) {
                return f.h.b.c.a.b1(str);
            }
        };
        LOWER_UNDERSCORE = caseFormat;
        CaseFormat caseFormat2 = new CaseFormat("LOWER_CAMEL", 2, new b.C0131b('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.c
            @Override // com.google.common.base.CaseFormat
            public String f(String str) {
                return f.h.b.c.a.b1(str);
            }

            @Override // com.google.common.base.CaseFormat
            public String g(String str) {
                return CaseFormat.a(str);
            }
        };
        LOWER_CAMEL = caseFormat2;
        CaseFormat caseFormat3 = new CaseFormat("UPPER_CAMEL", 3, new b.C0131b('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.d
            @Override // com.google.common.base.CaseFormat
            public String g(String str) {
                return CaseFormat.a(str);
            }
        };
        UPPER_CAMEL = caseFormat3;
        CaseFormat caseFormat4 = new CaseFormat("UPPER_UNDERSCORE", 4, new b.c('_'), "_") { // from class: com.google.common.base.CaseFormat.e
            @Override // com.google.common.base.CaseFormat
            public String d(CaseFormat caseFormat5, String str) {
                if (caseFormat5 == CaseFormat.LOWER_HYPHEN) {
                    return f.h.b.c.a.b1(str.replace('_', '-'));
                }
                if (caseFormat5 == CaseFormat.LOWER_UNDERSCORE) {
                    return f.h.b.c.a.b1(str);
                }
                return super.d(caseFormat5, str);
            }

            @Override // com.google.common.base.CaseFormat
            public String g(String str) {
                return f.h.b.c.a.d1(str);
            }
        };
        UPPER_UNDERSCORE = caseFormat4;
        $VALUES = new CaseFormat[]{aVar, caseFormat, caseFormat2, caseFormat3, caseFormat4};
    }

    public CaseFormat(String str, int i2, f.h.c.a.b bVar, String str2, a aVar) {
        this.wordBoundary = bVar;
        this.wordSeparator = str2;
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char charAt = str.charAt(0);
        if (f.h.b.c.a.z0(charAt)) {
            charAt = (char) (charAt ^ ' ');
        }
        String b1 = f.h.b.c.a.b1(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(b1).length() + 1);
        sb.append(charAt);
        sb.append(b1);
        return sb.toString();
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    public f.h.c.a.d<String, String> converterTo(CaseFormat caseFormat) {
        return new f(this, caseFormat);
    }

    public String d(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            i3 = this.wordBoundary.b(str, i3 + 1);
            if (i3 == -1) {
                break;
            }
            if (i2 == 0) {
                sb = new StringBuilder((caseFormat.wordSeparator.length() * 4) + str.length());
                sb.append(caseFormat.f(str.substring(i2, i3)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(caseFormat.g(str.substring(i2, i3)));
            }
            sb.append(caseFormat.wordSeparator);
            i2 = this.wordSeparator.length() + i3;
        }
        if (i2 == 0) {
            return caseFormat.f(str);
        }
        Objects.requireNonNull(sb);
        StringBuilder sb2 = sb;
        sb2.append(caseFormat.g(str.substring(i2)));
        return sb2.toString();
    }

    public String f(String str) {
        return g(str);
    }

    public abstract String g(String str);

    public final String to(CaseFormat caseFormat, String str) {
        Objects.requireNonNull(caseFormat);
        Objects.requireNonNull(str);
        return caseFormat == this ? str : d(caseFormat, str);
    }
}
