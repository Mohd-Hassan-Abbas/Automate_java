package i.have.an.program;

import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Main {
    
    static Robot myBot;
    static String s;
    static String BotName = "I am \"ROBOT\".";
    static Runtime run =Runtime.getRuntime();
    
    public static void main(String[] args) throws AWTException, IOException, AudioException
                                            , EngineException, InterruptedException {
        
        myBot = new Robot();
        
        System.out.println("SERVER STARTING...");
        ServerSocket ss=new ServerSocket(6666);
        
        System.out.println("WAITING FOR CLIENT...");
        Socket sck=ss.accept();
        
        System.out.println("CLIENT CONNECTED"+sck);
        DataInputStream dis=new DataInputStream(sck.getInputStream());
        
        String  str="empty";
        
        while(!str.equals("exit")) {
             str = dis.readUTF();
             if(!str.equals("empty")) {
                 System.out.println(str);
                 s=str;
                 reply(str);
             }
        }
        ss.close();
    }
    
    static void doAutomation(String s) throws IOException {
        
        wrongInput();
        
        int[] pos = {0,0};
    
        while(pos[1]<s.length()) {
            
            pos = CommandPosition(s, pos[1]);
            String com = s.substring(pos[0], pos[1]);
            doTask(com);
            pos[1]++;
        }
    }
    
    static void doTask(String s) throws IOException {
        
        if (s.substring(0,7).equalsIgnoreCase("release")) {
            
              if (s.substring(8).equalsIgnoreCase("window")) {
                  myBot.delay(200);
                  myBot.keyRelease(KeyEvent.VK_WINDOWS);
              }
              if (s.substring(8).equalsIgnoreCase("shift")) {
                  myBot.delay(200);
                  myBot.keyRelease(KeyEvent.VK_SHIFT);
              }
              if (s.substring(8).equalsIgnoreCase("alt")) {
                  myBot.delay(200);
                  myBot.keyRelease(KeyEvent.VK_ALT);
              }
              if (s.substring(8).equalsIgnoreCase("ctrl")) {
                myBot.delay(200);
                myBot.keyRelease(KeyEvent.VK_CONTROL);
              }
        }
        if (s.substring(0, 5).equalsIgnoreCase("press")) {
            
            if (s.substring(6).equalsIgnoreCase("window")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_WINDOWS);
            }
            if (s.substring(6).equalsIgnoreCase("w")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_W);
                myBot.keyRelease(KeyEvent.VK_W);
            }
            if (s.substring(6).equalsIgnoreCase("ctrl")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_CONTROL);
            }
            if (s.substring(6).equalsIgnoreCase("a")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_A);
                myBot.keyRelease(KeyEvent.VK_A);
            }
            if (s.substring(6).equalsIgnoreCase("s")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_S);
                myBot.keyRelease(KeyEvent.VK_S);
            }
            if (s.substring(6).equalsIgnoreCase("d")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_D);
                myBot.keyRelease(KeyEvent.VK_D);
            }
            if (s.substring(6).equalsIgnoreCase("b")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_B);
                myBot.keyRelease(KeyEvent.VK_B);
            }
            if (s.substring(6).equalsIgnoreCase("C")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_C);
                myBot.keyRelease(KeyEvent.VK_C);
            }
            if (s.substring(6).equalsIgnoreCase("e")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_E);
                myBot.keyRelease(KeyEvent.VK_E);
            }
            if (s.substring(6).equalsIgnoreCase("f")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_F);
                myBot.keyRelease(KeyEvent.VK_F);
            }
            if (s.substring(6).equalsIgnoreCase("g")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_G);
                myBot.keyRelease(KeyEvent.VK_G);
            }
            if (s.substring(6).equalsIgnoreCase("h")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_H);
                myBot.keyRelease(KeyEvent.VK_H);
            }
            if (s.substring(6).equalsIgnoreCase("i")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_I);
                myBot.keyRelease(KeyEvent.VK_I);
            }
            if (s.substring(6).equalsIgnoreCase("j")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_J);
                myBot.keyRelease(KeyEvent.VK_J);
            }
            if (s.substring(6).equalsIgnoreCase("k")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_K);
                myBot.keyRelease(KeyEvent.VK_K);
            }
            if (s.substring(6).equalsIgnoreCase("l")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_L);
                myBot.keyRelease(KeyEvent.VK_L);
            }
            if (s.substring(6).equalsIgnoreCase("m")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_M);
                myBot.keyRelease(KeyEvent.VK_M);
            }
            if (s.substring(6).equalsIgnoreCase("n")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_N);
                myBot.keyRelease(KeyEvent.VK_N);
            }
            if (s.substring(6).equalsIgnoreCase("o")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_O);
                myBot.keyRelease(KeyEvent.VK_O);
            }
            if (s.substring(6).equalsIgnoreCase("p")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_P);
                myBot.keyRelease(KeyEvent.VK_P);
            }
            if (s.substring(6).equalsIgnoreCase("q")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_Q);
                myBot.keyRelease(KeyEvent.VK_Q);
            }
            if (s.substring(6).equalsIgnoreCase("r")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_R);
                myBot.keyRelease(KeyEvent.VK_R);
            }
            if (s.substring(6).equalsIgnoreCase("t")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_T);
                myBot.keyRelease(KeyEvent.VK_T);
            }
            if (s.substring(6).equalsIgnoreCase("u")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_U);
                myBot.keyRelease(KeyEvent.VK_U);
            }
            if (s.substring(6).equalsIgnoreCase("v")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_V);
                myBot.keyRelease(KeyEvent.VK_V);
            }
            if (s.substring(6).equalsIgnoreCase("x")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_X);
                myBot.keyRelease(KeyEvent.VK_X);
            }
            if (s.substring(6).equalsIgnoreCase("y")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_Y);
                myBot.keyRelease(KeyEvent.VK_Y);
            }
            if (s.substring(6).equalsIgnoreCase("0")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD0);
                myBot.keyRelease(KeyEvent.VK_NUMPAD0);
            }
            if (s.substring(6).equalsIgnoreCase("1")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD1);
                myBot.keyRelease(KeyEvent.VK_NUMPAD1);
            }
            if (s.substring(6).equalsIgnoreCase("2")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD2);
                myBot.keyRelease(KeyEvent.VK_NUMPAD2);
            }
            if (s.substring(6).equalsIgnoreCase("3")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD3);
                myBot.keyRelease(KeyEvent.VK_NUMPAD3);
            }
            if (s.substring(6).equalsIgnoreCase("4")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD4);
                myBot.keyRelease(KeyEvent.VK_NUMPAD4);
            }
            if (s.substring(6).equalsIgnoreCase("5")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD5);
                myBot.keyRelease(KeyEvent.VK_NUMPAD5);
            }
            if (s.substring(6).equalsIgnoreCase("6")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD6);
                myBot.keyRelease(KeyEvent.VK_NUMPAD6);
            }
            if (s.substring(6).equalsIgnoreCase("7")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD7);
                myBot.keyRelease(KeyEvent.VK_NUMPAD7);
            }
            if (s.substring(6).equalsIgnoreCase("8")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD8);
                myBot.keyRelease(KeyEvent.VK_NUMPAD8);
            }
            if (s.substring(6).equalsIgnoreCase("9")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMPAD9);
                myBot.keyRelease(KeyEvent.VK_NUMPAD9);
            }
            if (s.substring(6).equalsIgnoreCase("!")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
                myBot.keyRelease(KeyEvent.VK_EXCLAMATION_MARK);
            }
            if (s.substring(6).equalsIgnoreCase("@")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_AT);
                myBot.keyRelease(KeyEvent.VK_AT);
            }
            if (s.substring(6).equalsIgnoreCase("#")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_NUMBER_SIGN);
                myBot.keyRelease(KeyEvent.VK_NUMBER_SIGN);
            }
            if (s.substring(6).equalsIgnoreCase("$")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_DOLLAR);
                myBot.keyRelease(KeyEvent.VK_DOLLAR);
            }
            if (s.substring(6).equalsIgnoreCase("&")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_AMPERSAND);
                myBot.keyRelease(KeyEvent.VK_AMPERSAND);
            }
            if (s.substring(6).equalsIgnoreCase("*")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_ASTERISK);
                myBot.keyRelease(KeyEvent.VK_ASTERISK);
            }
            if (s.substring(6).equalsIgnoreCase("(")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);
                myBot.keyRelease(KeyEvent.VK_LEFT_PARENTHESIS);
            }
            if (s.substring(6).equalsIgnoreCase(")")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);
                myBot.keyRelease(KeyEvent.VK_RIGHT_PARENTHESIS);
            }
            if (s.substring(6).equalsIgnoreCase("-")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_MINUS);
                myBot.keyRelease(KeyEvent.VK_MINUS);
            }
            if (s.substring(6).equalsIgnoreCase("_")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_UNDERSCORE);
                myBot.keyRelease(KeyEvent.VK_UNDERSCORE);
            }
            if (s.substring(6).equalsIgnoreCase("=")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_EQUALS);
                myBot.keyRelease(KeyEvent.VK_EQUALS);
            }
            if (s.substring(6).equalsIgnoreCase("+")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_PLUS);
                myBot.keyRelease(KeyEvent.VK_PLUS);
            }
            if (s.substring(6).equalsIgnoreCase("{")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                myBot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
            }
            if (s.substring(6).equalsIgnoreCase("}")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                myBot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
            }
            if (s.substring(6).equalsIgnoreCase("\\")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_BACK_SLASH);
                myBot.keyRelease(KeyEvent.VK_BACK_SLASH);
            }
            if (s.substring(6).equalsIgnoreCase("/")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_DIVIDE);
                myBot.keyRelease(KeyEvent.VK_DIVIDE);
            }
            if (s.substring(6).equalsIgnoreCase(":")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_COLON);
                myBot.keyRelease(KeyEvent.VK_COLON);
            }
            if (s.substring(6).equalsIgnoreCase(";")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_SEMICOLON);
                myBot.keyRelease(KeyEvent.VK_SEMICOLON);
            }
            if (s.substring(6).equalsIgnoreCase("\"")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_QUOTE);
                myBot.keyRelease(KeyEvent.VK_QUOTE);
            }
            if (s.substring(6).equalsIgnoreCase("<")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_LESS);
                myBot.keyRelease(KeyEvent.VK_LESS);
            }
            if (s.substring(6).equalsIgnoreCase(">")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_GREATER);
                myBot.keyRelease(KeyEvent.VK_GREATER);
            }
            if (s.substring(6).equalsIgnoreCase(",")) {
               myBot.delay(200);
               myBot.keyPress(KeyEvent.VK_COMMA);
               myBot.keyRelease(KeyEvent.VK_COMMA);
            }
            if (s.substring(6).equalsIgnoreCase(".")) {
               myBot.delay(200);
               myBot.keyPress(KeyEvent.VK_PERIOD);
               myBot.keyRelease(KeyEvent.VK_PERIOD);
            }
            if (s.substring(6).equalsIgnoreCase("del")) {
               myBot.delay(200);
               myBot.keyPress(KeyEvent.VK_DELETE);
               myBot.keyRelease(KeyEvent.VK_DELETE);
            }
            if (s.substring(6).equalsIgnoreCase("z")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_Z);
                myBot.keyRelease(KeyEvent.VK_Z);
            }
            if (s.substring(6).equalsIgnoreCase("shift")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_SHIFT);
            }
            if (s.substring(6).equalsIgnoreCase("capslock")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_CAPS_LOCK);
                myBot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            }
            if (s.substring(6).equalsIgnoreCase("alt")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_ALT);
            }
            if (s.substring(6).equalsIgnoreCase("alt_g")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_ALT_GRAPH);
                myBot.keyRelease(KeyEvent.VK_ALT_GRAPH);
            }
            if (s.substring(6).equalsIgnoreCase("tab")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_TAB);
                myBot.keyRelease(KeyEvent.VK_TAB);
            }
            if (s.substring(6).equalsIgnoreCase("back")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_BACK_SPACE);
                myBot.keyRelease(KeyEvent.VK_BACK_SPACE);
            }
            if (s.substring(6).equalsIgnoreCase("dup")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_UP);
                myBot.keyRelease(KeyEvent.VK_UP);
            }
            if (s.substring(6).equalsIgnoreCase("ddo")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_DOWN);
                myBot.keyRelease(KeyEvent.VK_DOWN);
            }
            if (s.substring(6).equalsIgnoreCase("dl")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_LEFT);
                myBot.keyRelease(KeyEvent.VK_LEFT);
            }
            if (s.substring(6).equalsIgnoreCase("dr")) {
                 myBot.delay(200);
                 myBot.keyPress(KeyEvent.VK_RIGHT);
                 myBot.keyRelease(KeyEvent.VK_RIGHT);
            }
            if (s.substring(6).equalsIgnoreCase("space")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_SPACE);
                myBot.keyRelease(KeyEvent.VK_SPACE);
            }
            if (s.substring(6).equalsIgnoreCase("enter")) {
                myBot.delay(200);
                myBot.keyPress(KeyEvent.VK_ENTER);
                myBot.keyRelease(KeyEvent.VK_ENTER);
            }
            
        }else  if (s.substring(0, 5).equalsIgnoreCase("click")) {
            
            if (s.substring(6).equalsIgnoreCase("left")) {
                myBot.delay(200);
                myBot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                myBot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            }
            if (s.substring(6).equalsIgnoreCase("right")) {
                myBot.delay(200);
                myBot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
                myBot.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
            }
            
        }else  if (s.substring(0, 6).equalsIgnoreCase("scroll")) {
            
            if (s.substring(7).equalsIgnoreCase("up")) {
                myBot.delay(200);
                myBot.mouseWheel(-1);
            }
            if (s.substring(7).equalsIgnoreCase("down")) {
                myBot.delay(200);
                myBot.mouseWheel(1);
            }
            
        }else  if (s.substring(0, 4).equalsIgnoreCase("move")) {
            
            if (s.substring(5,6).equalsIgnoreCase("x")) {
                float xf =Float.parseFloat(s.substring(6));
                float unit = (float) (xf/10.0);
                for(int i=0;i<10;i++) {
                    myBot.delay(5);
                    myBot.mouseMove((int) MouseInfo.getPointerInfo().getLocation().getX() +(int) unit
                                    , (int) MouseInfo.getPointerInfo().getLocation().getY());
                }
            }
             if (s.substring(5,6).equalsIgnoreCase("y")) {
                float yf =Float.parseFloat(s.substring(6));
                float unit = (float) (yf/10.0);
                for(int i=0;i<10;i++) {
                    myBot.delay(5);
                    myBot.mouseMove((int) MouseInfo.getPointerInfo().getLocation().getX()
                                , (int) MouseInfo.getPointerInfo().getLocation().getY() +(int) unit);
                }
            }
            if (s.substring(5).equalsIgnoreCase("down")) {
                for(int i=0;i<100;i++) {
                    myBot.delay(5);
                    myBot.mouseMove((int) MouseInfo.getPointerInfo().getLocation().getX()
                                , (int) MouseInfo.getPointerInfo().getLocation().getY() + 1);
                }
            }
            if (s.substring(5).equalsIgnoreCase("up")) {
                for(int i=0;i<100;i++) {
                    myBot.delay(5);
                    myBot.mouseMove((int) MouseInfo.getPointerInfo().getLocation().getX()
                                , (int) MouseInfo.getPointerInfo().getLocation().getY() - 1);
                }
            }
            if (s.substring(5).equalsIgnoreCase("left")) {
                for(int i=0;i<100;i++) {
                    myBot.delay(5);
                    myBot.mouseMove((int) MouseInfo.getPointerInfo().getLocation().getX() - 1
                                    , (int) MouseInfo.getPointerInfo().getLocation().getY());
                }
            }
            if (s.substring(5).equalsIgnoreCase("right")) {
                for(int i=0;i<100;i++) {
                    myBot.delay(5);
                    myBot.mouseMove((int) MouseInfo.getPointerInfo().getLocation().getX() + 1
                                    , (int) MouseInfo.getPointerInfo().getLocation().getY());
                }
            }
            
        }else  if (s.substring(0, 4).equalsIgnoreCase("type")) {
            
            String newS = s.substring(5);
            StringBuilder t= new StringBuilder();
               for(int i=0;i<newS.length();i++){
                   if(i==0){
                       t.append("press ").append(newS.charAt(i));
                   }else{
                       t.append(" press ").append(newS.charAt(i));
                   }
               }
               doAutomation(t.toString());
               
        }else  if (s.substring(0, 4).equalsIgnoreCase("open")) {
            
            if (s.substring(5).equalsIgnoreCase("chrome")) {
                myBot.delay(50);
                run.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
                myBot.delay(250);
                myBot.mouseMove(1240,450);
                myBot.delay(800);
                myBot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                myBot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            }
        }
    }
    
    static int[] CommandPosition(String s, int str){
        int[] pos={ str , s.length() };
        int j=0;
        for(int i=pos[0];i<pos[1];i++){
            if(s.charAt(i)==' '){
                if(j==1){
                    pos[1]=i;
                    return pos;
                }else{
                    j=1;
                }
            }
        }
        return pos;
    }
    
    static void wrongInput(){
        int spaces = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                spaces++;
            }
        }
        if(spaces%2==0){
        System.out.println("wrong input");
        }
    }
    
    static void reply(String str) throws EngineException, AudioException, InterruptedException
                , IOException {
        
        String reply = null;
        
        if(str.length()>4) {
            
            if (str.substring(0, 4).equalsIgnoreCase("play")) {
                
                System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(null, "general", Locale.getDefault(), null, null));
                synthesizer.allocate();synthesizer.resume();
                reply="Playing!";
                synthesizer.speakPlainText(reply, null);
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                playing(str.substring(5));
            }
        }
        
      if(str.length()>5) {
          
          if (str.substring(0, 5).equalsIgnoreCase("press")) {
              
              try {
                  
                  System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                  Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                  SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
                  Synthesizer synthesizer = Central.createSynthesizer(desc);
                  synthesizer.allocate();
                  synthesizer.resume();
                  reply = " ";
                  synthesizer.speakPlainText(reply, null);
                  synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                  doAutomation(str);
                  
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
          if(str.length()>4) {
              
              if (str.substring(0, 4).equalsIgnoreCase("type")) {
                  
                  try {
                      
                      System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                      Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                      SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
                      Synthesizer synthesizer = Central.createSynthesizer(desc);
                      synthesizer.allocate();
                      synthesizer.resume();
                      reply = "Typing!";
                      synthesizer.speakPlainText(reply, null);
                      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                      doAutomation(str);
                      
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
              } else if (str.substring(0, 4).equalsIgnoreCase("move")) {
                  
                  try {
                      
                      System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                      Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                      SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
                      Synthesizer synthesizer = Central.createSynthesizer(desc);
                      synthesizer.allocate();
                      synthesizer.resume();
                      reply = " ";
                      synthesizer.speakPlainText(reply, null);
                      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                      doAutomation(str);
                      
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
              }
          }
          
          if(str.length()>5) {
              
              if (str.substring(0, 5).equalsIgnoreCase("click")) {
                  
                  try {
                      
                      System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                      Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                      SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
                      Synthesizer synthesizer = Central.createSynthesizer(desc);
                      synthesizer.allocate();
                      synthesizer.resume();
                      reply = " ";
                      synthesizer.speakPlainText(reply, null);
                      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                      doAutomation(str);
                      
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
              }
          }
          
          if(str.length()>6) {
              
              if (str.substring(0, 6).equalsIgnoreCase("scroll")) {
                  
                  try {
                      
                      System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                      Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                      SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
                      Synthesizer synthesizer = Central.createSynthesizer(desc);
                      synthesizer.allocate();
                      synthesizer.resume();
                      reply = " ";
                      synthesizer.speakPlainText(reply, null);
                      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                      doAutomation(str);
                      
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
              }
          }
          
          if(str.length()>7) {
          
          if (str.substring(0, 7).equalsIgnoreCase("release")) {
              
              try {
                  
                  System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                  Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                  SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
                  Synthesizer synthesizer = Central.createSynthesizer(desc);
                  synthesizer.allocate();
                  synthesizer.resume();
                  reply = " ";
                  synthesizer.speakPlainText(reply, null);
                  synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                  doAutomation(str);
                  
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      
      if(str.length()>7) {
          
          if (str.substring(0, 7).equalsIgnoreCase("restart")) {
              
              try {
                  
                  System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                  Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                  Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(null, "general", Locale.getDefault(), null, null));
                  synthesizer.allocate();synthesizer.resume();
                  reply="Restarting Computer!";
                  synthesizer.speakPlainText(reply, null);
                  synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                  run.exec("shutdown -r -t 5");
                  
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      
      if(str.length()>8) {
          
          if (str.substring(0, 8).equalsIgnoreCase("shutdown")) {
              
              try {
                  
                  System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                  Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                  Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(null, "general", Locale.US, null, null));
                  synthesizer.allocate();synthesizer.resume();
                  reply="Shutting Down Computer!";
                  synthesizer.speakPlainText(reply, null);
                  synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                  run.exec("shutdown -s -t 5");
                  
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      
       if(reply==null){
           
                reply = switch (str) {
                    
                    case "Hi!", "hi!", "Hi", "hi" -> "Hello!";
                    case "Why", "why","Why?","why?" -> "I don't know! Sorry!";
                    case "Hello!","hello!","hello","Hello" -> "Hi!";
                    case "Can i change your name?","can i change your name?"
                        ,"Can i change your name","can i change your name","I want to change your name"
                        ,"i want to change your name"-> "Okay! So, tell me my new name.";
                    case "how is it going","How is it going","how is it going?"
                        ,"How is it going?" -> "Great, What about you?";
                    case "I am perfect","i am perfect","I am fine","i am fine"
                         ,"fine","Fine","fine and you?","fine and you"
                         ,"Fine and you" -> "That's Great, I am also fine. ";
                    case "What is your name","what is your name","What is your name?"
                         ,"what is your name?"->BotName+"Created by \"Hassan Abbas\".";
                    default -> "I can not understand!";
                };

                System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(null, "general", Locale.US, null, null));
                synthesizer.allocate();synthesizer.resume();
                synthesizer.speakPlainText(reply, null);
                synthesizer.waitEngineState(
                Synthesizer.QUEUE_EMPTY);
            }
    }
    
    public static void playing(String s) throws IOException {
        
        doAutomation("open chrome");
        myBot.delay(200);
        doAutomation("type "+s);
        myBot.delay(50);
        doAutomation("press space");
        myBot.delay(50);
        doAutomation("type "+"youtube");
        myBot.delay(100);
        doAutomation("press enter");
        myBot.mouseMove(600,530);
        myBot.delay(500);
        doAutomation("click left");
    }
}

