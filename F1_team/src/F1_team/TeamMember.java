package F1_team;

public class TeamMember extends Employee{
		private String role;
		
		public TeamMember(String name, int age, String role) {
		    super(name, age);
		    this.role = role;
		}

		public String getRole() {
		    return role;
		}

		public void setRole(String role) {
		    this.role = role;
		}
}
