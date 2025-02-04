package bibliotheque;

public class Livre {
	private  String Name ;
	private   double Price;
	private int Quantite;
	
	
	
	
 public Livre(String name , double price, int quantite) {
	 this.Name =name;
     this.Price =price;
     this.Quantite = quantite;
 }
 public String getName() {
     return Name;
 }

 public double getPrice() {
     return Price;
 }

 public int getQuantite() {
     return Quantite;
 }
 public String toString() {
	  return  " le Livre est "  + Name + '\'' +", le prix est  =" + Price +", la quantite est =" + Quantite ;
 }
	public void  Setquantite (int  Quantite ) {
		this.Quantite = Quantite ;
		
	}
}	
	
	
	