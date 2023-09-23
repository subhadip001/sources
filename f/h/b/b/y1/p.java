package f.h.b.b.y1;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import f.h.b.b.g2.b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes.dex */
public final class p {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i2 = b0.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean b(Metadata metadata) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f770f;
            if (i2 >= entryArr.length) {
                return false;
            }
            Metadata.Entry entry = entryArr[i2];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f817h) && a(commentFrame.f818i)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f824g) && "iTunSMPB".equals(internalFrame.f825h) && a(internalFrame.f826i)) {
                    return true;
                }
            } else {
                continue;
            }
            i2++;
        }
    }
}
