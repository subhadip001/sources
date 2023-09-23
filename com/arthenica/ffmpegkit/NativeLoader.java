package com.arthenica.ffmpegkit;

import android.os.Build;
import f.a.b.a.a;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class NativeLoader {
    public static final String[] FFMPEG_LIBRARIES = {"avutil", "swscale", "swresample", "avcodec", "avformat", "avfilter", "avdevice"};
    public static final String[] LIBRARIES_LINKED_WITH_CXX = {"chromaprint", "openh264", "rubberband", "snappy", "srt", "tesseract", "x265", "zimg"};

    public static void enableRedirection() {
        if (isTestModeDisabled()) {
            FFmpegKitConfig.enableRedirection();
        }
    }

    public static String getDeviceDebugInformation() {
        StringBuilder A = a.A("brand: ");
        A.append(Build.BRAND);
        A.append(", model: ");
        A.append(Build.MODEL);
        A.append(", device: ");
        A.append(Build.DEVICE);
        A.append(", api level: ");
        A.append(Build.VERSION.SDK_INT);
        A.append(", abis: ");
        A.append(FFmpegKitConfig.argumentsToString(Build.SUPPORTED_ABIS));
        A.append(", 32bit abis: ");
        A.append(FFmpegKitConfig.argumentsToString(Build.SUPPORTED_32_BIT_ABIS));
        A.append(", 64bit abis: ");
        A.append(FFmpegKitConfig.argumentsToString(Build.SUPPORTED_64_BIT_ABIS));
        return A.toString();
    }

    public static boolean isTestModeDisabled() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    public static String loadAbi() {
        if (isTestModeDisabled()) {
            return AbiDetect.getAbi();
        }
        return Abi.ABI_X86_64.getName();
    }

    public static String loadBuildDate() {
        if (isTestModeDisabled()) {
            return FFmpegKitConfig.getBuildDate();
        }
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
    }

    private static List<String> loadExternalLibraries() {
        if (isTestModeDisabled()) {
            return Packages.getExternalLibraries();
        }
        return Collections.emptyList();
    }

    public static boolean loadFFmpeg() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void loadFFmpegKit(boolean r3) {
        /*
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L33
            java.lang.String r3 = loadNativeAbi()
            java.lang.String r2 = "arm-v7a"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L33
            java.lang.String r3 = "ffmpegkit_armv7a_neon"
            loadLibrary(r3)     // Catch: java.lang.Error -> L1c
            com.arthenica.ffmpegkit.AbiDetect.setArmV7aNeonLoaded()     // Catch: java.lang.Error -> L19
            goto L34
        L19:
            r3 = move-exception
            r2 = 1
            goto L1e
        L1c:
            r3 = move-exception
            r2 = 0
        L1e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = f.d.a.c.a.a(r3)
            r0[r1] = r3
            java.lang.String r3 = "NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = "ffmpeg-kit"
            android.util.Log.i(r0, r3)
            r0 = r2
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 != 0) goto L3b
            java.lang.String r3 = "ffmpegkit"
            loadLibrary(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.NativeLoader.loadFFmpegKit(boolean):void");
    }

    public static void loadFFmpegKitAbiDetect() {
        loadLibrary("ffmpegkit_abidetect");
    }

    public static boolean loadIsLTSBuild() {
        if (isTestModeDisabled()) {
            return AbiDetect.isNativeLTSBuild();
        }
        return true;
    }

    private static void loadLibrary(String str) {
        if (isTestModeDisabled()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e2) {
                throw new Error(String.format("FFmpegKit failed to start on %s.", getDeviceDebugInformation()), e2);
            }
        }
    }

    public static int loadLogLevel() {
        if (isTestModeDisabled()) {
            return FFmpegKitConfig.getNativeLogLevel();
        }
        return Level.AV_LOG_DEBUG.getValue();
    }

    private static String loadNativeAbi() {
        if (isTestModeDisabled()) {
            return AbiDetect.getNativeAbi();
        }
        return Abi.ABI_X86_64.getName();
    }

    public static String loadPackageName() {
        return isTestModeDisabled() ? Packages.getPackageName() : "test";
    }

    public static String loadVersion() {
        if (isTestModeDisabled()) {
            return FFmpegKitConfig.getVersion();
        }
        return loadIsLTSBuild() ? String.format("%s-lts", "5.1") : "5.1";
    }
}
