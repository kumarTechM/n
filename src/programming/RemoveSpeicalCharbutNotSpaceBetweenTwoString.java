package programming;

public class RemoveSpeicalCharbutNotSpaceBetweenTwoString {

	public static void main(String[] args) {
		String s="prav@in sa#rka&te vi**shn&&&@u";
		 s=s.replaceAll("[^a-zA-z ]", "");// after capital Z need space so that string will maintain spaces between two string
		System.out.println(s);

	}

}
