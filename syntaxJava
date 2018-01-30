//get filenames and READ at root and with subfolders of the directory
    PATH------------------>static path = "C:\\Users\\anunugonda\\Desktop\\datasets";
		public static void listAllFiles(String path){
		File file = new File(path);
		File[] filesList = file.listFiles();
		for(File x : filesList){
			if(x.isFile()){
				System.out.println("File path => "+ path + "\\" + x.getName());
        //READ
        //        FileInputStream fin = new FileInputStream(path + "\\" + x.getName());
        //				Scanner sc = new Scanner(fin);
        //				while(sc.hasNextLine()){
        //					System.out.println(sc.nextLine());
        //				}				
			}
			if(x.isDirectory()){
				//directory
				//System.out.println("DIrec ---------" + path +"\\"+ x.getName());
				listAllFiles(path +"\\"+ x.getName());
			}
		}
	}

