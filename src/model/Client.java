package model;

/*This class it is about the client*/

public class Client {

    public static final String[] CATEGORYCLIENT = { "Normal", "Silver", "Gold", "Platinum" };

    // Atributes
    private string name;
	private int registrationNumber;
	private string date;
	private int price;
	private string categoryClient;
    private int total;

  

    public Client(String name, String registrationNumber, String date) {

       

       
        price = 0;

    }
	
	
	//Getters and Setters
    
    public string getName() {
        return name;
    }


    public void setName(String name) {
      
    }


    public int getCommercialRNumber() {
        return registrationNumber;
    }


    public void setCommercialRNumber(String registrationNumber) {
        
    }


    public string getDateCR() {
        return date;
    }


    public void setDateCR(String date) {
   
    }
   

	public double price() {
        return price;
    }


    public void setMoneyAccum(double price) {
        this.price = (int) price;
    }
    

    public string getClientType() {
        return categoryClient;
    }


    public void setTypeClient(String categoryClient) {
        
    }

    int getTotalKilosTransported() {
        return total;
       
    }

    void setTotalKilosTransported(int finalKilos) {
        
    }

    void getTotalExpenses() {
   
    }

    void setTotalExpenses(double finalExpenses) {
        
    }

    double getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static class string {

        public string() {
        }
    }

}