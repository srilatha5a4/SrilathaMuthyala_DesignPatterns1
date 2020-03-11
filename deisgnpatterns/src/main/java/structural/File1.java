package structural;

public class File1 implements MediaFile{
private String Filename;

public File1(String Filename){
    this.Filename = Filename;
    loadFromDisk(Filename);
 }

public void printname() {
	System.out.println("Displaying:"+ Filename);
	// TODO Auto-generated method stub
	
}
private void loadFromDisk(String Filename){
    System.out.println("Loading "+Filename);
 }

}