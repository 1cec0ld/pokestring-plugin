package com.gmail.ak1cec0ld.plugins.pokechat.Mutators;


public class JapanMutator {

    public static String toJapanese(String input){
        return replaceValues(input);
    }

    private static String replaceValues(String input){
        String template = input;
        template = template.replaceAll("sha","しゃ");
        template = template.replaceAll("shu","しゅ");
        template = template.replaceAll("sho","しょ");
        template = template.replaceAll("SHA","シャ");
        template = template.replaceAll("SHU","シュ");
        template = template.replaceAll("SHO","ショ");
        template = template.replaceAll("cha","ちゃ");
        template = template.replaceAll("chu","ちゅ");
        template = template.replaceAll("cho","ちょ");
        template = template.replaceAll("CHA","チャ");
        template = template.replaceAll("CHU","チュ");
        template = template.replaceAll("CHO","チョ");
        template = template.replaceAll("ta","た");
        template = template.replaceAll("chi","ち");
        template = template.replaceAll("tsu","つ");
        template = template.replaceAll("te","て");
        template = template.replaceAll("to","と");
        template = template.replaceAll("TA","タ");
        template = template.replaceAll("CHI","チ");
        template = template.replaceAll("TSU","ツ");
        template = template.replaceAll("TE","テ");
        template = template.replaceAll("TO","ト");
        template = template.replaceAll("ka","か");
        template = template.replaceAll("ki","き");
        template = template.replaceAll("ku","く");
        template = template.replaceAll("ke","け");
        template = template.replaceAll("ko","こ");
        template = template.replaceAll("KA","カ");
        template = template.replaceAll("KI","キ");
        template = template.replaceAll("KU","ク");
        template = template.replaceAll("KE","ケ");
        template = template.replaceAll("KO","コ");
        template = template.replaceAll("sa","さ");
        template = template.replaceAll("shi","し");
        template = template.replaceAll("su","す");
        template = template.replaceAll("se","せ");
        template = template.replaceAll("so","そ");
        template = template.replaceAll("SA","サ");
        template = template.replaceAll("SHI","シ");
        template = template.replaceAll("SU","ス");
        template = template.replaceAll("SE","セ");
        template = template.replaceAll("SO","ソ");
        template = template.replaceAll("na","な");
        template = template.replaceAll("ni","に");
        template = template.replaceAll("nu","ぬ");
        template = template.replaceAll("ne","ね");
        template = template.replaceAll("no","の");
        template = template.replaceAll("NA","ナ");
        template = template.replaceAll("NI","ニ");
        template = template.replaceAll("NU","ヌ");
        template = template.replaceAll("NE","ネ");
        template = template.replaceAll("NO","ノ");
        template = template.replaceAll("ha","は");
        template = template.replaceAll("hi","ひ");
        template = template.replaceAll("fu","ふ");
        template = template.replaceAll("he","は");
        template = template.replaceAll("ho","ほ");
        template = template.replaceAll("HA","ハ");
        template = template.replaceAll("HI","ヒ");
        template = template.replaceAll("FU","フ");
        template = template.replaceAll("HE","ヘ");
        template = template.replaceAll("HO","ホ");
        template = template.replaceAll("ma","ま");
        template = template.replaceAll("mi","み");
        template = template.replaceAll("mu","む");
        template = template.replaceAll("me","め");
        template = template.replaceAll("mo","も");
        template = template.replaceAll("MA","マ");
        template = template.replaceAll("MI","ミ");
        template = template.replaceAll("MU","ム");
        template = template.replaceAll("ME","メ");
        template = template.replaceAll("MO","モ");
        template = template.replaceAll("kya","きゃ");
        template = template.replaceAll("kyu","きゅ");
        template = template.replaceAll("kyo","きょ");
        template = template.replaceAll("KYA","キャ");
        template = template.replaceAll("KYU","キュ");
        template = template.replaceAll("KYO","キョ");
        template = template.replaceAll("nya","にゃ");
        template = template.replaceAll("nyu","にゅ");
        template = template.replaceAll("nyo","にょ");
        template = template.replaceAll("NYA","ニャ");
        template = template.replaceAll("NYU","ニュ");
        template = template.replaceAll("NYO","ニョ");
        template = template.replaceAll("hya","ひゃ");
        template = template.replaceAll("hyu","ヒュ");
        template = template.replaceAll("hyo","ひょ");
        template = template.replaceAll("HYA","ヒャ");
        template = template.replaceAll("HYU","ヒュ");
        template = template.replaceAll("HYO","ヒョ");
        template = template.replaceAll("mya","みゃ");
        template = template.replaceAll("myu","みゅ");
        template = template.replaceAll("myo","みょ");
        template = template.replaceAll("MYA","ミャ");
        template = template.replaceAll("MYU","ミュ");
        template = template.replaceAll("MYO","ミョ");
        template = template.replaceAll("rya","りゃ");
        template = template.replaceAll("ryu","りゅ");
        template = template.replaceAll("ryo","りょ");
        template = template.replaceAll("RYA","リャ");
        template = template.replaceAll("RYU","リュ");
        template = template.replaceAll("RYO","リョ");
        template = template.replaceAll("gya","ぎゃ");
        template = template.replaceAll("gyu","ぎゅ");
        template = template.replaceAll("gyo","ぎょ");
        template = template.replaceAll("GYA","ギャ");
        template = template.replaceAll("GYU","ギュ");
        template = template.replaceAll("GYO","ギョ");
        template = template.replaceAll("ja","じゃ");
        template = template.replaceAll("ju","じゅ");
        template = template.replaceAll("jo","じょ");
        template = template.replaceAll("JA","ジャ");
        template = template.replaceAll("JU","ジュ");
        template = template.replaceAll("JO","ジョ");
        template = template.replaceAll("bya","びゃ");
        template = template.replaceAll("byu","びゅ");
        template = template.replaceAll("byo","びょ");
        template = template.replaceAll("BYA","ビャ");
        template = template.replaceAll("BYU","ビュ");
        template = template.replaceAll("BYO","ビョ");
        template = template.replaceAll("pya","ぴゃ");
        template = template.replaceAll("pyu","ぴゅ");
        template = template.replaceAll("pyo","ぴょ");
        template = template.replaceAll("PYA","ピャ");
        template = template.replaceAll("PYU","ピュ");
        template = template.replaceAll("PYO","ピョ");
        template = template.replaceAll("ya","や");
        template = template.replaceAll("yu","ゆ");
        template = template.replaceAll("yo","よ");
        template = template.replaceAll("YA","ヤ");
        template = template.replaceAll("YU","ユ");
        template = template.replaceAll("YO","ヨ");
        template = template.replaceAll("ra","ら");
        template = template.replaceAll("ri","り");
        template = template.replaceAll("ru","る");
        template = template.replaceAll("re","れ");
        template = template.replaceAll("ro","ろ");
        template = template.replaceAll("RA","ラ");
        template = template.replaceAll("RI","リ");
        template = template.replaceAll("RU","ル");
        template = template.replaceAll("RE","レ");
        template = template.replaceAll("RO","ロ");
        template = template.replaceAll("wa","わ");
        template = template.replaceAll("wo","を");
        template = template.replaceAll("nn","ん");
        template = template.replaceAll("WA","ワ");
        template = template.replaceAll("WO","ヲ");
        template = template.replaceAll("NN","ン");
        template = template.replaceAll("ga","が");
        template = template.replaceAll("gi","ぎ");
        template = template.replaceAll("gu","ぐ");
        template = template.replaceAll("ge","げ");
        template = template.replaceAll("go","ご");
        template = template.replaceAll("GA","ガ");
        template = template.replaceAll("GI","ギ");
        template = template.replaceAll("GU","グ");
        template = template.replaceAll("GE","ゲ");
        template = template.replaceAll("GO","ゴ");
        template = template.replaceAll("za","ざ");
        template = template.replaceAll("ji","じ");
        template = template.replaceAll("zu","ず");
        template = template.replaceAll("ze","ぜ");
        template = template.replaceAll("zo","ぞ");
        template = template.replaceAll("ZA","ザ");
        template = template.replaceAll("JI","ジ");
        template = template.replaceAll("ZU","ズ");
        template = template.replaceAll("ZE","ゼ");
        template = template.replaceAll("ZO","ゾ");
        template = template.replaceAll("da","だ");
        template = template.replaceAll("di","ぢ");
        template = template.replaceAll("du","づ");
        template = template.replaceAll("de","で");
        template = template.replaceAll("do","ど");
        template = template.replaceAll("DA","ダ");
        template = template.replaceAll("DI","ヂ");
        template = template.replaceAll("DU","ヅ");
        template = template.replaceAll("DE","デ");
        template = template.replaceAll("DO","ド");
        template = template.replaceAll("ba","ば");
        template = template.replaceAll("bi","び");
        template = template.replaceAll("bu","ぶ");
        template = template.replaceAll("be","べ");
        template = template.replaceAll("bo","ぼ");
        template = template.replaceAll("BA","バ");
        template = template.replaceAll("BI","バ");
        template = template.replaceAll("BU","ブ");
        template = template.replaceAll("BE","ベ");
        template = template.replaceAll("BO","ボ");
        template = template.replaceAll("pa","ぱ");
        template = template.replaceAll("pi","ぴ");
        template = template.replaceAll("pu","ぷ");
        template = template.replaceAll("pe","ぺ");
        template = template.replaceAll("po","ぽ");
        template = template.replaceAll("PA","パ");
        template = template.replaceAll("PI","ピ");
        template = template.replaceAll("PU","プ");
        template = template.replaceAll("PE","ペ");
        template = template.replaceAll("PO","ポ");
        template = template.replaceAll("VA","ヴァ");
        template = template.replaceAll("VI","ヴィ");
        template = template.replaceAll("VU","ヴ");
        template = template.replaceAll("VE","ヴェ");
        template = template.replaceAll("VO","ヴォ");
        template = template.replaceAll("SI","シィ");
        template = template.replaceAll("SHE","シェ");
        template = template.replaceAll("JE","ジェ");
        template = template.replaceAll("TI","ティ");
        template = template.replaceAll("CHE","チェ");
        template = template.replaceAll("FA","ファ");
        template = template.replaceAll("FI","フィ");
        template = template.replaceAll("FE","フェ");
        template = template.replaceAll("FO","フォ");
        template = template.replaceAll("a","あ");
        template = template.replaceAll("i","い");
        template = template.replaceAll("u","う");
        template = template.replaceAll("e","え");
        template = template.replaceAll("o","お");
        template = template.replaceAll("A","ア");
        template = template.replaceAll("I","イ");
        template = template.replaceAll("U","ウ");
        template = template.replaceAll("E","エ");
        template = template.replaceAll("O","オ");
        template = template.replaceAll("n","ん");
        template = template.replaceAll("N","ン");
        template = template.replaceAll("[bdfghjkmnprstwyz]","っ");
        template = template.replaceAll("[BDFGHJKMNPRSTWYZ]","ッ");
        template = template.replaceAll("わたし","私");
        template = template.replaceAll("にほん","日本");
        template = template.replaceAll("えいご","英語");
        template = template.replaceAll("たのし","楽し");
        template = template.replaceAll("\\.","。");
        template = template.replaceAll("\\?","？");
        template = template.replaceAll("!","！");
        template = template.replaceAll("\\(","（");
        template = template.replaceAll("\\);","）");
        template = template.replaceAll("\\[","「");
        template = template.replaceAll("]","」");
        template = template.replaceAll("\\{","『");
        template = template.replaceAll("}","』");
        template = template.replaceAll("/","・");
        template = template.replaceAll("\\*","＊");
        template = template.replaceAll(",","、");
        template = template.replaceAll("-","ー");
        template = template.replaceAll("~","〜");
        template = template.replaceAll("\\$","¥");
        template = template.replaceAll("£","¥");
        return template;
    }
}
