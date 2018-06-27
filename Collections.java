Arraylist:
    
    a)
    List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("one");
		arrayList1.add("two");
		arrayList1.add("three");

		List<String> arrayList2 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 strings");
		for (int i = 0; i < 3; i++) {
			arrayList2.add(scanner.next());
		}
		Collections.sort(arrayList1);
		Collections.sort(arrayList2);
		
    System.out.println(arrayList1.equals(arrayList2));
    
 
