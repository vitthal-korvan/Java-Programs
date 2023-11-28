package Programs;
import java.io.*;
/*
Reading input from keyboard::
                                         IO Stramms
                                              |
                                        Flow of data
                                              |
                       InputStram                       OutputStram
                            |                                 |
         Reading data from keyboard(Keyboard)       Writing/priting Data (Monitor)

         System -1) standard input  (System.in)  - Object of InputStream - take input
                 2) standard output (System.out) - Object of PrintStraem - display outut
                 3) standard error  (System.err) - Object of PrintStraem - display error

          Keyboard(Input)
                |
          InputStream object
                |
          ByteStream (Sequence of Bytes)
                |
          CharacterStream (Sequence of char - converted from bytes)
                |
          BufferReader (Storing input to buffer)

          syntax::
          InputStreamReader io = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(io);
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


          // char ch = (char)br.raed();
          // String str = br.readLine()
          // int integer1 = Integer.parseInt(br.readLine());
          // float f = Float.parseFloat(br.readLine());
          // double d = Double.parseDouble(br.readLine());
          // long l = Long.parseLong(br.readLine());
          // sohrt s = Short.parseShort(br.readLine());
          // byte b = Byte.parseByte(br.readLine());
          // boolean bool = Boolean.parseBoolean(br.readline());

          //for br.read() we use br.skip()
          //br.skip(2)
          // \n - new line and \r - carriage return.
* */

public class ReadingAnInputFromKeyboard {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int rollno = Integer.parseInt(br.readLine());
//        String name = br.readLine();
//        char gender =(char)br.read();
//        br.skip(2);
//        String branch = br.readLine();
//        int semester=Integer.parseInt(br.readLine());
//        float marks=Float.parseFloat(br.readLine());
//
//        System.out.println("The student roll no is: "+rollno);
//        System.out.println("The student name is: "+name);
//        System.out.println("The student gender is: "+gender);
//        System.out.println("The student branch is: "+branch);
//        System.out.println("The student semester is: "+semester);
//        System.out.println("The student marks is: "+marks);

        char ch1 =(char)br.read();
        br.skip(2);
        char ch2 = (char)br.read();
        System.out.println(ch1);
        System.out.println(ch2);
    }
}
