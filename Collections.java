Arraylist:
    
    a)iterating
		List<Employee> employeeList =new ArrayList<Employee>();
		employeeList.add(new Employee("01", "name1", "a", "nowhere"));
		employeeList.add(new Employee("01", "name1", "a", "nowhere"));
		employeeList.add(new Employee("01", "name1", "a", "nowhere"));
		employeeList.add(new Employee("01", "name1", "a", "nowhere"));
		employeeList.add(new Employee("01", "name1", "a", "nowhere"));
		//(foreach)
		for(Employee each : employeeList){
			System.out.println(each.getName());
		}

		//iterator
		Iterator iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee each = (Employee) iterator.next();
			if (search(each.toString(), term)) {
				System.out.println(each.toString());
			}
		}
	public static boolean search(String source, String searchTerm) {
		return source.toLowerCase().contains(searchTerm.toLowerCase());
	}

    
	b)sorting-comparision
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
	c) sorting objects
class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
		//for integers
		// if(o1.age==o1.age)
		// return 0;
		// else if(o1.age>o1.age)
		// return 1;
		// else
		// return -1;
	}
}
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee("0", "name1", "a", "nowhere"));
		arrayList.add(new Employee("2", "name4", "b", "abc"));
		arrayList.add(new Employee("5", "name3", "c", "def"));
		arrayList.add(new Employee("1", "name2", "d", "ghi"));
		System.out.println(arrayList);

		Collections.sort(arrayList, new NameComparator());
		System.out.println(arrayList);

    


Stack:
	a) selecting available courses
	Stack stack1 = new Stack<>();
		stack1.add("java");
		stack1.add("dotnet");
		stack1.add("nodejs");
		stack1.add("angularjs");

		Stack stack2 = new Stack<>();
		System.out.println("Enter courses");
		Scanner scanner = new Scanner(System.in);
		String eachInput;
		while (!stack1.isEmpty() && !(eachInput = scanner.next()).equals("exit")) {
			if (stack1.contains(eachInput)) {
				stack1.remove(eachInput);
				stack2.push(eachInput);
				System.out.println(stack1 + " \n" + stack2);
			} else {
				System.out.println("invalid course");
			}

		}


Maps:
	a)hashmap
		HashMap map = new HashMap<>();
		map.put(100, "abc");
		map.put(200, "bc");
		map.put(300, "kk");
		map.put(null, "kk");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	
	Iterating:
		HashMap hashMap = new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);

		//key-value entry
		Set<Entry> set = hashMap.entrySet();
		for (Entry e : set) {
			System.out.println(e.getKey());
		}

		//keys
		Set set1 = hashMap.keySet();
		for (Object e : set1) {
			System.out.println(e);
		}


	b)linked hashmap
		Map map2 = new LinkedHashMap<>();
		map2.put("a", 100);
		map2.put("b", 100);
		map2.put("d", 100);
		map2.put("", 100);
		System.out.println(map2.get("k"));
	c) weakHashMap
		String str = new String("someKey1");
		String str2 = new String("someKey2");
		WeakHashMap weakHashMap = new WeakHashMap<>();
		weakHashMap.put(str, "10");
		HashMap map3 = new HashMap<>();
		map3.put(str2, "abc");
		str = null;
		str2 = null;
		System.gc();
		System.out.println(weakHashMap.get("someKey1") + "\n" + map3.get("someKey2"));
	
