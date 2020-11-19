public class calculator{
	public String data[];
	public int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else {
			if(input.length()==1) {
				return Integer.parseInt(input);
			}
			else {
				data = input.split(",");
				return Integer.parseInt(data[0])+Integer.parseInt(data[1]);
			}
		}
	}
}