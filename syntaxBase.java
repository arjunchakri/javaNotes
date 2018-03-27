
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

	// reading a file basic
	FileInputStream fin = new FileInputStream("C:\\Users\\anunugonda\\Desktop\\datasets\\abc.xml");
	Scanner sc = new Scanner(fin);while(sc.hasNextLine())
	{
	    	System.out.println(sc.nextLine());
	}

	//------------------Getting file or html raw content 
	String path = "http://bit.do/abcdea";
	URL url = new URL(path);
	URLConnection conn = url.openConnection();

	BufferedReader br = new BufferedReader(
	    new InputStreamReader(conn.getInputStream()));

	String inputLine;
	while ((inputLine = br.readLine()) != null) {
	    System.out.println(inputLine);
	}
	br.close();
