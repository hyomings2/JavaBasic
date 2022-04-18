package sec2;

import java.util.Date;
import java.util.List;
import java.util.Vector;

class Board{
	private String subject, content, writer;	//보안 때문에 private
	private Date regdate;
	public Board() { }
	public Board(String subject, String content, String writer, Date regdate) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	public String getSubject() {return subject;}
	public void setSubject(String subject) {this.subject = subject;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public Date getRegdate() {return regdate;}
	public void setRegdate(Date regdate) {this.regdate = regdate;}
}

public class ListEx2 {

	public static void main(String[] args) {
		List<Board> blist = new Vector<Board>();
		Date today=new Date();
		Board board6 = new Board();
		board6.setSubject("제목6");
		board6.setContent("내용6");
		board6.setWriter("장원희");
		blist.add(board6);
		
		blist.add(new Board("제목1","내용1","김효민",today));
		blist.add(new Board("제목2","내용2","김진실",today));
		blist.add(new Board("제목3","내용3","김소정",today));
		blist.add(new Board("제목4","내용4","정아희",today));
		blist.add(new Board("제목5","내용5","박다연",today));
		System.out.println("글제목\t글내용\t작성자\t작성일");
		
		for(Board bd : blist) {
			System.out.print(bd.getSubject()+"\t");
			System.out.print(bd.getContent()+"\t");
			System.out.print(bd.getWriter()+"\t");
			System.out.print(bd.getRegdate()+"\n");
		}

	}

}
