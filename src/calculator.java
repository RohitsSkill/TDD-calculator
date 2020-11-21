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
	
	public void checkNegative(int data) throws Exception {
		if(data<0)
			throw new Exception("Invalid Input");
	}
	
	public int add(String input) throws Exception{
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
						int num = Integer.parseInt(data[i]);
						checkNegative(num);
						sum += num;
					}
					i++;
				}
						
				return sum;
			}
		}
	}
}
