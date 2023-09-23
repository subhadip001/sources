package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class ReturnCode {
    public static int CANCEL = 255;
    public static int SUCCESS;
    private final int value;

    public ReturnCode(int i2) {
        this.value = i2;
    }

    public static boolean isCancel(ReturnCode returnCode) {
        return returnCode != null && returnCode.getValue() == CANCEL;
    }

    public static boolean isSuccess(ReturnCode returnCode) {
        return returnCode != null && returnCode.getValue() == SUCCESS;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isValueCancel() {
        return this.value == CANCEL;
    }

    public boolean isValueError() {
        int i2 = this.value;
        return (i2 == SUCCESS || i2 == CANCEL) ? false : true;
    }

    public boolean isValueSuccess() {
        return this.value == SUCCESS;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
