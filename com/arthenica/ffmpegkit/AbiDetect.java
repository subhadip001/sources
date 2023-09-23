package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class AbiDetect {
    public static final String ARM_V7A = "arm-v7a";
    public static final String ARM_V7A_NEON = "arm-v7a-neon";
    private static boolean armV7aNeonLoaded = false;

    static {
        NativeLoader.loadFFmpegKitAbiDetect();
    }

    private AbiDetect() {
    }

    public static String getAbi() {
        return armV7aNeonLoaded ? ARM_V7A_NEON : getNativeAbi();
    }

    public static String getCpuAbi() {
        return getNativeCpuAbi();
    }

    public static native String getNativeAbi();

    public static native String getNativeBuildConf();

    public static native String getNativeCpuAbi();

    public static native boolean isNativeLTSBuild();

    public static void setArmV7aNeonLoaded() {
        armV7aNeonLoaded = true;
    }
}
