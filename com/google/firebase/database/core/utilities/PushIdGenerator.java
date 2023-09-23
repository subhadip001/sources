package com.google.firebase.database.core.utilities;

import com.google.android.gms.common.api.Api;
import com.google.firebase.database.snapshot.ChildKey;
import java.util.Random;

/* loaded from: classes2.dex */
public class PushIdGenerator {
    private static final int MAX_KEY_LEN = 786;
    private static final char MAX_PUSH_CHAR = 'z';
    private static final char MIN_PUSH_CHAR = '-';
    private static final String PUSH_CHARS = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";
    private static final Random randGen = new Random();
    private static long lastPushTime = 0;
    private static final int[] lastRandChars = new int[12];

    public static synchronized String generatePushChildName(long j2) {
        String sb;
        synchronized (PushIdGenerator.class) {
            boolean z = true;
            boolean z2 = j2 == lastPushTime;
            lastPushTime = j2;
            char[] cArr = new char[8];
            StringBuilder sb2 = new StringBuilder(20);
            for (int i2 = 7; i2 >= 0; i2--) {
                cArr[i2] = PUSH_CHARS.charAt((int) (j2 % 64));
                j2 /= 64;
            }
            Utilities.hardAssert(j2 == 0);
            sb2.append(cArr);
            if (z2) {
                incrementArray();
            } else {
                for (int i3 = 0; i3 < 12; i3++) {
                    lastRandChars[i3] = randGen.nextInt(64);
                }
            }
            for (int i4 = 0; i4 < 12; i4++) {
                sb2.append(PUSH_CHARS.charAt(lastRandChars[i4]));
            }
            if (sb2.length() != 20) {
                z = false;
            }
            Utilities.hardAssert(z);
            sb = sb2.toString();
        }
        return sb;
    }

    private static void incrementArray() {
        for (int i2 = 11; i2 >= 0; i2--) {
            int[] iArr = lastRandChars;
            if (iArr[i2] != 63) {
                iArr[i2] = iArr[i2] + 1;
                return;
            }
            iArr[i2] = 0;
        }
    }

    public static final String predecessor(String str) {
        Validation.validateNullableKey(str);
        Integer tryParseInt = Utilities.tryParseInt(str);
        if (tryParseInt != null) {
            return tryParseInt.intValue() == Integer.MIN_VALUE ? ChildKey.MIN_KEY_NAME : String.valueOf(tryParseInt.intValue() - 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(sb.length() - 1) == '-') {
            if (sb.length() == 1) {
                return String.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            return sb.substring(0, sb.length() - 1);
        }
        sb.setCharAt(sb.length() - 1, PUSH_CHARS.charAt(PUSH_CHARS.indexOf(sb.charAt(sb.length() - 1)) - 1));
        sb.append(new String(new char[786 - sb.length()]).replace("\u0000", "z"));
        return sb.toString();
    }

    public static final String successor(String str) {
        Validation.validateNullableKey(str);
        Integer tryParseInt = Utilities.tryParseInt(str);
        if (tryParseInt != null) {
            if (tryParseInt.intValue() == Integer.MAX_VALUE) {
                return String.valueOf((char) MIN_PUSH_CHAR);
            }
            return String.valueOf(tryParseInt.intValue() + 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() < MAX_KEY_LEN) {
            sb.append(MIN_PUSH_CHAR);
            return sb.toString();
        }
        int length = sb.length() - 1;
        while (length >= 0 && sb.charAt(length) == 'z') {
            length--;
        }
        if (length == -1) {
            return ChildKey.MAX_KEY_NAME;
        }
        int i2 = length + 1;
        sb.replace(length, i2, String.valueOf(PUSH_CHARS.charAt(PUSH_CHARS.indexOf(sb.charAt(length)) + 1)));
        return sb.substring(0, i2);
    }
}
