package CIE;

public class Internals extends CIE.Student
 {
  public int [] InternalMarks;

public Internals(String name,String usn,int sem,int []InternalMarks)
 {
  super(name,usn,sem);
  this.InternalMarks=InternalMarks;
 }
}
