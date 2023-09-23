package f.n.a.n;

import com.video_converter.video_compressor.constants.FileFormat;

/* compiled from: FileFormatHelper.java */
/* loaded from: classes2.dex */
public class e extends a {
    public final String[] a = {"mp4", "3gp", "mov", "flv", "mkv", "avi", "mts", "m2ts", "ts", "m4v"};

    public String a(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(46) + 1);
    }

    public FileFormat b(String str) {
        if (str.equalsIgnoreCase("Original")) {
            return FileFormat.ORIGINAL;
        }
        if (!str.equalsIgnoreCase("3GP") && !str.equalsIgnoreCase("3GPP")) {
            return str.equalsIgnoreCase("AVI") ? FileFormat.AVI : str.equalsIgnoreCase("FLV") ? FileFormat.FLV : str.equalsIgnoreCase("WEBM") ? FileFormat.WEBM : str.equalsIgnoreCase("MP4") ? FileFormat.MP4 : str.equalsIgnoreCase("MPG") ? FileFormat.MPG : str.equalsIgnoreCase("MOV") ? FileFormat.MOV : str.equalsIgnoreCase("MTS") ? FileFormat.MTS : str.equalsIgnoreCase("M2TS") ? FileFormat.M2TS : str.equalsIgnoreCase("TS") ? FileFormat.TS : str.equalsIgnoreCase("MKV") ? FileFormat.MKV : str.equalsIgnoreCase("M4V") ? FileFormat.M4V : str.equalsIgnoreCase("MPEG") ? FileFormat.MPEG : str.equalsIgnoreCase("WMV") ? FileFormat.WMV : str.equalsIgnoreCase("VOB") ? FileFormat.VOB : FileFormat.UNKNOWN;
        }
        return FileFormat.GP3;
    }
}
