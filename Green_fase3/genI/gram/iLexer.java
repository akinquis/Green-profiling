// $ANTLR 3.2 Sep 23, 2009 12:02:23 gram/i.g 2016-01-19 18:17:26
 package gram; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class iLexer extends Lexer {
    public static final int Funcao=17;
    public static final int Ou=41;
    public static final int False=43;
    public static final int Comp=39;
    public static final int Print=37;
    public static final int Atrib=60;
    public static final int COMENTARIO_LINHA=78;
    public static final int ID=77;
    public static final int DVoid=27;
    public static final int Sub=56;
    public static final int LETRA=82;
    public static final int DInt=31;
    public static final int Argumento=10;
    public static final int ListaDecl=13;
    public static final int Float=42;
    public static final int Pos=53;
    public static final int Soma=57;
    public static final int Id=54;
    public static final int T__126=126;
    public static final int If=21;
    public static final int T__125=125;
    public static final int T__127=127;
    public static final int E=40;
    public static final int CHAR=76;
    public static final int DEnergia=36;
    public static final int Char=45;
    public static final int Igual=61;
    public static final int ListaParametros=73;
    public static final int IntWrap=14;
    public static final int Dif=62;
    public static final int Call=50;
    public static final int DChar=30;
    public static final int IncAntes=49;
    public static final int DFloat=28;
    public static final int MenorQ=63;
    public static final int Div=58;
    public static final int Neg=52;
    public static final int Mult=59;
    public static final int Menor=65;
    public static final int Menos=68;
    public static final int Declaracao=22;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int True=44;
    public static final int Comentarios=26;
    public static final int Divide=69;
    public static final int Input=38;
    public static final int Vezes=70;
    public static final int MaiorQ=64;
    public static final int T__99=99;
    public static final int Vazio=24;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int DBoolean=29;
    public static final int For=19;
    public static final int Maior=66;
    public static final int Condicional=47;
    public static final int Inc=33;
    public static final int Expressoes=35;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int FLOAT=75;
    public static final int T__123=123;
    public static final int ExpNum=55;
    public static final int T__120=120;
    public static final int DIGITO=80;
    public static final int Int=46;
    public static final int INT=74;
    public static final int COMENTARIO_LINHAS=79;
    public static final int Empty=34;
    public static final int IncDepois=48;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int Atribuicao=23;
    public static final int T__115=115;
    public static final int WS=83;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int Comentario=25;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int Dec=32;
    public static final int Return=18;
    public static final int Mod=67;
    public static final int T__112=112;
    public static final int Parametro=72;
    public static final int Decl=12;
    public static final int While=20;
    public static final int ListaArgumentos=11;
    public static final int SeqInstrucao=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int SufixoFloat=81;
    public static final int Mais=71;
    public static final int T__109=109;
    public static final int Exp=16;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int Nao=51;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public iLexer() {;} 
    public iLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public iLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "gram/i.g"; }

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:9:7: ( 'char' )
            // gram/i.g:9:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:10:7: ( 'int' )
            // gram/i.g:10:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:11:7: ( 'boolean' )
            // gram/i.g:11:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:12:7: ( 'float' )
            // gram/i.g:12:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:13:7: ( 'void' )
            // gram/i.g:13:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:14:7: ( ';' )
            // gram/i.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:15:7: ( ',' )
            // gram/i.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:16:7: ( '=' )
            // gram/i.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:17:7: ( '(' )
            // gram/i.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:18:7: ( ')' )
            // gram/i.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:19:7: ( 'if' )
            // gram/i.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:20:7: ( 'else' )
            // gram/i.g:20:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:21:7: ( 'for' )
            // gram/i.g:21:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:22:7: ( 'while' )
            // gram/i.g:22:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:23:7: ( 'return' )
            // gram/i.g:23:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:24:7: ( 'print' )
            // gram/i.g:24:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:25:8: ( 'energia' )
            // gram/i.g:25:10: 'energia'
            {
            match("energia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:26:8: ( 'input' )
            // gram/i.g:26:10: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:27:8: ( '{' )
            // gram/i.g:27:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:28:8: ( '}' )
            // gram/i.g:28:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:29:8: ( '?' )
            // gram/i.g:29:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:30:8: ( ':' )
            // gram/i.g:30:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:31:8: ( '||' )
            // gram/i.g:31:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:32:8: ( '&&' )
            // gram/i.g:32:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:33:8: ( '>' )
            // gram/i.g:33:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:34:8: ( '<' )
            // gram/i.g:34:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:35:8: ( '>=' )
            // gram/i.g:35:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:36:8: ( '<=' )
            // gram/i.g:36:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:37:8: ( '!=' )
            // gram/i.g:37:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:38:8: ( '==' )
            // gram/i.g:38:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:39:8: ( '*=' )
            // gram/i.g:39:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:40:8: ( '/=' )
            // gram/i.g:40:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:41:8: ( '+=' )
            // gram/i.g:41:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:42:8: ( '-=' )
            // gram/i.g:42:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:43:8: ( '+' )
            // gram/i.g:43:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:44:8: ( '-' )
            // gram/i.g:44:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:45:8: ( '*' )
            // gram/i.g:45:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:46:8: ( '/' )
            // gram/i.g:46:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:47:8: ( '%' )
            // gram/i.g:47:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:48:8: ( '++' )
            // gram/i.g:48:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:49:8: ( '--' )
            // gram/i.g:49:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:50:8: ( '!' )
            // gram/i.g:50:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:51:8: ( 'true' )
            // gram/i.g:51:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:52:8: ( 'false' )
            // gram/i.g:52:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "COMENTARIO_LINHA"
    public final void mCOMENTARIO_LINHA() throws RecognitionException {
        try {
            int _type = COMENTARIO_LINHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:230:2: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // gram/i.g:230:4: '//' (~ ( '\\r' | '\\n' ) )*
            {
            match("//"); 

            // gram/i.g:230:9: (~ ( '\\r' | '\\n' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // gram/i.g:230:9: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMENTARIO_LINHA"

    // $ANTLR start "COMENTARIO_LINHAS"
    public final void mCOMENTARIO_LINHAS() throws RecognitionException {
        try {
            int _type = COMENTARIO_LINHAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:234:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // gram/i.g:234:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // gram/i.g:234:9: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // gram/i.g:234:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMENTARIO_LINHAS"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:246:2: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // gram/i.g:246:4: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // gram/i.g:246:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\'' | '\\\\' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // gram/i.g:246:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // gram/i.g:246:55: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;

                setText(getText().substring(1, getText().length()-1));
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "DIGITO"
    public final void mDIGITO() throws RecognitionException {
        try {
            // gram/i.g:250:3: ( ( '0' .. '9' )+ )
            // gram/i.g:250:5: ( '0' .. '9' )+
            {
            // gram/i.g:250:5: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // gram/i.g:250:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITO"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:254:2: ( ( DIGITO )+ '.' ( DIGITO )* ( SufixoFloat )? | '.' ( DIGITO )+ ( SufixoFloat )? | INT SufixoFloat )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // gram/i.g:254:4: ( DIGITO )+ '.' ( DIGITO )* ( SufixoFloat )?
                    {
                    // gram/i.g:254:4: ( DIGITO )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // gram/i.g:254:4: DIGITO
                    	    {
                    	    mDIGITO(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // gram/i.g:254:16: ( DIGITO )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // gram/i.g:254:16: DIGITO
                    	    {
                    	    mDIGITO(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // gram/i.g:254:24: ( SufixoFloat )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==':') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // gram/i.g:254:24: SufixoFloat
                            {
                            mSufixoFloat(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // gram/i.g:255:4: '.' ( DIGITO )+ ( SufixoFloat )?
                    {
                    match('.'); 
                    // gram/i.g:255:8: ( DIGITO )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // gram/i.g:255:8: DIGITO
                    	    {
                    	    mDIGITO(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // gram/i.g:255:16: ( SufixoFloat )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==':') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // gram/i.g:255:16: SufixoFloat
                            {
                            mSufixoFloat(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // gram/i.g:256:4: INT SufixoFloat
                    {
                    mINT(); 
                    mSufixoFloat(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "SufixoFloat"
    public final void mSufixoFloat() throws RecognitionException {
        try {
            int _type = SufixoFloat;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:260:2: ( ':f' | ':F' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==':') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='f') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='F') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // gram/i.g:260:4: ':f'
                    {
                    match(":f"); 


                    }
                    break;
                case 2 :
                    // gram/i.g:260:9: ':F'
                    {
                    match(":F"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SufixoFloat"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:264:2: ( ( '0' | '1' .. '9' ( DIGITO )* ) )
            // gram/i.g:264:4: ( '0' | '1' .. '9' ( DIGITO )* )
            {
            // gram/i.g:264:4: ( '0' | '1' .. '9' ( DIGITO )* )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='0') ) {
                alt13=1;
            }
            else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // gram/i.g:264:5: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // gram/i.g:264:11: '1' .. '9' ( DIGITO )*
                    {
                    matchRange('1','9'); 
                    // gram/i.g:264:20: ( DIGITO )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // gram/i.g:264:20: DIGITO
                    	    {
                    	    mDIGITO(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:267:5: ( LETRA ( LETRA | '0' .. '9' )* )
            // gram/i.g:267:7: LETRA ( LETRA | '0' .. '9' )*
            {
            mLETRA(); 
            // gram/i.g:267:13: ( LETRA | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // gram/i.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETRA"
    public final void mLETRA() throws RecognitionException {
        try {
            // gram/i.g:271:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // gram/i.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETRA"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gram/i.g:274:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // gram/i.g:274:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // gram/i.g:1:8: ( T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | COMENTARIO_LINHA | COMENTARIO_LINHAS | CHAR | FLOAT | SufixoFloat | INT | ID | WS )
        int alt15=52;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // gram/i.g:1:10: T__84
                {
                mT__84(); 

                }
                break;
            case 2 :
                // gram/i.g:1:16: T__85
                {
                mT__85(); 

                }
                break;
            case 3 :
                // gram/i.g:1:22: T__86
                {
                mT__86(); 

                }
                break;
            case 4 :
                // gram/i.g:1:28: T__87
                {
                mT__87(); 

                }
                break;
            case 5 :
                // gram/i.g:1:34: T__88
                {
                mT__88(); 

                }
                break;
            case 6 :
                // gram/i.g:1:40: T__89
                {
                mT__89(); 

                }
                break;
            case 7 :
                // gram/i.g:1:46: T__90
                {
                mT__90(); 

                }
                break;
            case 8 :
                // gram/i.g:1:52: T__91
                {
                mT__91(); 

                }
                break;
            case 9 :
                // gram/i.g:1:58: T__92
                {
                mT__92(); 

                }
                break;
            case 10 :
                // gram/i.g:1:64: T__93
                {
                mT__93(); 

                }
                break;
            case 11 :
                // gram/i.g:1:70: T__94
                {
                mT__94(); 

                }
                break;
            case 12 :
                // gram/i.g:1:76: T__95
                {
                mT__95(); 

                }
                break;
            case 13 :
                // gram/i.g:1:82: T__96
                {
                mT__96(); 

                }
                break;
            case 14 :
                // gram/i.g:1:88: T__97
                {
                mT__97(); 

                }
                break;
            case 15 :
                // gram/i.g:1:94: T__98
                {
                mT__98(); 

                }
                break;
            case 16 :
                // gram/i.g:1:100: T__99
                {
                mT__99(); 

                }
                break;
            case 17 :
                // gram/i.g:1:106: T__100
                {
                mT__100(); 

                }
                break;
            case 18 :
                // gram/i.g:1:113: T__101
                {
                mT__101(); 

                }
                break;
            case 19 :
                // gram/i.g:1:120: T__102
                {
                mT__102(); 

                }
                break;
            case 20 :
                // gram/i.g:1:127: T__103
                {
                mT__103(); 

                }
                break;
            case 21 :
                // gram/i.g:1:134: T__104
                {
                mT__104(); 

                }
                break;
            case 22 :
                // gram/i.g:1:141: T__105
                {
                mT__105(); 

                }
                break;
            case 23 :
                // gram/i.g:1:148: T__106
                {
                mT__106(); 

                }
                break;
            case 24 :
                // gram/i.g:1:155: T__107
                {
                mT__107(); 

                }
                break;
            case 25 :
                // gram/i.g:1:162: T__108
                {
                mT__108(); 

                }
                break;
            case 26 :
                // gram/i.g:1:169: T__109
                {
                mT__109(); 

                }
                break;
            case 27 :
                // gram/i.g:1:176: T__110
                {
                mT__110(); 

                }
                break;
            case 28 :
                // gram/i.g:1:183: T__111
                {
                mT__111(); 

                }
                break;
            case 29 :
                // gram/i.g:1:190: T__112
                {
                mT__112(); 

                }
                break;
            case 30 :
                // gram/i.g:1:197: T__113
                {
                mT__113(); 

                }
                break;
            case 31 :
                // gram/i.g:1:204: T__114
                {
                mT__114(); 

                }
                break;
            case 32 :
                // gram/i.g:1:211: T__115
                {
                mT__115(); 

                }
                break;
            case 33 :
                // gram/i.g:1:218: T__116
                {
                mT__116(); 

                }
                break;
            case 34 :
                // gram/i.g:1:225: T__117
                {
                mT__117(); 

                }
                break;
            case 35 :
                // gram/i.g:1:232: T__118
                {
                mT__118(); 

                }
                break;
            case 36 :
                // gram/i.g:1:239: T__119
                {
                mT__119(); 

                }
                break;
            case 37 :
                // gram/i.g:1:246: T__120
                {
                mT__120(); 

                }
                break;
            case 38 :
                // gram/i.g:1:253: T__121
                {
                mT__121(); 

                }
                break;
            case 39 :
                // gram/i.g:1:260: T__122
                {
                mT__122(); 

                }
                break;
            case 40 :
                // gram/i.g:1:267: T__123
                {
                mT__123(); 

                }
                break;
            case 41 :
                // gram/i.g:1:274: T__124
                {
                mT__124(); 

                }
                break;
            case 42 :
                // gram/i.g:1:281: T__125
                {
                mT__125(); 

                }
                break;
            case 43 :
                // gram/i.g:1:288: T__126
                {
                mT__126(); 

                }
                break;
            case 44 :
                // gram/i.g:1:295: T__127
                {
                mT__127(); 

                }
                break;
            case 45 :
                // gram/i.g:1:302: COMENTARIO_LINHA
                {
                mCOMENTARIO_LINHA(); 

                }
                break;
            case 46 :
                // gram/i.g:1:319: COMENTARIO_LINHAS
                {
                mCOMENTARIO_LINHAS(); 

                }
                break;
            case 47 :
                // gram/i.g:1:337: CHAR
                {
                mCHAR(); 

                }
                break;
            case 48 :
                // gram/i.g:1:342: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 49 :
                // gram/i.g:1:348: SufixoFloat
                {
                mSufixoFloat(); 

                }
                break;
            case 50 :
                // gram/i.g:1:360: INT
                {
                mINT(); 

                }
                break;
            case 51 :
                // gram/i.g:1:364: ID
                {
                mID(); 

                }
                break;
            case 52 :
                // gram/i.g:1:367: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\7\uffff";
    static final String DFA10_minS =
        "\2\56\1\uffff\1\56\2\uffff\1\56";
    static final String DFA10_maxS =
        "\1\71\1\72\1\uffff\1\72\2\uffff\1\72";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\4\1\uffff\12\4\1\5",
            "",
            "\1\4\1\uffff\12\6\1\5",
            "",
            "",
            "\1\4\1\uffff\12\6\1\5"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "253:1: FLOAT : ( ( DIGITO )+ '.' ( DIGITO )* ( SufixoFloat )? | '.' ( DIGITO )+ ( SufixoFloat )? | INT SufixoFloat );";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\5\42\2\uffff\1\55\2\uffff\4\42\3\uffff\1\64\2\uffff\1\66"+
        "\1\70\1\72\1\74\1\100\1\103\1\106\1\uffff\1\42\1\uffff\1\110\1\uffff"+
        "\1\110\2\uffff\2\42\1\115\5\42\2\uffff\5\42\24\uffff\1\42\1\uffff"+
        "\1\110\1\42\1\132\1\42\1\uffff\2\42\1\136\10\42\1\147\1\uffff\3"+
        "\42\1\uffff\1\42\1\154\1\155\4\42\1\162\1\uffff\1\163\1\42\1\165"+
        "\1\166\2\uffff\1\42\1\170\1\42\1\172\2\uffff\1\42\2\uffff\1\42\1"+
        "\uffff\1\175\1\uffff\1\176\1\177\3\uffff";
    static final String DFA15_eofS =
        "\u0080\uffff";
    static final String DFA15_minS =
        "\1\11\1\150\1\146\1\157\1\141\1\157\2\uffff\1\75\2\uffff\1\154\1"+
        "\150\1\145\1\162\3\uffff\1\106\2\uffff\4\75\1\52\1\53\1\55\1\uffff"+
        "\1\162\1\uffff\1\56\1\uffff\1\56\2\uffff\1\141\1\160\1\60\2\157"+
        "\1\162\1\154\1\151\2\uffff\1\163\1\145\1\151\1\164\1\151\24\uffff"+
        "\1\165\1\uffff\1\56\1\162\1\60\1\165\1\uffff\1\154\1\141\1\60\1"+
        "\163\1\144\1\145\1\162\1\154\1\165\1\156\1\145\1\60\1\uffff\1\164"+
        "\1\145\1\164\1\uffff\1\145\2\60\1\147\1\145\1\162\1\164\1\60\1\uffff"+
        "\1\60\1\141\2\60\2\uffff\1\151\1\60\1\156\1\60\2\uffff\1\156\2\uffff"+
        "\1\141\1\uffff\1\60\1\uffff\2\60\3\uffff";
    static final String DFA15_maxS =
        "\1\175\1\150\1\156\3\157\2\uffff\1\75\2\uffff\1\156\1\150\1\145"+
        "\1\162\3\uffff\1\146\2\uffff\7\75\1\uffff\1\162\1\uffff\1\72\1\uffff"+
        "\1\72\2\uffff\1\141\1\164\1\172\2\157\1\162\1\154\1\151\2\uffff"+
        "\1\163\1\145\1\151\1\164\1\151\24\uffff\1\165\1\uffff\1\72\1\162"+
        "\1\172\1\165\1\uffff\1\154\1\141\1\172\1\163\1\144\1\145\1\162\1"+
        "\154\1\165\1\156\1\145\1\172\1\uffff\1\164\1\145\1\164\1\uffff\1"+
        "\145\2\172\1\147\1\145\1\162\1\164\1\172\1\uffff\1\172\1\141\2\172"+
        "\2\uffff\1\151\1\172\1\156\1\172\2\uffff\1\156\2\uffff\1\141\1\uffff"+
        "\1\172\1\uffff\2\172\3\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\6\1\7\1\uffff\1\11\1\12\4\uffff\1\23\1\24\1\25\1\uffff"+
        "\1\27\1\30\7\uffff\1\47\1\uffff\1\57\1\uffff\1\60\1\uffff\1\63\1"+
        "\64\10\uffff\1\36\1\10\5\uffff\1\61\1\26\1\33\1\31\1\34\1\32\1\35"+
        "\1\52\1\37\1\45\1\40\1\55\1\56\1\46\1\41\1\50\1\43\1\42\1\51\1\44"+
        "\1\uffff\1\62\4\uffff\1\13\14\uffff\1\2\3\uffff\1\15\10\uffff\1"+
        "\1\4\uffff\1\5\1\14\4\uffff\1\53\1\22\1\uffff\1\4\1\54\1\uffff\1"+
        "\16\1\uffff\1\20\2\uffff\1\17\1\3\1\21";
    static final String DFA15_specialS =
        "\u0080\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\43\1\uffff\2\43\22\uffff\1\43\1\27\3\uffff\1\34\1\24\1\36"+
            "\1\11\1\12\1\30\1\32\1\7\1\33\1\40\1\31\1\37\11\41\1\22\1\6"+
            "\1\26\1\10\1\25\1\21\1\uffff\32\42\4\uffff\1\42\1\uffff\1\42"+
            "\1\3\1\1\1\42\1\13\1\4\2\42\1\2\6\42\1\16\1\42\1\15\1\42\1\35"+
            "\1\42\1\5\1\14\3\42\1\17\1\23\1\20",
            "\1\44",
            "\1\46\7\uffff\1\45",
            "\1\47",
            "\1\52\12\uffff\1\50\2\uffff\1\51",
            "\1\53",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\56\1\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "\1\63\37\uffff\1\63",
            "",
            "",
            "\1\65",
            "\1\67",
            "\1\71",
            "\1\73",
            "\1\77\4\uffff\1\76\15\uffff\1\75",
            "\1\102\21\uffff\1\101",
            "\1\105\17\uffff\1\104",
            "",
            "\1\107",
            "",
            "\1\40\1\uffff\13\40",
            "",
            "\1\40\1\uffff\12\111\1\40",
            "",
            "",
            "\1\112",
            "\1\114\3\uffff\1\113",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "",
            "\1\40\1\uffff\12\111\1\40",
            "\1\131",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\164",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\167",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\171",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\173",
            "",
            "",
            "\1\174",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | COMENTARIO_LINHA | COMENTARIO_LINHAS | CHAR | FLOAT | SufixoFloat | INT | ID | WS );";
        }
    }
 

}