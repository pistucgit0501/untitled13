package homework04;


import java.io.File;
import java.io.IOException;






public   class FileOperation {
    public void printDirsInDirectory() {
        File file = new File("/home/pistuc/Desktop/helixlab");
        File[] dirList = file.listFiles();

        for (File flist : dirList) {
            if (flist.isDirectory()) {
                System.out.println(flist.getName());
            }
        }


    }

    public void printFilesInDirectory(String path) {
        File file = new File(path);
        File[] dirList = file.listFiles();

        for (File flist : dirList) {
            if (flist.isFile()) {
                System.out.println(flist.getName());

            }
        }


    }

    public void searchFile(String fileName) {
        File file = new File("/home/pistuc/Desktop/helixlab");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().equals(fileName)) {
                System.out.println(file1.getAbsolutePath());
                System.out.println("jk");


            }
        }

    }
    public  void comp(String path1,String path2){
        File file1 =new File(path1);
        File file2 =new File(path2);
        int szam =file1.compareTo(file2);
        System.out.println(szam);

    }
}
