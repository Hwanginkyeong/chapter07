package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.219.113",10001));
	
		System.out.println("<서버시작>");
		System.out.println("==================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		
		while(true) {
			
			Socket socket = serverSocket.accept(); //내보내버리기 
			
			Thread thread = new ServerThread(socket);   
			thread.start(); //출장나가고, 전화번호 전달,[회선강화 3단, 메세지 주고받기], 종료코드
			
			/*
			 if() {
				break;
			} 
			 */
			
		}
	

		
	
		/*
		 System.out.println("================================");
		System.out.println("<서버 종료>");
		
		socket.close();   //unreachable 나오면 트루기 때문에 탈출 조건 만들라는 의미 
		
		serverSocket.close();
		 */
		
	}

}
