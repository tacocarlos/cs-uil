public class ArgEcho {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No Args!");
		} else {
			for(String arg : args) {
				System.out.println(arg);
			}
		}
	}
}
