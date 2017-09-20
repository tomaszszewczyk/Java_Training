package ex4_4;

public class Counters {
	public static void main(String[] args) {
		Counter counters[] = new Counter[args.length];

		for (int i = 0; i < args.length; i++) {
			counters[i] = new Counter(Integer.parseInt(args[i]));
		}

		for (int i = 100; i < 1000; i++) {
			for (Counter counter : counters) {
				counter.count(i);
			}
		}

		for (Counter counter : counters) {
			System.out.println(counter);
		}
	}

}

class Counter {
	int num;
	int counter = 0;

	public Counter() {

	}

	public Counter(int num) {
		this.num = num;
	}

	public void count(int data) {
		if (data % num == 0)
			counter++;
	}

	public String toString() {
		return "Jest " + counter + " liczb podzielnych przez " + num;
	}
}