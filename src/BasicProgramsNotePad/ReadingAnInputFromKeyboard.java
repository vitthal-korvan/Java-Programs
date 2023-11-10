package BasicProgramsNotePad;

import java.io.*;

public class ReadingAnInputFromKeyboard {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char ch1 =(char)br.read();
        br.skip(1);
        char ch2 = (char)br.read();
        System.out.println(ch1+" "+ch2);

	}
}	