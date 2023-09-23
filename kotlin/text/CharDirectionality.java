package kotlin.text;

import f.n.a.n.i;
import i.c;
import i.l.b.j;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CharDirectionality.kt */
/* loaded from: classes2.dex */
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    private final int value;
    public static final b Companion = new Object(null) { // from class: kotlin.text.CharDirectionality.b
    };
    private static final c<Map<Integer, CharDirectionality>> directionalityMap$delegate = i.E(a.f9199g);

    /* compiled from: CharDirectionality.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j implements i.l.a.a<Map<Integer, ? extends CharDirectionality>> {

        /* renamed from: g  reason: collision with root package name */
        public static final a f9199g = new a();

        public a() {
            super(0);
        }

        @Override // i.l.a.a
        public Map<Integer, ? extends CharDirectionality> c() {
            CharDirectionality[] values = CharDirectionality.values();
            int H = i.H(20);
            if (H < 16) {
                H = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (int i2 = 0; i2 < 20; i2++) {
                CharDirectionality charDirectionality = values[i2];
                linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
            }
            return linkedHashMap;
        }
    }

    CharDirectionality(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }
}
