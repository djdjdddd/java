package nested.nested.ex2;

public class Network {

	public void sendMessage(String text){
		NetworkMessage networkMessage = new NetworkMessage(text);
		networkMessage.print();
	}

	// 리팩토링
	// 중첩 클래스로 변경 (public class -> private static class)
	private static class NetworkMessage {
		private String content;

		public NetworkMessage(String content){
			this.content = content;
		}

		public void print(){
			System.out.println(content);
		}
	}

}
