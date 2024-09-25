package enum2;

public class PrincipalDisciplinas {

	public static void main(String[] args) {
		for(Disciplinas materias : Disciplinas.values()) {
			System.out.println(materias);
		}
	}
}
