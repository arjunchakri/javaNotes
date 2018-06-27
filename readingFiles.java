
	// get filenames root and with subfolders of the directory
	PATH------------------>static path="C:\\Users\\anunugonda\\Desktop\\datasets";

	public static void listAllFiles(String path) {
		File file = new File(path);
		File[] filesList = file.listFiles();
		for (File x : filesList) {
			if (x.isFile()) {
				System.out.println("File path => " + path + "\\" + x.getName());
			}
			if (x.isDirectory()) {
				// directory
				// System.out.println("DIrec ---------" + path +"\\"+
				// x.getName());
				listAllFiles(path + "\\" + x.getName());
			}
		}
	}

	// reading a file using FIS
	FileInputStream fin = new FileInputStream("C:\\Users\\anunugonda\\Desktop\\datasets\\abc.xml");
	Scanner sc = new Scanner(fin);
	while(sc.hasNextLine())
	{
	    	System.out.println(sc.nextLine());
	}
	//reading file: buffered reader
	BufferedReader reader = new BufferedReader(new FileReader(fullpath));
	String eachLine = reader.readLine();
	while ((eachLine = reader.readLine()) != null) {
    		//System.out.println(scanner.nextLine());
	}

	//------------------Getting file(remote gist) or html raw content 
	String path = "http://bit.do/abcdea";
	URL url = new URL(path);
	URLConnection connection = url.openConnection();
	BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	String inputLine;
	while ((inputLine = br.readLine()) != null) {
	    System.out.println(inputLine);
	}
	br.close();
