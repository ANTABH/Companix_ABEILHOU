package principal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean start = true;
		Scanner scanner = new Scanner(System.in);
		Map <String, Salarie> salaries = new HashMap<>();
		while(start)
		{
			System.out.println("1 - Ajouter un concepteur");
			System.out.println("2 - Supprimer un concepteur");
			System.out.println("3 - Lister les concepteurs existants");
			System.out.println("4 - Ajouter un analyste");
			System.out.println("5 - Supprimer un analyste");
			System.out.println("6 - Lister les salariés existants en mettant en évidence la fonction (Concepteur ou Analyste");
			System.out.println("7 - Quitter");
			System.out.println("Faites votre choix (1,2,3,4,5,6,7)");
			String s = scanner.nextLine();
			
			switch(s) {
				case "1":
					System.out.println("Saisir le code, nom, prénom, date d'embauche et nombre d'année de développement : ");
					String input = scanner.nextLine();
					String[] array = input.split("-");
					if (salaries.containsKey(array[0])) {
						System.out.println("Ce code existe déjà !");
					}else {
						Sconcepteur concepteur = new Sconcepteur(array[0], array[1], array[2], array[3], array[4]);
						salaries.put(array[0], concepteur);
						System.out.print(salaries.get(concepteur.getCode()).getCode() + " " + salaries.get(concepteur.getCode()).getNom());	
					}
					
					break;
				case "2":
					System.out.println("Saisir le code :");
					String code = scanner.nextLine();
					
					if(salaries.containsKey(code)) {
						Salarie sal = salaries.get(code);
						if(sal instanceof Sconcepteur) {
							salaries.remove(code);	
						}
					}else
					{
						System.out.println("Erreur: Le code n'existe pas");
					}
					
					break;
				case "3":
					salaries.entrySet().forEach(entry -> {
					    if(entry.getValue() instanceof Sconcepteur) {
					    	System.out.println(entry.getValue().toString());
					    }
					});
					break;
				case "4":
					System.out.println("Saisir le code, nom, prénom, date d'embauche et nombre d'année de développement : ");
					String inputA = scanner.nextLine();
					if (salaries.containsKey(inputA)) {
						System.out.println("Ce code existe déjà !");
					}else {
					String[] arrayA = inputA.split("-");
					Sanalyste analyste = new Sanalyste(arrayA[0], arrayA[1], arrayA[2], arrayA[3], arrayA[4]);
					salaries.put(arrayA[0], analyste);
					System.out.print(salaries.get(analyste.getCode()).getCode() + " " + salaries.get(analyste.getCode()).getNom());
					}
					break;
				case "5":
					System.out.println("Saisir le code :");
					String codeA = scanner.nextLine();
					if(salaries.containsKey(codeA)) {
						salaries.remove(codeA);
					}else
					{
						System.out.println("Erreur: Le code n'existe pas");
					}
					break;
				case "6":
					Map<String, Salarie> map = new TreeMap<String, Salarie>(salaries);
					map.entrySet().forEach(entry -> {   
					    	System.out.println(entry.getValue().toString());
					});
					break;
					
				case "7":
					start = false;
					break;
			}	
		}
	}
}
