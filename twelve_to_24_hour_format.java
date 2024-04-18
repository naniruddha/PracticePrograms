package Practice_Codes;

public class twelve_to_24_hour_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "11:01:00PM";
		char[] sc= s.toCharArray();
		String res = "";
		if(s.charAt(sc.length-2) == 'A') {
			if(s.charAt(1)=='2') {
				sc[0] = '0';
				sc[1] = '0';
			}
			for(int i=0;i<sc.length-2;i++) {
				res+=sc[i];
			}
		}else if(s.charAt(sc.length-2) == 'P') {
			int count = 0;
			String h = s.substring(0, 2);
			int hours = Integer.parseInt(h);
			if(hours != 12) {
				hours = hours + 12;
				String str = Integer.toString(hours);
				sc[0] = str.charAt(0);
				sc[1] = str.charAt(1);
			}
			for(int i=0;i<sc.length-2;i++) {
				res+=sc[i];
			}
		}
		
		System.out.println(res);
	}

}
