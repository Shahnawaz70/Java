package innerClass;

public class MemberClass {
	int x =10;
	
	class InnerMemberClass {
		public void show() {
			System.out.println("X = " + x);
		}
	}
}
