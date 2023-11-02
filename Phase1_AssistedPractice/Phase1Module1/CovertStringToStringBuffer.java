package Phase1Module1;

public class CovertStringToStringBuffer {

	public static void main(String[] args) {

		String str1 = "My name is Noor Ayesha. ";
		StringBuffer sb = new StringBuffer();  // create StringBuffer object
		sb.append(str1); // 1. convert String to StringBuffer


		String str2 = "I've pursued my B.Tech from Presidecy University.";
		sb.append("\n" + str2);

		String str3 = "I've Programming knowledge on Frontend concepts, Java & Python.";
		sb.append("\n" + str3);

		System.out.println("Example to convert String to StringBuffer : \n\n" + sb);
	}

}
