package FileHandlingPackage;

public class Attributes {
	public class Attributes {
		public static void main(String[] args)
		{
			File file = new file("src/Attributes.java");
			
			System.out.println("exists: " + file.exist());
			// The Exist method is part of class or file class that determines the file or directory.
			
			System.out.println("path: " + file.getPath());
			//  The Path or (file.getPath) method is function to returns the path of the given the file object.
			
			System.out.println("length: " + file.lenght());
			//The length method is returns no. of present in the first string.
			
			System.out.println("isDirectory: " + file.isDirectory());
			//The isDirectory method is determines whether the file or directory is denoted.
			
			System.out.println("isFile: " + file.isFile());
			// The isFile determines the file or the Directory denoted by the filename is File or not.
			
			System.out.println("canRead: " + file.canRead());
			//The function of canRead is determines program can read the file by the pathname, or path exist.
			
		}

}
}