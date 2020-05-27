package FileIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
 자바 입출력의 개요
 -------------------------------------------------------------------------

 - java.io패키지는 사용자가 작성한 자바 프로그램에서 입력 및 출력을 할 수 있도록 도와주는 클래스들을 포함하고 있다.

 - java.io.InputStream클래스를 중심으로 하는 입력 스트림과

 - java.io.OutputStream클래스를 중심으로 하는 
 출력 스트림(Stream : 데이터, 패킷, 비트 등의 일련의 연속성을 갖는 흐름을 의미)이 있다.


 1. InputStream 클래스
 -------------------------------------------------------------------------
 모든 입력 스트림 클래스의 슈퍼 클래스로 기본적인 입력에 관련된 메쏘드들을 제공한다. 

 이 클래스는 abstract 클래스로 new 연산자나 newInstance() 메소드를 이용하여 직접적으로 객체를 생성할 수 없다. 


 int available() - 블록킹이 되지 않고 읽을 수 있는 바이트의 수를 넘겨준다. 

 void close() - 스트림을 닫는다. 

 void mark( int readlimit ) - 스트림내의 현재 위치에 표시를 해둔다. 

 boolean markSupported() - 스트림이 마크/리셋을 지원하는 가를 판별한다. 

 abstract int read() - 스트림으로부터 한 바이트를 읽어서 넘겨준다. 

 int read( byte b [] ) - 스트림으로부터 바이트의 배열만큼 읽어서 b에 채워 준다. 

 int read( byte b[] , int off, int length ) - 스트림으로부터 length만큼 읽어서 b의 off부터 채워줌.

 void reset() - 최근에 마크된 위치로 스트림을 재위치시킨다. 

 long skip( long n ) - 지정한 바이트 수만큼 건너뛴다. 



 2. OutputStream 클래스

 ------------------------

 이 클래스는 모든 출력 스트림 클래스들의 슈퍼 클래스이며, abstract 클래스라 new 연산자나 newInstance()메소드를 이용해서 직접적으로 객체를 생성할 수 없다. 대부분의 출력 스트림 클래스는 이 클래스와 멤버가 비슷하다. 



 void close() - 스트림을 닫는다. 이 스트림과 관련되었던 시스템자원도 모두 돌려준다. 

 void flush() - 스트림에 의해 쓰여진 buffer에 있던 내용을 강제적으로 출력한다. 

 void write( byte b[] ) - 스트림에 b.length만큼 쓴다. 

 void write( byte b[], int off, int length ) - 스트림에 b의내용을 off부터 length만큼 쓴다. 

 abstract void write( int b ) - 스트림에 한바이트를 쓴다. 





 입력스크림 클래스들

 -----------------------

 3. File클래스

 - 파일에 대한 기본적인 정보를 제공해 주는 클래스이다.

 - 파일의 크기나 날짜등 파일 자체 정보와 실제로 파일 입출력과는 관계가 없다.



 [File생성]

 File dukcifile=new File("c:javadukci.doc");

 File dukciDir=new File(c:java");



 4. FileInputStream클래스

 - 파일을 입출력 하고자 한다면 이 클래스를 사용한다.

 - 순차젓인 방법으로 파일의 데이터를 한 바이트씩 가져올 수 있다.



 [FileInputStream 생성]

 File dukciFile = new File("c:javadukci.doc");

 FileInputStream file=new FileInputStream(dukciFile);

 또는

 FileInputStream file=new FileInputStream("dukci.doc");



 5. DataInputStream클래스

 - 이 클래스는 자바에서 사용되는 기본 데이터 타입으로 바로 읽어들일 수 있으며 라인 단위 입 력 처리를 할 수 있다.



 [DataInputStream 생성]

 String line;

 FileInputStream in = new FileInputStream("dukci.txt");

 DataInputStream dis = new DataInputStream(in);

 while((line=dis.readLine())!=null)



 6. 그밖의 입력스트림 클래스



 ByteArrayInputStream 클래스 

 이 클래스의 객체는 별도의 입력장치가 아닌 byte의 배열에서 자료를 읽어 들인다. 

 다른 입력 스트림들과 달리 이 클래스의 입력 메소드들은 block되지 않는다. 



 PipedInputStream 클래스

 이 클래스는 파이프의 양 끝을 이용해서 서로 통신할 경우 사용되는데, 한 쓰레드가 파이프의 한쪽을 이용해서 데이터를 보내면 다른 쓰레드가 다른 파이프의 한쪽을 이용해서 데이터를 읽어 들일 수 있다. 



 PushbackInputStream 클래스 

 이 클래스는 1바이트 push back buffer를 제공하는 입력 스트림 필터로, 응용 프로그램에서 마지막으로 읽은 한 문자를 "unread"할 수 있다. 따라서 "unread"한 문자는 다시 읽어 들일 수 있다. 





 1. ByteArrayOutputStream 클래스

 이 클래스는 바이트 배열에 출력을 하기 위한 출력 스트림을 가진다. 

 버퍼는 쓸 때 자동적으로 그 크기가 증가된다. 



 2. DataOutputStream 클래스

 이 클래스는 간단한 방식으로 출력 스트림에 자바 기본 데이터형을 출력하는데 유용하다. 



 3. PipedOutputStream 클래스

 이 클래스는 파이프의 보내는 쪽에 위치한다. 

 두 쓰레드간의 통신에서 이 클래스는 보내는 쪽에 위치해서 데이터를 보내는 역할을 한다. 



 4. PrintStream 클래스

 이 클래스는 주로 텍스트로 출력 데이터를 출력하기 위해서 디자인되었다. 

 이 클래스에는 다수의 print()와 println()메쏘드가 각각 매개 변수로 서로 다른 자료형을 받아들이도록 overload 되어 있다. 

 코드의 구현은 println()메쏘드는 print()메쏘드를 이용하도록 되어 있고, print()메쏘드는 write()메쏘드를 이용해서 출력하도록 되어 있다. Println()메쏘드와 print()메쏘드는 줄 바꿈 기능의 여부이다.



 5. FileOutputStream 클래스

 이 클래스는 파일로 출력을 하기 위해 사용된다.

 쓰기 위한 메쏘드들은 OutputStream 클래스와 같다.







 * Data 입.출력 처리



 import  java.io.*;



 o 스트림(Stream) : 데이터의 흐름



 Stream - Byte Stream  -  입력 (InputStream)

 (1Byte 단위로 데이터를 
 전송하는 스트림)  -  출력 (OutputStream)


 Text Stream               -  입력 (Reader)

 (2Byte 단위로 데이터를
 전송하는 스트림)              -  출력 (Writer)


 o Byte Stream에 관련된 클래스(1Byte 입.출력 처리)


 InputStream  - FileInputStream

 (입력)         FilterInputStream  -  BufferedInputStream

 DataInputStream

 ObjectInputStream





 OutputStream - FileOutputStream

 (출력)         FilterOutputStream  -  BufferedOutputStream

 DataOutputStream

 PrintStream

 ObjectOutputStream





 o Text Stream에 관련된 클래스(2Byte 입.출력 처리)



 Reader - BufferedReader

 (입력)      InputStreamReader - FileReader



 Writer - BufferedWriter

 (출력)      OutputStreamWriter - FileWriter

 PrintWriter

 */

/*
 * aaa라고 입력하면, aaa라고 출력이 됩니다.
 * 한글 => 한글
 * AAA => AAA
 * 
 */
public class FileSample1 {

	public static void main(String[] args) throws IOException {

		PrintStream out = System.out;
		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
// 원래 한줄로 많이사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 원래 한줄로 많이사용
		
		System.out.println("출력할 데이터를 입력하세요.");
		String str = br.readLine();
		System.out.println(str);

	}
}