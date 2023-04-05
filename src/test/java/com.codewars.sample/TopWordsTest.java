package com.codewars.sample;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopWordsTest {
    @Test
    public void sampleTests() {
//        assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
//        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
//        assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
//        assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
//        assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
//        assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
//        assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));
        assertEquals(Arrays.asList("giwthqedw", "kddoeah", "zdwzhph"),                 TopWords.top3("GIWTHqEdW hiXMLQg-rkLW,ZDWzHPh eKokKLRDY;kja ZDWzHPh y'icGGFOy hiXMLQg rkLW-rkLW eKokKLRDY-MSAKCr:rkLW:KDDOeaH,MSAKCr kja eKokKLRDY-ZDWzHPh:hiXMLQg eKokKLRDY ZDWzHPh,NtykfznVy.y'icGGFOy rkLW?IhzCEE:EXM kja;y'icGGFOy hiXMLQg,NtykfznVy?KDDOeaH,y'icGGFOy ZDWzHPh rkLW GIWTHqEdW KjkQvl_ZDWzHPh ZDWzHPh KDDOeaH EXM kja-dqEEQuBYrw_ZfPOnj_KDDOeaH IhzCEE KDDOeaH y'icGGFOy ZDWzHPh?KDDOeaH kja KDDOeaH-hiXMLQg hiXMLQg NtykfznVy ZfPOnj/EXM_ZDWzHPh;ZDWzHPh kVCUEbVbk EXM/eKokKLRDY,GIWTHqEdW:kja ZfPOnj KDDOeaH kja:GIWTHqEdW_GIWTHqEdW EXM GIWTHqEdW hiXMLQg ZDWzHPh GIWTHqEdW/hiXMLQg;dqEEQuBYrw kja,GIWTHqEdW,KDDOeaH hiXMLQg;GIWTHqEdW KjkQvl KDDOeaH;GIWTHqEdW?GIWTHqEdW KDDOeaH eKokKLRDY.EXM KDDOeaH GIWTHqEdW!KDDOeaH ZfPOnj y'icGGFOy KjkQvl?y'icGGFOy;EXM/EXM NtykfznVy!kja!y'icGGFOy KDDOeaH_NtykfznVy_y'icGGFOy.KDDOeaH EXM;rkLW:rkLW eKokKLRDY-GIWTHqEdW-y'icGGFOy GIWTHqEdW EXM kja/hiXMLQg_NtykfznVy ZfPOnj/NtykfznVy y'icGGFOy hiXMLQg y'icGGFOy NtykfznVy;y'icGGFOy?GIWTHqEdW GIWTHqEdW.KDDOeaH.GIWTHqEdW hiXMLQg eKokKLRDY ZDWzHPh hiXMLQg ZDWzHPh eKokKLRDY-y'icGGFOy eKokKLRDY.y'icGGFOy GIWTHqEdW hiXMLQg-ZDWzHPh.KDDOeaH:rkLW rkLW GIWTHqEdW ZDWzHPh-EXM KjkQvl NtykfznVy kja;hiXMLQg hiXMLQg hiXMLQg kja_KDDOeaH eKokKLRDY rkLW;rkLW.IhzCEE.ZDWzHPh rkLW kja kja;rkLW NtykfznVy;y'icGGFOy GIWTHqEdW.ZfPOnj;NtykfznVy?KDDOeaH hiXMLQg GIWTHqEdW_NtykfznVy ZDWzHPh;KDDOeaH/eKokKLRDY,ZDWzHPh EXM_y'icGGFOy kja GIWTHqEdW/EXM ZfPOnj ZfPOnj/ZDWzHPh/ZDWzHPh KDDOeaH.GIWTHqEdW ZDWzHPh.GIWTHqEdW y'icGGFOy ZDWzHPh GIWTHqEdW:ZfPOnj/y'icGGFOy GIWTHqEdW!kja.KDDOeaH EXM!EXM!KDDOeaH EXM-KDDOeaH GIWTHqEdW hiXMLQg;rkLW eKokKLRDY KDDOeaH;rkLW:kja:hiXMLQg eKokKLRDY kja GIWTHqEdW_EXM_kja-KjkQvl kVCUEbVbk eKokKLRDY IhzCEE_KDDOeaH-hiXMLQg_EXM/KDDOeaH;\n"));
//        assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
//                .of("In a village of La Mancha, the name of which I have no desire to call to",
//                        "mind, there lived not long since one of those gentlemen that keep a lance",
//                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
//                        "coursing. An olla of rather more beef than mutton, a salad on most",
//                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
//                        "on Sundays, made away with three-quarters of his income.")
//                .collect(Collectors.joining("\n")) ));
    }

}
