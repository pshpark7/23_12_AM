import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int lastArticleId = 0;

		System.out.println("== 프로그램 시작 == ");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("명령어 > ");
			String cmd = sc.nextLine();
			
			if (cmd.length() == 0) {
				System.out.println("명령어를 입력하세요");
				continue;
			}
			if (cmd.equals("article write")) {
				int id = lastArticleId + 1;
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String contents = sc.nextLine();

				System.out.printf("%d번 글이 생성 되었습니다.\n", id);
				lastArticleId++;
			} else if(cmd.equals("article list")) {
				
			}
			if (cmd.equals("exit")) {
				break;
			} else {
				System.out.println("사용할 수 없는 명령어입니다.");
			}
		}

		System.out.println("== 프로그램 끝 ==");

		sc.close();
	}
}