package f.h.b.b.y1.h0;

import android.util.Log;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import f.h.b.b.g2.t;

/* compiled from: MetadataUtil.java */
/* loaded from: classes.dex */
public final class h {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i2, t tVar) {
        int f2 = tVar.f();
        if (tVar.f() == 1684108385) {
            tVar.D(8);
            String n = tVar.n(f2 - 16);
            return new CommentFrame("und", n, n);
        }
        String valueOf = String.valueOf(d.a(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static ApicFrame b(t tVar) {
        int f2 = tVar.f();
        if (tVar.f() == 1684108385) {
            int f3 = tVar.f() & 16777215;
            String str = f3 == 13 ? "image/jpeg" : f3 == 14 ? "image/png" : null;
            if (str == null) {
                f.a.b.a.a.G(41, "Unrecognized cover art flags: ", f3, "MetadataUtil");
                return null;
            }
            tVar.D(4);
            int i2 = f2 - 16;
            byte[] bArr = new byte[i2];
            System.arraycopy(tVar.a, tVar.b, bArr, 0, i2);
            tVar.b += i2;
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static TextInformationFrame c(int i2, String str, t tVar) {
        int f2 = tVar.f();
        if (tVar.f() == 1684108385 && f2 >= 22) {
            tVar.D(10);
            int w = tVar.w();
            if (w > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(w);
                String sb2 = sb.toString();
                int w2 = tVar.w();
                if (w2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(w2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(d.a(i2));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static TextInformationFrame d(int i2, String str, t tVar) {
        int f2 = tVar.f();
        if (tVar.f() == 1684108385) {
            tVar.D(8);
            return new TextInformationFrame(str, null, tVar.n(f2 - 16));
        }
        String valueOf = String.valueOf(d.a(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static Id3Frame e(int i2, String str, t tVar, boolean z, boolean z2) {
        int f2 = f(tVar);
        if (z2) {
            f2 = Math.min(1, f2);
        }
        if (f2 >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, Integer.toString(f2));
            }
            return new CommentFrame("und", str, Integer.toString(f2));
        }
        String valueOf = String.valueOf(d.a(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static int f(t tVar) {
        tVar.D(4);
        if (tVar.f() == 1684108385) {
            tVar.D(8);
            return tVar.r();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
