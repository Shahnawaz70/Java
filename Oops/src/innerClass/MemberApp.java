package innerClass;

public class MemberApp {
	public static void main(String[] args) {
		MemberClass outer = new MemberClass();
		MemberClass.InnerMemberClass inner = outer.new InnerMemberClass();
		inner.show();
		}
}
