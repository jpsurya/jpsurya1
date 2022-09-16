package day15ExeptionHandling;

public class CheckMailid {

	public static void main(String[] args) throws MailidException, Exception {
		String a = "jpsurya123@gmail.com";
		try {
			if (a.contains("gmail")) {
				throw new MailidException("iT IS GOOGLE");
			} else {
				// throw new MailidException("yahoo");
				System.out.println("IT IS YAHOO");
			}
		} catch (MailidException e) {
			e.printStackTrace();
			// System.out.println("INVALID");
		}
	}

}
