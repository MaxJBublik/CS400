/**
 * This is a simple application that demonstrates the use of MyList.
 */
public class Main {

    public static void main(String[] args) {
	// populate zoo with ant, bear, cat, dog, and elephant
	ListADT<String> miniZoo = new MyList<>();
	miniZoo.add("ant");
	miniZoo.add("bear");
	miniZoo.add("cat");
	miniZoo.add("dog");
	miniZoo.add("elephant");
	System.out.println("Miniature Zoo started with: "+miniZoo);

	// TODO: add code here to trade a dog for a panda
	// 1) remove the dog element miniZoo
	miniZoo.remove(3);
	// 2) add a new element with the value "panda" to miniZoo
	miniZoo.add("panda");
	System.out.println("Miniature Zoo ended with: "+miniZoo);
    }

}
