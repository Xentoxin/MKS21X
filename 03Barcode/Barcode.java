public class Barcode implements Comparable<Barcode> {
	private String zip, _zip;
	private int check;
	private String barcode;

	public static void main(String[] args) {
		Barcode test = new Barcode("12345");
		System.out.println(test.toString());

	}

	public Barcode(String z) {
		try {
			int temp = Integer.parseInt(z);
			if (z.length() != 5) {
				throw new IllegalArgumentException("Illegal Argument");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		zip = z;
		check = checkSum() % 10;
	}

	private int checkSum() {
		int sum = 0;
		for (int i = 0; i < zip.length(); i++) {
			sum = sum + Integer.parseInt(zip.charAt(i) + "");
		}
		return sum;
	}

	public String toString() {
		return (zip + check + " " + "|" + createBarcode() + "|");
	}

	private String createBarcode() {
		String result = "";
		for (int i = 0; i < zip.length(); i++) {
			switch (Integer.parseInt(zip.charAt(i) + "")) {
			case 1:
				result = result + ":::||";
				break;
			case 2:
				result = result + "::|:|";
				break;
			case 3:
				result = result + "::||:";
				break;
			case 4:
				result = result + ":|::|";
				break;
			case 5:
				result = result + ":|:|:";
				break;
			case 6:
				result = result + ":||::";
				break;
			case 7:
				result = result + "|:::|";
				break;
			case 8:
				result = result + "|::|:";
				break;
			case 9:
				result = result + "|:|::";
				break;
			case 0:
				result = result + "||:::";
				break;
			}
		}
		barcode = result;
		return barcode;
	}

	private String createZip(String barcode) {
		String result = "";
		for (int i = 0; i < barcode.length() - 1; i++) {
			if (!barcode.substring(i, i + 1).equals("|") && !barcode.substring(i, i + 1).equals(":")) {
				throw new IllegalArgumentException("Illegal Argument");
			}
		}
		if (barcode.length() != 32) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		if (!barcode.substring(0, 1).equals("|")) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		if (!barcode.substring(31).equals("|")) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		for (int i = 0; i < 6; i++) {
			switch (barcode.substring(i * 5 + 1, i * 5 + 6)) {
			case ":::||":
				result = result + 1;
				break;
			case "::|:|":
				result = result + 2;
				break;
			case "::||:":
				result = result + 3;
				break;
			case ":|::|":
				result = result + 4;
				break;
			case ":|:|:":
				result = result + 5;
				break;
			case ":||::":
				result = result + 6;
				break;
			case "|:::|":
				result = result + 7;
				break;
			case "|::|:":
				result = result + 8;
				break;
			case "|:|::":
				result = result + 9;
				break;
			case "||:::":
				result = result + 0;
				break;
			}
		}
		_zip = result;
		return _zip;
	}

	public int compareTo(Barcode other) {
		if (Integer.parseInt(zip) > Integer.parseInt(other.zip)) {
			return 1;
		} else {
			if (Integer.parseInt(zip) < Integer.parseInt(other.zip)) {
				return -1;
			} else {
				return 0;
			}
		}

	}
}