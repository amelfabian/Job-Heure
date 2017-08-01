package vue;

public class Vue {

		private StringBuilder menu;
	
		public String getScreenAcceuil() {
			menu = new StringBuilder();
			menu.append(String.format("Menu"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("-----"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(1) trouver jobbeur"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(2) trouver un job"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Entrez votre choix: "));
			return menu.toString();

		}
		

		public String getScreenJob() {
			menu = new StringBuilder();
			menu.append(String.format("Menu job"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("--------------------"));

			menu.append(String.format(System.lineSeparator()));

			menu.append(String.format("(1) Créer"));
			menu.append(String.format(System.lineSeparator()));
			;
			menu.append(String.format("(2) Modifier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(3) Supprimer"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(4) Lister"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Entrez votre choix: "));
			return menu.toString();
		}

		public String getScreenJobbeur() {
			menu = new StringBuilder();
			menu.append(String.format("Menu jobbeur"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("--------------------"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(1) Créer"));
			menu.append(String.format(System.lineSeparator()));
			;
			menu.append(String.format("(2) Modifier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(3) Supprimer"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("(4) Lister"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Entrez votre choix: "));
			return menu.toString();
		}


	}


