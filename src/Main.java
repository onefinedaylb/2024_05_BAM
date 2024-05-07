import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		
		List<Article> articles = new ArrayList<>();
		
		int id = 1;
		
		while(true) {
			System.out.println("명령어) ");
			String cmd = sc.nextLine().trim();
			

			if (cmd.equals("exit")) {
				break;
			}
			
			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			
			if (cmd.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("존재하는 게시글이 없습니다");
					continue;
				}
				if (articles.size() != 0) {
					System.out.println("번호   |   제목");
					for (int i = articles.size() - 1; i >= 0; i--) {
						Artixle article = articles.get(i);
						System.out.println("%d   |   %s\n", article.id, article.title);
					}
					
				}
				
			} else if (cmd.equals("article write")) {
				
				
				System.out.print("제목 : ");
				String title = sc.nextLine().trim();
				System.out.print("내용 : ");
				String body = sc.nextLine().trim();
				
//				Article article = new Article(id, title, body);
			
//				articles.add(article);
				
				articles.add(new Article(id, title, body));
				
				System.out.println(id + "번 글이 생성되었습니다. ");
				id++;

			} else {
				System.out.println("존재하지 않는 명령어 입니다");
			}
			
		}
		
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
	}
}


class Article {
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
		
	}
}