package kotlin.text;

/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public enum RegexOption {
    IGNORE_CASE(2, 0, 2),
    MULTILINE(8, 0, 2),
    LITERAL(16, 0, 2),
    UNIX_LINES(1, 0, 2),
    COMMENTS(4, 0, 2),
    DOT_MATCHES_ALL(32, 0, 2),
    CANON_EQ(128, 0, 2);
    
    private final int mask;
    private final int value;

    RegexOption(int i2, int i3, int i4) {
        i3 = (i4 & 2) != 0 ? i2 : i3;
        this.value = i2;
        this.mask = i3;
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }
}
