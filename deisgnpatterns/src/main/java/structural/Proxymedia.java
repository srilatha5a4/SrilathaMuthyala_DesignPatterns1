package structural;

public class Proxymedia implements MediaFile{
	private File1 mediaFileImpl;
	   private String Filename;

	   public Proxymedia(String Filename){
	      this.Filename = Filename;
	   }

	   public void printname() {
	      if(mediaFileImpl == null){
	         mediaFileImpl = new File1(Filename);
	      }
	      mediaFileImpl.printname();
	   }
}

