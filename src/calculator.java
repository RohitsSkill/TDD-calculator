public class calculator{
	public String data[];
	public boolean isDigit(String str) {
		try {
			int num = Integer.parseInt(str);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else {
			if(input.length()==1) {
				return Integer.parseInt(input);
			}
			else {
				data = input.split(",|\n");
				int sum = 0;
				int i=0;
				while(i<data.length) {
					if(isDigit(data[i])) {
						sum += Integer.parseInt(data[i]);
					}
					i++;
				}
						
				return sum;
			}
		}
	}
}
