 

package bibliotheque;

public class testLivre {
	
	public static void main(String[] args) {
		Livre livre = new Livre ("kirikou" ,15, 7);
		System.out.println (livre );
		System.out.println (livre.getName());
		System.out.println (livre.getPrice());
		System.out.println (livre.getQuantite());
		
		
    }
}

